package tn.eng.model;

public class Matiere {
	private int id ;
	private String titre ;
	private int niv ;
	private int nbreH;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public int getNiv() {
		return niv;
	}
	public void setNiv(int niv) {
		this.niv = niv;
	}
	public int getNbreH() {
		return nbreH;
	}
	public void setNbreH(int nbreH) {
		this.nbreH = nbreH;
	}
	public Matiere(int id, String titre, int niv, int nbreH) {
		super();
		this.id = id;
		this.titre = titre;
		this.niv = niv;
		this.nbreH = nbreH;
	}
	public Matiere() {
		super();
	}
	
	
	
	
}
