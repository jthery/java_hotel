package management_hotel;

import java.util.*;

public class Hotel {

	public static void main(String[] args) {
		System.out.println("---- Bienvenue au grand hotel BelleVue ----");
		System.out.println(" 1. Réserver une chambre \n 2. Les informations générales \n 3. Contact \n 4. Quitter l'application");
		
		Booking booking = new Booking();
		booking.afficherInfos();
		
		/** Observe la saisie du USER **/
		Scanner scanner = new Scanner(System.in);
		int choice = scanner.nextInt();
		
		/** ---------- INSTANCE Single bedroom ---------- **/
		SingleBedroom singleA = new SingleBedroom(1, 300, "simple A", 100);
		singleA.createSingleRoom(singleA);

		SingleBedroom singleB = new SingleBedroom(1, 300, "simple B", 101);
		singleB.createSingleRoom(singleB);

		SingleBedroom singleC = new SingleBedroom(1, 300, "simple C", 102);
		singleC.createSingleRoom(singleC);

		/** ---------- INSTANCE Family bedroom ---------- **/
		FamilyBedroom familyA = new FamilyBedroom(5, 459, "family A", 200);
		familyA.createFamilyRoom(familyA);

		FamilyBedroom familyB = new FamilyBedroom(6, 559, "family B", 201);
		familyB.createFamilyRoom(familyB);

		/** ---------- INSTANCE Suite bedroom ---------- **/
		SuiteBedroom suiteA = new SuiteBedroom(10, 659, "suite A", 300);
		suiteA.createSuiteRoom(suiteA);
		
		/** GET ALL BEDROOM **/
		singleA.getBedroom();
	}
}
