package Lab5;
import javax.swing.JOptionPane;
public class Lab5_2 {

    public static void main(String[] args) {
        Lab5_2 obj = new Lab5_2();
        
        
        double number1, number2, number3,number4,number5,number6,number7,number8,number9,number10;
        String s1, s2, s3,s4,s5,s6,s7,s8,s9,s10;
        String output;
        s1 = JOptionPane.showInputDialog("Enter first floating-point value");
        s2 = JOptionPane.showInputDialog("Enter second floating-point value");
        s3 = JOptionPane.showInputDialog("Enter third floating-point value");
        s4 = JOptionPane.showInputDialog("Enter four floating-point value");
        s5 = JOptionPane.showInputDialog("Enter five floating-point value");
        s6 = JOptionPane.showInputDialog("Enter six floating-point value");
        s7 = JOptionPane.showInputDialog("Enter seven floating-point value");
        s8 = JOptionPane.showInputDialog("Enter eight floating-point value");
        s9 = JOptionPane.showInputDialog("Enter nine floating-point value");
        s10 = JOptionPane.showInputDialog("Enter ten floating-point value");
        number1 = Double.parseDouble(s1);
        number2 = Double.parseDouble(s2);
        number3 = Double.parseDouble(s3);
        number4 = Double.parseDouble(s4);
        number5 = Double.parseDouble(s5);
        number6 = Double.parseDouble(s6);
        number7 = Double.parseDouble(s7);
        number8 = Double.parseDouble(s8);
        number9 = Double.parseDouble(s9);
        number10 = Double.parseDouble(s10);
        double max = obj.maximum(number1, number2, number3,number4,number5,number6,number7,number8,number9,number10);
        double min = obj.minimum(number1, number2, number3,number4,number5,number6,number7,number8,number9,number10);
        output =  "\nnumber1  :  " + number1 + "\nnumber2  :  " + number2;
        output += "\nnumber2  :  " + number2 + "\nnumber3  :  " + number3;
        output += "\nnumber4  :  " + number4 + "\nnumber5  :  " + number5;
        output += "\nnumber5  :  " + number5 + "\nnumber6  :  " + number6;
        output += "\nnumber7  :  " + number7 + "\nnumber8  :  " + number8;
        output += "\nnumber9  :  " + number9 + "\nnumber10 : " + number10;
        output += "\nmaximum is : " + max;
        output += "\nminimum is : " + min;
        JOptionPane.showMessageDialog(null, output);
        System.exit(0); 
    
    }

    public double maximum(double x, double y, double z ,double a ,double b , double c, double d, double e,double f, double g) {
        return Math.max(x, Math.max(y, Math.max (z, Math.max(a,Math.max(b,Math.max(c,Math.max(d,Math.max(e,Math.max(f,g))))))))) ;
    } 
    public double minimum(double x, double y, double z ,double a ,double b , double c, double d, double e,double f, double g) {
        return Math.min(x, Math.min(y, Math.min (z, Math.min(a,Math.min(b,Math.min(c,Math.min(d,Math.min(e,Math.min(f,g)))))))));
    } 
    public void sort (double n1, double n2, double n3 ,double n4){
           
        }
     
}


