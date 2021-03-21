package Student;
import javax.swing.JOptionPane;

public class Secret_limit {

    private int rnd(int s, int e) {
        int offset = e - s + 1;
        return (s + (int) (Math.random() * offset));
    }

    public static void main(String[] args) {
        final int round = 5;
        Secret_limit obj = new Secret_limit();
        int secret_number = obj.rnd(1, 100); // 60
        boolean win = false;
        int start = 1, end = 100, number;
        for (int i = 1; i <= round; i++){
            String num = JOptionPane.showInputDialog(null, "Round " + i + "\nEnter Number " + start + " - " + end); // 50
            number = Integer.parseInt(num);
            if (number >= start && number <= end) {
                if (number == secret_number) {
                    win = true;
                    break;
                } else if (number > secret_number) { // 69
                    end = number - 1;
                } else if (number < secret_number) { // 51
                    start = number + 1;
                }
            } else {
                i--; // i = 0
            }
        }

        if (win) {
            JOptionPane.showMessageDialog(null, "Youwin \nSecret number = " + secret_number, "Win",
                    JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "YouLose \nSecret number = " + secret_number, "Lose",
                    JOptionPane.ERROR_MESSAGE);
        }

    }
}
