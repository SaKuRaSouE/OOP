package Lab8;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Lab8_3 extends JFrame implements ActionListener {
    /**
     *
     */
    private static final long serialVersionUID = 4846745278589809438L;
    JLabel textLabel;
    JTextField textField;
    JButton saveBtn, clearBtn, showBtn;
    JButton addBtn, subBtn, mulBtn, divBtn;
    JButton sqrt, percent, madd, msub,power,base,bin;
    Container container;
    NumberNew obj;

    public Lab8_3() {
        super("Program Calculate Number");
        container = getContentPane();
        container.setLayout(new FlowLayout());

        textLabel = new JLabel("Enter Number :");
        textLabel.setFont(new Font("Kanit-Regular", Font.BOLD, 20));
        container.add(textLabel);

        textField = new JTextField(10);
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

        addBtn = new JButton(" + ");
        addBtn.setFont(new Font("Courier New", Font.BOLD, 20));
        addBtn.addActionListener(this);
        container.add(addBtn);

        subBtn = new JButton(" - ");
        subBtn.setFont(new Font("Courier New", Font.BOLD, 20));
        subBtn.addActionListener(this);
        container.add(subBtn);

        mulBtn = new JButton(" * ");
        mulBtn.setFont(new Font("Courier New", Font.BOLD, 20));
        mulBtn.addActionListener(this);
        container.add(mulBtn);

        divBtn = new JButton(" / ");
        divBtn.setFont(new Font("Courier New", Font.BOLD, 20));
        divBtn.addActionListener(this);
        container.add(divBtn);

        sqrt = new JButton(" √ ");
        sqrt.setFont(new Font("Courier New", Font.BOLD, 20));
        sqrt.addActionListener(this);
        container.add(sqrt);

        percent = new JButton(" % ");
        percent.setFont(new Font("Courier New", Font.BOLD, 20));
        percent.addActionListener(this);
        container.add(percent);

        madd = new JButton(" M ");
        madd.setFont(new Font("Courier New", Font.BOLD, 20));
        madd.addActionListener(this);
        container.add(madd);

        power = new JButton(" ^10 ");
        power.setFont(new Font("Courier New", Font.BOLD, 20));
        power.addActionListener(this);
        container.add(power);

        base = new JButton(" HEX ");
        base.setFont(new Font("Courier New", Font.BOLD, 20));
        base.addActionListener(this);
        container.add(base);

        bin = new JButton(" BIN ");
        bin.setFont(new Font("Courier New", Font.BOLD, 20));
        bin.addActionListener(this);
        container.add(bin);

        setSize(400, 240);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        Lab8_3 test = new Lab8_3();   
        test.obj = new NumberNew();
        test.textField.setText(test.obj.toString());
    }

    public void actionPerformed(ActionEvent event) {
        if (event.getSource() == saveBtn) {
            if (textField.getText().isEmpty()) {
                obj.setValue(0.0);
                textField.setText("");
            } else {
                Double value = Double.parseDouble(textField.getText());
                obj.setValue(value);
                textField.setText("");
            }
        } else if (event.getSource() == clearBtn) {
            obj.setValue(0.0);
            textField.setText("");

        } else if (event.getSource() == showBtn) {
            textField.setText(obj.toString());

        } else if (event.getSource() == addBtn) {
            if (textField.getText().isEmpty()) {
                obj.setValue(0.0);
                textField.setText("");
            } else {
                int value = Integer.parseInt(textField.getText());
                obj.add(value);
                textField.setText(obj.toString());
            }
        } else if (event.getSource() == subBtn) {
            if (textField.getText().isEmpty()) {
                obj.setValue(0.0);
                textField.setText("");
            } else {
                int value = Integer.parseInt(textField.getText());
                obj.subtract(value);
                textField.setText(obj.toString());
            }
        } else if (event.getSource() == mulBtn) {
            if (textField.getText().isEmpty()) {
                obj.setValue(0.0);
                textField.setText("");
            } else {
                int value = Integer.parseInt(textField.getText());
                obj.multiply(value);
                textField.setText(obj.toString());
            }
        } else if (event.getSource() == divBtn) {
            if (textField.getText().isEmpty()) {
                obj.setValue(0.0);
                textField.setText("");
            } else {
                int value = Integer.parseInt(textField.getText());
                obj.divide(value);
                textField.setText(obj.toString());
            }
        } else if (event.getSource() == sqrt) {
            if (textField.getText().isEmpty()) {
                obj.setValue(0.0);
                textField.setText("");
            } else {
                int value = Integer.parseInt(textField.getText());
                obj.sqrt(value);
                textField.setText(obj.toString());
            }
        } else if (event.getSource() == percent) {
            if (textField.getText().isEmpty()) {
                obj.setValue(0.0);
                textField.setText("");
            } else {
                Double value = Double.parseDouble(textField.getText());
                obj.percent(value);
                textField.setText(obj.toString());
            }
        } else if (event.getSource() == madd) {
            if (textField.getText().isEmpty()) {
                obj.setValue(0.0);
                textField.setText("");
            } else {
                Double value = Double.parseDouble(textField.getText());
                obj.madd(value);
                textField.setText(obj.toString());
            }
        } else if (event.getSource() == power) {
            if (textField.getText().isEmpty()) {
                obj.setValue(0.0);
                textField.setText("");
            } else {
                Double value = Double.parseDouble(textField.getText());
                obj.power(value);
                textField.setText(obj.toString());
            }
        } else if (event.getSource() == base) {
            if (textField.getText().isEmpty()) {
                obj.setValue(0.0);
                textField.setText("");
            } else {
                int value = Integer.parseInt(textField.getText());
                obj.base(value);
                textField.setText(obj.getValue2());
            }
        } else if (event.getSource() == bin) {
            if (textField.getText().isEmpty()) {
                obj.setValue(0.0);
                textField.setText("");
            } else {
                int value = Integer.parseInt(textField.getText());
                obj.bin(value);
                textField.setText(obj.toString1());
            }
        }
    }
}