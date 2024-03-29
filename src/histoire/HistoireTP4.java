package histoire;

import personnages.Humain;

public class HistoireTP4 {

	public static void main(String[] args) 
	{
		Humain Nikita = new Humain("Nikita", "Mojito", 54);
		Nikita.direBonjour();
		
		Nikita.acheter("Mojito", 12);
		Nikita.perdreArgent(12);
		
		Nikita.boire();
		
		Nikita.acheter("jeu",2);
		Nikita.perdreArgent(2);
		
		Nikita.acheter("kimono", 50);
		
	}

}
