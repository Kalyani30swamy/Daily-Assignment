
import java.util.*;
public class Vowel_check
{
   public static void main(String args[])
   {
	   //define a boolean bool variable and initialize false
      boolean bool = false;
      System.out.println("Enter a character :");
      Scanner sc = new Scanner(System.in);
      char ch = sc.next().charAt(0);
      //Define cases for character
      switch(ch) {
         case 'A' :
         case 'E' :
         case 'I' :
         case 'O' :
         case 'U' :
         case 'a' :
         case 'e' :
         case 'i' :
         case 'o' :
         case 'u' : bool = true;
      }
      //check value of bool is true or not
      if(bool == true){
         System.out.println("Given character is an vowel ");
      }
      else
      {
         System.out.println("Given character is a not a vowel ");
      }
   }
}