package fr.insee.cnio.formation.struts.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

import fr.insee.cnio.formation.struts.modele.Personne;
import fr.insee.cnio.formation.struts.service.PersonneService;

public class AffichageAction extends ActionSupport implements ServletRequestAware, SessionAware {

	private static final long serialVersionUID = 1L;
	
	private Personne personneChoisie;
	private int ageChoisi;
	private List<Personne> listePersonnes;
	private List<Personne> listePersonnesPlusAgees = new ArrayList<>();
	private HttpServletRequest request;
	private PersonneService service = new PersonneService();
		
	
	public String enregistrer() {
		listePersonnes = service.getToutLeMonde();
		listePersonnes.add(personneChoisie);
		return SUCCESS;
	}
	
	public String rechercher() {
		listePersonnes = service.getToutLeMonde();		
		listePersonnes.forEach(personne -> {
			if(personne.getAge() > ageChoisi) {
				listePersonnesPlusAgees.add(personne);
			}
		});
		Integer age = (Integer) request.getAttribute("ageChoisi");
		return SUCCESS;
	}
	

	public List<Personne> getListePersonnes() {
		return listePersonnes;
	}

	public void setListePersonnes(List<Personne> listePersonnes) {
		this.listePersonnes = listePersonnes;
	}

	public int getAgeChoisi() {
		return ageChoisi;
	}

	public void setAgeChoisi(int ageChoisi) {
		this.ageChoisi = ageChoisi;
	}

	public List<Personne> getListePersonnesPlusAgees() {
		return listePersonnesPlusAgees;
	}

	public void setListePersonnesPlusAgees(List<Personne> listePersonnesPlusAgees) {
		this.listePersonnesPlusAgees = listePersonnesPlusAgees;
	}

	public Personne getPersonneChoisie() {
		return personneChoisie;
	}

	public void setPersonneChoisie(Personne personneChoisie) {
		this.personneChoisie = personneChoisie;
	}

	@Override
	public void setServletRequest(HttpServletRequest request) {
		this.request = request;		
	}

	@Override
	public void setSession(Map<String, Object> session) {
		
		
	}


	
}
