package Lab4;
import java.util.Scanner;
public class W2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num;
        int Odd=0,Even=0,Zero=0;
        System.out.print("Enter positive number"); num = sc.nextLong();
        String text = String.valueOf(num);
        for (int i=0;i<text.length(); i++){
             char c =text.charAt(i);
             int b= Integer.parseInt(String.valueOf(c));
             if (b == 0) Zero++;
             else if (b % 2 == 0) Even++;
             else Odd++;
        }
        System.out.println("Odd digit   : "+Odd);
        System.out.println("Even digit  : "+Even);
        System.out.println("Zero digit  : "+Zero);
    }
}
