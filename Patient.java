package assignments;

/*
 *Class: CMSC203 CRN 34473
 *Program: Assignment 2
 *Instructor: Khandan Monshi
 *Summary of Description: Build interface showing a patients procedures and cost
 *Due Date: 02/26/2024 
 *Integrity Pledge: I pledge that I have completed the programming assignment independently.
 *I have not copied the code from a student or any source.
*/

public class Patient {
	private String name;
	private String address;
	private String EmergencyContact;

	public Patient(String name, String address, String contact) {
		this.name = name;
		this.address = address;
		this.EmergencyContact = contact;
	}
	
	public String getName() {
		return name;
	}
	
	public String getaddress() {
		return address;
	}
	
	public String getcontact() {
		return EmergencyContact;
	}
	
	public void setName(String newName) {
		this.name = newName;
	}
	
	public void setaddress(String newaddress) {
		this.address = newaddress;
	}
	
	public void setcontact(String newcontact) {
		this.EmergencyContact = newcontact;
	}
}