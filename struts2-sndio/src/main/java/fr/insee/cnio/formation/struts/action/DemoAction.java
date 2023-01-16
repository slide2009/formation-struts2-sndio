package fr.insee.cnio.formation.struts.action;

import java.util.List;
import java.util.stream.Collectors;

import com.opensymphony.xwork2.ActionSupport;

import fr.insee.cnio.formation.struts.modele.Personne;
import fr.insee.cnio.formation.struts.service.PersonneService;

public class DemoAction extends ActionSupport {

	private List<Personne> listePersonnes;
	private String nomChoisi;
	private PersonneService personneService = new PersonneService();

	private String nom;
	private int age;
	private String message;
	private int nbPersonnesAuDessusAge;


	public String lister() {
		listePersonnes = personneService.getToutLeMonde();
		return SUCCESS;
	}

	public String choisirPersonne() {
		listePersonnes = personneService.getToutLeMonde();
		return SUCCESS;
	}

	public String compter() {
		personneService.chercherPersonne(nom).ifPresent(personne -> {
			message = "Détails " + personne.getNom() + ", " + personne.getAge() + ", " + personne.getSexe();
			if (age < personne.getAge()) {
				message = message + "/n" + "En dessous";
			} else {
				message = message + "/n" + "Au-dessus";
			}

		});
		nbPersonnesAuDessusAge = personneService.getToutLeMonde().stream().filter(p -> p.getAge() > age)
				.collect(Collectors.toList()).size();
		return SUCCESS;
	}

	public List<Personne> getListePersonnes() {
		return listePersonnes;
	}

	public String getNomChoisi() {
		return nomChoisi;
	}

	public void setNomChoisi(String nomChoisi) {
		this.nomChoisi = nomChoisi;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getNbPersonnesAuDessusAge() {
		return nbPersonnesAuDessusAge;
	}

	public void setNbPersonnesAuDessusAge(int nbPersonnesAuDessusAge) {
		this.nbPersonnesAuDessusAge = nbPersonnesAuDessusAge;
	}

}
