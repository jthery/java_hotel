package management_hotel;

import java.time.LocalDate;
import java.util.ArrayList;

public class Bedroom {
	private int capacity;
	private double price;
	private String name;
	private int number;
	private LocalDate dateBedroom;
	
	static ArrayList<Bedroom> bedroom = new ArrayList<>();
	
	public Bedroom() { }
	
	public Bedroom (int capacity, double price, String name, int number) {
		this.capacity = capacity;
		this.price = price;
		this.name = name;
		this.number = number;
	}
	
	public void getAllBedroom() {
		for (Bedroom event: bedroom) {
			System.out.println(" Numéro : " + event.getNumber() + " Nom : "+ event.getName() + " Capacité : "+ event.getCapacity() + " Prix : "+ event.getPrice() + "€");
		}
	}
	
	public void createAllBedroom() {
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
	
	}
	
	/** --------------- GETTERS AND SETTERS ----------------- **/
	
	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
	public LocalDate getDateBedroom() {
		return dateBedroom;
	}

	public void setDateBedroom(LocalDate dateBedroom) {
		this.dateBedroom = dateBedroom;
	}

}