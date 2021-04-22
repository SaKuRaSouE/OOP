package Lab13;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Lab13_01 extends JFrame implements ActionListener {
    private Picture image1, image2, image3;
    private JPanel guiPanel1, graphicsPanel1, graphicsPanel2, graphicsPanel3;
    private JButton btn1, btn2, btn3, btn4, btn5, gui1, gui2, gui3;
    private boolean isShow = false;
    private int imageNo, panelNo;
    private Animation display;
    private JButton playBtn, stopBtn;

    public Lab13_01() {

        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        guiPanel1 = new JPanel();

        guiPanel1.setPreferredSize(new Dimension(2000, 80));
        guiPanel1.setBorder(BorderFactory.createBevelBorder(0));

        playBtn = new JButton("Play");
        playBtn.addActionListener(this);
        guiPanel1.add(playBtn);

        stopBtn = new JButton("Stop");
        stopBtn.addActionListener(this);
        guiPanel1.add(stopBtn);

        display = new Animation();

        btn1 = new JButton("Logo");
        btn1.addActionListener(this);
        guiPanel1.add(btn1);

        btn2 = new JButton("Car");
        btn2.addActionListener(this);
        guiPanel1.add(btn2);

        btn3 = new JButton("Beach");
        btn3.addActionListener(this);
        guiPanel1.add(btn3);

        btn4 = new JButton("Show");
        btn4.addActionListener(this);
        guiPanel1.add(btn4);

        btn5 = new JButton("Clear");
        btn5.addActionListener(this);
        guiPanel1.add(btn5);

        gui1 = new JButton("GUI1");
        gui1.addActionListener(this);
        guiPanel1.add(gui1);

        gui2 = new JButton("GUI2");
        gui2.addActionListener(this);
        guiPanel1.add(gui2);

        gui3 = new JButton("GUI3");
        gui3.addActionListener(this);
        guiPanel1.add(gui3);

        c.add(guiPanel1);

        graphicsPanel1 = new JPanel();
        graphicsPanel1.setPreferredSize(new Dimension(320, 240));
        graphicsPanel1.setBorder(BorderFactory.createBevelBorder(0));
        c.add(graphicsPanel1);

        graphicsPanel2 = new JPanel();
        graphicsPanel2.setPreferredSize(new Dimension(320, 240));
        graphicsPanel2.setBorder(BorderFactory.createBevelBorder(0));
        c.add(graphicsPanel2);

        graphicsPanel3 = new JPanel();
        graphicsPanel3.setPreferredSize(new Dimension(320, 240));
        graphicsPanel3.setBorder(BorderFactory.createBevelBorder(0));
        c.add(graphicsPanel3);
        c.add(display);
        loadImage();
    }

    public void loadImage() {
        image1 = new Picture("d:/logo.gif");
        image2 = new Picture("d:/car1.jpg");
        image3 = new Picture("d:/beach.jpg");
    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == gui1)
            panelNo = 1;
        else if (e.getSource() == gui2)
            panelNo = 2;
        else if (e.getSource() == gui3)
            panelNo = 3;
        if (e.getSource() == playBtn) {
            display.play();
            playBtn.setEnabled(false);
        } else if (e.getSource() == stopBtn) {
            display.stop();
            playBtn.setEnabled(true);
        }
        if (e.getSource() == btn1)
            imageNo = 1;
        else if (e.getSource() == btn2)
            imageNo = 2;
        else if (e.getSource() == btn3)
            imageNo = 3;
        else if (e.getSource() == btn4) {
            if (isShow == true)
                btn4.setText("Not show");
            else
                btn4.setText("Show");
            isShow = !isShow;
        } else {
            imageNo = 0;
            image1.clear(graphicsPanel1);
        }

        repaint();
    }

    public void stop() {
        display.stop();
    }

    public void paint(Graphics g) {
        super.paint(g);
        if (isShow) {
            if (panelNo == 1) {
                switch (imageNo) {
                case 1:
                    image1.draw(graphicsPanel1);
                    break;
                case 2:
                    image2.draw(graphicsPanel1);
                    break;
                case 3:
                    image3.draw(graphicsPanel1);
                    break;
                }
            } else if (panelNo == 2) {
                switch (imageNo) {
                case 1:
                    image1.draw(graphicsPanel2);
                    break;
                case 2:
                    image2.draw(graphicsPanel2);
                    break;
                case 3:
                    image3.draw(graphicsPanel2);
                    break;
                }
            } else if (panelNo == 3) {
                switch (imageNo) {
                case 1:
                    image1.draw(graphicsPanel3);
                    break;
                case 2:
                    image2.draw(graphicsPanel3);
                    break;
                case 3:
                    image3.draw(graphicsPanel3);
                    break;
                }
            }
        }

    }

    public static void main(String[] args) {
        Lab13_01 window = new Lab13_01();
        window.setSize(500, 350);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
    }
}