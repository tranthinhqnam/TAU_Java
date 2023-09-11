package chapter3;

import java.util.Scanner;

public class QuotaCaculator {
    public static void main(String[] args) {
        //Initialize values we know
        int quota = 10;
        System.out.println("Enter the sales u made this week :");
        Scanner sc = new Scanner(System.in);
        int sales = sc.nextInt();
        if (sales >= quota) {
            System.out.println("Congrs ! U have done!");
        } else {
            int shortamount = quota - sales;
            System.out.println("U didnot make your quota ! U lack : " + shortamount);
        }
    }
}
