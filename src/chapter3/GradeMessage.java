package chapter3;

import java.util.Scanner;

public class GradeMessage {
    public static void main(String[] args) {
        System.out.println("Enter your letter grade :");
        Scanner sc = new Scanner(System.in);
        String grade = sc.next();
        sc.close();
        String message;
        switch (grade) {
            case "A":
                message = "Excellent !";
                break;
            case "B":
                message ="Great job!";
                break;
            case "C":
                message ="You should do better";
                break;
            default:
                message="Invalid ! Please try again!";
        }
        System.out.println(message);
    }
}
