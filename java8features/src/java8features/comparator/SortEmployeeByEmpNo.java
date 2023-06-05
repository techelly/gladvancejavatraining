package java8features.comparator;

import java.util.Comparator;
//Custom Comparator class
public class SortEmployeeByEmpNo implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		
		return o1.getEmpNo() - o2.getEmpNo();
	}

}
