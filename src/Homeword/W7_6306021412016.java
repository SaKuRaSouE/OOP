package Homeword;
import java.util.Scanner;
public class W7_6306021412016 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String id_customer,name_customer;
        float age,year,productsales,salary,commit=0f;

        System.out.print("Enter ID Customer    : "); id_customer = scan.nextLine();
        System.out.print("Enter Name Customer  : "); name_customer = scan.nextLine();
        System.out.print("Enter Working age    : "); age = scan.nextFloat();
        System.out.print("Enter Product sales  : "); productsales = scan.nextFloat();
        System.out.print("Enter Salary         : "); salary = scan.nextFloat();
        year = age*1.5f;
    
        if(year < 1){
            commit = 0f;
        }else if (year >=1 && year<5){
            commit = 0.02f;
        }else if (year >=5 && year<6){
            commit = 0.03f;
        }else if (year >=6 && year<8){
            commit = 0.05f;
        }else if (year >=8){
            commit = 0.10f;
        }
      
        System.out.print("\nOutput ID            : " +id_customer);
        System.out.print("\nOutput Name Customer : " +name_customer);
        System.out.print("\nOutput Working age   : " +age);
        System.out.print("\nOutput Salary        : " +salary);
        System.out.print("\nCommition    (%)     : " +(commit*100f)+"%");
        System.out.print("\nCommition    (Baht)  : " +(commit*productsales)+ " Baht");
        System.out.print("\nSalary       (Baht)  : " +salary+ " Baht");
        System.out.print("\nSalaty Price (Baht)  : " +(salary+(commit*productsales))+ " Baht");
   
    }

}
