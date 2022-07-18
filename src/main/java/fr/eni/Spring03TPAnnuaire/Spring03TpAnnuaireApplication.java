package fr.eni.Spring03TPAnnuaire;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import fr.eni.Spring03TPAnnuaire.bll.Contact;
import fr.eni.Spring03TPAnnuaire.bo.Annuaire;
import fr.eni.Spring03TPAnnuaire.bo.Personne;


@SpringBootApplication
public class Spring03TpAnnuaireApplication implements CommandLineRunner {

	@Autowired
	@Qualifier("Contact")
	private Contact contact;
	public static void main(String[] args) {
		SpringApplication.run(Spring03TpAnnuaireApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Annuaire annuaireClass = new Annuaire();
		ArrayList<Personne> annuaire = annuaireClass.getAnnuaire();
//		ArrayList<Personne> annuaire = new ArrayList<Personne>();
		
		Personne personne1 = new Personne("Olivier", "Billant", "0606060606", 34);
//		System.out.println(personne1.toString());
		Personne personne2 = new Personne("Clement", "Duval", "0707070707", 34);
		Personne personne3 = new Personne("Antoine", "Guillou", "0808080808", 33);
		Personne personne4 = new Personne("Phileas", "Peron", "090909090909", 14);
		
		contact.ajouterContact(personne1, annuaire);
		contact.ajouterContact(personne2, annuaire);
		contact.ajouterContact(personne3, annuaire);
		contact.ajouterContact(personne4, annuaire);
		System.out.println("Test affichage tous contacts");
		contact.afficherTousContact(annuaire);
		System.out.println("Test affichage un contact");
		contact.afficherUnContact(2, annuaire);
		System.out.println("Test effacer un contact");
		contact.effacerUnContact(0, annuaire);
		contact.afficherTousContact(annuaire);		
	}

}
