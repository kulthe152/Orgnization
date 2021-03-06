package net.org.dto;

public class Employee {
	
	private long eid;
	private String empName;
	private double empSal;
	private String deptName;
	
	public long getEid() {
		return eid;
	}
	public void setEid(long eid) {
		this.eid = eid;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getEmpSal() {
		return empSal;
	}
	public void setEmpSal(double empSal) {
		this.empSal = empSal;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	
	//-------------------change request---------------------------------------
	
		public Employee(long eid, String empName, double empSal, String deptName) {
			super();
			this.eid = eid;
			this.empName = empName;
			this.empSal = empSal;
			this.deptName = deptName;
		}
		@Override
		public String toString() {
			return "Employee [eid=" + eid + ", empName=" + empName + ", empSal=" + empSal + ", deptName=" + deptName + "]";
		}
		
	
}

