// WAP to accept age from user and check whether eligible for voting or not

import java.util.*;
 
public class Voting_age {
 
 public static void main(String[] args) 
 {
          // Declaring variables
          int age;
          // taking values from user at run time
          Scanner sc = new Scanner(System.in);
          System.out.println(" Please enter your age");
          age = sc.nextInt();
          // Checking condition for voting..
          if(age>=18)
          {
        	  System.out.println("Eligible for voting");
          }
          else
          {
        	  System.out.println("Not eligible for voting");
          }
 
 }
 
}