package com.cybersoft.quanlynhansu.object;

public class HumanResources {
	// Properties
	protected String name, phoneNumber;
	protected int no;
	protected float daysWork, salaryPerDay;
	
	// getters and setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public float getDaysWork() {
		return daysWork;
	}
	public float getSalaryPerDay() {
		return salaryPerDay;
	}

	// Constructors
	public HumanResources(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}
	
	public HumanResources() {
		this.name = "";
		this.no = 0;
		this.phoneNumber = "115";
		this.daysWork = 22;
		this.salaryPerDay = 100;
	}


	// Methods
	public float totlaSalary() {
		return 0;
	}
	
	public void informationHr() {
		System.out.println("Thong tin nhan vien:");
		System.out.println("Ten nhan vien: " + name);
		System.out.println("So dien thoai nhan vien: " + phoneNumber);
		System.out.println("Ma so nhan vien: " + no);
	}
}
