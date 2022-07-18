package fr.eni.Spring03TPAnnuaire.bo;

public class Personne {
	private int identifiant;
	private String prenom;
	private String nom;
	private String numTelephone;
	private int age;
	
	public Personne(String prenom, String nom, String numTelephone, int age) {
		super();
		this.prenom = prenom;
		this.nom = nom;
		this.numTelephone = numTelephone;
		this.age = age;
	}

	public Personne() {
		super();
	}

	public int getIdentifiant() {
		return identifiant;
	}

	public void setIdentifiant(int identifiant) {
		this.identifiant = identifiant;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getNumTelephone() {
		return numTelephone;
	}

	public void setNumTelephone(String numTelephone) {
		this.numTelephone = numTelephone;
	}

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "Personne [prenom=" + prenom + ", nom=" + nom + ", numTelephone=" + numTelephone + ", age=" + age + "]";
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	
	
	
}
