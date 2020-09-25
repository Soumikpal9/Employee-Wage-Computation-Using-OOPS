package com.cg;

//UC8
public class EmpWageBuilder {
	//Constants
	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;
	
	public static void computeEmpWage(String company, int empRatePerHour, int noOfWorkingDays, int maxWorkingHours) {
		//Variables
		int empHrs = 0;
		int totalHrs = 0;
		int totalDays = 0;
		int empWage = 0;
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
		System.out.println("Employee wage for : "+ company + " is " + empWage);
	}
	
	public static void main(String[] args) {
		computeEmpWage("Capgemini", 20, 22, 100);
		computeEmpWage("Wipro", 20, 22, 90);
	}
}
