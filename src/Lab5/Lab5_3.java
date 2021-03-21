package Lab5;
import javax.swing.JOptionPane;
public class Lab5_3 {
    public static void main(String[] args) {
        int value;
        String s1;
        int n1,n2;
        String number1,number2;
        String output = "";
        number1 = JOptionPane.showInputDialog("Enter Number Random Strat :");
        number2 = JOptionPane.showInputDialog("Enter Number Random Stop  :");
        n1 = Integer.parseInt(number1);
        n2 = Integer.parseInt(number2);
        for (int counter = 1; counter <= 20; counter++) {
           
            value =  n1 + ( int ) ( Math.random() * ((n2-n1)+1) );
            output += value + " "; 
            
            if (counter % 5 == 0)
                output += "\n";
        } 
        JOptionPane.showMessageDialog(null, output, "20 Random Numbers from 1 to 6", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0); 
    }
}
/* public static void main(String[] args) {
    int value;
    String output = "";
    // loop 20 times
    for ( int counter = 1; counter <= 20; counter++ ) {
    // pick random integer between 1 and 6
    value = 1 + ( int ) ( Math.random() * 6 );
    output += value + " "; // append value to output
    // if counter divisible by 5, append newline to String output
    if ( counter % 5 == 0 )
    output += "\n";
    } // end for
    JOptionPane.showMessageDialog( null, output,
    "20 Random Numbers from 1 to 6",
    JOptionPane.INFORMATION_MESSAGE );
    System.exit( 0 ); // terminate application
    }
 */