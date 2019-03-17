package com.app;

public class Employee {

	private int empId;
	private String empName;
	private String empSal;
	private String empEmail;

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpSal() {
		return empSal;
	}

	public void setEmpSal(String empSal) {
		this.empSal = empSal;
	}

	public String getEmpEmail() {
		return empEmail;
	}

	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSal=" + empSal + ", empEmail=" + empEmail
				+ "]";
	}

	public Employee(int empId, String empName, String empSal, String empEmail) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
		this.empEmail = empEmail;
	}

	public Employee() {
		super();
	}
}
