package personnages;

import personnages.Yakuza;

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
	
	
	// METHODE "provoquer"
	
	public void provoquer(Yakuza adversaire)
	{
		System.out.println(parler() + " Je t'ai retrouvé vermine, tu vas payer pour ce que tu as fait à ce pauvre"
				+ " marchand!");
		
		if (honneur >= adversaire.getReput())
		{
			honneur += 1;
			System.out.println("Je t'ai eu petit Yakuza");
		}
		else
		{
			honneur -= 1;
			System.out.println("J'ai perdu contre ce yakuza, mon honneur et ma bourse ont en pris un coup");
		}
	}
	
	
}
