package management_hotel;
import java.time.LocalDate;
import java.util.Scanner;

public class Hotel {

	public static void main(String [] args) {
		int capacityClient;
		String dateBooking;
		LocalDate lt;
		
		Booking booking = new Booking();
		Bedroom bedroom = new Bedroom();
		SingleBedroom singlebedroom = new SingleBedroom();
		FamilyBedroom familybedroom = new FamilyBedroom();
		SuiteBedroom suitebedroom = new SuiteBedroom();
	
		booking.afficherMenuPrincipal();
		bedroom.createAllBedroom();
		
		Scanner scanner = new Scanner(System.in);
		int choice = scanner.nextInt();
		

		if(choice != 1 && choice != 2 && choice != 3 && choice != 4 && choice != 5) {
			System.out.println("Saisissez un choix valable !");
		} else if (choice == 1){
			/** GET ALL BEDROOM **/
			bedroom.getAllBedroom();
			booking.afficherMenuPrincipal();
		} else if (choice == 2) {
			System.out.println("--------- Réservation d'une chambre ---------");
			
			System.out.println("Date de réservation : ");
			dateBooking = scanner.next();
			lt = LocalDate.parse(dateBooking);
			
			System.out.println("Nombre de personnes :");
			capacityClient = scanner.nextInt();
			
			System.out.println("Chambres correspondante :");
			if (capacityClient > 0 && capacityClient <= 3 ) {
				System.out.println("Selectionner le numéro de la chambre :");
				singlebedroom.getSingleRoom();
				int numberBedroom = scanner.nextInt();
				SingleBedroom.compareForBooking(numberBedroom);
			} else if (capacityClient > 3 && capacityClient < 10 ) {
				familybedroom.getFamilyRoom();
			} else {
				suitebedroom.getSuiteBedroom();
			}
			

		
			
			
			System.out.println("La chambre est réservée");
			System.out.println("------------------------------------");
			System.out.println("Récapitulatif de la réservation : " + "\n" + "Nombre de personnes : " + capacityClient + "\n" + "Date de réservation : " + lt + "\n");
		} else if (choice == 3) {

		} else if (choice == 4) {
			
			System.out.println("1. Informations Hotel \n2. Informations propriétaires \n3. Retour");
			int choice2 = scanner.nextInt();
			if (choice2 == 1) {
				System.out.println("Le Grand Hotel BelleVue \n12 rue des Oliviers, 83000 Cavalaires \n03.XX.XX.XX.XX");
			} else if (choice2 == 2) {
				Owner owner = new Owner("Paul", " Delaroche", "32 rue Casimir Beugnet, 62300 Lens", null, "06.XX.XX.XX.XX");
				owner.getOwner();
			} else {	
				booking.afficherMenuPrincipal();
			}
			
		} else {
			System.out.println("Fermeture du portail de réservation");
			System.exit(0);
		}

	}
}


