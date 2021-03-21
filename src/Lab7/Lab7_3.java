package Lab7;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Lab7_3 implements ActionListener {
    JLabel numberLabel, numberLabel1, numberLabel2;
    JTextField numberField, numberField1, numberField2;
    JButton btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0, clear, add, sub, multiply, divide, equel, point,
            mplus, mmin, back;
    JFrame window;
    int First = 0, end = 0;
    String strtus = "";

    public Lab7_3() {

        window = new JFrame("Programm Show Text");
        Container container = window.getContentPane();
        container.setLayout(new FlowLayout());

        numberLabel = new JLabel("Show Number : ");
        container.add(numberLabel);
        numberField = new JTextField(20);
        numberField.setHorizontalAlignment(SwingConstants.RIGHT);
        container.add(numberField);

        divide = new JButton(" / ");
        divide.addActionListener(this);
        container.add(divide);

        mplus = new JButton(" M+ ");
        mplus.addActionListener(this);
        container.add(mplus);

        mmin = new JButton(" M- ");
        mmin.addActionListener(this);
        container.add(mmin);

        back = new JButton(" ← ");
        back.addActionListener(this);
        container.add(back);

        btn1 = new JButton(" 1 ");
        btn1.addActionListener(this);
        container.add(btn1);

        btn2 = new JButton(" 2 ");
        btn2.addActionListener(this);
        container.add(btn2);

        btn3 = new JButton(" 3 ");
        btn3.addActionListener(this);
        container.add(btn3);

        add = new JButton(" + ");
        add.addActionListener(this);
        container.add(add);

        btn4 = new JButton(" 4 ");
        btn4.addActionListener(this);
        container.add(btn4);

        btn5 = new JButton(" 5 ");
        btn5.addActionListener(this);
        container.add(btn5);

        btn6 = new JButton(" 6 ");
        btn6.addActionListener(this);
        container.add(btn6);

        sub = new JButton(" - ");
        sub.addActionListener(this);
        container.add(sub);

        btn7 = new JButton(" 7 ");
        btn7.addActionListener(this);
        container.add(btn7);

        btn8 = new JButton(" 8 ");
        btn8.addActionListener(this);
        container.add(btn8);

        btn9 = new JButton(" 9 ");
        btn9.addActionListener(this);
        container.add(btn9);

        multiply = new JButton(" * ");
        multiply.addActionListener(this);
        container.add(multiply);

        point = new JButton(" . ");
        point.addActionListener(this);
        container.add(point);

        btn0 = new JButton(" 0 ");
        btn0.addActionListener(this);
        container.add(btn0);

        clear = new JButton(" C ");
        clear.addActionListener(this);
        container.add(clear);

        equel = new JButton(" = ");
        equel.addActionListener(this);
        container.add(equel);

        window.setSize(250, 350);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
    }

    public void actionPerformed(ActionEvent event) {
        String str = numberField.getText();
        String massage="";
        if (event.getSource() == btn1) {
            str += "1";
            numberField.setText(str);
        } else if (event.getSource() == btn2) {
            str += "2";
            numberField.setText(str);
        } else if (event.getSource() == btn3) {
            str += "3";
            numberField.setText(str);
        } else if (event.getSource() == btn4) {
            str += "4";
            numberField.setText(str);
        } else if (event.getSource() == btn5) {
            str += "5";
            numberField.setText(str);
        } else if (event.getSource() == btn6) {
            str += "6";
            numberField.setText(str);
        } else if (event.getSource() == btn7) {
            str += "7";
            numberField.setText(str);
        } else if (event.getSource() == btn8) {
            str += "8";
            numberField.setText(str);
        } else if (event.getSource() == btn9) {
            str += "9";
            numberField.setText(str);
        } else if (event.getSource() == btn0) {
            str += "0";
            numberField.setText(str);

        } else if (event.getSource() == add) {

            First = Integer.parseInt(str);
            numberField.setText("");
            strtus ="plus";
        } else if (event.getSource() == clear) {
            str = "";
            numberField.setText(str);
        } else if (event.getSource() == sub) {
            First = Integer.parseInt(str);
            numberField.setText("");
            strtus ="sub";
        } else if (event.getSource() == multiply) {
            First = Integer.parseInt(str);
            numberField.setText("");
            strtus ="mul";
        } else if (event.getSource() == divide) {
            First = Integer.parseInt(str);
            numberField.setText("");
            strtus ="div";
        } else if (event.getSource() == equel) {
           if(strtus.equals("plus")){
            end = Integer.parseInt(str);
            First = First + end;
            str = String.valueOf(First);
            numberField.setText(str);
           }if(strtus.equals("sub")){
            end = Integer.parseInt(str);
            First = First - end;
            str = String.valueOf(First);
            numberField.setText(str);
           }if(strtus.equals("mlu")){
            end = Integer.parseInt(str);
            First = First * end;
            str = String.valueOf(First);
            numberField.setText(str);
           }if(strtus.equals("div")){
            end = Integer.parseInt(str);
            First = First / end;
            str = String.valueOf(First);
            numberField.setText(str);
           }

        } else if (event.getSource() == point) {
            str += ".";
            numberField.setText(str);
        }else if (event.getSource() == back) {
           for(int i = 0;i<str.length()-1;i++){
               massage += str.charAt(i);
           }
           numberField.setText(massage);
     
        }
    }

    public static void main(String[] args) {
        Lab7_3 gui = new Lab7_3();
    }
}
