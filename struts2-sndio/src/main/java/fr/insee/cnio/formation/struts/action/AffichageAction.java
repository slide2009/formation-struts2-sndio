package fr.insee.cnio.formation.struts.action;

import java.util.Date;

import com.opensymphony.xwork2.ActionSupport;

public class AffichageAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	
	private Date date;
	
	public String afficher() {
		date = new Date();
		return SUCCESS;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

}
