package management_hotel;

import java.time.*;
import java.util.*;

public class Owner extends People {
	private String numberOwner;

	public Owner(String firstname, String lastname, String adress, LocalDate birthDate, String numberOwner) {
		super(firstname, lastname, adress, birthDate);
		this.numberOwner = numberOwner;
	}
	
	public void getOwner() {
		System.out.println("Voici les coordonn�es du propri�taire :");
		System.out.println(getFirstname() + getLastname() + "\n" + getAdress() + "\n" + getNumberOwner());
	}
	
	/** --------------- GETTERS AND SETTERS ----------------- **/
	
	public String getNumberOwner() {
		return numberOwner;
	}

	public void setNumberOwner(String numberOwner) {
		this.numberOwner = numberOwner;
	}

}
