package management_hotel;

import java.util.ArrayList;

public class Bedroom {
	private int capacity;
	private double price;
	private String name;
	private int number;
	
	static ArrayList<Bedroom> bedroom = new ArrayList<>();
	
	public Bedroom (int capacity, double price, String name, int number) {
		this.capacity = capacity;
		this.price = price;
		this.name = name;
		this.number = number;
	}
	
	public void getBedroom() {
		for (Bedroom event: bedroom) {
			System.out.println(" Num�ro : " + event.getNumber() + " Nom : "+ event.getName() + " Capacit� : "+ event.getCapacity() + " Prix : "+ event.getPrice() + "�");
		}
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
}