/*Q.WAP to Accept a no from the user and perform the following task
1:Logical Operator
2: Arithmetic Operation
3: Reverse of the No
4: swapping of two no with third variable
5:Swapping without third variable
6:Accept the value find out the factorial and pass the value of factorial to another function 7
7:Find out the sum of digit
*/


import java.util.*;				//importing packages
public class Func_demo {
	Scanner sc=new Scanner(System.in);

	//1st Logical operator method 
	void logical() {
	 System.out.println("Using Logical operator:-  ");	
	 System.out.println("enter num1 :");
	 int num1=sc.nextInt();
	 System.out.println("enter num2 :");
	 int num2=sc.nextInt();	
	 System.out.println("enter num3 :");
	 int num3=sc.nextInt();	
	 if(num1>num2 && num1>num3)
     {
         System.out.println(num1+" is greater number");
     }
     else if(num2>num1 && num2>num3)
     {
       System.out.println(num2+" is greater number");  
     }
     else
     {
        System.out.println(num3+" is greater number"); 
     }
	}
	
	// 2nd Arithmetic operator 
	void Arithmatic() {
		System.out.println("Using Arithmetic operator: ");	
	System.out.println("Enter num1 :");
	int num1=sc.nextInt();
	System.out.println("Enter num2 :");
	int num2=sc.nextInt();
	System.out.println("The Addition of num1 and num2 is:"+(num1+num2)); // addition formula in printing statement
	System.out.println("Substraction = "+(num1-num2));
    System.out.println("Multiplication = "+(num1*num2));
    System.out.println("Division = "+(num1/num2));
    System.out.println("Modulus = "+(num1%num2));
	}
	
	//3rd Reverse Number
	void Reverse() {
		System.out.println("Using Reversing a number:- ");
		int rev=0,rem;
		System.out.println("enter a number :");
		int num=sc.nextInt();
		while(num>0){
		    rem=num%10;
			rev=rev*10+rem; // formulas
			num=num/10;
		}
		System.out.println("The reverse of number is :"+rev);
	}
	
	//4th Swapping numbers with 3 variable
	void Swap() {
		System.out.println("Using Swapping Numbers using 3 variable:- ");
		System.out.println("enter a number1 :");
		int num1=sc.nextInt();
		System.out.println("enter a number2 :");
		int num2=sc.nextInt();
		int num3 = 0;
		System.out.println("before Swapping :"+num1+" "+num2);
		num3=num1; 
		num1=num2;  //swapping
		num2=num3;
		System.out.println("After Swapping :"+num1+" "+num2);
	}
	
	//5th Swapping numbers without using three variable 
	void swapWithout() {
		System.out.println("Using Swapping Numbers using 2 variables:- ");
		System.out.println("enter a number1 :");
		int num1=sc.nextInt();
		System.out.println("enter a number2 :");
		int num2=sc.nextInt();
		System.out.println("before Swapping :"+num1+" "+num2);
	    num1=num1+num2;
	    num2=num1-num2;  //swapping using with formula
	    num1=num1-num2;
	    System.out.println("After Swapping :"+num1+" "+num2);
	}
	
	//6th factorial of number
	void factii(int fact) // variable calling from another function 
	{
		System.out.println("The Factorial is :"+fact);
	}
	
	//7th sum of digits
	void sum() {
		System.out.println("\n sum of Digits \nThe sum of Digits is :"+factorial()); //function calling
	}
	int factorial() {
		System.out.println("Using Factorial of Number ");	
		System.out.println("Enter a number :");
		int num=sc.nextInt();
		int fact=1;
		int sum1=0;
		for(int i=num;i>=1;i--) {
			fact=fact*i; // factorial formula
			sum1=sum1+i; // addition formula
		}
		factii(fact); //function name with variable 
		return sum1;  //return a value		
	}
	
	//main method
    public static void main(String[] args) {
	Func_demo m=new Func_demo();
	//method calling using object of class
	m.logical(); 
	m.Arithmatic();
	m.Reverse();       
	m.Swap();
	m.swapWithout();
	m.sum();
}
}