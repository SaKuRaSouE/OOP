package Lab8;
import java.util.*;
import java.util.Scanner;

public class Test {
   public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
      double dec,bin=0.0,i,m,n=1.0;
      String str="";
      String hex="";
       System.out.print("Enter Number : "); dec = scan.nextDouble();

       for(i=dec; i>0; i=i/2){
        m=i%2;
        bin=bin+(m*n);
        n=n*10;
       };
       System.out.println(bin);
       str = String.valueOf(bin);
       if(str.equals("01")){
         hex="1";
       }if (str.equals("10")){
        hex="2";
       }else{
           
       }
   }
}
