package Lab4;

public class Vehicle { // ประกาศคลาส Vehicle
    int passengers; //ประการตัวเแปร passengers เป็น int
    int fuelcap;
    int mpg;
    static boolean hasEngine = true;

    void range() { // void 
        System.out.println(hasEngine);
        System.out.println("Range is " + fuelcap * mpg + " miles.");
    }

    static int calcRange(int fuelCap, int mpg) {
        int theRange = fuelCap * mpg;
        return theRange;
    }

    static Vehicle passByValue(int i, Vehicle v) {
        System.out.println("Inside method, passByValue(..)");
        i += 1;
        
        System.out.println("Within passByValue(..): i+=1=" + i);
        v.mpg += 1;
        
        System.out.println("Inside passByValue(..) method, change the original object data,v.mpg+=1=" + v.mpg);
        System.out.println("Within passByValue(..): instantiating a new object, vehicle");
        
        Vehicle vehicle = new Vehicle();
        vehicle.passengers = 5;
        vehicle.mpg = 50;
        vehicle.fuelcap = 20;
        v = vehicle; // V เท่ากับ obj vehicle ให้ค่า vehicle ให้ค่ากับ V
        
        System.out.println("\nInside Method passByValue(..): After v=vehicle, parameter v ispointing to new object vehicle");
        System.out.println("v.passenger=vehicle.passengers=" + v.passengers + "v.mpg=vehicle.mpg=" + v.mpg+ " v.fuelcap=vehicle.fuelcap=" + v.fuelcap);
        return vehicle;
    }

    public static void main(String[] args) {
        System.out.println("You can access a class variable, or class method without instantiating an object");
        System.out.println("Access class variable using dot operator: Vehicle.hasEngine=" + Vehicle.hasEngine);
        System.out.println("Access class method using dot operator:");

        int range1 = Vehicle.calcRange(18, 33);
        System.out.println("Vehicle.calcRange(18,33)=" + range1);
        System.out.println("\nInstantiate minivan object");
       
        Vehicle minivan = new Vehicle(); //สร้าง obj ชื่อ minivan
        minivan.passengers = 7; //กำหนดค่า
        minivan.fuelcap = 16; //กำหนดค่า
        minivan.mpg = 21; //กำหนดค่า

        System.out.println("\naccess minivan's instance variables and calculate range");
        int range = minivan.fuelcap * minivan.mpg;
        
        System.out.println("Minivan can carry " + minivan.passengers + " passengers with a range of " + range + " miles.");
        System.out.println("\nInstantiate a second vehicle object");
       
        Vehicle sedan = new Vehicle(); //สร้าง obf ที่ 2 ขึ้นมา sedan
        sedan.passengers = 4; //กำหนดค่า
        sedan.fuelcap = 10; //กำหนดค่า
        sedan.mpg = 35; //กำหนดค่า
        range = sedan.fuelcap * sedan.mpg; 
        
        System.out.println("Sedan can carry " + sedan.passengers + " passengers with a range of " + range + " miles.");
        System.out.println("\nReference variable assignment.");
        System.out.println("Creating a third object v");
       
        Vehicle v = new Vehicle(); //สร้าง obf ที่ 3 ขึ้นมา v
        v.passengers = 6;
        v.fuelcap = 20;
        v.mpg = 12;
        v = minivan; // v เเละ minivan ตัวเเปรเหมือนกันสามารถให้ค่ากันได้ เอา obj minivan ไปให้กับ V ตำเเหน่งในการชี้หน่วยความจำเท่ากัน
        System.out.println("after assign object reference minivan to v, v reference the samememory block as minivan reference to"); //หน่วยความจำเดียวกัน
        System.out.println("v.passengers=minivan.passengers=" + v.passengers);
        System.out.println("v.fuelcap=minivan.fuelcap=" + v.fuelcap);
        System.out.println("v.mpg=minivan.mpg=" + v.mpg);
        System.out.println("\nCalling minivan's method:");
        
        minivan.range(); //ตัวเเปร obj minivan . ไปที่ method range เอาค่าไปคำนวณ methon เป็นเเบบ instance
        System.out.println("\nJava method passes everything by value"); // ต่อมาจะเป็นการเรียกใช้ methon pass by value
        System.out.println("Before calling the method, passByValue(..),");
        
        int j = 10; //ประกาศ int j = 10
        System.out.println("j =" + j); //เเสดงค่า J ออกมาเป็น 10
                                                              //เเสดงค่าของ passengers ใน obj sedan                            //เเสดงค่า ข้อมูล mpg ใน obj sedan
        System.out.println("sedan.passengers=" + sedan.passengers + "sedan.mpg=" + sedan.mpg + " sedan.fuelcap=" + sedan.fuelcap); //เเสดงค่าตัวเเปร furlcap ใน sedan
        System.out.println("Calling method passByValue(..)"); // เเสดงค่าตอนนี้จะเรียกใช้ method จะเริ่มใช้ passByValue
        
        Vehicle v1 = passByValue(j, sedan); //ประกาศ Vehicle V1 มาใช้เรียกค่าคืนกลับจากการเรียกใช้ passByValue มาส่ง J มีค่าเป็น 10 passByValue sedan passByreference
        System.out.println("Now the control is returned to the caller method.");
        System.out.println("Primitive variable is not changed: j=" + j); //พิมพ์มีถีบ
        System.out.println("sedan references to the same object (memory block), however thevalue of variable, mpg, in that object changes");
        System.out.println("sedan.passenger=" + sedan.passengers + "sedan.mpg=" + sedan.mpg + " sedan.fuelcap=" + sedan.fuelcap);
    }
}
