package management_hotel;
import java.util.ArrayList;

public class SingleBedroom extends Bedroom {
	static ArrayList<Bedroom> single = new ArrayList<Bedroom>();
	
	public SingleBedroom(int capacity, double price, String name, int number) {
		super(capacity, price, name, number);
	}
	
	public void createSingleRoom(SingleBedroom singlebedroom) {
		single.add(singlebedroom);
	}
}
