import java.util.*;

import javax.lang.model.util.ElementScanner14;
public class Operator_ex
 {
  public static void main(String[] args) 
  {
      int ch,num1,ch1,num2,num3,num4,num5;
     System.out.println("Enter Your Choice\n 1:unary Operator\n 3:Binary operator \n 2:Ternary Operator\n ");
     Scanner in=new Scanner(System.in);
       ch=in.nextInt();
       switch(ch)
       {
        case 1:System.out.println("\nUnary Operators");
        System.out.println("\nEnter a number:");
        num1=in.nextInt();
        System.out.println("\n number after increamentation is "+(num1++));
        System.out.println("\n number after decreamentation is "+(num1--));
        break;
        case 2: System.out.println("\nBinary Operators:\n1.Arithmetic Operators\n2.Logical Operator\n3.Betwise Operator");
        ch1=in.nextInt();
            switch(ch1)
            {
            case 1: System.out.println("\nArithmetic Operators");
            System.out.println("\nEnter two number:");
            num2=in.nextInt();
            num3=in.nextInt();
            System.out.println("Addition = "+(num2+num3));
            System.out.println("Substraction = "+(num2-num3));
            System.out.println("Multiplication = "+(num2*num3));
            System.out.println("Division = "+(num2/num3));
            System.out.println("Modulus = "+(num2%num3));
            break; 
            case 2:
            System.out.println("Logical Operators \n1. Logical And(&&) \n2. Logical Or(||) ");
            int ch3;
            System.out.println("Enter your choice to see the use of logical operators\n1. Find Greater no\n2. Check whether Entered no is prime or not");
            ch3=in.nextInt();
            switch(ch3)
            {
                case 1:System.out.println("\nEnter three nos to check greater no:");
                num2=in.nextInt();
                num3=in.nextInt();
                num4=in.nextInt();
                if(num2>num3 && num2>num4)
                {
                    System.out.println(num2+" is greater number");
                }
                else if(num3>num2 && num3>num4)
                {
                  System.out.println(num3+" is greater number");  
                }
                else
                {
                   System.out.println(num4+" is greater number"); 
                }
                break;
                case 2:
                System.out.println("Enter no:");
                num5=in.nextInt();
                if(num5%1==0 || num5%2==0 || num5%3==0 || num5%5==0 || num5%7==0 || num5%11==0 || num5%13==0 || num5%17==0)
                {
                    System.out.println(num5+" is prime number");
                }
                else 
                {
                    System.out.println(num5+" is not prime number");
                }
                break;
                default:
                System.out.println("Enter valid choice");
            }

           break;
           
        }
      break;
     case 3:System.out.println("Ternary operator");
           int a,b;
           System.out.println("Enter two number:");
           a=in.nextInt();
           b=in.nextInt();
           System.out.println("the greater number is"+(a>b?a:b));
           break;
           default:
           System.out.println("Invalide choice");
    }
 }   
}
