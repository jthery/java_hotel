package management_hotel;

import java.util.*;
import java.time.*;

public class Booking {
	
	static ArrayList<Booking> booking = new ArrayList<>(); 
	
	/** VARIABLES **/
	private int day;
	private int month;
	private int years;
	private LocalDate date;
	
	public void afficherMenuPrincipal() {
		System.out.println("---- Bienvenue au Grand Hotel BelleVue ----");
		System.out.println("1. Lister les chambres \n2. Réserver une chambre \n3. Afficher les réservation \n4. Informations générales \n5. Quitter l'application");
		System.out.println("-------------------------------------------");
		System.out.println("Choix :");
	}
	
	public void getAllBedroom() {
		/** ----- 1. Lister les chambres ----- **/
		/** INSTANCE Single bedroom **/
		SingleBedroom singleA = new SingleBedroom(1, 300, "simple A", 100);
		singleA.createSingleRoom(singleA);

		SingleBedroom singleB = new SingleBedroom(1, 300, "simple B", 101);
		singleB.createSingleRoom(singleB);

		SingleBedroom singleC = new SingleBedroom(1, 300, "simple C", 102);
		singleC.createSingleRoom(singleC);

		/** INSTANCE Family bedroom **/
		FamilyBedroom familyA = new FamilyBedroom(5, 459, "family A", 200);
		familyA.createFamilyRoom(familyA);

		FamilyBedroom familyB = new FamilyBedroom(6, 559, "family B", 201);
		familyB.createFamilyRoom(familyB);

		/** INSTANCE Suite bedroom **/
		SuiteBedroom suiteA = new SuiteBedroom(10, 659, "suite A", 300);
		suiteA.createSuiteRoom(suiteA);
		
		/** GET ALL BEDROOM **/
		singleA.getBedroom();
	}
	
	/** --------------- GETTERS AND SETTERS ----------------- **/
	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYears() {
		return years;
	}

	public void setYears(int years) {
		this.years = years;
	}
}
