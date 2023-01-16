package fr.insee.cnio.formation.struts.action;

import com.opensymphony.xwork2.ActionSupport;

import fr.insee.cnio.formation.struts.service.PersonneService;

public class RecherchePersonneAction extends ActionSupport {

	private static final long serialVersionUID = 1L;

	private String nom;
	private String message;
	PersonneService personneService = new PersonneService();

	public String rechercher() {
		personneService.chercherPersonne(nom)
				.ifPresentOrElse(
						personne -> message = " La personne est présente dans la liste : " + personne.getNom() + ", "
								+ personne.getAge() + ", " + personne.getSexe(),
						() -> message = "La personne est absente ");
		return SUCCESS;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getMessage() {
		return message;
	}
}
