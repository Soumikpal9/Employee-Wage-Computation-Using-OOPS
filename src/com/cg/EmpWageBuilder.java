package com.cg;

//UC5
public class EmpWageBuilder {
	//Constants
	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;
	public static final int EMP_RATE_PER_HOUR =20;
	public static final int NO_OF_WORKING_DAYS =20;
	public static final int NO_OF_EMPLOYEES = 10;
	
	public static void main(String[] args) {
		//Variables
		int empHrs = 0;
		int empWage = 0;
		int totalEmpWage = 0;
		//Computation
		for(int i=0;i<NO_OF_EMPLOYEES;i++) {
			for(int j=0;j<NO_OF_WORKING_DAYS;j++) {
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
				empWage = empHrs * EMP_RATE_PER_HOUR;
				totalEmpWage += empWage;
			}
			System.out.println("Employee wage : " + totalEmpWage);
		}
	}
}
