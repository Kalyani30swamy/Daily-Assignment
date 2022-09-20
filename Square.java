/*  WAP to accept a number from user and display a square if number is divisible by 5*/

// importing Classes/Files
import java.util.*;

class Square {

	// Main Driver function
	public static void main(String[] args)
	// TODO Auto-generated method stub
	
	{
		
		int n, result;//initilize the variables
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number=");
		n=sc.nextInt();

		// Checking if remainder is 0 or not when divided by 5
		if (n % 5 == 0)
		{

			//squaring the given number 
			result= n*n;
			// Print the square of the given number
			System.out.println("the number is divisible by 5 and the square is=" +result);
		}
		else
		{
			// Print no if no is not divisible by 5
			System.out.println("no is not divisible by 5");
	}}
}

		
		
		
		
		
		


