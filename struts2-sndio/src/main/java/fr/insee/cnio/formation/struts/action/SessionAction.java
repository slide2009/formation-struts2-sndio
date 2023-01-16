package fr.insee.cnio.formation.struts.action;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.struts2.action.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

import fr.insee.cnio.formation.struts.service.PersonneService;

public class SessionAction extends ActionSupport implements SessionAware {

	private Map<String, Object> session;
	private Date date;
	private Date date2;
	private List<String> tousNoms;

	public String afficher() {
		date = new Date();
		session.put("maDate", date);
		return SUCCESS;
	}

	public String afficherSession() {
		date2 = (Date) session.get("maDate");
		tousNoms = new PersonneService().getTousNoms();
		return SUCCESS;
	}

	@Override
	public void withSession(Map<String, Object> session) {
		this.session = session;
	}

	public Date getDate() {
		return date;
	}

	public Date getDate2() {
		return date2;
	}

	public List<String> getTousNoms() {
		return tousNoms;
	}

}
