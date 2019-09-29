package management_hotel;

import java.time.LocalDate;
import java.util.ArrayList;

public class Booking {
	
	static ArrayList<Booking> booking = new ArrayList<>(); 
	
	/** VARIABLES **/
	private int day;
	private int month;
	private int years;
	private LocalDate date;

	
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

	public void afficherInfos() {
		System.out.println("---- Réservation ----");
		System.out.println(" 1. Lister les chambres \n 2. Réserver une chambre \n 3. Afficher les réservation \n 4. Quitter l'application");
	}
	
	
}
