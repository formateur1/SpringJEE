package com.inti.service;

import java.util.ArrayList;
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
		List<Etudiant> listeE = new ArrayList<>();
		try {			
			session.beginTransaction();
			
			listeE = session.createQuery("from Etudiant", Etudiant.class).list();
			
			session.getTransaction().commit();			
		} catch (Exception e2) {
			e2.printStackTrace();
			session.getTransaction().rollback();
		}
		return listeE;
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
		Etudiant e = null;
		try {			
			session.beginTransaction();
			
			e = session.get(Etudiant.class, id);
			
			session.getTransaction().commit();			
		} catch (Exception e2) {
			e2.printStackTrace();
			session.getTransaction().rollback();
		}
		return e;
	}

	@Override
	public void deleteEtudiant(int id) {
		try {			
			session.beginTransaction();
			
			session.delete(session.get(Etudiant.class, id));
			
			session.getTransaction().commit();			
		} catch (Exception e2) {
			e2.printStackTrace();
			session.getTransaction().rollback();
		}		
	}

}
