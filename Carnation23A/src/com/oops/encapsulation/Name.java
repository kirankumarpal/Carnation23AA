package com.oops.encapsulation;

public class Name {

	private String firstName;
	private String middleName;
	private String lastName;

	@Override
	public String toString() {
		return firstName + " " + middleName + " " + lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
		String a = this.firstName.substring(0, 1); // starts at zero index and ends at 1(index)-1
		String b = this.firstName.substring(1); // starts at 2nd index till last index
		a = a.toUpperCase();
		b = b.toLowerCase();
		this.firstName = a + b;

//		this.firstName = firstName;
//		this.firstName = this.firstName.toLowerCase();
//		char c = this.firstName.charAt(0);
//		char d = Character.toUpperCase(c);
//		this.firstName = this.firstName.replace(c, d);
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
		String a = this.middleName.substring(0, 1);
		String b = this.middleName.substring(1);
		a = a.toUpperCase();
		b = b.toLowerCase();
		this.middleName = a + b;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
		String a = this.lastName.substring(0, 1);
		String b = this.lastName.substring(1);
		a = a.toUpperCase();
		b = b.toLowerCase();
		this.lastName = a + b;
	}

}
