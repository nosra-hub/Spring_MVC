package tn.eng.model;

public class Enseignant {
private int id ;
private int ChargeH ;
private String  nom ;
private String  prenom ;
public Enseignant( ){
	
	
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getChargeH() {
	return ChargeH;
}
public void setChargeH(int chargeH) {
	ChargeH = chargeH;
}
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public String getPrenom() {
	return prenom;
}
public void setPrenom(String prenom) {
	this.prenom = prenom;
}
public Enseignant(int id, int chargeH, String nom, String prenom) {
	super();
	this.id = id;
	ChargeH = chargeH;
	this.nom = nom;
	this.prenom = prenom;
}
}
