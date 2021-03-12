import java.util.Scanner;
public class Q3
{
	public static void main(String[] args) {
	Scanner perimeter = new Scanner(System.in);
	System.out.println ("Enter three edges (length in double): " );
    double l1 = perimeter.nextDouble();  
    double l2 = perimeter.nextDouble();  
    double l3 = perimeter.nextDouble();  
    if (l1 >= 0 && l2>=0 && l3>=0)  
    {
        if (l1+l2 > l3 && l2+l3>l1 && l1+l3>l1) 
        {
            double Perimeter = l1+l2+l3;
            System.out.println("The perimeter of the triangle is: "+ Perimeter);
        }
        else{
        System.out.println("Invalid input");
        }
    }
    else
    {
        System.out.println("Invalid input");
    }
	}
}
