package com.bridgelabz.employee_wage;

import java.util.Random;

public class EmployeeWage {

    public static void main(String[] args) {

        int wagePerHour = 20;
        int fullDayHours = 8;
        int halfDayHours = 4;
        int dailyWage = 0;

        System.out.println("Welcome to Employee Wage Computation Program");

        Random random = new Random();

        int randomNum = random.nextInt(3);

        switch (randomNum) {

            case 0:
                System.out.println("Employee is Absent");
                System.out.println("Monthly Salary will be: ");
                break;
            case 1:
                System.out.println("Employee is Present");
                System.out.println("Monthly salary for Full Day: ");
                dailyWage = wagePerHour * fullDayHours;
                break;
            case 2:
                System.out.println("Employee is Present");
                System.out.println("Monthly Salary for Half Day: ");
                dailyWage = wagePerHour * halfDayHours;
                break;

        }
        System.out.println(+dailyWage);
    }
}
