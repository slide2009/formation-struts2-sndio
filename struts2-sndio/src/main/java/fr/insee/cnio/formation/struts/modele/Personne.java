package fr.insee.cnio.formation.struts.modele;


public class Personne {
	
	private String nom;
	private String sexe;
	private int age;
	
	private Personne enfant;
	
	public Personne() {
		super();
	}
	
	public Personne(String nom, String sexe, int age) {
		super();
		this.nom = nom;
		this.sexe = sexe;
		this.age = age;
	}
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getSexe() {
		return sexe;
	}
	public void setSexe(String sexe) {
		this.sexe = sexe;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Personne getEnfant() {
		return enfant;
	}
	public void setEnfant(Personne enfant) {
		this.enfant = enfant;
	}

	
	
}
