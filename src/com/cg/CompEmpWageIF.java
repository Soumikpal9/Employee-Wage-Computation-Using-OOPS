package com.cg;

public interface CompEmpWageIF {
	public void AddCompanyEmpWage(String company, int empRatePerHour, int noOfWorkingDays, int maxWorkingHours);
	public void ComputeEmpWage();
	public int GetTotalWage(String company);
}
