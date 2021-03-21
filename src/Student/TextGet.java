package Student;
import java.util.*;
public class TextGet {
    private int num;
    public static void main (String[] args){
        TextGet textget = new TextGet();
        textget.input();
        System.out.print(textget.Getnum());
    }
    public void Setnum (int num){
        this.num = num;
    }
    public int Getnum(){
        return num;
    }
    public void input(){
        Scanner scan = new Scanner(System.in);
        Setnum(scan.nextInt());
    }
}
    
