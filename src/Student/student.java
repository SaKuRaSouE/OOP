package Student;

import java.util.Scanner;

public class student {
    private String std_id;
    private String std_name;
    private String std_listname;
    private char grade;
    private float midterm;
    private float finalterm;
    private float total;
    void Calgrade() {
        total = midterm + finalterm;
        if(total>=80){
            grade='A';
        } else if(total>=70) {
            grade='B';
        } else if(total>=60) {
            grade='C';
        }else if(total>=50){
            grade='D';
        } 
        else grade='F';
   }
    public static void main(String[] args) {
        student student = new student();
        Scanner scan = new Scanner(System.in);
        System.out.print("Input Student ID : ");
        student.setStd_id(scan.nextLine());
        System.out.print("Input Student Name : ");
        student.setStd_name(scan.nextLine());
        System.out.print("Input Student LIstname : ");
        student.setStd_listname(scan.nextLine());
        System.out.print("Input Student Midterm : ");
        student.setMidterm(scan.nextFloat());
        System.out.print("Input Student Finalterm : ");
        student.setFinalterm(scan.nextFloat());
        System.out.print("-----------------------------------------------\n");
        student.Calgrade();
        System.out.print("Output Grade \n" + student.toString());
       
        
        
    }
 
    public student() {
    }

    public student(String std_id, String std_name, String std_listname, char grade, float midterm, float finalterm,
            float total) {
        this.std_id = std_id;
        this.std_name = std_name;
        this.std_listname = std_listname;
        this.grade = grade;
        this.midterm = midterm;
        this.finalterm = finalterm;
        this.total = total;
    }

    public String getStd_id() {
        return std_id;
    }

    public void setStd_id(String std_id) {
        this.std_id = std_id;
    }

    public String getStd_name() {
        return std_name;
    }

    public void setStd_name(String std_name) {
        this.std_name = std_name;
    }

    public String getStd_listname() {
        return std_listname;
    }

    public void setStd_listname(String std_listname) {
        this.std_listname = std_listname;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }

    public float getMidterm() {
        return midterm;
    }

    public void setMidterm(float midterm) {
        this.midterm = midterm;
    }

    public float getFinalterm() {
        return finalterm;
    }

    public void setFinalterm(float finalterm) {
        this.finalterm = finalterm;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

   
    public String toString() {
        String str;
        str = "\nStudent ID : " + std_id + "\nStudent Name : " + std_name + "\nStudent Listname : " + std_listname + "\nMidterm : " + midterm + "\nFinalterm : " + finalterm + "\nScore : " + total + "\nGrade : " + getGrade();
                return(str);
    }
}
