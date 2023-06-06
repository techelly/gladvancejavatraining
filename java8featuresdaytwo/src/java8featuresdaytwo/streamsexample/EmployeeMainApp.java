package java8featuresdaytwo.streamsexample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeMainApp {

	public static void main(String[] args) {
		Department marketing = new Department(1, "Marketing");
		Department finance = new Department(2, "Finance");
		Department informationTech = new Department(3, "IT");
		Department operations = new Department(4, "Operations");

		Employee emp1 = new Employee(1, "Rakesh", marketing, 15000.00, 23, "Associate");
		Employee emp2 = new Employee(2, "Rajesh", finance, 15500.00, 26, "Manager");
		Employee emp3 = new Employee(3, "Ram", marketing, 25000.00, 25, "Sr Associate");
		Employee emp4 = new Employee(4, "Raja", operations, 15500.00, 25, "Associate");
		Employee emp5 = new Employee(5, "Kumar", marketing, 45000.00, 27, "Director");
		Employee emp6 = new Employee(6, "Sita", finance, 65500.00, 21, "VP");
		Employee emp7 = new Employee(7, "Geeta", informationTech, 35000.00, 22, "Associate");
		Employee emp8 = new Employee(8, "Neeta", operations, 11500.00, 29, "Director");

		List<Employee> empList = new ArrayList<Employee>();
		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);
		empList.add(emp4);
		empList.add(emp5);
		empList.add(emp6);
		empList.add(emp7);
		empList.add(emp8);
		/**
		 * Group by department
		 * IT- List of Employee
		 */
		Map<Department, List<Employee>> groupedEmployee = empList.stream().collect(Collectors.groupingBy(Employee::getDepartment));
		System.out.println(groupedEmployee);

		
		Map<String, List<Employee>> groupedEmployeeByTitle = empList.stream().collect(Collectors.groupingBy(Employee::getJobTitle));
		System.out.println(groupedEmployeeByTitle);
		
		System.out.println("**********************************************************");
		//Below max is a terminal operation
		Optional<Employee> employeeWithMaxSalary =empList.stream().max(Comparator.comparing(Employee::getSalary));
		
		if(employeeWithMaxSalary.isPresent()) {
			System.out.println(employeeWithMaxSalary.get());
		}
		
		

		System.out.println("*******************************In a stream we have two types of oeprations Terminal and Intermediate Operation **************************");
		//Below collect method is part of intermediate operation
		Optional<Employee> highestPaidEmployeeWrapper = empList.stream()
				.collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)));

		Employee highestPaidEmployee = highestPaidEmployeeWrapper.get();
		System.out.println(highestPaidEmployee);
		
		empList.stream()
		.collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary))).get();
		
		
		/**
		 * Collectors.maxBy method
		 * Collectors is a utility class which provides various implementations of reduction operations such as 
		 * grouping,collecting and summarizing elements.
		 * 
		 */
		//List of numbers
		List<Integer> listOfNumbers = Arrays.asList(10,4,12,15,11,17,18,20);
		Stream<Integer> numStream = listOfNumbers.stream();
		Optional<Integer> maxElement= numStream.collect(Collectors.maxBy(Comparator.naturalOrder()));
		System.out.println(maxElement.get());
		
		//List of String type data
		List<String> listOfProgrammingLanguage = Arrays.asList("Java","Javascript","Python","GoLang","DotNet");
		Stream<String> plStream = listOfProgrammingLanguage.stream();
		
		Optional<String> maxPLElement =plStream.collect(Collectors.maxBy(Comparator.naturalOrder()));
		System.out.println(maxPLElement.get());
		
		
		/**
		 * Find top 5 employees with higher salary.
		 */
		List<Employee> top5Employees = 	empList.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).limit(5).collect(Collectors.toList());
		System.out.println(top5Employees);
		
		/**
		 * Display all directors
		 */
		System.out.println(groupedEmployeeByTitle);
		System.out.println(groupedEmployeeByTitle.get("Director"));
	}

}
