package histoire;

import personnages.Humain;
import personnages.Commercant;
import personnages.Ronin;
import personnages.Yakuza;

public class HistoireTP5 
{
	
	// LE MAIN 
	
	public static void main (String[] args)
	{
		Commercant marco = new Commercant("Marco","coca", 20);
		Commercant chonin = new Commercant("Chonin","coca", 40);
		Commercant kumi = new Commercant("Kumi","fanta", 10);
		Yakuza yaku = new Yakuza("Yaku Le Noir", "whisky", 30, "Warsong", 4);
		Ronin roro = new Ronin("Roro", "shochu", 60, 1);
		
		marco.faireConnaissanceAvec(roro);
		marco.faireConnaissanceAvec(yaku);
		marco.faireConnaissanceAvec(chonin);
		marco.faireConnaissanceAvec(kumi);
		marco.listeConnaissance();
		roro.listeConnaissance();
		yaku.listeConnaissance();
	}
	
}
