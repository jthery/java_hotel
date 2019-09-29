package management_hotel;
import java.util.ArrayList;

public class FamilyBedroom extends Bedroom {
	static ArrayList<FamilyBedroom> family = new ArrayList<FamilyBedroom>();
	
	public FamilyBedroom(int capacity, double price, String name, int number) {
		super(capacity, price, name, number);
	}
	
	public void createFamilyRoom(FamilyBedroom familybedroom) {
		family.add(familybedroom);
		bedroom.add(familybedroom);
	}
	
	public void getFamilyRoom() {
		for (FamilyBedroom event: family) {
			System.out.println(" Num�ro : " + event.getNumber() + " Nom : "+ event.getName() + " Capacit� : "+ event.getCapacity() + " Prix : "+ event.getPrice() + "�");
		}
	}
}
