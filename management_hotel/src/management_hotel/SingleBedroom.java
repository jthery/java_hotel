package management_hotel;
import java.util.*;

public class SingleBedroom extends Bedroom {

	public SingleBedroom(int capacity, double price, String name, int number) {
		super(capacity, price, name, number);
	}
	
	int n = 3;
	ArrayList<Integer> arraySingle = new ArrayList<Integer>(n);
	
    ArrayList<Integer> single1 = new ArrayList<Integer>(); 
    single1.add(1)
    single1.add(2)
    arraySingle.add(single1)

    ArrayList<Integer> single2 = new ArrayList<Integer>(); 
    single2.add(5)
    arraySingle.add(single2)

    ArrayList<Integer> single3 = new ArrayList<Integer>(); 
    single3.add(10)
    single3.add(20)
    single3.add(30)
    arraySingle.add(single3)

    for (int i = 0; i < arraySingle.size(); i++) { 
        for (int j = 0; j < arraySingle.get(i).size(); j++) { 
            System.out.print(arraySingle.get(i).get(j) + " "); 
        } 
        System.out.println("GOOD"); 
    } 
	
}
