package Student;
import java.util.*;
import java.text.*;
import javax.swing.*;

public class Midtest{

    public int objnum1; // ประกาศตัวแปรชื่อ objnum1 เป็น object เป็นประเภท pubilc
    private int objnum2; // ประกาศตัวแปรชื่อ objnum2 เป็น object เป็นประเภท private
    
    public Midtest(){ // ประกาศ Method เป็นแบบ constrcutor
    }
    public Midtest(int objnum2){ // ประกาศ Method เป็นแบบ constrcutor overload ไว้เก็บค่าที่ตัวแปรที่เป็นชนิด Private ชื่อ objnum2
        this.objnum2 = objnum2;
    }

    public void setObjnum2(int objnum2){ // ประกาศ Method ที่ไม่คืนค่า ชื่อ setObjnum2 ไว้เก็บค่าที่ตัวแปรที่เป็นชนิด Private ชื่อ objnum2
        this.objnum2 = objnum2;
    }
    public int getObjnum2(){ // ประกาศ Method ที่ต้องคืนค่า ประเภท int ชื่อ getObjnum2 ไว้เรียกใช้งานค่าของตัวแปรที่เป็นชนิด Private ชื่อ objnum2
        return this.objnum2;
    }

    public static void main(String[] args) {
        Midtest obj = new Midtest(); // ประกาศตัวแปรชื่อ obj เป็นแบบ Object ของคลาสที่ชื่อ Midtest
        int[] array1 = new int [12]; // ประกาศตัวชื่อ array1 เป็นประเภท int เป็นแบบ Array 1 มิติ ที่มีขนาด 12 ช่อง
        int[][] array2; // ประกาศตัวชื่อ array2 เป็นประเภท int เป็นแบบ Array 2 มิติ ที่ไม่มีขนาดช่อง
        int numberrow=0,numbercol=0; // ประกาศตัวชื่อ numberrow และ numbercol เป็นประเภท int
        String enternumber=""; // ประกาศตัวแปรชื่อ enternumber เป็นประเภท String
        String output = "row     col\n"; // ประกาศตัวแปรชื่อ output เป็นประเภท String โดยใส่ข้อความ row  col แล้วขึ้นบรรทัดใหม่
        enternumber = JOptionPane.showInputDialog("Enter Number row"); // สร้างกล่องข้อความไว้เก็บค่าไว้ที่ตัวแปร enternumber มีข้อความ "Enter Number row"
        numberrow = Integer.parseInt(enternumber); // แปลงข้อความจากตัวแปรให้เป็น ตัวเลข(int)
        enternumber = JOptionPane.showInputDialog("Enter Number col"); // สร้างกล่องข้อความไว้เก็บค่าไว้ที่ตัวแปร enternumber มีข้อความ "Enter Number col"
        numbercol = Integer.parseInt(enternumber); // แปลงข้อความจากตัวแปรให้เป็น ตัวเลข(int)
        array2 = new int [numberrow][numbercol]; // ตัวแปร array2 ที่เป็น 2 มิติ นำมากำนดขนาดใหม่โดยมีค่าจาก numberrow ในมิติที่ 1 numbercol ในมิติที่ 2
        for(int i=0;i<array2.length;i++){ // ประกาศลูป for ใช้สำหรับ array มิติที่ 1
            array1[i] = (i+1); // นำค่า i+1 เก็บไว้ในตัวแปร array1
            output += array1[i]+".       "; // ใส่ข้อความ เป็นค่าของตัวแปร array1
            for(int j=0;j<array2[i].length;j++){ // ประกาศลูป for ใช้สำหรับ array มิติที่ 2
                NumberFormat formatter = new DecimalFormat("#,##0.00"); // ประกาศตัวแปรชื่อ formatter ใช้สำหรับ set การแสดงตัวเลข
                obj.objnum1 = random(1,10); // นำตัวแปรชื่อ objnum1 โดยเรียกผ่านตัวแปร obj เป็นแบบ Object แล้วนำค่าของ Method ที่ชื่อ random มาเก็บไว้เป็นแบบ Parameter
                obj.setObjnum2(obj.objnum1); // นำค่าของตัวแปรที่อยู่ใน ตัวแปร objnum1 ของตัวแปร obj ส่งค่าไปยัง method ชื่อ setObjnum2 โดยที่เรียกผ่าน object
                array2[i][j] = obj.getObjnum2(); // นำค่าของ objnum2 โดยเรียกผ่าน method getObjnum2 เก็บไว้ในตัวแปร array2
                output += formatter.format(array2[i][j])+" "; // นำค่าของตัวแปร array2 มาจัดตาม format ที่จัดไว้ แล้วเก็บค่าไว้ที่ตัวแปร output แบบข้อความ
            }
            output += "\n"; // ใส่ข้อความ ขึ้นบรรทัดใหม่
        }
        obj.display(output); // ส่งค่า output ไปยัง Method ชื่อ display ผ่าน Object เป็นแบบ Value
    }

    public static int random(int st,int ed){ // Method สุ่มค่า
        int offset = ed - st + 1;
        return (st + (int) (Math.random() * offset)); // ส่งค่าที่สุ่มกลับไป
    }

    public void display(String output){ // Method แสดงผล
        JOptionPane.showMessageDialog(
        null, output, "Result", 1); // Dailog แสดงผล ค่าของตัวแปร output 
    }
}