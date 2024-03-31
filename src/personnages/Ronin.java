package personnages;

public class Ronin extends Humain
{
	private int honneur;
	
	// CONSTRUCTEUR POUR LA CLASSE RONIN
	
	public Ronin (String nom, String boisson, int argent, int honneur)
	{
		super(nom, boisson, argent);
		this.honneur = honneur = 1;
	}
	
	
	// METHODE "donner"
	
	public void donner(Commercant beneficiaire)
	{
		System.out.println(beneficiaire.getNom() + " prend ces ");
	}
}
