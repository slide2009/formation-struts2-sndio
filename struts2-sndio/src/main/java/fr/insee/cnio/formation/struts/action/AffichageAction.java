package fr.insee.cnio.formation.struts.action;

import com.opensymphony.xwork2.ActionSupport;

import fr.insee.cnio.formation.struts.modele.Personne;
import fr.insee.cnio.formation.struts.service.PersonneService;

public class AffichageAction extends ActionSupport {

	private static final long serialVersionUID = 1L;

	private String nom;
	private String message;
	private PersonneService personneService = new PersonneService();
	
	public String rechercher() {
		Personne personneTrouvee = personneService.chercherPersonneParNom(nom);		
		if(personneTrouvee == null) {
			message = "La personne est absente";
		}
		else {
			message = "La personne est présente dans la liste. " 
					+ " Nom : " + personneTrouvee.getNom()
					+ ". Age : " + personneTrouvee.getAge()
					;
		}
		return SUCCESS;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}	
	
}
