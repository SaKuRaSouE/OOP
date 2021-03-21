package Lab3;

import java.util.Scanner;

public class W6306021412016_2 {
    public static void main(String[] args) {
        
        float Deposit=0, Principal, Interate=0,I=0,D=0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Principal : ");
        Principal = scan.nextFloat();
        System.out.print("Enter Interate : ");
        Interate = scan.nextFloat();
        Deposit =((Principal*Interate)+Interate);
        for (int i = 1; i <=5; i++) {
            
            I+=Interate;
            D=Deposit+I;
            System.out.print("Employee get salary YEAR["+i+"] : Deposit : "+D+" BATH  Interate : "+I+" BATH \n");
        }


    }
}
