package com.bridgelabz.employee_wage;

public interface IEmployeeWage {
    public void addCompany(String companyName, int wagePerHr, int maxWorkingDays, int maxWorkingHrs);

    public void calculateTotalWage();

}
