package com.inti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.inti.model.Etudiant;
import com.inti.service.IEtudiantService;

@Controller
@RequestMapping("etudiant")
public class EtudiantController {
	
	@Autowired
	IEtudiantService ies;
	
	@GetMapping("creerEtu")
	public String afficherFormEtu()
	{
		return "formEtu";
	}
	
	@PostMapping("creerEtu")
	public String saveEtu(@ModelAttribute("etu") Etudiant e)
	{
//		Etudiant e1 = new Etudiant(n, prenom, tel, email);
		
		ies.saveEtudiant(e);
		
		return "formEtu";
//		return "redirect:creerEtu";
	}
	
}
