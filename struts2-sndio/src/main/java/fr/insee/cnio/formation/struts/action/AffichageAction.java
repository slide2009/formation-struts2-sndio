package fr.insee.cnio.formation.struts.action;

import com.opensymphony.xwork2.ActionSupport;

import fr.insee.cnio.formation.struts.service.PersonneService;

public class AffichageAction extends ActionSupport {

	private static final long serialVersionUID = 1L;

	private int nombreTotal;

	public String compter() {
		PersonneService personneService = new PersonneService();
		nombreTotal = personneService.getToutLeMonde().size() + 253;
		if(nombreTotal <7) {			
			return ERROR;
		}
		return SUCCESS;
	}

	public int getNombreTotal() {
		return nombreTotal;
	}

	public void setNombreTotal(int nombreTotal) {
		this.nombreTotal = nombreTotal;
	}

}
