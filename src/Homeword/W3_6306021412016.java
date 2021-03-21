package Homeword;

import java.util.Scanner;

public class W3_6306021412016 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float ka, hour, money = 0, total;
        System.out.print("Distance : ");
        ka = scan.nextFloat();
        System.out.print("Time : ");
        hour = scan.nextFloat();

        if (ka > 0 && ka <= 1) {
            money = ka * 35f;
        } else if (ka > 2 && ka <= 12) {
            money = (ka - 1) * 5f + 35f;
        } else if (ka > 12 && ka <= 20) {
            money = (ka - 12) * 5.50f + 90f;
        } else if (ka > 20 && ka <= 40) {
            money = (ka - 20) * 6f + 134f;
        } else if (ka > 40 && ka <= 60) {
            money = (ka - 40) * 6.50f + 254f;
        } else if (ka > 60 && ka <= 80) {
            money = (ka - 60) * 7.50f + 384f;
        } else if (ka > 80) {
            money = (ka - 80) * 8.50f + 534;
        }
        hour = hour * 2f;
        total = money + hour;
        System.out.println("Show duration : " + ka + " \nTime : " + hour + " \nAnd the fare to pay : " + total);
    }
}
