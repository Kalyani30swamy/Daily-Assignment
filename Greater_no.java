// WAP to accept 5 number from user and find out the greater

import java.util.*;
public class Greater_no {

	public static void main(String[] args)
	{
		//initialize the variables
		int num1,num2,num3,num4,num5;
        Scanner sc = new Scanner(System.in);
        //print five number
        System.out.println("Enter the five number:");
        System.out.println("enter num1");
        num1=sc.nextInt();
        System.out.println("enter num2");
        num2=sc.nextInt();
        System.out.println("enter num3");
        num3=sc.nextInt();
        System.out.println("enter num4");
        num4=sc.nextInt();
        System.out.println("enter num5");
        num5=sc.nextInt();
        //check for greater number
        if(num1>num2 && num1>num3 && num1>num4 && num1>num5)
        {
        	System.out.println("num1 is greater=" +num1);
        }
        else if(num2>num3 && num2>num4 && num2>num5)
        {
        	System.out.println("num2 is greater=" +num2);
        }
        else if(num3>num4 && num3>num5)
        {
        	System.out.println("num3 is greater=" +num3);
        }
        else if(num4>num5)
        {
        	System.out.println("num4 is greater=" +num4);
        }
        else
        {
        	System.out.println("num5 is greater=" +num5);
        }
	}
}

