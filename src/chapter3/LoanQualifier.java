package chapter3;

import java.util.Scanner;

public class LoanQualifier {
    public static void main(String[] args) {
        //Initialize what we know
        int requiredSalary = 30000;
        int requiredYearEmployee = 2;
        //Get wwhat we know
        System.out.println("Enter your salary : ");
        Scanner sc = new Scanner(System.in);
        double salary = sc.nextDouble();
        System.out.println("Enter your number's year of employee : ");
        double years = sc.nextDouble();
        sc.close();
        //Make decision
        if (salary >= requiredSalary && years >= requiredYearEmployee) {
            System.out.println("Congrats ! U qualify a loan");
        } else {
            System.out.println("So sorry u must earn at least " + requiredSalary + " and at least years" + " " + requiredYearEmployee);
        }
    }
}
