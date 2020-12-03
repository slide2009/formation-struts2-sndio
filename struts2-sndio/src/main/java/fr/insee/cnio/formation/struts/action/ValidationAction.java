package fr.insee.cnio.formation.struts.action;

import com.opensymphony.xwork2.ActionSupport;

import fr.insee.cnio.formation.struts.modele.Personne;

public class ValidationAction extends ActionSupport {

	private static final long serialVersionUID = 1L;

	private Personne personne;

	public String enegistrer() {
		return SUCCESS;
	}
	
	public Personne getPersonne() {
		return personne;
	}

	public void setPersonne(Personne personne) {
		this.personne = personne;
	}
	

}
