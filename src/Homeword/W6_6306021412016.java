package Homeword;
import java.util.Scanner;
public class W6_6306021412016 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String day;
        System.out.print("Enter Number month 28,29,30,31 : " ); day = scan.nextLine();
        if(day.equals("28") || (day.equals("29"))){
            System.out.print("February me one 28 or 29 one");
        }else if(day.equals("30")){
            System.out.print("April, June, September, November me one 30 one");
        }else if (day.equals("31")){
            System.out.print("January, March, May, July, August, October, December me one 31 one");
        }else{
            System.out.print("Cannot be displayed. The data is not correct.");
        }
}
}
