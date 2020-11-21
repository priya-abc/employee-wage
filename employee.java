package t;
import java.util.*;
public class EmployeeDetail {
	public static void main(String [] args) {
<<<<<<< HEAD
		String name;
		System.out.println("Welcome to Employee Wage Computation Program");
		import java.util.*;

class EmployeeDetail {
=======
		System.out.println("Welcome to Employee Wage Computation Program");
>>>>>>> UC8-modifying
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
	
class EmployeeTester
{
	public static void main(String [] args)
	{
		// Ask user for number of employees; create array of appropriate size
		
		int numberOfEmployees = Integer.parseInt(
		Employee [] employees = new Employee [numberOfEmployees];
		
		// Read information on individual employees.  In each case, first ask
		// user what kind of employee, then pop up dialog to read relevant
		// information
		
		String [] employeeKinds = { "Hourly", "Salaried" };
		String [] hourlyLabels = { "Name", "SSN", "Hourly Rate" };
		String [] salariedLabels = { "Name", "SSN", "Annual Salary" };

		for (int i = 0; i < numberOfEmployees; i ++)
		{
			String kind = (String) JOptionPane.showInputDialog(null,
				"What kind of employee is employee " + (i+1) + "? ",
				"", JOptionPane.QUESTION_MESSAGE, null, employeeKinds, "Hourly");
			if (kind.equals("Hourly"))
			{
				String [] employeeInfo = MultiInputPane.showMultiInputDialog(
					null, hourlyLabels, "Employee Information");
				employees[i] = new HourlyEmployee(employeeInfo[0], 
					employeeInfo[1], Double.parseDouble(employeeInfo[2]));
			}
			else				
			{
				String [] employeeInfo = MultiInputPane.showMultiInputDialog(
					null, salariedLabels, "Employee Information");
				employees[i] = new SalariedEmployee(employeeInfo[0], 
					employeeInfo[1], Double.parseDouble(employeeInfo[2]));
			}
		}
				
		// Print out information on all the employees
		
		System.out.println("Information on employees:"); System.out.println();
		for (int i = 0; i < employees.length; i ++)
			System.out.println(employees[i].toString());
	  
		// Pay them.  Note that, for each hourly employee, the user will be
		// asked to input the hours worked
		
		System.out.println();
		System.out.println("Weekly payroll:"); System.out.println();
		for (int i = 0; i < employees.length; i ++)
			System.out.println(employees[i].getName() + " $" + 
				(new DecimalFormat("0.00")).format(employees[i].weeklyPay()));
				
		System.exit(0);
	}
}
