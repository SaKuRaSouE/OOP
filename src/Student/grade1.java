package Student;
import java.util.*;
public class grade1 {
    public static void main(String[] args){
        grade1 obj = new grade1();
        int score=0;
        String grade="";
        score = obj.input(score);
        grade = obj.cal(score,grade);
        System.out.print(grade);
         

    }
    public int input(int score){
        Scanner scan = new Scanner(System.in); 
        System.out.print("Enter Score : "); score = scan.nextInt();
        return score;
    }
    public String cal (int score, String grade){
        if(score >=80){
            grade ="A";    
        }
        else if (score >=75){
            grade ="B+";                                                                                                    
        }
        else if (score >=70){
            grade ="B";    
        }
        else if (score >=65){
            grade ="C+";    
        }else if (score >=60){
            grade ="C";    
        }else if (score >=55){
            grade ="D+";    
        }else if (score >=50){
            grade ="D";    
        }else if (score <=50){
            grade ="F";    
        }

        return grade;
    }
}
