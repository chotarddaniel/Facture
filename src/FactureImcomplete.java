
public class FactureImcomplete {

	public static void main(String[] args) {
		//System.out.println(calculerSommePrix(listeAchats));
		//System.out.println("La taxe tps de 2 est" + calculerTaxeFederale(2));
		//System.out.println("La taxe tps de 1 est" + calculerTaxeProvincial(2));
		
		//System.out.println("Le sous total est" + sousTotal + "$");
		//System.out.println("Le grand total est" + total + "$");
		
		//soustotal = somme(listeAchats);
		//taxeFederale = sousTotal = 5%
		//taxeProvincial = (sousTotal + taxeFederale) = 9.5%
		//total = sousTotal + taxeFederal + TaxeProvinciale
		float [] listeAchats = lireAchats();
		float [] facture = preparerFacture(listeAchats);
		afficherFacture(facture, listeAchats);
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
	
	public static float [] preparerFacture(float [] listeAchats )
	{
		float sousTotal = calculerSommePrix(listeAchats);
		float tps = calculerTaxeFederale(sousTotal);
		float tvq = calculerTaxeProvincial(sousTotal);
		float total = sousTotal + tps + tvq;
		
		float [] facture = new float[4];
		
		facture[0] = sousTotal;
		facture[1] = tps;
		facture[2] = tvq;
		facture[3] = total;
		
		return facture;
		//faire un return avec les valeurs de dans 
	}
	public static void afficherFacture(float [] facture, float[] listeAchats)
	{
		for(int numeroAchat = 0; numeroAchat < listeAchats.length;numeroAchat++ )
		{
			float achat = listeAchats[numeroAchat];
			System.out.println(achat);
		}
		System.out.println("--------------------------");
		System.out.println("Sous-Total:" + facture[0] + "$");
		System.out.println("TPS:" + facture[1] + "$");
		System.out.println("TVQ:" + facture[2] + "$");
		System.out.println("--------------------------");
		System.out.println("Total:" + facture[3] + "$");
	}
	public static float calculerSommePrix(float [] listePrix)
	{
		float somme = 0;
		
		for(int position = 0; position < listePrix.length; position++)
		{
			somme += listePrix[position];
		}
		
		return somme;
	}
	
	public static float calculerTaxeFederale(float montant)
	{
		return montant = 0.05f;
	}
	
	public static float calculerTaxeProvincial(float montant)
	{
		return montant = 0.09975f;
	}
}