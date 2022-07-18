package fr.eni.Spring03TPAnnuaire.bo;

import java.util.ArrayList;

public class Annuaire {
	private ArrayList<Personne> annuaire = new ArrayList<Personne>();

	public Annuaire(ArrayList<Personne> annuaire) {
		super();
		this.annuaire = annuaire;
	}

	public Annuaire() {
		super();
	}

	public ArrayList<Personne> getAnnuaire() {
		return annuaire;
	}

	public void setAnnuaire(ArrayList<Personne> annuaire) {
		this.annuaire = annuaire;
	}

}
