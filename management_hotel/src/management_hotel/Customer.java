package management_hotel;

import java.time.*;
import java.util.*;

public class Customer extends People {
	private String mail;
	private String phone;
	
	public Customer(String firstname, String lastname, String adress, LocalDate birthDate, String mail, String phone) {
		super(firstname, lastname, adress, birthDate);
		this.mail = mail;
		this.phone = phone;
	}
	
	/** --------------- GETTERS AND SETTERS ----------------- **/
	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
}
