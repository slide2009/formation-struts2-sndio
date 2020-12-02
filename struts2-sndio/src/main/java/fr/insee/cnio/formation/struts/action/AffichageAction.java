package fr.insee.cnio.formation.struts.action;

import com.opensymphony.xwork2.ActionSupport;

import fr.insee.cnio.formation.struts.service.PersonneService;

public class AffichageAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	
	private int nombrePersonnes;
	
	public String afficher() {
		PersonneService personneService = new PersonneService();
		nombrePersonnes = personneService.getToutLeMonde().size();
		return SUCCESS;
	}

	public int getNombrePersonnes() {
		return nombrePersonnes;
	}

	public void setNombrePersonnes(int nombrePersonnes) {
		this.nombrePersonnes = nombrePersonnes;
	}


}
