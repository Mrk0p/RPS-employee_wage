package com.bridgelabz.employee_wage;

import java.util.Random;

public class EmployeeWage {

    public static void main(String[] args) {

        int wagePerHour = 20;
        int fullDayHours = 8;
        int dailyWage = 0;

        System.out.println("Welcome to Employee Wage Computation Program");

        Random random = new Random();

        int randomNum = random.nextInt(2);

        if (randomNum == 1) {
            System.out.println("Employee  is Present");
            dailyWage = wagePerHour * fullDayHours;
        }
        else {
            System.out.println("Employee  is Absent");
            System.out.println("daily wage is :" + dailyWage);
        }
    }
}
