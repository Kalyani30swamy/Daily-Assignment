import java.util.Scanner;
public class Student_demo {
	public static void main(String[] args) 
	{
		accept_name();
		accept_value();

}
public static void accept_name()
{
	Scanner sc=new Scanner(System.in);
	int size,i;
	System.out.println("Enter the size");
	size=sc.nextInt();
	String[] name=new String[size];
	System.out.println("Enter "+size+" names:");
	for(i=0;i<size;i++)
	{
		name[i]=sc.next();
	}
	System.out.println("The names are :");
	for(i=0;i<size;i++)
	{
		System.out.println(name[i]);
	}
}
public static void accept_value()
{
	// Taking input from user 
    Scanner sc = new Scanner(System.in); 
    int n;     //Declaring Variables
    
    //Ask the user to enter the Array Size
    System.out.println("Enter the total subjects ");
    n=sc.nextInt();
    
    //Declare the array
    int arr[] = new int[n]; 
    System.out.println("Enter the marks secured in each subject ");
    for(int i=0;i<n;i++)   //Initialize the array
    {
        arr[i]=sc.nextInt();
    }
    
    int total=0;
    //Calculate the total marks
    for(int i=0;i<n;i++)
    {
        total=total+arr[i];
    }
    //Display the total marks
    System.out.println("The total marks obtained is "+total);
    
    //Calculate the percentage
    float percentage; 
   
	 percentage = (total / (float)n); 
 
    
    //Display the total percentage
   System.out.println( "Total Percentage : " + percentage + "%");
   //Display Grade
	 System.out.print("The student Grade is: ");
		if(percentage>=90)
     {
         System.out.print("A+");
     }
		else if(percentage>=80)
     {
         System.out.print("A");
     }
     else if(percentage>=60 && percentage<80)
     {
        System.out.print("B");
     } 
     else if(percentage>=40 && percentage<60)
     {
         System.out.print("C");
     }
     else
     {
         System.out.print("D");
     }
    
}   
}