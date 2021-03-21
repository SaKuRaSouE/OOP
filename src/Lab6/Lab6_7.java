package Lab6;

public class Lab6_7 {
    // import jdk.internal.org.jline.utils.Display;
    int X[] = new int[10];
    int Y[] = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
    final int Array_Size = 10;
    int Z[];

    public static void main(String[] args) {
        Lab6_7 Obj = new Lab6_7();
        Obj.Z = new int[Obj.Array_Size];

        for (int i = 0; i < Obj.X.length; i++)
            Obj.X[i] = i;
        for (int i = 0; i < Obj.Z.length; i++)
            Obj.Z[i] += Obj.X[i] * 5 + Obj.Y[i];

        Obj.Display();
    }

    public void Display() {
        System.out.println("\tIndex \tArray X \tArray Y \tArray Z");
        for (int i = 0; i < this.X.length; i++) {
            System.out.print("\t" + this.X[i] + " \t\t" + this.X[i]);
            System.out.println(" \t\t" + this.Y[i] + " \t\t" + this.Z[i]);
        }
    }
}
