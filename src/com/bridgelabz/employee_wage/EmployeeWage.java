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

        if (randomNum == 1) {
            System.out.println("Employee  is Present");
            dailyWage = wagePerHour * fullDayHours;
            System.out.println("Monthly wage for Full Day is: " + dailyWage);
        }
        else if (randomNum == 2) {
            dailyWage = halfDayHours * wagePerHour;
            System.out.println("Monthly wage for Half Day is: " + dailyWage);
        }
        else {
            System.out.println("Employee  is Absent");
            System.out.println("Daily wage is: " + dailyWage);
        }
    }
}
