package magasin;
import magasin.modele.Facture;

public class Magasin 
{		
	public static void main(String[] args) {
		
		
		// Ce n'etait que sa recette, aucun espace m�moire n'est utilis� avec juste ceci
		Facture factureDuLundi = new Facture(); // on cr�e pour vrai les variables de la recettes (listeAchats, sousTotal, tps, tpq, total)
		
		float tpsLundi = factureDuLundi.tps; // Lecture l'objet  et remplissage de tpsLundi par factureDuLundi.tps
		factureDuLundi.tps = 5f;//Ecriture dans facture du lundi
		
		// Facture.tps = incorrect car la facture ne reserve pas d'espace
		// factureDuLundi.tps = 5f; correct
		
		
		Facture factureDuMardi = new Facture(); // instanciation    creer un objet 
		factureDuMardi.preparer();
		factureDuMardi.afficher();
	}
	
	
	
	
	
	
	
	
}