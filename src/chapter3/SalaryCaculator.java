package chapter3;

import java.util.Scanner;

public class SalaryCaculator {
    public static void main(String[] args) {
        int salary = 1000;
        int bonus = 250;
        int quota = 10;
        System.out.println("How many sales does employee work ? ");
        Scanner sc = new Scanner(System.in);
        int sales = sc.nextInt();
        if (sales > quota) {
            salary = salary + bonus;
        }
        System.out.println("The salary is : " + salary);

    }
}
