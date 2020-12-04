package fr.insee.cnio.formation.struts.action;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import fr.insee.cnio.formation.struts.modele.Personne;
import fr.insee.cnio.formation.struts.service.PersonneService;

public class JsonAction extends ActionSupport {
	
	private static final long serialVersionUID = -4813326437969589514L;
	
	private List<Personne> listePersonnes;
	private PersonneService personneService = new PersonneService();
	private String nom;
	private Personne personne;
	
	public String lister() {
		listePersonnes = personneService.getToutLeMonde();
		return SUCCESS;
	}
	
	public String chercher() {
		personne = personneService.chercherPersonneParNom(nom);
		return NONE;
	}
	

	
	public List<Personne> getListePersonnes() {
		return listePersonnes;
	}

	public void setListePersonnes(List<Personne> listePersonnes) {
		this.listePersonnes = listePersonnes;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}

	public Personne getPersonne() {
		return personne;
	}

	public void setPersonne(Personne personne) {
		this.personne = personne;
	}

}
