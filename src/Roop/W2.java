package Roop;
import java.util.Scanner;
public class W2 {
    public static void main(String[] args) {
        double sum=1;
        double r,n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number :"); n = sc.nextInt();
        System.out.print("Enter number :"); r = sc.nextInt();
        sum  = n;
        for(int i=1; i<r;i++){
            sum *= (n-i)/(i+1);

        }
        System.out.println(sum);
    }
}
