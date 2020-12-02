package fr.insee.cnio.formation.struts.service;

import java.util.ArrayList;
import java.util.List;

import fr.insee.cnio.formation.struts.modele.Personne;

/**
 * Classe simulant l'accès à la couche service. Fournit :
 * <ul>
 * <li> {@link #getToutLeMonde()} </li>
 * <li> {@link #getTousNoms()} </li>
 * <li> {@link #chercherPersonneParNom(String)} </li>
 * </ul>
 *
 */
public class PersonneService {
	
	private List<Personne> listePersonnes = new ArrayList<>();
	
	public PersonneService() {
		listePersonnes.add(new Personne("Anthony", "H", 19));
		listePersonnes.add(new Personne("David L", "H", 20));
		listePersonnes.add(new Personne("David O", "H", 21));
		listePersonnes.add(new Personne("Farida", "F", 22));
		listePersonnes.add(new Personne("Minh", "H", 23));
		listePersonnes.add(new Personne("Sébastien", "H", 24));
		listePersonnes.add(new Personne("Valérie", "F", 25));
	}

	/**
	 * Renvoie la liste de toutes les personnes
	 */
	public List<Personne> getToutLeMonde() {
		return listePersonnes;
	}
	
	/**
	 * Renvoie la liste de tous les noms
	 */
	public List<String> getTousNoms() {
		List<String >listeNoms = new ArrayList<>();
		for(Personne personne : getToutLeMonde()) {
			listeNoms.add(personne.getNom());
		}
		return listeNoms;
	}
	
	/**
	 * Renvoie une personne ayant le nom en paramètre.
	 * Null on ne trouve personne.
	 */
	public Personne chercherPersonneParNom(String nom) {
		Personne personneTrouvee = null;
		for(Personne p : getToutLeMonde()) {
			if(nom.equalsIgnoreCase(p.getNom())) {
				personneTrouvee = p;
				break;
			}
		}
		return personneTrouvee;
	}
}
