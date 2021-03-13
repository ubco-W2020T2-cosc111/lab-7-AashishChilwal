
import java.util.Scanner;
public class Q5
{
	public static void main(String[] args) {
	    int salary = 0, tax = 0;
	    Scanner checker = new Scanner(System.in);
		System.out.println("Enter your salary: ");
	    salary = checker.nextInt();
		System.out.println("Enter M=married, S=single: ");
		String status = checker.next();
		for (int i = 0;i<1;i++)
		{
		    char ch = status.charAt(i);
		
		if (salary < 35000 && (ch == 'M'|| ch == 'm'))
		{
		     tax = salary * (20/100);
		    System.out.println("Tax$ : " + tax);
		} else if (salary < 35000 && (ch == 'S' || ch == 's') )
		{
		     tax = salary * (30/100);
		    System.out.println("Tax$ : ");
		}else if (salary > 50000 && (ch == 'M' || ch == 'm'))
		{
		     tax = salary * (40/100);
		    System.out.println("Tax$ : " + tax);
		}else if (salary > 50000 && (ch == 'S' || ch == 's'))
		{
		     tax = salary * (50/100);
		    System.out.println("Tax$ : " + tax);
		}else if ((salary >= 35000 && salary <=50000) && (ch == 'S' || ch == 's'))
		{
		     tax = salary * (40/100);
		    System.out.println("Tax$ : " + tax);
		}else if ((salary >= 35000 && salary <=50000) && (ch == 'M' || ch == 'm'))
		{
		     tax = salary * (30/100);
		    System.out.println("Tax$ : " + tax);
		}
		else{
		    System.out.println("Invalid Marital Status! ");
		}
		}
	}
}
