package Lab4;

import java.util.Scanner;

public class GradeStudy {
    private long stdid;
    private String stdfirstname;
    private String stdlastname;
    private Double scoretotal;
    private Double scorehomework;
    private Double scoreassignment;
    private Double scoresubtest;
    private Double scoremidterm;
    private Double scorefinal;
    private String stdgrade;

    public GradeStudy() {
    }

    public GradeStudy(long stdid, String stdfirstname, String stdlastname, Double scoretotal, Double scorehomework,
            Double scoreassignment, Double scoresubtest, Double scoremidterm, Double scorefinal, String stdgrade) {
        this.stdid = stdid;
        this.stdfirstname = stdfirstname;
        this.stdlastname = stdlastname;
        this.scoretotal = scoretotal;
        this.scorehomework = scorehomework;
        this.scoreassignment = scoreassignment;
        this.scoresubtest = scoresubtest;
        this.scoremidterm = scoremidterm;
        this.scorefinal = scorefinal;
        this.stdgrade = stdgrade;
    }

    public long getStdid() {
        return stdid;
    }

    public void setStdid(long stdid) {
        this.stdid = stdid;
    }

    public String getStdfirstname() {
        return stdfirstname;
    }

    public void setStdfirstname(String stdfirstname) {
        this.stdfirstname = stdfirstname;
    }

    public String getStdlastname() {
        return stdlastname;
    }

    public void setStdlastname(String stdlastname) {
        this.stdlastname = stdlastname;
    }

    public Double getScoretotal() {
        return scoretotal;
    }

    public void setScoretotal(Double scoretotal) {
        this.scoretotal = scoretotal;
    }

    public Double getScorehomework() {
        return scorehomework;
    }

    public void setScorehomework(Double scorehomework) {
        this.scorehomework = scorehomework;
    }

    public Double getScoreassignment() {
        return scoreassignment;
    }

    public void setScoreassignment(Double scoreassignment) {
        this.scoreassignment = scoreassignment;
    }

    public Double getScoresubtest() {
        return scoresubtest;
    }

    public void setScoresubtest(Double scoresubtest) {
        this.scoresubtest = scoresubtest;
    }

    public Double getScoremidterm() {
        return scoremidterm;
    }

    public void setScoremidterm(Double scoremidterm) {
        this.scoremidterm = scoremidterm;
    }

    public Double getScorefinal() {
        return scorefinal;
    }

    public void setScorefinal(Double scorefinal) {
        this.scorefinal = scorefinal;
    }

    public String getStdgrade() {
        return stdgrade;
    }

    public void setStdgrade(String stdgrade) {
        this.stdgrade = stdgrade;
    }

    void Calgrade() {
         scoretotal = scorehomework + scoreassignment + scoresubtest + scoremidterm + scorefinal;

        if (scoretotal >= 80) {
            stdgrade = "A";

        } else if (scoretotal >= 70) {
            stdgrade = "B";

        } else if (scoretotal >= 60) {
            stdgrade = "C";

        } else if (scoretotal >= 50) {
            stdgrade = "D";

        } else
            stdgrade = "F";
    }

    void Displayresut() {
        System.out.print("\nStudent ID        : " + getStdid());
        System.out.print("\nStudent Firstname : " + getStdfirstname());
        System.out.print("\nStudent Listname  : " + getStdfirstname());
        System.out.print("\nHomework          : " + getScorehomework());
        System.out.print("\nAssignment        : " + getScoreassignment());
        System.out.print("\nSubtest           : " + getScoresubtest());
        System.out.print("\nMidterm           : " + getScoremidterm());
        System.out.print("\nFinal             : " + getScorefinal()) ;
        System.out.print("\nGrade             : " + getStdgrade());
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        GradeStudy gradeStudy = new GradeStudy();
        System.out.print("Enter ID Study  : ");
        gradeStudy.setStdid(scan.nextLong());
        System.out.print("Enter Firstname : ");
        gradeStudy.setStdfirstname(scan.next());
        System.out.print("Enter Lastname : ");
        gradeStudy.setStdlastname(scan.next());
        System.out.print("Enter Homework : ");
        gradeStudy.setScorehomework(scan.nextDouble());
        System.out.print("Enter Assignment : ");
        gradeStudy.setScoreassignment(scan.nextDouble());
        System.out.print("Enter Subtest : ");
        gradeStudy.setScoresubtest(scan.nextDouble());
        System.out.print("Enter Midterm : ");
        gradeStudy.setScoremidterm(scan.nextDouble());
        System.out.print("Enter Final : ");
        gradeStudy.setScorefinal(scan.nextDouble());
        gradeStudy.Calgrade();
        gradeStudy.Displayresut();
        
    }
}
