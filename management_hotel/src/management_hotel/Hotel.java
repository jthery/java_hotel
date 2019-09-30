package management_hotel;

import java.util.Scanner;

public class Hotel {

	public static void main(String[] args) {
		
		Booking booking = new Booking();
		booking.afficherMenuPrincipal();
		
		/** ---------- Saisie de l'USER ---------- **/
		Scanner scanner = new Scanner(System.in);
		int choice = scanner.nextInt();
		
		/** ---------- 1. RESERVER UNE CHAMBRE ---------- **/
		if(choice != 1 && choice != 2 && choice != 3 && choice != 4) {
			System.out.println("Saisissez un choix valable !");
		} else if (choice == 1){
			/** ----- 1. Lister les chambres ----- **/
			booking.getAllBedroom();
			booking.afficherMenuPrincipal();
		} else if (choice == 2) {
			/** ----- 2. Réserver une chambre ----- **/
		} else if (choice == 3) {
			/** ----- 3. Afficher les réservation ----- **/
		} else if (choice == 4) {
			/** ----- 4. Informations générales ----- **/
			System.out.println("1. Informations Hotel \n2. Informations propriétaires \n3. Retour");
			
			/** System.out.println("Le Grand Hotel BelleVue \n12 rue des Oliviers, 83000 Cavalaires \n03.XX.XX.XX.XX");
			Owner owner = new Owner("Paul", " Delaroche", "32 rue Casimir Beugnet, 62300 Lens", null, "06.XX.XX.XX.XX");
			owner.getOwner(); **/
		} else if (choice == 5) {
			/** ----- 5. Quitter l'application ----- **/
		}
		
		
	}
}
