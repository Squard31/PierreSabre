package personnages;

public class Humain 
{
	private String nom;
	private String boisson;
	protected int argent;
	private Humain[] Connaissance = new Humain[30];
	private int nbConnaissance = 0;
	
	// CONSTRUCTEUR
	
	public Humain (String nom, String boisson, int argent)
	{
		this.nom = nom;
		this.boisson = boisson;
		this.argent = argent;
	}
	
	
	// GETTER POUR LE NOM
	
	public String getNom()
	{
		return nom;
	}
	
	
	// GETTER POUR L'ARGENT
	
	public int getArgent()
	{
		return argent;
	}
	
	
	// METHODE "parler"
	
	public String parler()
	{
		return("L'Humain " + nom + " : ");
	}
	
	
	// METHODE "direBonjour"
	
		public void direBonjour()
		{
			System.out.println(parler() + " Bonjour ! Je m'apelle " + getNom() + " et j'aime boire du " + boisson );
		}
		
		
		// METHODE "boire"
		
		public void boire()
		{
			System.out.println(parler() + " Mmmm, un bon verre de " + boisson + "! " + "GLOUPS ! ");
		}
		
		
		// METHODE "acheter"
		
		public void acheter(String bien, int prix)
		{
			if (prix > getArgent()) 
			{
				System.out.println(parler() + " Je n'ai plus que " + getArgent() + " sous en poche. Je ne peux m�me pas offrir un " + bien + " � " + prix + " sous ");
			}
			else
			{
				System.out.println(" J'ai " + getArgent() + " sous en poche. Je vais pouvoir m'offrir " + bien + " � " + prix + " sous ");
			}
		}
		
		
		// METHODE "gagnerArgent"
		
		public void gagnerArgent(int gain)
		{
			argent = argent + gain;
		}
		
		
		// METHODE "perdreArgent"
		
		public void perdreArgent(int perte)
		{
			argent = argent - perte;
		}
		
		
		// METHODE "faireConnaissance"
		
		public void faireConnaissanceAvec(Humain humain)
		{
			direBonjour();
			repondre(humain);
			memoriser(humain);
			memoriser(this);
			
		}
		
		
		// METHODE "repondre"
		
		public void repondre(Humain humain)
		{
			humain.direBonjour();
		}
		
		
		// METHODE "memoriser"
		
		public void memoriser(Humain humain)
		{
			if (nbConnaissance >= Connaissance.length)
			{
				for (int j = 1 ; j < Connaissance.length ; j++)
				{
					Connaissance[j-1] = Connaissance[j]; 
				}
				Connaissance[Connaissance.length -1] = humain;
			}
			else
			{
				Connaissance[nbConnaissance] = humain;
				nbConnaissance = nbConnaissance + 1;
			}
		}
		
		
		// METHODE "afficherConnaissance"
		
		public void listeConnaissance()
		{
			for (int i = 0 ; i < Connaissance.length ; i++)
			{
				if (Connaissance[i] == null)
				{
					break;
				}
				System.out.print(Connaissance[i].nom + " ");
			}
			System.out.println();
		}
		
}
