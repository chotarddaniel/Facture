
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
		
		factureDuMardi.listeAchats = lireAchats(); // dans l'objet qui est du type de la classe aui est de la sorte facture aue j4ecrase et aue je met le tableau
		factureDuMardi = factureDuMardi.preparerFacture();
		factureDuMardi.afficherFacture();
	}
	
	
	
	
	public static float [] lireAchats()
	{
		float [] listeAchats = new float [5];
		listeAchats [0] = 2.7f;
		listeAchats [1] = 6f;
		listeAchats [2] = 8.2f;
		listeAchats [3] = 4.25f;
		listeAchats [4] = 1.0f;
		
		return listeAchats;
		//faire un return avec les valeurs de dans 
	}
	
	
	
	
}