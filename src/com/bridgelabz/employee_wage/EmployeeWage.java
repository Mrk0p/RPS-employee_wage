package com.bridgelabz.employee_wage;

import java.util.Random;

public class EmployeeWage {

    public static void main(String[] args) {

        int wagePerHour = 20;
        int fullDayHours = 8;
        int halfDayHours = 4;
        int dailyWage = 0;
        int monthlyWage = 0;
        int days = 0;
        int monthlyHours = 0;

        System.out.println("Welcome to Employee Wage Computation Program");

        Random random = new Random();

        while (days != 20 && monthlyHours != 100) {
            days++;
            int randomNum = random.nextInt(3);

            switch (randomNum) {

                case 0:
                    System.out.println("Employee is Absent"+dailyWage);
                    break;
                case 1:
                    System.out.println("Monthly salary for Full Day: ");
                    dailyWage = wagePerHour * fullDayHours;
                    break;
                case 2:
                    System.out.println("Monthly Salary for Half Day: ");
                    dailyWage = wagePerHour * halfDayHours;
                    break;

            }
            monthlyWage = monthlyWage + dailyWage;
            System.out.println("Day" + days + " Salary is: " + dailyWage);

        }
        System.out.println("Monthly Salary: " + monthlyWage);
    }
}
