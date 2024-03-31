package personnages;

public class Humain 
{
	private String nom;
	private String boisson;
	protected int argent;
	
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
	
	protected String parler()
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
		
		protected void perdreArgent(int perte)
		{
			argent = argent - perte;
		}
}
