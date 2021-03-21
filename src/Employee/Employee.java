package Employee;

public class Employee {
	private int empId;
	private String empName;
	private double empSalary;
	private String empTimeIn;
	private String empTimeOut;

	public Employee() {

	}

	public Employee(int empId, String empName, double empSalary, String empTimeIn, String empTimeOut) {
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
		this.empTimeIn = empTimeIn;
		this.empTimeOut = empTimeOut;
	}

	public Employee(int empId, String empName) {
		this.empId = empId;
		this.empName = empName;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}

	public String getEmpTimeIn() {
		return empTimeIn;
	}

	public void setEmpTimeIn(String empTimeIn) {
		this.empTimeIn = empTimeIn;
	}

	public String getEmpTimeOut() {
		return empTimeOut;
	}

	public void setEmpTimeOut(String empTimeOut) {
		this.empTimeOut = empTimeOut;
	}

	public String toString() {
		String str;
		str = getEmpId() + ", " + getEmpName() + ", " + getEmpSalary();
		str += ", " + getEmpTimeIn() + ", " + getEmpTimeOut();
		return (str);
	}

}
