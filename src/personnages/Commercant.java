package personnages;

public class Commercant extends Humain 
{
	// CONSTRUCTEUR DE LA SOUS-CLASSE "Commercant"
	
	public Commercant (String nom, String boissonFavorite, int argent)
	{
		super (nom, boissonFavorite = "the", argent);
	}
	
	
	// METHODE "seFaireExtorquer"
	
	public int seFaireExtorquer(int vol)
	{
		perdreArgent(vol);
		System.out.println("J'ai tout perdu ! Le monde est vraiment trop injuste");
		return getArgent();
	}
	
	
	// METHODE "recevoir"
	
	public void recevoir(int argent)
	{
		gagnerArgent(argent);
		System.out.println(parler() + argent + " sous ! Je te remercie généreux donateur ");
	}
}
