package management_hotel;

public class Hotel {

	public static void main(String[] args) {
		System.out.println("----R�servation----");
		System.out.println(" 1. Lister les chambres \n 2. R�server une chambre \n 3. Afficher les r�servation \n 4. Quitter l'application");
		
		
		Bedroom bedroomTest = new Bedroom(0, 0, "inconnu", 0);
		System.out.println(bedroomTest);
	}

}
