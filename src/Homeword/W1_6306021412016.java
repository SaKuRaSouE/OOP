package Homeword;
import java.util.Scanner;
public class W1_6306021412016 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String id,name;
        float salary,bonus,pricesalary,vat=0.0f,total,income;
        System.out.print("Enter Customer ID : ");  id = scan.nextLine();
        System.out.print("Enter Customer Name : "); name = scan.nextLine();
        System.out.print("Enter Customer Salary : "); salary = scan.nextFloat();
        System.out.print("Enter Customer Bonus : "); bonus = scan.nextFloat();
        pricesalary = (salary*12)+(salary*bonus);
        if(pricesalary>=500000){
            vat=0.15f;
        }else if (pricesalary>=400000){
            vat=0.13f;
        }else if (pricesalary>=300000){
            vat=0.12f;
        }else if (pricesalary>=200000){
            vat=0.11f;
        }else if (pricesalary>=100000){
            vat=0.10f;
        }else if (pricesalary>=70000){
            vat=0.07f;
        }else if (pricesalary>=50000){
            vat=0.05f;
        }else if (pricesalary>=30000){
            vat=0.03f;
        }else if (pricesalary<30000){
            vat=0.01f;
        }
        total  = pricesalary*vat;
        income = pricesalary-total;
        System.out.print("\nOutput Customer ID     : "+id);
        System.out.print("\nOutput Customer Name   : "+name);
        System.out.print("\nOutput Bonus           : "+bonus);
        System.out.print("\nOutput Bonus  Bath     : "+bonus*salary + " Bath");
        System.out.print("\nOutput Salary          : "+pricesalary + " Bath");
        System.out.print("\nOutput Vat             : "+vat*100+" % ");
        System.out.print("\nOutput Vat Bath        : "+total+ " Bath");
        System.out.print("\nOutput Net inc ome     : "+income+ " Bath");
    }
}
