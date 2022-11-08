package tn.eng.model;

public class Affectation {
	private int id ;
private  Matiere mat;
private Enseignant ens ;

public Affectation() {
	super();
}
public Affectation(int id, Matiere mat, Enseignant ens) {
	super();
	this.id = id;
	this.mat = mat;
	this.ens = ens;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public Matiere getMat() {
	return mat;
}
public void setMat(Matiere mat) {
	this.mat = mat;
}
public Enseignant getEns() {
	return ens;
}
public void setEns(Enseignant ens) {
	this.ens = ens;
}

}
