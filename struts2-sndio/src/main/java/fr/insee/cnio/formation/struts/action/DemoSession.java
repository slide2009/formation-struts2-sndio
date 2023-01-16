package fr.insee.cnio.formation.struts.action;

import java.util.List;
import java.util.Map;

import org.apache.struts2.action.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

import fr.insee.cnio.formation.struts.modele.Personne;
import fr.insee.cnio.formation.struts.service.PersonneService;

public class DemoSession extends ActionSupport implements SessionAware {

	Map<String, Object> session;
	PersonneService personneService = new PersonneService();
	private List<Personne> listePersonnes;
	private String nom;
	private String message;
	private Personne personne;

	public String remplirListePersonnes() {
		listePersonnes = personneService.getToutLeMonde();
		return SUCCESS;
	}

	public String mettreEnSession() {
		personneService.chercherPersonne(nom).ifPresent(personne -> {
			session.put("PERSONNE_SESSION", personne);
			message = "Détails " + personne.getNom() + ", " + personne.getAge() + ", " + personne.getSexe();
		});

		return SUCCESS;
	}

	public String preRemplirFormulaire() {
		personne = (Personne) session.get("PERSONNE_SESSION");
		return SUCCESS;
	}

	@Override
	public void withSession(Map<String, Object> session) {
		this.session = session;
	}

	public List<Personne> getListePersonnes() {
		return listePersonnes;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getMessage() {
		return message;
	}

	public Personne getPersonne() {
		return personne;
	}

}
