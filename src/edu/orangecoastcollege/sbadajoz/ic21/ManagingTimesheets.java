package edu.orangecoastcollege.sbadajoz.ic21;

import java.text.DecimalFormat;
import java.util.Scanner;

/*
Badajoz, Seve
CS A170
November 16, 2016

IC21
 */
public class ManagingTimesheets {
    public static final int EMPLOYEES = 3;
    public static final int DAYS = 5;
    public static void main(String[] args) {
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
        double[][] timesheet = new double[EMPLOYEES][DAYS + 1];

        Scanner input = new Scanner(System.in);
        DecimalFormat format = new DecimalFormat("#.#");

        for(int i = 0;i < EMPLOYEES; i++) {
            for(int y = 0; y < DAYS; y++) {
                System.out.print("Please enter hours worked for employee #" + (i + 1) + " on " + days[y] + ": ");
                timesheet[i][y] = input.nextDouble();
                timesheet[i][DAYS] += timesheet[i][y];
            }
            System.out.println();
        }

        for(int i = 0; i< EMPLOYEES; i++) {
            System.out.println("\nTotal hours worked for employee #" + (i +1) + " : " + format.format(timesheet[i][DAYS]) + 
                    "\nAverage hours worked for employee #" + (i + 1) + " : " + format.format(timesheet[i][DAYS] / DAYS));
        }
    }
}

