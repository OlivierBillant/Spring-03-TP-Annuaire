package fr.eni.Spring03TPAnnuaire.bll;

import java.util.ArrayList;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import fr.eni.Spring03TPAnnuaire.bo.Personne;


@Component("Contact")
@Primary
public class ContactImpl implements Contact {

	@Override
	public void ajouterContact(Personne personne, ArrayList<Personne> annuaire) {
		annuaire.add(personne);		
	}

	@Override
	public void afficherTousContact(ArrayList<Personne> annuaire) {
		for (Personne personne : annuaire) {
			System.out.println(personne);
		}		
	}

	@Override
	public void afficherUnContact(int id, ArrayList<Personne> annuaire) {
		System.out.println(annuaire.get(id));
	}

	@Override
	public void effacerUnContact(int id, ArrayList<Personne> annuaire) {
		annuaire.remove(id);
	}

	@Override
	public void mettreAJour(Personne personne) {		
	}

}
