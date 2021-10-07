package fr.simplon.medecine.model;

public class Personne {

		private String nom;
		private String prenom;
		private String numeroDeTelephone;
		private Adresse adresse;
		
		public Personne(String nom, String prenom, String numeroDeTelephone, Adresse adresse) {
			this.nom = nom;
			this.prenom = prenom;
			this.numeroDeTelephone = numeroDeTelephone;
			this.adresse = adresse;
		}

		public String getNom() {
			return nom;
		}

		public void setNom(String nom) {
			this.nom = nom;
		}

		public String getPrenom() {
			return prenom;
		}

		public void setPrenom(String prenom) {
			this.prenom = prenom;
		}

		public String getNumeroDeTelephone() {
			return numeroDeTelephone;
		}

		public void setNumeroDeTelephone(String numeroDeTelephone) {
			this.numeroDeTelephone = numeroDeTelephone;
		}
		
		public Adresse getAdresse() {
			return this.adresse;
		}
		
		public void setAdresse(Adresse adresse) {
			this.adresse = adresse;
		}

		public void afficher() {
			// TODO Auto-generated method stub
			
			
		}

		
}
