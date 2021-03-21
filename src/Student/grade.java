package Student;
import java.util.*;
public class grade {
    int score;
    String grade;
    public static void main (String args[]){
        grade g = new grade();
        g.input();
        g.cla();
        g.output();

    }
    public void input(){
        Scanner scan = new Scanner(System.in); 
        System.out.print("Enter Score : "); this.score = scan.nextInt();
        
     }
     public void cla(){
            if(this.score >=80){
                this.grade ="A";    
            }
            else if (this.score >=75){
                this.grade ="B+";    
            }
            else if (this.score >=70){
                this.grade ="B";    
            }
            else if (this.score >=65){
                this.grade ="C+";    
            }else if (this.score >=60){
                this.grade ="C";    
            }else if (this.score >=55){
                this.grade ="D+";    
            }else if (this.score >=50){
                this.grade ="D";    
            }else if (this.score <=50){
                this.grade ="F";    
            }
     }
     public void output (){
            System.out.print(this.grade);
     }
    
}
