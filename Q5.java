
import java.util.Scanner;
public class Q5
{
	public static void main(String[] args) {
	    Scanner checker = new Scanner(System.in);
		System.out.println("Enter your salary: ");
		int salary = checker.nextInt();
		int tax = 0;
		System.out.println("Enter M=married, S=single: ");
		String status = checker.nextLine();
		if (salary < 35000 && status.charAt(0) == "M" || status.chartAt(0) == "m")
		{
		    tax = (salary * (20/100));
		    System.out.println("Tax$ : " + tax);
		} else if (salary < 35000 && status.charAt(0) == "S" || status.chartAt(0) == "s" )
		{
		    tax = (salary * (30/100));
		    System.out.println("Tax$ : ");
		}else if (salary > 50000 && status.charAt(0) == "M" || status.chartAt(0) == "m")
		{
		    tax = (salary * (40/100));
		    System.out.println("Tax$ : " + tax);
		}else if (salary > 50000 && status.charAt(0) == "S" || status.chartAt(0) == "s")
		{
		    tax = (salary * (50/100));
		    System.out.println("Tax$ : " + tax);
		}else if (salary >= 35000 && salary <=50000 && status.charAt(0) == "S" || status.chartAt(0) == "s")
		{
		    tax = (salary * (40/100));
		    System.out.println("Tax$ : " + tax);
		}else if (salary >= 35000 && salary <=50000 && status.charAt(0) == "M" || status.chartAt(0) == "m")
		{
		    tax = (salary * (30/100));
		    System.out.println("Tax$ : " + tax);
		}
	}
}
