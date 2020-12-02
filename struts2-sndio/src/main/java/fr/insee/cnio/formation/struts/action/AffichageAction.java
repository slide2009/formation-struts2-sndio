package fr.insee.cnio.formation.struts.action;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import fr.insee.cnio.formation.struts.modele.Personne;
import fr.insee.cnio.formation.struts.service.PersonneService;

public class AffichageAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	
	private List<Personne> listePersonnes;
	
	private int age;
	private String nom;
	private String message;
	private PersonneService service = new PersonneService();
	private Personne personneTrouvee;	
	private int nombrePersonnesAuDessus;
	
	public String afficher() {
		listePersonnes = service.getToutLeMonde();
		return SUCCESS;
	}

	public String valider() {
		personneTrouvee = service.chercherPersonneParNom(nom);
		if(personneTrouvee.getAge() > age) {
			message = "La personne est au-dessus de l'âge limite.";
		}
		else {				
			message = "La personne est en-dessous de l'âge limite.";
		}
		service.getToutLeMonde().forEach(personne -> {
			if(personne.getAge() > age) {
				nombrePersonnesAuDessus++;
			}
		});
		return SUCCESS;
	}
	
	public List<Personne> getListePersonnes() {
		return listePersonnes;
	}

	public void setListePersonnes(List<Personne> listePersonnes) {
		this.listePersonnes = listePersonnes;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
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

	public Personne getPersonneTrouvee() {
		return personneTrouvee;
	}

	public void setPersonneTrouvee(Personne personneTrouvee) {
		this.personneTrouvee = personneTrouvee;
	}

	public int getNombrePersonnesAuDessus() {
		return nombrePersonnesAuDessus;
	}

	public void setNombrePersonnesAuDessus(int nombrePersonnesAuDessus) {
		this.nombrePersonnesAuDessus = nombrePersonnesAuDessus;
	}

}
