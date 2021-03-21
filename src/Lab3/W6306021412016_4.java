package Lab3;

import java.util.Scanner;

public class W6306021412016_4 {
    float hours, rate, salary;

    public static void cal(float hours, float rate, float salary) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter hours work : ");
        hours = scan.nextFloat();
        System.out.print("Enter hourly rate : ");
        rate = scan.nextFloat();
        salary = (hours <= 40) ? (hours * rate) : (rate * (1.5f * hours - 20));
        System.out.print("Employee get salary : " + salary + " BATH");
    }

    public static void main(String[] args) {
        float hours = 0, rate = 0, salary = 0;
        cal(hours, rate, salary);

    }
}
