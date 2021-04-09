import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Lab12_03 extends JFrame implements ActionListener, MouseListener {
    int x1, y1, x2, y2;
    int x11, x22, x33, y11, size;
    JButton btnLine, btnRect, btnCircle, btnClear, greenBtn, blueBtn;
    JTextField text1, text2;
    Color oldColor1, oldColor2;
    Container container;
    char typeShape = 'L';
    boolean isDraw = true;

    public Lab12_03() {
        super("");
        size = 30;
        addMouseListener(this);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        c.add(new JLabel("         "));
        btnLine = new JButton("Line");
        btnLine.addActionListener(this);
        // c.add(btnLine);

        btnRect = new JButton("Rectangle");
        btnRect.addActionListener(this);
        // c.add(btnRect);

        btnCircle = new JButton("Circle");
        btnCircle.addActionListener(this);
        // c.add(btnCircle);

        btnClear = new JButton("Clear");
        btnClear.addActionListener(this);
        // c.add(btnClear);
        c.add(new JLabel("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     "));
        c.add(new JLabel("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     "));
        c.add(new JLabel("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     "));
        c.add(new JLabel("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     "));

        text1 = new JTextField(12);
        text1.setEditable(false);
        c.add(text1);

        text2 = new JTextField(12);
        text2.setEditable(false);
        c.add(text2);
                                                                
        addMouseListener(this);
    }

    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.yellow);
        g.fillRect(30, 60, 50, 20);
        g.setColor(Color.BLACK);
        g.drawRect(30, 60, 50, 20);
        g.drawString("LINE",42,75);

        g.setColor(Color.yellow);
        g.fillRect(90, 60, 50, 20);
        g.setColor(Color.BLACK);
        g.drawRect(90, 60, 50, 20);
        g.drawString("RECT",102,75);

        g.setColor(Color.yellow);
        g.fillRect(150, 60, 50, 20);
        g.setColor(Color.BLACK);
        g.drawRect(150, 60, 50, 20);
        g.drawString("CIRC",162,75);

        g.setColor(Color.yellow);
        g.fillRect(210, 60, 50, 20);
        g.setColor(Color.BLACK);
        g.drawRect(210, 60, 50, 20);
        g.drawString("CLEAR",215,75);

        g.setColor(Color.BLUE);
        g.fillRect(20, 100, size, size);
        g.setColor(Color.BLACK);
        g.drawRect(20, 100, size, size);

        g.setColor(Color.orange);
        g.fillRect(60, 100, size, size);
        g.setColor(Color.BLACK);
        g.drawRect(60, 100, size, size);

        g.setColor(Color.red);
        g.fillRect(100, 100, size, size);
        g.setColor(Color.BLACK);
        g.drawRect(100, 100, size, size);

        g.setColor(Color.green);
        g.fillRect(140, 100, size, size);
        g.setColor(Color.BLACK);
        g.drawRect(140, 100, size, size);

        g.setColor(Color.pink);
        g.fillRect(180, 100, size, size);
        g.setColor(Color.BLACK);
        g.drawRect(180, 100, size, size);

        g.setColor(Color.yellow);
        g.fillRect(220, 100, size, size);
        g.setColor(Color.BLACK);
        g.drawRect(220, 100, size, size);

        g.setColor(Color.MAGENTA);
        g.fillRect(260, 100, size, size);
        g.setColor(Color.BLACK);
        g.drawRect(260, 100, size, size);

        g.setColor(Color.darkGray);
        g.fillRect(300, 100, size, size);
        g.setColor(Color.BLACK);
        g.drawRect(300, 100, size, size);

        g.setColor(Color.BLUE);
        g.fillRect(340, 100, size, size);
        g.setColor(Color.BLACK);
        g.drawRect(340, 100, size, size);

        g.setColor(Color.lightGray);
        g.fillRect(380, 100, size, size);
        g.setColor(Color.BLACK);
        g.drawRect(380, 100, size, size);

        g.setColor(Color.black);
        g.fillRect(420, 100, size, size);
        g.setColor(Color.BLACK);
        g.drawRect(420, 100, size, size);

        g.setColor(Color.DARK_GRAY);
        g.fillRect(460, 100, size, size);
        g.setColor(Color.BLACK);
        g.drawRect(460, 100, size, size);


        switch (typeShape) {
        case 'L':
            g.drawLine(x1, y1, x2, y2);
            break;
        case 'R':
            g.drawRect(x1, y1, x2 - x1, y2 - y1);
            break;
        case 'C':
            g.drawOval(x1, y1, x2 - x1, y2 - y1);
            break;
        }
    }

    public void mousePressed(MouseEvent event) {
        if (event.getButton() == 1) { // Mouse Left
            x1 = event.getX();
            y1 = event.getY();
            boolean isLine = isInside(20,60,50,20,x1,y1);
            text1.setText("(X1 = " + x1 + ",Y1 = " + y1 + ")");
        } else if (event.getButton() == 3) { // Mouse Right
            x2 = event.getX();
            y2 = event.getY();
            text2.setText(" (X2 = " + x2 + ",Y2 = " + y2 + ")");
        }
    }

    public void mouseReleased(MouseEvent event) {
        repaint();
    }

    public void mouseClicked(MouseEvent event) {
        repaint();
    }

    public void mouseEntered(MouseEvent event) {
        repaint();
    }

    public void mouseExited(MouseEvent event) {
        repaint();
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnLine)
            typeShape = 'L';
        else if (e.getSource() == btnRect)
            typeShape = 'R';
        else if (e.getSource() == btnCircle)
            typeShape = 'C';
        else if (e.getSource() == btnClear) {
            x1 = y1 = x2 = y2 = 0;
            text1.setText("");
            text2.setText("");
        }
        repaint();
    }

    public static void main(String[] args) {
        Lab12_03 window = new Lab12_03();
        window.setSize(510, 500);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
    }

    boolean isInside(int x1, int y1, int width, int height, int posx, int posy  ) {
        int x2 = x1 + width;
        int y2 = y1 + height;
        if (posx >= x1 && posx <= x2)
            if (posy >= y1 && posy <= y2)
                return true;
        return false;
    }
}
