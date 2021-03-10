import java.util.Scanner;
public class Q3
{
	public static void main(String[] args) {
	Scanner perimeter = new Scanner(System.in);
	System.out.println ("Enter three edges (length in double): " );
    double l1 = perimeter.nextDouble();
    double l2 = perimeter.nextDouble();
    double l3 = perimeter.nextDouble();
    double sum = l1+l2 , sum1 = l2+l3 , sum2 = l1+l3;
    double Perimeter = l1+l2+l3;
    if (l1 >= 0 && l2>=0 && l3>=0)
    {
        if (sum > l3 || sum2>l2 || sum1>l1)
        {
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
