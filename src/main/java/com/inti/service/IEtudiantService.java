package com.inti.service;

import java.util.List;

import com.inti.model.Etudiant;

public interface IEtudiantService {
	
	List<Etudiant> getEtudiants();
	void saveEtudiant(Etudiant e);
	Etudiant getEtudiant(int id);
	void deleteEtudiant(int id);

}
