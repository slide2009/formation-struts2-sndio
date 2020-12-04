package fr.insee.cnio.formation.struts.action;

import fr.insee.cnio.formation.struts.modele.Personne;


public class FormulairePrerempliAction extends SessionAwareAction {

	private Personne personneParDefaut;
	
	public String preremplirFormulaire() {
		personneParDefaut = (Personne) session.get(Constantes.SESSION_PERSONNE_PREFEREE);
		return SUCCESS;
	}
	
	public Personne getPersonneParDefaut() {
		return personneParDefaut;
	}

	public void setPersonneParDefaut(Personne personneParDefaut) {
		this.personneParDefaut = personneParDefaut;
	}
	
}
