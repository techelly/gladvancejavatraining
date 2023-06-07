package java11and17featuresdaythree.java11features.accesscontrol;

public class Employee {
	private Integer empId;
	private String empName;
	public Employee(Integer empId, String empName) {
		this.empId = empId;
		this.empName = empName;
	}
	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + "]";
	}
	
}
