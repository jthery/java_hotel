package management_hotel;
import java.util.ArrayList;

public class SingleBedroom extends Bedroom {
	static ArrayList<SingleBedroom> single = new ArrayList<SingleBedroom>();
	
	public SingleBedroom(int capacity, double price, String name, int number) {
		super(capacity, price, name, number);
	}
	
	public void createSingleRoom(SingleBedroom singlebedroom) {
		single.add(singlebedroom);
		bedroom.add(singlebedroom);
	}
	
	public void getSingleRoom() {
		for (SingleBedroom event: single) {
			System.out.println(" Num�ro : " + event.getNumber() + " Nom : "+ event.getName() + " Capacit� : "+ event.getCapacity() + " Prix : "+ event.getPrice() + "�");
		}
	}
}
