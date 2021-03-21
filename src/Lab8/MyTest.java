package Lab8;
import java.util.Scanner;
public class MyTest{
    
    public static void main(String[] args) {
        MyTest obj = new MyTest();
        Scanner scan = new Scanner(System.in);
        String st = "";
        int num;
        System.out.print("Enter Number : "); num = scan.nextInt();
                while (num>0){
                    num = num/2;
                    int f = num%2;
                    st = st+f; 
                }    
                System.out.println(st);
    }
}
