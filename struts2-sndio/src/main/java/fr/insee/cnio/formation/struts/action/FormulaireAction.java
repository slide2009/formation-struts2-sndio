package fr.insee.cnio.formation.struts.action;

import com.opensymphony.xwork2.ActionSupport;

public class FormulaireAction extends ActionSupport {

	private static final long serialVersionUID = 1332581630955750728L;

	private String nom;
	private String nomMajuscule;

	public String enregistrer() {
		nomMajuscule = nom.toUpperCase();
		return SUCCESS;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getNomMajuscule() {
		return nomMajuscule;
	}

	public void setNomMajuscule(String nomMajuscule) {
		this.nomMajuscule = nomMajuscule;
	}
	
}
