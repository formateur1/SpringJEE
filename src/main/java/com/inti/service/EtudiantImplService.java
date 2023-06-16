package com.inti.service;

import java.util.List;

import org.hibernate.Session;
import org.springframework.stereotype.Service;

import com.inti.model.Etudiant;
import com.inti.util.HibernateUtil;

@Service
public class EtudiantImplService implements IEtudiantService {
	
	private Session session;
	
	public EtudiantImplService() {
		session = HibernateUtil.getSessionFactory().openSession();
	}

	@Override
	public List<Etudiant> getEtudiants() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveEtudiant(Etudiant e) {
		try {			
			session.beginTransaction();
			
			session.save(e);
			
			session.getTransaction().commit();			
		} catch (Exception e2) {
			e2.printStackTrace();
			session.getTransaction().rollback();
		}
		
	}

	@Override
	public Etudiant getEtudiant(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteEtudiant(int id) {
		// TODO Auto-generated method stub
		
	}

}
