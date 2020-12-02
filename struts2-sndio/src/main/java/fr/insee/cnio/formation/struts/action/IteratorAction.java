package fr.insee.cnio.formation.struts.action;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import fr.insee.cnio.formation.struts.modele.Personne;
import fr.insee.cnio.formation.struts.service.PersonneService;

public class IteratorAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	
	private Personne personne;
	private PersonneService personneService = new PersonneService();
	private List<Personne> listePersonnes;
	
	private List<Personne> listeAgees;
	private int ageChoisi;
	
	public String enregistrer() {
		listePersonnes = personneService.getToutLeMonde();
		listePersonnes.add(personne);
		return SUCCESS;
	}

	public String listeAgees() {
		listePersonnes = personneService.getToutLeMonde();
		listeAgees = new ArrayList<>();
		for(Personne personne : listePersonnes) {
			if(personne.getAge()> ageChoisi) {				
				listeAgees.add(personne);
			}
		}
		return SUCCESS;
	}
	
	public Personne getPersonne() {
		return personne;
	}

	public void setPersonne(Personne personne) {
		this.personne = personne;
	}

	public List<Personne> getListePersonnes() {
		return listePersonnes;
	}

	public void setListePersonnes(List<Personne> listePersonnes) {
		this.listePersonnes = listePersonnes;
	}

	public List<Personne> getListeAgees() {
		return listeAgees;
	}

	public void setListeAgees(List<Personne> listeAgees) {
		this.listeAgees = listeAgees;
	}

	public int getAgeChoisi() {
		return ageChoisi;
	}

	public void setAgeChoisi(int ageChoisi) {
		this.ageChoisi = ageChoisi;
	}

}
