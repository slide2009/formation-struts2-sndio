package fr.insee.cnio.formation.struts.action;

import java.util.List;

import fr.insee.cnio.formation.struts.modele.Personne;
import fr.insee.cnio.formation.struts.service.PersonneService;

public class SessionAction extends SessionAwareAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private List<Personne> listePersonnes;
	
	private String nomChoisi;	
	
	private PersonneService personneService = new PersonneService();
	
	public String afficher() {
		listePersonnes = personneService.getToutLeMonde();
		return SUCCESS;
	}
	
	public String miseEnSession() {
		Personne personnePreferee = personneService.chercherPersonneParNom(nomChoisi);
		session.put(Constantes.SESSION_PERSONNE_PREFEREE, personnePreferee);
		return SUCCESS;
	}	

	public List<Personne> getListePersonnes() {
		return listePersonnes;
	}

	public void setListePersonnes(List<Personne> listePersonnes) {
		this.listePersonnes = listePersonnes;
	}

	public String getNomChoisi() {
		return nomChoisi;
	}

	public void setNomChoisi(String nomChoisi) {
		this.nomChoisi = nomChoisi;
	}

}
