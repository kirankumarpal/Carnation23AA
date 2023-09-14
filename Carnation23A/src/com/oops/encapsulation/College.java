package com.oops.encapsulation;

public class College {
	private Name name;
	private int rollNo;
	private Address address;
	private String mobileNo;
	private int percentage;

	public Name getName() {
		return name;
	}

	public void setName(Name name) {
		this.name = name;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		if (rollNo < 1) {
			System.out.println("Invalid Roll No." + rollNo);
		} else {
			this.rollNo = rollNo;
		}
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		if (mobileNo.length() < 10 || mobileNo.length() > 10) {
			System.out.println("Invalid Mobile No.");
		} else {
			this.mobileNo = mobileNo;
		}
	}

	public int getPercentage() {
		return percentage;
	}

	public void setPercentage(int percentage) {
		if (percentage < 0) {
			System.out.println("Invalid percentage: " + percentage);
		} else if (percentage >= 0 && percentage < 40) {
			System.out.println("You are failed: " + percentage);
		} else if (percentage >= 40 && percentage <= 100) {
			this.percentage = percentage;
		}
	}

}
