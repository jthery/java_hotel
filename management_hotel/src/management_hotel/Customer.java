package management_hotel;

import java.util.Date;

public class Customer extends People {
	String mail;
	String phoneNumber;
	
	public Customer(String name, String surname, String adress, Date birthDate) {
		super(name, surname, adress, birthDate);
	}
}
