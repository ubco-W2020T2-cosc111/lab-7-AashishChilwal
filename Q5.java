
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner checker = new Scanner(System.in);
		System.out.println("Enter your salary: ");
		int salary = checker.nextInt();
		int tax = 0;
		System.out.println("Enter M=married, S=single: ");
		String [] Status = checker.next();
		if (salary < 35000 && (Status[0].equals("M") || Status[0].equals("m")))
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
		else{
		    System.out.println("Invalid Marital Status! ");
		}
	}
}
