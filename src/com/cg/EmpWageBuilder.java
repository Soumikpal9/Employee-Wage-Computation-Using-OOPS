package com.cg;

public class EmpWageBuilder {
	//Constants
	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;
	
	//Instance Variables
	private final String company;
	private final int empRatePerHour;
	private final int noOfWorkingDays;
	private final int maxWorkingHours;
	private int empWage;
	
	//Constructor
	public EmpWageBuilder(String company, int empRatePerHour, int noOfWorkingDays, int maxWorkingHours) {
		this.company = company;
		this.empRatePerHour = empRatePerHour;
		this.noOfWorkingDays = noOfWorkingDays;
		this.maxWorkingHours = maxWorkingHours;
	}
	
	//Method
	public void computeEmpWage() {
		//Variables
		int empHrs = 0;
		int totalHrs = 0;
		int totalDays = 0;
		//Computation
		while(totalHrs <= maxWorkingHours && totalDays <= noOfWorkingDays) {
			totalDays++;
			int empcheck = (int)Math.floor(Math.random() * 10) % 3;
			switch(empcheck) {
				case IS_PART_TIME:
					empHrs = 4;
					break;
				case IS_FULL_TIME:
					empHrs = 8;
					break;
				default:
				empHrs = 0;
			}
			totalHrs += empHrs;
			System.out.println("Day : " + totalDays + "		Employee hours : " + empHrs);
		}
		empWage = totalHrs * empRatePerHour;
	}
	
	//@Override
	public String toString() {
		return "Employee wage for " + company + " is " + empWage;
	}
	
	public static void main(String[] args) {
		EmpWageBuilder capg = new EmpWageBuilder("Capgemini", 20, 22, 100);
		EmpWageBuilder wipro = new EmpWageBuilder("Wipro", 20, 22, 90);
		capg.computeEmpWage();
		System.out.println(capg);
		wipro.computeEmpWage();
		System.out.println(wipro);
	}
}
