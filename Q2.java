import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	     int length = 5;
	     int char_count = 2,num_count = 2,schar_count = 1;
	     int charcount = 0, numcount=0,scharcount = 0;
		 Scanner numberplate = new Scanner(System.in);
		 System.out.print("Enter a valid plate number: ");
		 String input = numberplate.nextLine();
		 if (input.length() == length)
		 {
		      for (int i = 0; i <= 1; i++) 
		     {
		        char ch = input.charAt(i);
                if (ch >= 'A' && ch <= 'Z'){
                    charcount ++ ;
                }
		     }
		     for (int i = 3; i <= 4; i++) 
		     {
		        char ch = input.charAt(i);
                if (ch >= '1' && ch <= '9'){
                    numcount ++ ;
                }
		     }
		     for (int i = 2; i < 3; i++) 
		     {
		        char ch = input.charAt(i);
                if (ch == '-'){
                    scharcount ++ ;
                }
		     }
		     if (charcount == char_count && numcount == num_count && scharcount==schar_count)
		     {
		         System.out.println(input+" is an valid number plate");
		     }
		     else
		 {
		      System.out.println(input+" is an invalid number plate") ; 
		 }
		 }
		 else
		 {
		      System.out.println(input+" is an invalid number plate") ; 
		 }
		 }
		 }
