package com.bridgelabz.employee_wage;

public class EmployeeWage implements IEmployeeWage {

    public static final int PART_TIME = 1;
    public static final int FULL_TIME = 2;
    // instance variables
    int noOfCompanies, index;
    CompanyEmpWage[] companies;

    public EmployeeWage(int noOfCompanies)
    {
        this.noOfCompanies = noOfCompanies;
        companies = new CompanyEmpWage[noOfCompanies];
        index = 0;
    }

    public void addCompany(String companyName, int wagePerHr, int maxWorkingDays, int maxWorkingHrs)
    {
        companies[index++] = new CompanyEmpWage(companyName, wagePerHr, maxWorkingDays, maxWorkingHrs);
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
        System.out.printf("%5s     %5s     %5s     %5s\n", "Day", "Workinghrs", "Wage", "Total working hrs");

        int workingHrs, totalWage = 0;
        for (int day = 1, totalWorkingHrs = 0; day <= companyEmpWage.MAX_WORKING_DAYS
                && totalWorkingHrs <= companyEmpWage.MAX_WORKING_HRS; day++, totalWorkingHrs += workingHrs)
        {
            int empType = generateEmployeeType();
            workingHrs = getWorkingHrs(empType);
            int wage = workingHrs * companyEmpWage.WAGE_PER_HR;
            totalWage += wage;
            System.out.printf("%5d       %5d      %5d      %5d\n", day, workingHrs, wage, totalWorkingHrs + workingHrs);
        }
        return totalWage;
    }

    public static void main(String args[])
    {
        EmployeeWage employeeWage = new EmployeeWage(3);
        employeeWage.addCompany("Microsoft", 4, 30, 100);
        employeeWage.addCompany("Google", 5, 40, 170);
        employeeWage.addCompany("Apple", 9, 10, 70);
        employeeWage.calculateTotalWage();
    }
}
