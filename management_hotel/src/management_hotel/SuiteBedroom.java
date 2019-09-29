package management_hotel;
import java.util.ArrayList;

public class SuiteBedroom extends Bedroom {
	static ArrayList<SuiteBedroom> suite = new ArrayList<SuiteBedroom>();
	
	public SuiteBedroom(int capacity, double price, String name, int number) {
		super(capacity, price, name, number);
	}
	
	public void createSuiteRoom(SuiteBedroom suitebedroom) {
		suite.add(suitebedroom);
		bedroom.add(suitebedroom);
	}
	
	public void getSuiteBedroom() {
		for (SuiteBedroom event: suite) {
			System.out.println(" Num�ro : " + event.getNumber() + " Nom : "+ event.getName() + " Capacit� : "+ event.getCapacity() + " Prix : "+ event.getPrice() + "�");
		}
	}

}