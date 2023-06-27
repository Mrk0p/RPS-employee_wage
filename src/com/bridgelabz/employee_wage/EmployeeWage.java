package com.bridgelabz.employee_wage;

import java.util.Random;

public class EmployeeWage {

    public static int wagePerHour = 20;
    public static int fullDayHours = 8;
    public static int halfDayHours = 4;
    public static int dailyWage= 0;
    public static int monthlyWage = 0;
    public static int workingDaysPerMonth = 20;
    public static int days = 0;
    public static int monthlyHours = 0;

    public static int EmpWage() {
        System.out.println("Welcome to Employee Wage Computation Program");
        Random random = new Random();

        while (days != 20 && monthlyHours != 100) {
            days++;
            int randomNum = random.nextInt(3);

            switch (randomNum) {

                case 0:
                    System.out.println("Employee is Absent");
                    break;
                case 1:
                    System.out.println("Monthly wage for Full Day: ");
                    dailyWage = wagePerHour * fullDayHours;
                    break;
                case 2:
                    System.out.println("Monthly wage for Half Day: ");
                    dailyWage = wagePerHour * halfDayHours;

            }
            monthlyWage = monthlyWage + dailyWage;
            System.out.println("Day" + days + " Salary is: " + dailyWage);

        }
        System.out.println("Monthly Salary: " + monthlyWage);
        return monthlyWage;

    }
    public static void main(String[] args) {

        EmpWage();
    }
}
