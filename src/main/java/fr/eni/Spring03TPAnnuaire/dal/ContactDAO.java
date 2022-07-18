package fr.eni.Spring03TPAnnuaire.dal;

import java.util.ArrayList;

import fr.eni.Spring03TPAnnuaire.bo.Personne;

public interface ContactDAO {
	public void insert(Personne personne, ArrayList<Personne> annuaire);
	public void showAll(ArrayList<Personne> annuaire);
	public void showById(int id, ArrayList<Personne> annuaire);
	public void delete(int id, ArrayList<Personne> annuaire);
	public void update(Personne personne);
}
