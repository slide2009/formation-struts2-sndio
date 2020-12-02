package fr.insee.cnio.formation.struts.action;

import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

import fr.insee.cnio.formation.struts.modele.Personne;
import fr.insee.cnio.formation.struts.service.PersonneService;

public class SessionAction extends ActionSupport implements SessionAware {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Map<String, Object> session;
	
	private List<Personne> listePersonnes;
	
	private String nomChoisi;
	
	private Personne personneParDefaut;
	
	private final String SESSION_PERSONNE_PREFEREE = "SESSION_PERSONNE_PREFEREE";
	
	private PersonneService personneService = new PersonneService();
	
	public String afficher() {
		listePersonnes = personneService.getToutLeMonde();
		return SUCCESS;
	}
	
	public String miseEnSession() {
		Personne personnePreferee = personneService.chercherPersonneParNom(nomChoisi);
		session.put(SESSION_PERSONNE_PREFEREE, personnePreferee);
		return SUCCESS;
	}
	
	public String preremplirFormulaire() {
		personneParDefaut = (Personne) session.get(SESSION_PERSONNE_PREFEREE);
		return SUCCESS;
	}
	
	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
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

	public Personne getPersonneParDefaut() {
		return personneParDefaut;
	}

	public void setPersonneParDefaut(Personne personneParDefaut) {
		this.personneParDefaut = personneParDefaut;
	}

}
