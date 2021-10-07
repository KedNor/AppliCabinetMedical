package fr.simplon.medecine.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Patient extends Personne {
//	
//	private String nom;
//	private String prenom;
//	private String numeroDeTelephone;
	private char sexe;
	private long numeroDeSecu;
	private LocalDate dateDeNaissance;
	private String commentaire;
	Adresse adresse;
	
	
	
public Patient (String nom, String prenom, String numeroDeTelephone, char sexe, long numeroDeSecu, LocalDate dateDeNaissance,String commentaire, Adresse adresse) {
//	this.nom = nom;
//	this.prenom = prenom;
//	this.numeroDeTelephone = numeroDeTelephone;
	super(nom, prenom, numeroDeTelephone, adresse);
	this.sexe = sexe;
	this.numeroDeSecu = numeroDeSecu;
	this.dateDeNaissance = dateDeNaissance;
	this.commentaire = commentaire;
//	this.adresse = adresse;
	
}

public void afficher () {
//	System.out.println(nom+ " "+prenom);
//	System.out.println("Téléphone : "+numeroDeTelephone);
	System.out.println("pour "+getNom() + " " +getPrenom());
	System.out.println("Téléphone : " + getNumeroDeTelephone());
	System.out.println("sexe : "+ (sexe == 'F' ? "Féminin" : "Masculin"));
	System.out.println("Numéro de Sécurité : "+numeroDeSecu);
	System.out.println("Date de Naissance : " + this.dateDeNaissance.format(DateTimeFormatter.ofPattern("dd MMMM YYYY")));
	System.out.println("Commentaire : " +(commentaire == null ? "[aucun commentaire]" : commentaire));
	System.out.println("Adresse :");
	getAdresse().afficher();
}
}
