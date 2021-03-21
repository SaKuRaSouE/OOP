package Lab4;

import java.util.Scanner;

public class W3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean prime = true;
        System.out.print("Enter positive number: ");
        int number = sc.nextInt();
        int limit = (int) Math.sqrt(number);
        for (int i = 2; i <= limit; i++) {
            if (number % i == 0) {
                prime = false;
                break;
            }
        }
        if (prime == true) {
            System.out.println("Number " + number + " is prime number.");

        } else {
            System.out.println("Number " + number + " not is prime number.");
        }
    }
}
