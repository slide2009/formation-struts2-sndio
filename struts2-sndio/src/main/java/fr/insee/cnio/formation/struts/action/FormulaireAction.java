package fr.insee.cnio.formation.struts.action;

import com.opensymphony.xwork2.ActionSupport;

import fr.insee.cnio.formation.struts.modele.Personne;
import fr.insee.cnio.formation.struts.service.PersonneService;

public class FormulaireAction extends ActionSupport {

	private static final long serialVersionUID = 1332581630955750728L;

	private String nom;
	private String message;

	public String rechercher() {
		PersonneService personneService = new PersonneService();
		Personne personne = personneService.chercherPersonneParNom(nom);
		if(personne == null) {
			message = "La personne est absente.";
		}
		else {
			message = nom + " est dans la liste."
					 + " Son âge est " + personne.getAge();
			if("H".equals(personne.getSexe())) {
				message = message + ". C'est un homme.";
			}
			else {
				message = message + ". C'est une femme.";
			}
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
