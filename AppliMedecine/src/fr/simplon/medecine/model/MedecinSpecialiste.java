package fr.simplon.medecine.model;

public class MedecinSpecialiste extends MedecinGeneraliste {

		public int tarif;
		public String specialite;
		
		public MedecinSpecialiste(String nom, String prenom, String numDeTelephone, Adresse adresse,String specialite, int tarif) {
			super(nom, prenom, numDeTelephone, adresse);
			this.tarif = tarif;
			this.specialite = specialite;
		}


		public int getTarif() {
			return tarif;
		}


		public void setTarif(int tarif) {
			this.tarif = tarif;
		}


		public String getSpecialite() {
			return specialite;
		}


		public void setSpecialite(String specialite) {
			this.specialite = specialite;
		}
		
		
		public void afficher() {
			System.out.println(getNom() + " " + getPrenom());
			System.out.println("Téléphone : " + getNumeroDeTelephone());
			System.out.println("Spécialité : " + getSpecialite());
			System.out.println("Tarif : " + tarif);
			System.out.println("Adresse :");
			getAdresse().afficher();
			System.out.println("Créneaux :");
			for (Creneau creneau : creneaux) {
				if(creneau != null) {
					creneau.afficher();
				}
			}
			
		}
			
	}
		



