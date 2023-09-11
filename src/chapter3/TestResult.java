package chapter3;

import java.util.Scanner;

public class TestResult {
    public static void main(String[] args) {
        System.out.println("Enter Score :");
        Scanner sc = new Scanner(System.in);
        double score = sc.nextDouble();
        // Determine the letter grade
        char grade;
        if (score < 60) {
            grade = 'F';
        } else if (score < 70) {
            grade = 'D';
        } else if (score < 80) {
            grade = 'C';
        } else {
            grade = 'A';
        }
        System.out.println(grade);

    }
}
