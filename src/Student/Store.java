package Student;
import javax.swing.JOptionPane;

public class Store {
    private float price = 0;
    private String sell_product(String code, String product[][]) {
        String output = "";
        for (int i = 0; i < product.length; i++) {
            if (code.equals(product[i][0]) || code.equals(product[i][1])) {
                String amount = JOptionPane.showInputDialog(null, "Enter Amount Product : ");
                output += product[i][1] + "x" + amount + " " + (Integer.parseInt(product[i][2]) * Integer.parseInt(amount)) + "baht\n";
                this.price += sell_price(Integer.parseInt(product[i][2]), Integer.parseInt(amount));
            }
        }
        return output;
    }

    private float sell_price(int price, int amount) {
        return price *= amount;
    }
    public static void main(String[] args) {
        String output = "";
        Store obj = new Store();
        String product[][] = { 
            { "1001", "Snack", "10" }, 
            { "1002", "Milk", "12" }, 
            { "1003", "Apple", "16" },
            { "0000", "Grumme", "4" },
            { "1234", "MAMA", "6"}
        };
        while (true) {
            String code = JOptionPane.showInputDialog(null, "Enter Code Product : ");
            if (code.equals("-1")){
                break;
            }
            output += obj.sell_product(code, product);
        }

        JOptionPane.showMessageDialog(null, output + obj.price + "baht", "Checkout", JOptionPane.INFORMATION_MESSAGE);
    }
}
