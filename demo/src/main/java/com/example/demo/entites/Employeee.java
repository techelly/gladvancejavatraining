package com.example.demo.entites;

public record Employeee(Integer empId,String empName) {
	//non-static fields
	//private Double salary;
	public static Double salary;
	
	public void dispaly() {
		System.out.println("I am non static method display inside record Employee");
	}
	
	public static void displayInfo() {
		System.out.println("I am static method displayInfo inside record Employee");
	}
}
