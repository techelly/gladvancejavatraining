package soliddesignprinciples.srp;

public class Department {
	private Integer deptId;
	private String dept;
	public Department(Integer deptId, String dept) {
		this.deptId = deptId;
		this.dept = dept;
	}
	public Integer getDeptId() {
		return deptId;
	}
	public void setDeptId(Integer deptId) {
		this.deptId = deptId;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "Department [deptId=" + deptId + ", dept=" + dept + "]";
	}
	
	
}
