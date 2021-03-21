package Student;
import java.util.*;
public class yai{

	int number1;
	int number2;

	public static void main (String[] args){

	yai kuyyai = new yai();
	kuyyai.input();
	kuyyai.cal();
	kuyyai.output();
}

	public void input(){
	Scanner scan = new Scanner(System.in);
	this.number1 = scan.nextInt();
	this.number2 = scan.nextInt();

}
	public void cal(){
	this.number1= this.number1 + this.number2;
}
	public void output(){
	System.out.print(this.number1);
}
}