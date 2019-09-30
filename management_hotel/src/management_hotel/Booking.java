package management_hotel;

import java.util.*;
import java.time.*;

public class Booking extends Bedroom {

	static ArrayList<Booking> booking = new ArrayList<>(); 
	
	/** VARIABLES **/
	private LocalDate bookingDate;
	
	public Booking() { 
		super();
		bookingDate = null;
	};
	
	public Booking(int capacity, double price, String name, int number, LocalDate bookingDate) {
		super(capacity, price, name, number);
		this.bookingDate = bookingDate;
	}
	
	public void afficherMenuPrincipal() {
		System.out.println("---- Bienvenue au Grand Hotel BelleVue ----");
		System.out.println("1. Lister les chambres \n2. R�server une chambre \n3. Afficher les r�servation \n4. Informations g�n�rales \n5. Quitter l'application");
		System.out.println("-------------------------------------------");
		System.out.println("Choix :");
	}
	
	public void createBooking(Booking createBooking) {
		booking.add(createBooking);
	}
	
	public void getBookingBedroom() {
		for(Booking event: booking) {
			System.out.println(" Num�ro : " + event.getNumber() + " Nom : "+ event.getName() + " Capacit� : "+ event.getCapacity() + " Prix : "+ event.getPrice() + "�");
            System.out.println ("-------------------");    
        }
	}
	/** --------------- GETTERS AND SETTERS ----------------- **/
	public LocalDate getBookingDate() {
		return bookingDate;
	}

	public void setBookingDate(LocalDate bookingDate) {
		this.bookingDate = bookingDate;
	}
	
}
