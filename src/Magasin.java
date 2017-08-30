
public class Magasin 
{		
	public static void main(String[] args) {
		
		
		// Ce n'etait que sa recette, aucun espace mémoire n'est utilisé avec juste ceci
		Facture factureDuLundi = new Facture(); // on crée pour vrai les variables de la recettes (listeAchats, sousTotal, tps, tpq, total)
		
		float tpsLundi = factureDuLundi.tps; // Lecture l'objet  et remplissage de tpsLundi par factureDuLundi.tps
		factureDuLundi.tps = 5f;//Ecriture dans facture du lundi
		
		// Facture.tps = incorrect car la facture ne reserve pas d'espace
		// factureDuLundi.tps = 5f; correct
		
		
		Facture factureDuMardi = new Facture(); // instanciation    creer un objet 
		float tpsMardi = factureDuMardi.tps; //
		
		factureDuMardi.lireAchats(); // dans l'objet qui est du type de la classe aui est de la sorte facture aue j4ecrase et aue je met le tableau
		factureDuMardi = factureDuMardi.preparer();
		factureDuMardi.afficher();
	}
	
	
	
	
	
	
	
	
}