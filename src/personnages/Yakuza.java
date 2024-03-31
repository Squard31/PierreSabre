package personnages;

import personnages.Ronin;

public class Yakuza extends Humain
{
	private String clan;
	private int reput;


	// CONSTRUCTEUR POUR LES YAKUZAS
	
	public Yakuza (String nom, String boisson, int argent, String clan, int reput)
	{
		super(nom, boisson, argent);
		this.clan = clan;
		this.reput = reput = 4;
	}
	
	
	// METHODE "extorquer"
	
	public void extorquer(Commercant victime)
	{
		System.out.println("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ? ");
		System.out.println(victime.getNom() + ", si tu tiens à la vie donne moi ta bourse !");
	}
	
	
	// METHODE "perdre"
	
	public int perdre()
	{
		reput = reput - 1;
		System.out.println("J’ai perdu mon duel et mes " + argent + " sous, snif... J'ai déshonoré le clan de "
				+ clan);
		perdreArgent(argent);
		return argent;
	}
	
	
	// METHODE "gagner"
	
	public void gagner(int gain)
	{
		gagnerArgent(gain);
		reput = reput + 1;
		System.out.println("Ce ronin pensait vraiment battre " + getNom() + " du clan de " + clan +
				" Je l'ai dépouillé de ses " + gain + " sous");
	}
	
	
	// METHODE getter "getReput"
	
	public int getReput()
	{
		return reput;
	}
}
