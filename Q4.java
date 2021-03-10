import java.util.Scanner;
public class Q4
{
	public static void main(String[] args) {
		 int rps = (int) (Math.random() * 3.0);
		 Scanner guess = new Scanner(System.in);
		 System.out.print("Guess scissor (0), rock (1), paper (2): ");
		 int input = guess.nextInt();
		 if (rps == 0 &&  input == 2)
		 {
		     System.out.println("The computer is scissor. You are paper. You lost");
		 }else if (rps == 0 && input ==1)
		 {
		     System.out.println("The computer is scissor. You are rock. You won");
		 }else if (rps == 0 && input ==0)
		 {
		     System.out.println("The computer is scissor. You are also scissor. Game drawn");
		 }else if (rps == 0 && input ==1)
		 {
		     System.out.println("The computer is scissor. You are rock. You won");
		 }else if (rps == 1 && input ==0)
		 {
		     System.out.println("The computer is rock. You are scissor. You lost");
		 }else if (rps == 1 && input ==1)
		 {
		     System.out.println("The computer is rock. You are also rock. Game drawn");
		 }else if (rps == 1 && input ==2)
		 {
		     System.out.println("The computer is rock. You are paper. You won");
		 }else if (rps == 2 && input ==0)
		 {
		     System.out.println("The computer is paper. You are scissor. You won");
		 }else if (rps == 2 && input ==1)
		 {
		     System.out.println("The computer is paper. You are rock. You lost");
		 }else if (rps == 2 && input ==2)
		 {
		     System.out.println("The computer is paper. You are also paper. Game drawn");
		 }
		 else 
		 {
		 }
		 }
		 }
