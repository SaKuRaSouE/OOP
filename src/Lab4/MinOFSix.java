package Lab4;

import java.util.Scanner;

public class MinOFSix {
    public static void main(String[] args) {
        int num1, num2, num3, num4, num5, num6, min = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Integers 1 : ");
        num1 = sc.nextInt();
        System.out.print("Enter Integers 2 : ");
        num2 = sc.nextInt();
        System.out.print("Enter Integers 3 : ");
        num3 = sc.nextInt();
        System.out.print("Enter Integers 4 : ");
        num4 = sc.nextInt();
        System.out.print("Enter Integers 5 : ");
        num5 = sc.nextInt();
        System.out.print("Enter Integers 6 : ");
        num6 = sc.nextInt();
        min = num1;
        if (num2 < min) {
            min = num2;
        }
        if (num3 < min) {
            min = num3;
        }
        if (num4 < min) {
            min = num4;
        }
        if (num5 < min) {
            min = num4;
        }

        if (num6 < min) {
            min = num6;
        }
        System.out.print("Minimum Value : " + min);
    }
}
