package typesDeDonnees;

public class Client {

	int id;
	String nom;
	String prenom;
	public Client(int idp, String nomp, String prenomp) {
		id = idp;
		nom = nomp;
		prenom = prenomp;
	}
    public Client(){
    	id = 0;
    	nom = "anonyme";
    	prenom = "anonyme";
    }
}
