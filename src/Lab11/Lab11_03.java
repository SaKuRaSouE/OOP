package Lab11;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.Timer;

public class Lab11_03 extends JFrame implements ActionListener {
    Timer swTimer;
    Container container;
    JTextField inField;
    JLabel showJLabel;
    int x = 0, y = 0, w = 0, h = 0, Red = 0, Green = 0, Blue = 0;

    public Lab11_03() {
        super("Program Using Timer");
        swTimer = new Timer(1000, this);
        swTimer.start();
        container = getContentPane();
        container.setLayout(new FlowLayout());
        showJLabel = new JLabel("Please input Shape fillOval , drawOval , fillRect , drawRect :");
        container.add(showJLabel);
        inField = new JTextField(10);
        container.add(inField);
        inField.addActionListener(this);
    }

    public void paint(Graphics g) {
        super.paint(g);
        x = 20 + (int) (Math.random() * 720);
        y = 20 + (int) (Math.random() * 900);
        w = 50 + (int) (Math.random() * 720);
        h = 50 + (int) (Math.random() * 900);
        Red = (int) (Math.random() * 256);
        Green = (int) (Math.random() * 256);
        Blue = (int) (Math.random() * 256);
        g.setColor(new Color(Red, Green, Blue));
        // g.drawOval(x, y, 20, 20);
    }

    public void actionPerformed(ActionEvent event) {
        Graphics g = getGraphics();
        if (event.getSource() == inField) {
            if (inField.getText().equals("fillOval")) {
                print(g);
                g.fillOval(x, y, w, h);
            } else if (inField.getText().equals("drawOval")) {
                paint(g);
                g.drawOval(x, y, w, h);
            } else if (inField.getText().equals("fillRect")) {
                paint(g);
                g.fillRect(x, y, w, h);
            } else if (inField.getText().equals("drawRect")) {
                paint(g);
                g.drawRect(x, y, w, h);
            }
        }
    }

    public static void main(String[] args) {
        Lab11_03 test = new Lab11_03();
        test.setSize(900, 720);
        test.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        test.setVisible(true);
    }
}
