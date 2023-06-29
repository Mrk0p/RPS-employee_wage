package com.bridgelabz.employee_wage;

import java.util.Random;

public class EmployeeWage {

  public static int fullDayHours = 8;
  public static int halfDayHours = 4;
  private final String companyName;
  private final int wagePerHour;
  private final int workingHours;
  private final int workingDays;

    public EmployeeWage(String companyName, int wagePerHour, int workingHours, int workingDays) {
        this.companyName = companyName;
        this.wagePerHour = wagePerHour;
        this.workingHours = workingHours;
        this.workingDays = workingDays;
    }
    public int calculateWage() {
        int dailyWage = 0;
        int totalWage = 0;
        int totalWorkingHours = 0;
        int days = 0;

        Random random = new Random();

        while (totalWorkingHours <= workingDays && days <= workingDays) {
            days++;
            int empCheck = random.nextInt(3);

            switch (empCheck) {
                case 1:
                    System.out.println("FullDay Present .");
                    dailyWage = wagePerHour * fullDayHours;
                    totalWorkingHours = totalWorkingHours + fullDayHours;
                    break;

                case 2:
                    System.out.println(" HalfDay Present .");
                     dailyWage = wagePerHour * halfDayHours;
                    totalWorkingHours = totalWorkingHours + halfDayHours;
                    break;
                default:
                    System.out.println("Employee Absent");
            }
            System.out.println("Day :"+ days + empCheck +" ");
            System.out.println("Working Hours :"+ totalWorkingHours +" ");
            System.out.println("Daily wage is :"+ dailyWage +" ");
        }
        return totalWorkingHours * wagePerHour;
    }

    public static void main(String[] args) {

        EmployeeWage Nike = new EmployeeWage("Nike",20,100,20);

        EmployeeWage Adidas = new EmployeeWage("Adidas",22,95,22);

        EmployeeWage Puma =  new EmployeeWage("Puma",20,90,25);

        System.out.println("Total employee's wage of company :"+Nike.companyName+"-"+Nike.calculateWage());

        System.out.println("Total employee's wage of company :"+Adidas.companyName+"-"+Adidas.calculateWage());

        System.out.println("Total employee's wage of company :"+Puma.companyName+"-"+Puma.calculateWage());
    }
}
