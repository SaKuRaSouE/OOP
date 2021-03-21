package Roop;
import java.util.Scanner;
import java.util.Random;
public class W3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String anser = "A";
        while(true){
        System.out.print("Enter Character : ");

        String cha = sc.next();
        if(cha.equals(anser)){
            System.out.println("You Win");
        }else{
            System.out.println("You lose");
            
        }
    }

    }
}
