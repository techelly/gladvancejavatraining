package soliddesignprinciples.dip;

public class DIPMainApp {
	/**
	 * It depends on abstractions not on concretions. -- 
	 * The high level module must never rely on any low-level module
	 */
	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.setEmpId(1);
		emp.setEmpName("Manish");
		Department dept = new Department();
		emp.setDepartment(dept);
	}
	
	
}
