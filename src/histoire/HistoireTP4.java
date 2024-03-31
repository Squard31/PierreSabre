package histoire;

import personnages.Humain;
import personnages.Commercant;
import personnages.Yakuza;
import personnages.Ronin;

public class HistoireTP4 {

	public static void main(String[] args) 
	{
		Humain eliott = new Humain ("Eliott", "coca", 100);
		Commercant marco = new Commercant ("Marco", "the", 100);
		Yakuza yaku  = new Yakuza("Yaku Le Noir", "whisky", 45, "Warsong", 4);
		Ronin roro = new Ronin("Roro", "shochu", 54, 1);
		
		roro.provoquer(yaku);
		yaku.gagner(roro.getArgent());
		roro.perdreArgent(roro.getArgent());
		yaku.gagnerArgent(roro.getArgent());
		
	}

}
