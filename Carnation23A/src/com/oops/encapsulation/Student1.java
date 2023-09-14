package com.oops.encapsulation;

public class Student1 {

	public static void main(String[] args) {
		College obj = new College();
		Name n = new Name();
		n.setFirstName("kirankumar");
		n.setMiddleName("UttamKUMAR");
		n.setLastName("pAl");

		obj.setName(n);
		System.out.println("Name of student: " + obj.getName().getFirstName() + " " + obj.getName().getMiddleName()
				+ " " + obj.getName().getLastName());

		obj.setRollNo(5);
		System.out.println("Roll No.: " + obj.getRollNo());

		obj.setMobileNo("9922211467");
		System.out.println("Mobile No.: " + obj.getMobileNo());

		obj.setPercentage(50);
		System.out.println("Percentage: " + obj.getPercentage());

		Address add = new Address();
		add.setCity("Pune");
		add.setCountry("INDIA");
		add.setLocality("PCMC");
		add.setState("Maharashtra");
		add.setStreetName("87/4 Sector 18");
		obj.setAddress(add);
		System.out.println("Address: " + obj.getAddress());

	}
}