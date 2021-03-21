package Employee;

import java.util.Scanner;

public class TestEmployee1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Employee employee = new Employee();

        System.out.print("Employee is empty : " + employee.toString());
        System.out.print("Enter employe id :");
        employee.setEmpId(scan.nextInt());
        System.out.print("Enter employe name :");
        employee.setEmpName(scan.next());
        System.out.print("Enter employe salary :");

        employee.setEmpSalary(scan.nextDouble());
        System.out.print("Enter employe time in :");
        employee.setEmpTimeIn(scan.next());
        System.out.print("Enter employe time out :");
        employee.setEmpTimeOut(scan.next());
        System.out.print("Employee data : " + employee.toString());
    }

}
