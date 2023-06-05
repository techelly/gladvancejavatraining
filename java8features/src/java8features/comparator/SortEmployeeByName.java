package java8features.comparator;

import java.util.Comparator;
//Custom comparator class 
public class SortEmployeeByName implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		
		return o1.getEmpName().compareTo(o2.getEmpName());
	}

}
