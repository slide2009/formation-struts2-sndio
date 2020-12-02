package fr.insee.cnio.formation.struts.action;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import fr.insee.cnio.formation.struts.modele.Personne;
import fr.insee.cnio.formation.struts.service.PersonneService;

public class CheckboxListAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	
	private List<String> listeNoms;
	private List<String> nomsChoisis;
	private List<Personne> personnes;
	
	private PersonneService service = new PersonneService();
	
	public String afficher() {
		listeNoms = service.getTousNoms();
		return SUCCESS;
	}
	
	public String enregistrer() {
		personnes = new ArrayList<>();
		for(String nom : nomsChoisis) {
			personnes.add(service.chercherPersonneParNom(nom));
		}
		return SUCCESS;
	}
	

	public List<String> getListeNoms() {
		return listeNoms;
	}

	public void setListeNoms(List<String> listeNoms) {
		this.listeNoms = listeNoms;
	}

	public List<String> getNomsChoisis() {
		return nomsChoisis;
	}

	public void setNomsChoisis(List<String> nomsChoisis) {
		this.nomsChoisis = nomsChoisis;
	}
	public List<Personne> getPersonnes() {
		return personnes;
	}
	public void setPersonnes(List<Personne> personnes) {
		this.personnes = personnes;
	}

}
