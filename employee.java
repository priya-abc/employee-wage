package t;
import java.util.*;
public class a {
	public static void main(String [] args) {
		String name;
		int WagePerHour=20;
		int FullDayHour=8;
		int HalfDayHour=4;
		int days=0;
		int totalhours=0;
		int hours=0;
		int wage=0;
		int totalwage=0;
		double salary,priceoftime,total;
		int timeover;
		System.out.println("Welcome to Employee Wage Computation Program");
		Scanner sc=new Scanner(System.in);
		Random rnum = new Random();
		for(int i=0;i<90;i++)
		{
			int random = rnum.nextInt(2);
			int halfday= rnum.nextInt(2);
			if (random == 0)
			{
				System.out.print("Employee absent");
		}
			else
			{
				System.out.print("Employee Present");
			}
		System.out.print("Enter name: ");
		name=sc.nextLine();
		System.out.print("Enter Salary: ");
		salary=sc.nextDouble();
		System.out.print("Enter OverTime: ");
		timeover=sc.nextInt();
		System.out.print("Enter Price of Time: ");
		priceoftime=sc.nextDouble();
		double pricetime=timeover*priceoftime;
		total=pricetime+salary;
		
		System.out.println("Total Salary of Monthly: "+total);
		
		}
}
}
	
