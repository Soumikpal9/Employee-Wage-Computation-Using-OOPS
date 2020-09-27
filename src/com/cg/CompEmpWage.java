package com.cg;

public class CompEmpWage {
	//Instance Variables
	public final String company;
	public final int empRatePerHour;
	public final int noOfWorkingDays;
	public final int maxWorkingHours;
	public int totalEmpWage;
	
	//Constructor
	public CompEmpWage(String company, int empRatePerHour, int noOfWorkingDays, int maxWorkingHours) {
		this.company = company;
		this.empRatePerHour = empRatePerHour;
		this.noOfWorkingDays = noOfWorkingDays;
		this.maxWorkingHours = maxWorkingHours;
	}
	
	public void SetTotalEmpWage(int totalEmpWage) {
		this.totalEmpWage = totalEmpWage;
	}
	
	@Override
	public String toString() {
		return "Employee wage for " + company + " is " + totalEmpWage;
	}
	
}
