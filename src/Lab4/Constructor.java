package Lab4;

public class Constructor {
    private int i;
    private boolean b;

    public Constructor() {

    }

    public Constructor(int i, boolean b) {
        this.i = i;
        this.b = b;
    }

    public void setI(int i) {
        this.i = i;
    }

    public int getI() {
        return i;
    }

    public boolean getB() {
        return b;
    }

    public void setB(boolean b) {
        this.b = b;
    }

    public static void main(String[] args) {
        System.out.println("Instantiate an object using constructor without parameters");
        Constructor c = new Constructor();
        c.setI(30);
        c.setB(false);
        System.out.println("c.i=" + c.getI() + " c.b=" + c.getB());
        System.out.println("\nInstantiate an object using constructor with parameters");
        Constructor d = new Constructor(50, true);
        System.out.println("d.i=" + d.getI() + " d.b=" + d.getB());
        
    }
}