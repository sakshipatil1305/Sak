package com.pojo;

public class Employee {
	
	private int empid,salary;
	private String name;
	
	public Employee() {
		empid=23;
		salary=39234;
		name="no name";
		
		
	}
	public Employee(int empid,String name,int salary) {
		super();
		this.empid=empid;
		this.salary=salary;
		this.name=name;
		
		
	}
 public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
