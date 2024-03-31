package histoire;

import personnages.Humain;
import personnages.Commercant;
import personnages.Yakuza;

public class HistoireTP4 {

	public static void main(String[] args) 
	{
		Commercant marco = new Commercant ("Marco", "the", 100);
		Yakuza yaku  = new Yakuza("Yaku Le Noir", "whisky", 30, "Warsong", 0);
		
		yaku.direBonjour();
		yaku.extorquer(marco);
		
		marco.seFaireExtorquer(15);
		yaku.gagnerArgent(15);
		
		System.out.println("J’ai piqué les 15 sous de " + marco.getNom() + ", ce qui "
				+ "me fait " + yaku.getArgent() + " sous dans ma poche. Hi ! Hi !");
	}

}
