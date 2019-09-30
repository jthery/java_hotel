package management_hotel;

import java.time.*;
import java.util.*;

public class People {
	private String firstname;
	private String lastname;
	private String adress;
	private LocalDate birthDate;
	
	public People (String firstname, String lastname, String adress, LocalDate birthDate) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.adress = adress;
		this.birthDate = birthDate;
	}
	
	/** --------------- GETTERS AND SETTERS ----------------- **/

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}
	
}