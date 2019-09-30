package management_hotel;
import java.util.ArrayList;

public class SingleBedroom extends Bedroom {
	static ArrayList<SingleBedroom> single = new ArrayList<SingleBedroom>();
	
	public SingleBedroom() {
		super();
	}
	
	public SingleBedroom(int capacity, double price, String name, int number) {
		super(capacity, price, name, number);
	}
	
	public void createSingleRoom(SingleBedroom singlebedroom) {
		single.add(singlebedroom);
		bedroom.add(singlebedroom);
	}
	
	public void getSingleRoom() {
		for (SingleBedroom event: single) {
			System.out.println(" Numéro : " + event.getNumber() + " Nom : "+ event.getName() + " Capacité : "+ event.getCapacity() + " Prix : "+ event.getPrice() + "€");
		}
	}
	
	public static void removeBedroom(SingleBedroom singlebedroom) {
		single.remove(singlebedroom);
	}
	
	public static void compareForBooking(int numberBedroomScan) {
		Boolean exist = false;
		
		for (SingleBedroom event: single) {
			if(numberBedroomScan == event.getNumber()) {
				exist = true;
				removeBedroom(event);
				Booking booking = new Booking(" Numéro : " + event.getNumber() + " Nom : "+ event.getName() + " Capacité : "+ event.getCapacity() + " Prix : "+ event.getPrice() + "€");
				booking.createBooking(booking);
				break;
			}

		}
	}
		
}
