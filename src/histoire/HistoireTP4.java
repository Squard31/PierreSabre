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
		Yakuza yaku  = new Yakuza("Yaku Le Noir", "whisky", 30, "Warsong", 0);
		Ronin roro = new Ronin("Roro", "shochu", 50, 1);
		
		roro.direBonjour();
		
		roro.donner(marco); System.out.println(" 6 sous");
		roro.perdreArgent(6);
		System.out.println(marco.parler() + " 6 sous ! Je te remercie généreux donateur! ");
	}

}
