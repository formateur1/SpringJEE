package com.inti.controller;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.inti.model.Client;
import com.inti.service.ClientImplService;
import com.inti.service.IClientService;
import com.inti.util.HibernateUtil;

@Controller
@RequestMapping("client")
public class ClientController {
	
	@Autowired
	IClientService cs;
	
	@GetMapping("saveC")
	public String saveClient(@RequestParam("nom") String n, @RequestParam("prenom") String p)
	{
		Client c1 = new Client(n, p);

//		IClientService cs = new ClientImplService();
		cs.saveClient(c1);
		
		return "saveClient";
	}
	
	@GetMapping("listeC")
	public String listeClient(Model m)
	{
//		IClientService cs = new ClientImplService();
		
		m.addAttribute("listeC", cs.getListeClients());
		
		return "listeClient";		
	}
	
}
