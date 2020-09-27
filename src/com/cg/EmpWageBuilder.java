package com.cg;
import java.util.*;

public class EmpWageBuilder implements CompEmpWageIF {
	//Constants
	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;
	
	private ArrayList<CompEmpWage> empWageArrList;
	
	//Constructor
	public EmpWageBuilder() {
		empWageArrList = new ArrayList<>();
	}
	
	public void AddCompanyEmpWage(String company, int empRatePerHour, int noOfWorkingDays, int maxWorkingHours) {
		CompEmpWage empWage = new CompEmpWage(company, empRatePerHour, noOfWorkingDays, maxWorkingHours);
		empWageArrList.add(empWage);
	}
	
	public void ComputeEmpWage() {
		for(int i=0;i<empWageArrList.size();i++) {
			CompEmpWage empWage = empWageArrList.get(i);
			empWage.SetTotalEmpWage(this.ComputeEmpWage(empWage));
			System.out.println(empWage);
		}
	}
	
	private int ComputeEmpWage(CompEmpWage empWage) {
		int empHrs = 0;
		int totalHrs = 0;
		int totalDays = 0;
		while(totalHrs <= empWage.maxWorkingHours && totalDays <= empWage.noOfWorkingDays) {
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
		}
		return totalHrs * empWage.empRatePerHour;
	}
	
	public int GetTotalWage(String company) {
		return 0;
	}
	
	public static void main(String[] args) {
		EmpWageBuilder empWageBuilder = new EmpWageBuilder();
		empWageBuilder.AddCompanyEmpWage("Capgemini", 20, 22, 100);
		empWageBuilder.AddCompanyEmpWage("Wipro", 20, 24, 95);
		empWageBuilder.ComputeEmpWage();
	}
}
