package Student;
import javax.swing.JOptionPane;

public class bmi {
    
    public float bmi(float h, float w) {
        h /= 100;
        return (w / (h * h));
    }

    public String criterion(float bmi) {
        String output;
        if (bmi < 18.5) {
            output = "Below the threshold";
        }else if (bmi >= 18.5 || bmi <= 24.9) {
            output = "Normal";
        }else if (bmi >= 25 || bmi <= 29.9) {
            output = "Fat";
        }else {
            output = "Overload";
        }
        return output;
    }
    public static void main(String[] args) {
        bmi obj = new bmi();
        String hight = JOptionPane.showInputDialog(null, "Hight cm.");
        String weight = JOptionPane.showInputDialog(null, "Weight kg.");
        float bmi = obj.bmi(Integer.parseInt(hight), Integer.parseInt(weight));
        String output = "";
        output += "BMI = " + bmi;
        output += "\nCriterion " + obj.criterion(bmi);
        JOptionPane.showMessageDialog(null, output, "BMI", JOptionPane.DEFAULT_OPTION);
    }
}
