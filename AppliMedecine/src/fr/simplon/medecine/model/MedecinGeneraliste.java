package fr.simplon.medecine.model;


public class MedecinGeneraliste extends Personne {
	
//	private String nom;
//	private String prenom;
//	private String numeroDeTelephone;
	Adresse adresse;
	private static int Tarif = 25;
	protected Creneau creneaux[] = new Creneau[15];
	
	public MedecinGeneraliste (String nom,String prenom,String numeroDeTelephone, Adresse adresse) {
		super(nom, prenom, numeroDeTelephone, adresse);
//		this.nom = nom;
//		this.prenom = prenom;
//		this.numeroDeTelephone = numeroDeTelephone;
		this.adresse = adresse;
		
		
		
	}

//	public String getNumeroDeTelephone() {
//		return numeroDeTelephone;
//	}

////	public void setNumeroDeTelephone(String numeroDeTelephone) {
////		this.numeroDeTelephone = numeroDeTelephone;
//	}

	public int getTarif() {
		return Tarif;
	}

	public void setTarif(int tarif) {
		Tarif = tarif;
	}

//	public String getNom() {
//		return nom;
//	}
//	
	
	
    void ajouterCreneau(Creneau creneauAAjouter) {
        if (this != creneauAAjouter.getMedecin()) {
            System.err.println("Ce créneau ne peut être associé à ce médecin " +
                    "car il est déjà associé à un autre");
        } // le créneau n'est pas associé donc c'est possible
        else
        {
            int pos = 0;
            while (pos < this.creneaux.length && this.creneaux[pos] != null)
                pos++;
            if (pos == this.creneaux.length)
                System.err.println(
                        "Trop de créneaux sont affectés à ce médecin");
            else
                // sinon on ajoute le créneau passé en paramètre
                // à la position disponible
                this.creneaux[pos] = creneauAAjouter;
        }
    }
	
	public void afficher() {
//		System.out.println(nom + " " +prenom);
//		System.out.println("Téléphone : "+numeroDeTelephone);
		System.out.println("pour "+getNom() + " " +getPrenom());
		System.out.println("Téléphone : " + getNumeroDeTelephone());
		System.out.println();
		System.out.println("Tarif : "+Tarif);
		adresse.afficher();
		System.out.println("Adresse :");
		for (Creneau creneau : creneaux) {
			creneau.afficher();
		}
	}
	

	
	}

