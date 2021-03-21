package Lab5;
import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] Mind, Homework, Quiz, Midterm, Final, Total;
        String[] grade, name, lastname;
        Mind = new int[20];
        Homework = new int[20];
        Quiz = new int[20];
        Midterm = new int[20];
        Final = new int[20];
        Total = new int[20];
        grade = new String[20];
        name = new String[20];
        lastname = new String[20];
        for (int i = 0; i <20; i++) {
            System.out.print("Enter UserName : ");
            name[i] = scan.nextLine();
            System.out.print("Enter LastName : ");
            lastname[i] = scan.nextLine();
            Mind[i] = 1 + (int) (Math.random() * 5);
            Homework[i] = 1 + (int) (Math.random() * 15);
            Quiz[i] = 1 + (int) (Math.random() * 10);
            Midterm[i] = 1 + (int) (Math.random() * 35);
            Final[i] = 1 + (int) (Math.random() * 35);
            Total[i] += Mind[i] + Homework[i] + Quiz[i] + Midterm[i] + Final[i];
            if (Total[i] >= 80 && Total[i] <= 100) {
                grade[i] = "A";
            } else if (Total[i] >= 70 && Total[i] < 80) {
                grade[i] = "B";
            } else if (Total[i] >= 60 && Total[i] < 70) {
                grade[i] = "C";
            } else if (Total[i] >= 50 && Total[i] < 60) {
                grade[i] = "D";
            } else if (Total[i] >= 0 && Total[i] < 50) {
                grade[i] = "F";
            }
        }
        for (int i = 1; i <=20; i++) {
            System.out.println("Output User Name ["+i+"] : "+name[i]+""+"  : Score : "+Total[i]+" : "+"Grade  : "+grade[i]);
           System.out.println("--------------------------------------------");
        }
    }
}
