package typesDeDonnees;

public class Livre {

	long issn;
	String titre;
	String langue;
	String auteur;
	double prix;
	public Livre(long issnp, String titrep, String languep, String auteurp, double prixp) {
		issn =issnp;
		titre = titrep;
		langue = languep;
		auteur = auteurp;
		prix = prixp;
	}
   
}
