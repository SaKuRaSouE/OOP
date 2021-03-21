package Homeword;

import java.util.Scanner;

public class W10_6306021412016 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String month;
        System.out.print("Enter Month : "); month = scan.nextLine();
        if (month.equals("A") || (month.equals("a"))){
            System.out.print("April, Angust");
        }else if (month.equals("D") || (month.equals("d"))){
            System.out.print("December");
        }else if (month.equals("F") || (month.equals("f"))){
            System.out.print("February");
        }else if (month.equals("J") || (month.equals("j"))){
            System.out.print("January, July, June");
        }else if (month.equals("M") || (month.equals("m"))){
            System.out.print("March, May");
        }else if (month.equals("N") || (month.equals("n"))){
            System.out.print("November");
        }else if (month.equals("O") || (month.equals("o"))){
            System.out.print("October");
        }else if (month.equals("S") || (month.equals("s"))){
            System.out.print("September");
        }else{
            System.out.print("Please !!Try again");
        }
    }
}
