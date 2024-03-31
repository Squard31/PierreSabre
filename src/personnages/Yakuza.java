package personnages;

public class Yakuza extends Humain
{
	private String clan;
	private int reput;


	// CONSTRUCTEUR POUR LES YAKUZAS
	
	public Yakuza (String nom, String boisson, int argent, String clan, int reput)
	{
		super(nom, boisson, argent = 30);
		this.clan = clan;
		this.reput = reput;
	}
	
	
	// METHODE "extorquer"
	
	public void extorquer(Commercant victime)
	{
		System.out.println("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ? ");
		System.out.println(victime.getNom() + ", si tu tiens à la vie donne moi ta bourse !");
	}
}
