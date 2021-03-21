package Lab3;

public class test {
    public static void main(String[] args) {
       int x,y,z;
       int a=7,b=9,c=6; 

       c=--a;
       x=a;
       z=(x !=c)?a:c;
       y=c;
       x=y*b%x;

       System.out.println(x);
       System.out.println(y);
       System.out.println(z);
    }
}
