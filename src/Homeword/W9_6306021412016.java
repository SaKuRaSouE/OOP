package Homeword;
import java.util.Scanner;
public class W9_6306021412016 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int customer, food;
        float discount=0, vat=0, totalfoot=0, discounttotal=0,discount1=0;
        System.out.print("Enter Customer : ");customer = scan.nextInt();
        System.out.print("Enter Data Food : ");food = scan.nextInt();
        if (customer >= 1 && customer <= 2) {
            discount1 = 0.00f;
        } else if (customer >= 3 && customer <= 5) {
            discount1 = 0.05f;        
        } else if (customer >= 6 && customer <= 10) {
            discount1 = 0.12f;
        } else if (customer >= 11 && customer <= 14) {
            discount1 = 0.13f;
        } else if (customer >= 15 && customer <= 17) {
            discount1 = 0.20f;
        } else if (customer >= 18 && customer <= 20) {
            discount1 = 0.30f;
        } else if (customer >= 21 && customer <= 22) {
            discount1 = 0.35f;    
        } else if (customer >= 23) {
            discount1 = 0.40f;   
        }
        discount = food * discount1;
        discounttotal = food - discount;
        vat = discounttotal * 0.07f;
        totalfoot = discounttotal + vat;
            System.out.print("\nCustomer        :"+customer);
            System.out.print("\nFood            :"+food);
            System.out.print("\nDiscount        :"+discount1+" % ");
            System.out.print("\nDiscount Bath   :"+discount);
            System.out.print("\nDiscount %      :"+discounttotal);
            System.out.print("\nVat 7%          :"+vat);
            System.out.print("\nFood Price      :"+totalfoot);
    }
}
