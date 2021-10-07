package fr.simplon.medecine.model;

import java.time.LocalTime;

public class Creneau {
	
	private LocalTime heureDuRdv;
	private int dureDeRdv;
	private MedecinGeneraliste Medecin;
	
	public Creneau(LocalTime heureDuRdv, int dureDeRdv, MedecinGeneraliste Medecin) {
		this.heureDuRdv = heureDuRdv;
		this.dureDeRdv = dureDeRdv;
		this.Medecin = Medecin;
		Medecin.ajouterCreneau(this);
	}

	public MedecinGeneraliste getMedecin() {
		return Medecin;
	}
	
	public void afficher() {
		System.out.println( heureDuRdv + " - " + heureDuRdv.plusMinutes(dureDeRdv)+ " (" +dureDeRdv+" minutes)");
	}


}
