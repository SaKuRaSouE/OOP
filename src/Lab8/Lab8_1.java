package Lab8;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Lab8_1 extends JFrame implements ActionListener {
    /**
     *
     */
    private static final long serialVersionUID = 1057578305137575067L;
    JLabel textLabel;
    JTextField textField;
    JButton saveBtn, clearBtn, showBtn;
    Container container;
    private int number;

    public Lab8_1() {

        super("Program Save Show Clear Delete Number"); //ตั้งชื่อโปรเเกรม ต้องอยู่บรรทัดเเรกเท่านั้น ถ้าอยู่บรรทัดต่อไป Error

        container = getContentPane(); //สร้างตัวเเปรมาเก็บค่า
        container.setLayout(new FlowLayout()); //สร้างช่องในการเก้็บค่า
        
        textLabel = new JLabel("Enter number :"); 
        textLabel.setFont(new Font("Courier New", Font.BOLD, 20));
        container.add(textLabel);
        
        textField = new JTextField(10); //ขนาดช่อง
        textField.setFont(new Font("Courier New", Font.BOLD, 24));
        container.add(textField);

        saveBtn = new JButton(" Save ");
        saveBtn.setFont(new Font("Courier New", Font.BOLD, 20));
        saveBtn.addActionListener(this);
        container.add(saveBtn);

        clearBtn = new JButton(" Clear ");
        clearBtn.setFont(new Font("Courier New", Font.BOLD, 20));
        clearBtn.addActionListener(this);
        container.add(clearBtn);

        showBtn = new JButton(" Show ");
        showBtn.setFont(new Font("Courier New", Font.BOLD, 20));
        showBtn.addActionListener(this);
        container.add(showBtn);

        setSize(400, 120);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        Lab8_1 obj = new Lab8_1();
        obj.setValue((int) (Math.random() * 100));
        obj.textField.setText(obj.toString());
    }

    public void setValue(int n) {
        number = n;
    }

    public int getValue() {
        return (number);
    }

    public String toString() {
        return (Integer.toString(getValue()));
    }

    public void actionPerformed(ActionEvent event) {
        if (event.getSource() == saveBtn) {
            int value = Integer.parseInt(textField.getText());
            this.setValue(value);
            textField.setText("");

        } else if (event.getSource() == clearBtn) {
            this.setValue(0);
            textField.setText("");

        } else if (event.getSource() == showBtn) {
            textField.setText(this.toString());
        }
    }
}