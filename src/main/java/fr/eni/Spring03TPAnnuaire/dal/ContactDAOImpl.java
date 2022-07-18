package fr.eni.Spring03TPAnnuaire.dal;

import java.util.ArrayList;

import org.springframework.stereotype.Component;

import fr.eni.Spring03TPAnnuaire.bo.Personne;

@Component("ContactDao")
public class ContactDAOImpl implements ContactDAO {
	public void insert(Personne personne, ArrayList<Personne> annuaire) {
		annuaire.add(personne);
	}

	public void showAll(ArrayList<Personne> annuaire) {
		for (Personne personne : annuaire) {
			System.out.println(personne);
		}
	}

	public void showById(int id, ArrayList<Personne> annuaire) {
		System.out.println(annuaire.get(id));
	}

	public void delete(int id, ArrayList<Personne> annuaire) {
		annuaire.remove(id);
	}

	public void update(Personne personne) {
	}

}
