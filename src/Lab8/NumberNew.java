package Lab8;
import java.math.*;
public class NumberNew {
    private Double number;
    private int number1;
    private String str;
    public NumberNew() {
        setValue((Double) (Math.random() * 100));
        // setValue1((int) (Math.random() * 100));
    }

    public NumberNew(Double n) {
        setValue(n);
        
    }
    // public NumberNew(int n) {
    //     setValue1(n);
    // }
    
    public void setValue(Double n) {
        number = n;
    }

    public Double getValue() {
        return (number);
    }

    public String toString() {
        return (Double.toString(getValue()));
    }

    public void add(int n) {
        setValue(getValue() + n);
    }

    public void subtract(int n) {
        setValue(getValue() - n);
    }

    public void multiply(int n) {
        setValue(getValue() * n);
    }

    public void divide(int n) {
        setValue(getValue() / n);
    }

    public void sqrt(int n) {

        setValue(Math.sqrt(n));
    }

    public void percent(Double n) {
        setValue(getValue() * n / 100d);
    }

    public void madd(Double n) {
        setValue(n = n - (n + n));
    }

    public void power(Double n) {
        setValue(Math.pow(10, n));
    }
    public void bin(int n) {
        int bin = 0, i, m, num = 1;
        for (i = n; i > 0; i = i / 2) {
            m = i % 2;
            bin = bin + (m * num);
            num = num * 10;
        }
         n= bin;
        setValue1(n);
    }


    public void base(int n) {
        // int bin = 0, i, m, num = 1;
        // int n1;
        // String str = "";
        // // String hex = "";
        // char  hex =' ';
        // for (i = n; i > 0; i = i / 2) {
        //     m = i % 2;
        //     bin = bin + (m * num);
        //     num = num * 10;
        // }
        // str = String.valueOf(bin);
        // if (str.equals("01")) {
        //     hex = '1';
        // }if (str.equals("10")) {
        //     hex = '2';
        // }if (str.equals("11")) {
        //     hex = '3';
        // }if (str.equals("100")) {
        //     hex = '4';
        // }if (str.equals("101")) {
        //     hex = '5';
        // }if (str.equals("110")) {
        //     hex = '6';
        // }if (str.equals("111")) {
        //     hex = '7';
        // }if (str.equals("1000")) {
        //     hex = '8';
        // }if (str.equals("1001")) {
        //     hex = '9';
        // }if (str.equals("1010")) {
        //     hex = 'A';
        // }if (str.equals("1011")) {
        //     hex = 'B';
        // }if (str.equals("1100")) {
        //     hex = 'C';
        // }if (str.equals("1101")) {
        //     hex = 'D';
        // }if (str.equals("11100")) {
        //     hex = 'E';
        // }if (str.equals("1111")) {
        //     hex = 'F';
        // }
        //  na = Integer.valueOf(hex);
        //  n = na;
        //  n = bin;
        //  n= bin;
         setValue2(Integer.toHexString(n));
    }

    public void setValue1(int n) {
        number1 = n;
    }

    public int getValue1() {
        return number1;
    }

    public String toString1() {
        return (String.valueOf(getValue1()));
    }

    public void setValue2(String n) {
        str = n;
    }

    public String getValue2() {
        return str;
    }

}
