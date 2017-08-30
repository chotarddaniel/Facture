package magasin.modele;
import java.text.NumberFormat;

public class Facture {
	
	protected float [] listeAchats = new float[5];
	protected float sousTotal;
	protected float tps;
	protected float tvq;
	protected float total;
	
	public Facture() // fonction constructeur aui met toute les vqriqbles a 0
	{
		this.sousTotal = 0;
		this.tps = 0;
		this.tvq = 0;
		this.total = 0;
		this.listeAchats = this.lireAchats();
	}
	
	public void afficher()
	{
		NumberFormat imprimeurNombres = NumberFormat.getCurrencyInstance();
		imprimeurNombres.setMaximumFractionDigits(2);
		imprimeurNombres.setMinimumIntegerDigits(2);
		
		for(int numeroAchat = 0; numeroAchat < this.listeAchats.length;numeroAchat++ )
		{
			float achat = this.listeAchats[numeroAchat];
			System.out.println(imprimeurNombres.format(achat) );
		}
		System.out.println("--------------------------");
		System.out.println("Sous-Total:" + imprimeurNombres.format(this.sousTotal) );
		System.out.println("TPS:" + imprimeurNombres.format(this.tps));
		System.out.println("TVQ:" + imprimeurNombres.format(this.tvq));
		System.out.println("--------------------------");
		System.out.println("Total:" + imprimeurNombres.format(this.total));
	}

	public Facture preparer()
	{
		this.sousTotal = calculerSommePrix(this.listeAchats);
		this.tps = calculerTaxeFederale(this.sousTotal);
		this.tvq = calculerTaxeProvincial(this.sousTotal);
		this.total = this.sousTotal + this.tps + this.tvq;		
		return this;
	}
	
	public static float calculerTaxeFederale(float montant)
	{
		return montant = 0.05f;
	}
	
	public static float calculerTaxeProvincial(float montant)
	{
		return montant = 0.09975f;
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
	
	public float [] lireAchats()
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

