package Homeword;
import java.util.Scanner;
public class W2_6306021412016 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name;
        int position=0;
        System.out.print("Enter weed : ");
        name = scan.next();
        if (name.equals("A") || (name.equals("a"))) {
            position = 1;
        } else if (name.equals("B") || (name.equals("b"))) {
            position = 2;
        } else if (name.equals("C") || (name.equals("c"))) {
            position = 3;
        } else if (name.equals("D") || (name.equals("d"))) {
            position = 4;
        } else if (name.equals("E") || (name.equals("e"))) {
            position = 5;
        } else if (name.equals("F") || (name.equals("f"))) {
            position = 6;
        } else if (name.equals("G") || (name.equals("g"))) {
            position = 7;
        } else if (name.equals("H") || (name.equals("h"))) {
            position = 8;
        } else if (name.equals("I") || (name.equals("i"))) {
            position = 9;
        } else if (name.equals("J") || (name.equals("j"))) {
            position = 10;
        } else if (name.equals("K") || (name.equals("k"))) {
            position = 11;
        } else if (name.equals("L") || (name.equals("l"))) {
            position = 12;
        } else if (name.equals("M") || (name.equals("m"))) {
            position = 12;
        } else if (name.equals("N") || (name.equals("n"))) {
            position = 14;
        } else if (name.equals("O") || (name.equals("o"))) {
            position = 15;
        } else if (name.equals("P") || (name.equals("p"))) {
            position = 16;
        } else if (name.equals("Q") || (name.equals("q"))) {
            position = 17;
        } else if (name.equals("R") || (name.equals("r"))) {
            position = 18;
        } else if (name.equals("S") || (name.equals("s"))) {
            position = 19;
        } else if (name.equals("T") || (name.equals("t"))) {
            position = 20;
        } else if (name.equals("U") || (name.equals("u"))) {
            position = 21;
        } else if (name.equals("V") || (name.equals("v"))) {
            position = 22;
        } else if (name.equals("W") || (name.equals("w"))) {
            position = 23;
        } else if (name.equals("X") || (name.equals("x"))) {
            position = 24;
        } else if (name.equals("Y") || (name.equals("y"))) {
            position = 25;
        } else if (name.equals("Z") || (name.equals("z"))) {
            position = 26;
        } else {
            System.out.print("Sorry!!!");
        }
        System.out.println(name+" Position in to : "+position);
    }
}
