// Lab04avst.java
// The Mortgage Payment Program
// This the student, starting version of the Lab04a assignment.

import java.lang.Math;

public class Lab04avst100
{
    public static void main(String[] args)
    {
        System.out.println("Lab04a, Student Version\n");

        double principal      = 250000;
        double annualRate     = 4.85;
        double numYears       = 30;
        double monthlyPayment = (((principal * (annualRate / 12) * Math.pow(
        1 + (annualRate / 100) / 12, numYears * 12)) / (Math.pow(1 + 
        (annualRate / 100) / 12, numYears * 12) - 1)) / 100);
        monthlyPayment = monthlyPayment * 100;
        monthlyPayment = Math.round(monthlyPayment);
        monthlyPayment = monthlyPayment / 100;
        double totalPayment   = monthlyPayment * numYears * 12;
        double totalInterest  = totalPayment - principal;
        

        System.out.println("Principal:         $" + principal);
        System.out.println("Annual Rate:       " + annualRate + "%");
        System.out.println("Number of Years:   " + numYears);
        System.out.println("Monthly Payment:   $" + Math.round(monthlyPayment * 100.0) / 100.0);
        System.out.println("Total Payments:    $" + Math.round(totalPayment * 100.0) / 100.0);
        System.out.println("Total Interest:    $" + Math.round(totalInterest * 100.0) / 100.0);
    }
}

