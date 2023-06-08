package soliddesignprinciples.srp;

public class EmployeeSRP {
	private Integer empNo;
	private String empName;
	private Double salary;
	public EmployeeSRP(Integer empNo, String empName, Double salary) {
		this.empNo = empNo;
		this.empName = empName;
		this.salary = salary;
	}
	public Integer getEmpNo() {
		return empNo;
	}
	public void setEmpNo(Integer empNo) {
		this.empNo = empNo;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "EmployeeSRP [empNo=" + empNo + ", empName=" + empName + ", salary=" + salary + "]";
	}
	
	
}
