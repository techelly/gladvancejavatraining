package java8features.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeMain {

	public static void main(String[] args) {
		Employee employee1 = new Employee(); //Using new keyword No-arg constructor method is invoked
		employee1.setEmpNo(1);
		employee1.setEmpName("Pavan");
		
		Employee employee2 = new Employee(5,"Hemanth");
		Employee employee3 = new Employee(4,"Ankita");
		Employee employee4 = new Employee(3,"Bob");
		Employee employee5 = new Employee(2,"Valdimir Putin");
		//Collection of employees. Employee objects are stored in an ArrayList
		List<Employee> empList = new ArrayList<Employee>();
		empList.add(employee1);
		empList.add(employee2);
		empList.add(employee3);
		empList.add(employee4);
		empList.add(employee5);
		//Unsorted empList
		System.out.println(empList);
		
		System.out.println("******************Sort By Emp No *********************");
		Collections.sort(empList,new SortEmployeeByEmpNo());
		empList.forEach(System.out::println);
		
		System.out.println("******************Sort By Emp Name *********************");
		Collections.sort(empList,new SortEmployeeByName());
		empList.forEach(System.out::println);

	}

}
