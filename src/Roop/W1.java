package Roop;

import java.util.Scanner;

public class W1 {
public static void main(String[] args) {
    int number,total=1;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Number : "); number=sc.nextInt();
    System.out.print("!"+number+ " = ");  
    for(int i=1; i<=number; i++){
        
         total*=i;   
        }
        System.out.print("Total = "+total);  
        
    }
}

