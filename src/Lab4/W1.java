package Lab4;

import java.util.Scanner;

public class W1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start=0, end=0,total=0;
        System.out.print("Enter Start number ");
        start = sc.nextInt();
        System.out.print("Enter end number ");
        end = sc.nextInt();
        for ( int i = start; i <= end; i++) {
            if (i % 3 == 0 && i % 5 == 0) {

                System.out.print(i + "\t");
                total++;

                if (total % 5 == 0) {
                    System.out.println("");
                }
            }

        }
    }

}
