package Homeword;

import java.util.Scanner;

public class W8_6306021412016 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name, position="";
        System.out.print("Enter Month  : ");
        name = scan.nextLine();
        if (name.equals("Su") || (name.equals("su"))) {
            position = "Sunday";
        } else if (name.equals("MO") || (name.equals("mo")) || (name.equals("Mo")) || (name.equals("mO"))) {
            position = "Monday";
        } else if (name.equals("TU") || (name.equals("tu")) || (name.equals("Tu")) || (name.equals("tU"))) {
            position = "Tuesday";
        } else if (name.equals("WE") || (name.equals("we")) || (name.equals("We")) || (name.equals("wE"))) {
            position = "Wednesday";
        } else if (name.equals("TH") || (name.equals("th")) || (name.equals("Th")) || (name.equals("tH"))) {
            position = "Thursday";
        } else if (name.equals("FI") || (name.equals("fi")) || (name.equals("Fi")) || (name.equals("fI"))) {
            position = "Friday";
        } else if (name.equals("SA") || (name.equals("sa")) || (name.equals("Sa")) || (name.equals("sA"))) {
            position = "Saturday";
        }else {
            System.out.print("Please Input again !! ");
        }
        System.out.println("Output Month : "+position);
    }
}