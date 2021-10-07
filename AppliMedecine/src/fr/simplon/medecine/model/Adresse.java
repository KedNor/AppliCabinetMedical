package fr.simplon.medecine.model;

public class Adresse {
		
		private String zone;
		private int numero; 
		private String bis;
		private String rue;
		private int codePostale;
		private String ville; 
		
		
		public Adresse (String zone,int numero,String bis,String rue,int codePostale,String ville) {
			this.zone = zone;
			this.numero = numero;
			this.bis = bis;
			this.rue = rue;
			this.codePostale = codePostale;
			this.ville = ville;
		}
		public Adresse (int numero,String bis,String rue,int codePostale,String ville) {
			this.numero = numero;
			this.bis = bis;
			this.rue = rue;
			this.codePostale = codePostale;
			this.ville = ville;
		}
		
		public void afficher () {
			System.out.println((zone == null ? "" : zone));
			System.out.println(numero+(bis == null ? "" : bis)+" "+rue);
			System.out.println((Integer.toString(codePostale).length() < 5 ? "0" + codePostale : codePostale)+" "+ville.toUpperCase());
			}
		
}
