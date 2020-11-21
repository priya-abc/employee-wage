package t;
import java.util.*;
public class EmployeeDetail {
	public static void main(String [] args) {
<<<<<<< HEAD
		String name;
		System.out.println("Welcome to Employee Wage Computation Program");
		import java.util.*;
public class paycheck {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner input = new Scanner (System.in);

        NumberFormat nf = NumberFormat.getCurrencyInstance();

        System.out.println("Enter the employee name: ");
        long empName = input.nextLong();

        mediaArray[empName];

        System.out.println("Enter your total sales for the year:  ");
        double totalSales = input.nextDouble();

        System.out.println("\r");

        Calculations c = new Calculations (totalSales);

        System.out.println("Your Total compensation with your annual sales is:  " + nf.format(c.getCommissionCalc()));

        System.out.println("\r");

        System.out.println("If you were to increase your sales you could earn even more money!");

        System.out.println("\r");

        double i = totalSales + 5000;
        double finish = totalSales * 1.5;

        while (i <= finish) {

            c.totalSales = i;

            System.out.println("If you were to increase your sales commission to " + nf.format(i) + " you could earn: " + nf.format(c.getCommissionCalc()));

            i = i + 5000;
        }

    }

}
