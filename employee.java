package t;
import java.util.*;
public class EmployeeDetail {
	public static void main(String [] args) {
		String name;
		System.out.println("Welcome to Employee Wage Computation Program");
		import java.util.*;

class EmployeeDetail {
	private String name;
	private float salary, hours;
	
	public EmployeeDetail() {
		name = " ";
		salary = 0;
		hours = 0;
	}
	
	public void getInfo(String n, float sal, float hr) {
		name = n;
		salary = sal;
		hours = hr;
	}
	
	public float AddSal() {
		if(salary<500) {
			salary = salary + 10;
		}
		return salary;
	}
	
	public float AddWork() {
		if(hours > 6) {
			salary = salary + 5;
		}
		return salary;
	}
}


public class Employee{

  private int employeeId;
  private String employeeName;
  private double salary;
  private double netSalary;

//setters
  public void setEmployeeId(int employeeId){
      this.employeeId=employeeId;
  }

  public void setEmployeeName(String employeeName){
      this.employeeName=employeeName;
  }

  public void setSalary(double salary){
      this.salary=salary;
  }

  public void setNetSalary(double netSalary){
      this.netSalary=netSalary;
  }

  //getters
  public int getEmployeeId(){
      return employeeId;
  }

  public String getEmployeeName(){
      return employeeName;
  }

  public double getSalary(){
      return salary;
  }

  public double getNetSalary(){
      return netSalary;
  }

  public void calculateNetSalary(double pfpercentage) {
      double pfamount = salary * (pfpercentage / 100);
      netSalary = salary - pfamount;
  }

  @Override
  public String toString() {
      String output = new StringBuffer()
              .append("Id: ").append(employeeId)
              .append(System.lineSeparator()).append("Name: ").append(employeeName)
              .append(System.lineSeparator()).append("Salary: ").append(salary)
              .append(System.lineSeparator()).append("Net Salary: ").append(netSalary).toString();
      return output;
  }
}
