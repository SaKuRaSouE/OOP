package Lab3;

import java.util.Scanner;

public class W6306021412016_3 {
    public static void main(String[] args) {
        String number;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Number : ");
        number = scan.nextLine();
        for (int i=0; i<number.length(); i++){
            System.out.print(number.charAt(i)+ "   ");
        }
    
    }
}
