package Lab3;

import java.util.Scanner;

public class W6306021412016_1 {
    public static void main(String[] args) {
        float Celsius,Fahrenheit;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Celsius to Fahrenheit conversion : "); Celsius = scan.nextFloat();
        Fahrenheit = 9 * Celsius / 5 + 32;
        System.out.println("Output Fahrenheit : " + Fahrenheit+ " Fahrenheit");

    }

}
