package fr.insee.cnio.formation.struts.action;

import com.opensymphony.xwork2.ActionSupport;

import fr.insee.cnio.formation.struts.modele.Personne;
import fr.insee.cnio.formation.struts.service.PersonneService;

public class TransfertObjetAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	
	private Personne personne;
	
	private Personne personneTrouvee;
	private Personne enfant;
	
	
	public String enegistrer() {
		PersonneService personneService = new PersonneService();
		personneTrouvee = personneService.chercherPersonneParNom(personne.getNom());
		enfant = personneService.chercherPersonneParNom(personne.getEnfant().getNom());
		return SUCCESS;
	}

	public Personne getPersonne() {
		return personne;
	}

	public void setPersonne(Personne personne) {
		this.personne = personne;
	}

	public Personne getPersonneTrouvee() {
		return personneTrouvee;
	}

	public void setPersonneTrouvee(Personne personneTrouvee) {
		this.personneTrouvee = personneTrouvee;
	}

	public Personne getEnfant() {
		return enfant;
	}

	public void setEnfant(Personne enfant) {
		this.enfant = enfant;
	}

}
