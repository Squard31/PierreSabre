package histoire;

import personnages.Humain;
import personnages.Commercant;

public class HistoireTP4 {

	public static void main(String[] args) 
	{
		Commercant marco = new Commercant ("Marco", "the", 100);
		marco.direBonjour();
		
		marco.seFaireExtorquer(15);
		marco.recevoir(15);
		
		marco.boire();
	}

}
