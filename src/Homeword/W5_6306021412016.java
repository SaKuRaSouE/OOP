package Homeword;
import java.util.Scanner;
public class W5_6306021412016 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name,listname;
        float bonus=0,salary,pricebonus,price;
        System.out.print("Enter Nickname : "); name = scan.nextLine();
        System.out.print("Enter Listname : "); listname = scan.nextLine();
        System.out.print("Enter Salary   : "); salary = scan.nextFloat();
        if(salary>=0 && salary<=15000){
            bonus= 0.00f;
        }else if(salary>=15001 && salary<=20000){
            bonus= 0.07f;
        }else if(salary>=20001 && salary<=30000){
            bonus= 0.10f;
        }else if(salary>=30001 && salary<=40000){
            bonus= 0.12f;
        }else if(salary>=40001 && salary<=60000){
            bonus= 0.13f;
        }else if(salary>=60001 && salary<=70000){
            bonus= 0.14f;
        }else if(salary>70000){
            bonus= 0.15f;
        }
        price = salary * bonus;
        pricebonus = salary + price;
        System.out.print("\nOutput Name         : "+name);
        System.out.print("\nOutput Listname     : "+listname);
        System.out.print("\nOutput Salary       : "+salary);
        System.out.print("\nOutput Bonus        : "+bonus*100);
        System.out.print("\nOutput Bonus Bath   : "+price);
        System.out.print("\nOutput Price Salary : "+pricebonus);
    }
}
