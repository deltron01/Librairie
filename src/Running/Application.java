package Running;

import typesDeDonnees.Client;
import typesDeDonnees.Livre;
import typesDeDonnees.Transaction;

public class Application {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Livre l1 = new Livre(9548712587452L, "Origines des espèces", "Fr", "Charles Darwin", 11.30);
		Livre l2 = new Livre(9541792587357L, "Programmer en C++", "Fr", "Eyrolles", 26.30);
		Client c1 = new Client(688940, "MAATALLA", "Ali");
		Client c2 = new Client(748714, "CHANYIJAN", "Sanita");
		Transaction t1 = new Transaction(l1, c1);
		Transaction t2 = new Transaction(l2, new Client());
		
		AfficherToutesLesTransactions();

	}

	private static void AfficherToutesLesTransactions() {
		// TODO Auto-generated method stub
		
	}

}
