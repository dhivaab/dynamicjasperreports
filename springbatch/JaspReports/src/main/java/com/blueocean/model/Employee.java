package com.blueocean.model;

public class Employee {

	private Integer empNo;
	private String name;
	private Integer salary;
	private Float commission;

	public Employee() {
	}

	public Employee(Integer empNo, String name, Integer salary, Float commission) {
		super();
		this.empNo = empNo;
		this.name = name;
		this.salary = salary;
		this.commission = commission;
	}

	public Integer getEmpNo() {
		return empNo;
	}

	public void setEmpNo(Integer empNo) {
		this.empNo = empNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	public Float getCommission() {
		return commission;
	}

	public void setCommission(Float commission) {
		this.commission = commission;
	}
}