package emp;
import java.util.*;
public class employee {

        public static void main(String [] args) {
		int WagePerHour=20;
		int FullDayHour=8;
		int HalfDayHour=4;
		int wage=0;
		int hours=0;
		int days=0;
		int totalhours=0;
		int totalwage=0;
		System.out.println("Welcome to Employee Wage Computation Program");
		Random rnum = new Random();
		while( days!=20 && totalhours!=100)
		{
		int random = rnum.nextInt(2);
		int halfday= rnum.nextInt(2);
		days++;
		totalhours=totalhours+hours;
		switch (random)
		{case 1:
			System.out.println("Present");
			if ( halfday == 0)
			{
				System.out.println("Employee present for half day only");
				wage=WagePerHour*HalfDayHour;
				hours=4;
			}
			else
			{
				System.out.println("Employee present for full day");
				wage=WagePerHour*FullDayHour;
				hours=8;
			}
			break;
<<<<<<< HEAD
                 case 0:
=======
                   case 0:
>>>>>>> main
			System.out.println("Absent");
			wage=0;
			hours=0;
			break;
		default:
			System.out.println("Invalid Entry");
		}
              totalwage=totalwage+wage;
		}
		System.out.println("Wage=" +totalwage);		
	}
}
