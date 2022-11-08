package tn.enig.dao;

import java.util.List;

import tn.eng.model.Affectation;
import tn.eng.model.Enseignant;
import tn.eng.model.Matiere;

public interface Igestion {
	public  List<Matiere> getallMatiere();
	public  List<Enseignant> getallEnseignant();
	public  List<Affectation> getallAffectation();

	public void deleteAff(int id);
}
