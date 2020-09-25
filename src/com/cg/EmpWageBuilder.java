package com.cg;

//UC2
public class EmpWageBuilder {
	//Constants
	public static final int IS_FULL_TIME = 1;
	public static final int EMP_RATE_PER_HOUR = 20;
	public static final int NO_OF_EMPLOYEES = 10;
	
	public static void main(String[] args) {
		//Variables
		int empHrs = 0;
		int empWage =0;
		//Computation
		for(int i=0;i<NO_OF_EMPLOYEES;i++) {
			double empcheck = Math.floor(Math.random() * 10) % 2;
			if(empcheck == IS_FULL_TIME) {
				empHrs = 8;
			}
			else {
				empHrs = 0;
			}
			empWage = empHrs * EMP_RATE_PER_HOUR;
			System.out.println("Employee wage : " + empWage);
		}
	}
}
