package fr.eni.Spring03TPAnnuaire.bll;

import java.util.ArrayList;

import fr.eni.Spring03TPAnnuaire.bo.Personne;


public interface Contact {
	public void ajouterContact(Personne personne, ArrayList<Personne> annuaire);
	public void afficherTousContact(ArrayList<Personne> annuaire);
	public void afficherUnContact(int id, ArrayList<Personne> annuaire);
	public void effacerUnContact(int id, ArrayList<Personne> annuaire);
	public void mettreAJour(Personne personne);
}
