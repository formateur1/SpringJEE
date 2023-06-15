package com.inti.service;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.springframework.stereotype.Service;

import com.inti.model.Client;
import com.inti.util.HibernateUtil;

@Service
public class ClientImplService implements IClientService {
	
	private static Session session;
	
	public ClientImplService()
	{
		session = HibernateUtil.getSessionFactory().openSession();
	}

	@Override
	public void saveClient(Client client) 
	{
		session.beginTransaction();
				
		try {			
			session.save(client);
			
			session.getTransaction().commit();
			
		} catch (Exception e) {
			e.printStackTrace();
			
			session.getTransaction().rollback();
		}		
	}

	@Override
	public List<Client> getListeClients() {
		List<Client> listeC = new ArrayList();
		session.beginTransaction();
		
		try {			
			listeC = session.createNativeQuery("select * from client", Client.class).list();
			
			session.getTransaction().commit();
			
		} catch (Exception e) {
			e.printStackTrace();
			
			session.getTransaction().rollback();
		}	
		
		return listeC;
	}

	@Override
	public void deleteClient(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateClient(Client client) {
		// TODO Auto-generated method stub
		
	}

}
