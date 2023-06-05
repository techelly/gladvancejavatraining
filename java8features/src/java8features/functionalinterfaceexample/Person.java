package java8features.functionalinterfaceexample;

import java.time.LocalDate;

public class Person {
	private String name;
	private Double salary;
	private LocalDate dob;

	public Person() {
		// TODO Auto-generated constructor stub
	}

	public Person(String name) {

		this.name = name;
	}

	public Person(String name, Double salary, LocalDate dob) {

		this.name = name;
		this.salary = salary;
		this.dob = dob;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", salary=" + salary + ", dob=" + dob + "]";
	}

}
