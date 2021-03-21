package Lab6;

public class Lab6_1 {
    public static void main(String[] args) {
        Lab6_1 obj = new Lab6_1();
        int X[] = new int[10]; // declare and allocate array
        int Y[] = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
        final int Array_Size = 10;
        int Z[]; // declare array
        Z = new int[Array_Size]; // allocate array
        // Initial value in array
        for (int i = 0; i < X.length; i++)
            X[i] = i;
        for (int i = 0; i < Z.length; i++)
            Z[i] += X[i] * 5 + Y[i];
        // Display output of array
        obj.Display(X, Y, Z);;
        
        }
        
    public void Display(int X[] , int Y[] , int Z[]) {
        System.out.println("\tIndex \tArray X \tArray Y \tArray Z");
        for (int i = 0; i < X.length; i++) {
            System.out.print("\t" + X[i] + " \t\t" + X[i]);
            System.out.println(" \t\t" + Y[i] + " \t\t" + Z[i]);  
        }
    }
}

