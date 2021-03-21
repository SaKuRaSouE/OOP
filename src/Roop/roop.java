package Roop;

import java.util.Scanner;

public class roop {
    public static void main(String[] args) {
        int number, total;
        boolean n = true;
        Scanner sc = new Scanner(System.in);


        do {n=true;
            System.out.print("Enter Number ");
            number = sc.nextInt();
        }while(number<=1 && number>=100);
        for (int i = 1; i <= 12; i++) {
            total = number * i;
            System.out.println(+number + " * " + i + " = " + total);
            n=false;
        }
    }
}

