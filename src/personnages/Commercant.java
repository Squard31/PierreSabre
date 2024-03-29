package personnages;

public class Commercant extends Humain 
{
	// CONSTRUCTEUR DE LA SOUS-CLASSE "Commercant"
	
	public Commercant (String nom, String boissonFavorite, int argent)
	{
		super (nom, boissonFavorite = "thé", argent);
	}
	
	
	// METHODE "seFaireExtorquer"
	public int seFaireExtorquer(int vol)
	{
		argent = argent - vol;
		return getArgent();
	}
}
