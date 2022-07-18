package fr.eni.Spring03TPAnnuaire.bll;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import fr.eni.Spring03TPAnnuaire.bo.Personne;
import fr.eni.Spring03TPAnnuaire.dal.ContactDAO;

@Component("ContactManager")
@Primary

public class ContactManagerImpl implements ContactManager {
	@Autowired
	@Qualifier("ContactDao")
	private ContactDAO contactDao;

	@Override
	public void ajouterContact(Personne personne, ArrayList<Personne> annuaire) {
		contactDao.insert(personne, annuaire);
	}

	@Override
	public void afficherTousContact(ArrayList<Personne> annuaire) {
		contactDao.showAll(annuaire);
	}

	@Override
	public void afficherUnContact(int id, ArrayList<Personne> annuaire) {
		contactDao.showById(id, annuaire);
	}

	@Override
	public void effacerUnContact(int id, ArrayList<Personne> annuaire) {
		contactDao.delete(id, annuaire);
}

	@Override
	public void mettreAJour(Personne personne) {
	}

}
