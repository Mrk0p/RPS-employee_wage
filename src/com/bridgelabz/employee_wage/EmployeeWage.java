package com.bridgelabz.employee_wage;

import java.util.ArrayList;
import java.util.HashMap;

public class EmployeeWage implements IEmployeeWage {

    public static final int PART_TIME = 1;
    public static final int FULL_TIME = 2;

    ArrayList<CompanyEmpWage> companies;

    HashMap<String, Integer> totalEmpWages;


    public EmployeeWage()
    {
        companies = new ArrayList<>();
        totalEmpWages = new HashMap<>();
    }


    public void addCompany(String companyName, int wagePerHr, int maxWorkingDays, int maxWorkingHrs)
    {
        CompanyEmpWage company = new CompanyEmpWage(companyName, wagePerHr, maxWorkingDays, maxWorkingHrs);
        companies.add(company);
        totalEmpWages.put(companyName, 0);
    }

    int generateEmployeeType()
    {
        return (int) (Math.random() * 100) % 3;
    }

    int getWorkingHrs(int empType)
    {
        switch (empType)
        {
            case FULL_TIME:
                return 8;
            case PART_TIME:
                return 4;
            default:
                return 0;
        }
    }

    public void calculateTotalWage()
    {
        for (CompanyEmpWage company : companies)
        {
            int totalWage = calculateTotalWage(company);
            company.setTotalEmployeeWage(totalWage);
            System.out.println(company);
        }
    }

    int calculateTotalWage(CompanyEmpWage companyEmpWage)
    {
        System.out.println("Computation of total wage of " + companyEmpWage.COMPANY_NAME + " employee");
        System.out.println("-----------------------------------------------------");
        System.out.printf("%4s\t%4s\t%2s\t%4s\n", "Day", "Workinghrs", "Wage", "Total working hrs");

        int workingHrs, totalWage = 0;
        for (int day = 1, totalWorkingHrs = 0; day <= companyEmpWage.MAX_WORKING_DAYS
                && totalWorkingHrs <= companyEmpWage.MAX_WORKING_HRS; day++, totalWorkingHrs += workingHrs)
        {
            int empType = generateEmployeeType();
            workingHrs = getWorkingHrs(empType);
            int wage = workingHrs * companyEmpWage.WAGE_PER_HR;
            totalWage += wage;
            System.out.printf("%4d\t%5d\t%10d\t%10d\n", day, workingHrs, wage, totalWorkingHrs + workingHrs);
        }
        totalEmpWages.put(companyEmpWage.COMPANY_NAME, totalWage);
        return totalWage;
    }

    public int getTotalEmpWage(String companyName)
    {
        return totalEmpWages.get(companyName);
    }

    public static void main(String args[])
    {
        EmployeeWage employeeWage = new EmployeeWage();
        employeeWage.addCompany("Microsoft", 4, 30, 100);
        employeeWage.addCompany("Google", 5, 40, 170);
        employeeWage.addCompany("Amazon", 19, 10, 150);
        employeeWage.calculateTotalWage();
        String query = "Google";
        int totalWage = employeeWage.getTotalEmpWage(query);
        System.out.println("Total Employee Wage for " + query + " company is " + totalWage);
    }
}
