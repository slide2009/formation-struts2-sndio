package fr.insee.cnio.formation.struts.action;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import fr.insee.cnio.formation.struts.modele.Personne;
import fr.insee.cnio.formation.struts.service.PersonneService;

public class AffichageAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	
	private List<Personne> listePersonnes;
	
	public String lister() {
		PersonneService personneService = new PersonneService();
		listePersonnes = personneService.getToutLeMonde();
		return NONE;
	}


	public List<Personne> getListePersonnes() {
		return listePersonnes;
	}

	public void setListePersonnes(List<Personne> listePersonnes) {
		this.listePersonnes = listePersonnes;
	}

}
