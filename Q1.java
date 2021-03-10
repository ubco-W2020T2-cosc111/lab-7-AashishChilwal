import java.util.Scanner;
public class Q1
{
	public static void main(String[] args) {
	Scanner letters = new Scanner(System.in);
	System.out.println ("Enter a letter: " );
    char letter = letters.next().charAt(0);
    if (letter >= 97 && letter <=122)
    {
         if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
       System.out.println(letter + " is a vowel.");
      }
      else{
       System.out.println(letter + " is a consonant.");
      }
    }
        else
        {
            System.out.println(letter+" is an invalid input");
        }
	    
	}
}
