package Lab4;

public class Vehicle1 {
    private int id; 
    private int passengers; 
    private int fuelCap; 
    private int mpg; 

    public Vehicle1(int id, int passengers, int fuelCap, int mpg) {
        this.id = id;
        this.passengers = passengers;
        this.fuelCap = fuelCap;
        this.mpg = mpg;
    }

    public int getID() 
    {
        return id;
    }

    public int range() {
        return fuelCap * mpg;
    }


    public static void main(String[] args) {
        Vehicle1 v1 = new Vehicle1(1, 4, 17, 25);
        int range = v1.range();
        System.out.println("The range of the vehicle is " + range + ".");
    }
}
