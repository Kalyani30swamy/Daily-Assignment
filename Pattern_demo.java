import java.util.Scanner;

public class Pattern_demo {
	int i,j,k,blank=1;
	
	public static void main(String[] args)
	{
		Pattern_demo obj=new Pattern_demo();
		obj.Asci();
		obj.star();
		obj.binary();
		obj.table();
		obj.number();
		obj.table_ten();
	}

		

		public void Asci()
		{
			int alphabet = 65; //ASCII value of “A”
			Scanner sc=new Scanner(System.in);
			int size;
			System.out.println("Enter the size:");
			size=sc.nextInt();

			for (i=0; i<size;i++)
			{

			for (j=0;j<=i;j++)
			{

			System.out.print((char) (alphabet+j)+ " "); //Logic to print Alphabet pattern

			}

			System.out.println();
			}
		}
		public void star() 
		{
			
			for (int i=1; i<6; i++) //outer loop for number of rows(n)
	        { 
	        for (int j=5; j>=i; j--) //inner loop for spaces
	            { 
	                System.out.print(" "); //print space
	            }  
	            for (int j=1; j<=2*i-1; j++ ) //inner loop for number of columns
	            { 
	                System.out.print("* "); //print star
	            } 
	  
	            System.out.println(); //ending line after each row
				}
		}
		
			public void binary()
			{
			
				Scanner sc=new Scanner(System.in);
				int size,i,j,k;
				char ch;
				System.out.println("Enter the size:");
				size=sc.nextInt();
				for(i=1;i<=size;i++)
				{
					for(j=1;j<i;j++)
					{
						System.out.print(" ");
					}
					for( k=i;k<=size;k++)
					{
						if(k%2==0)
						{
							System.out.print("0");
						}
						else
						{
						System.out.print("1");
						}
						
					}
					System.out.println();
				}
			}
			public void number()
			
			{
				Scanner sc=new Scanner(System.in);
				int i,j,size;
				System.out.println("\nEnter the size:");
				size=sc.nextInt();
				for(i=1;i<=size;i++)
				{
					for(j=i;j<size;j++)
					{
						System.out.print(" ");
					}	
					for(j=1;j<=i;j++)
					{
						System.out.print(j);
					}
				
					System.out.println();
			}
			}
			public void table_ten()
			{
				for (int table = 1; table <= 10; table++) {
					for (int i = 1; i <= 10; i++) {

						System.out.println(table + " * " + (i) + " = " + (table * (i)));
					}
					System.out.println("----------");
				}
				}
			
				public void table()
				{
					Scanner sc = new Scanner(System.in);  
					System.out.print("Enter number: ");        
					int num=sc.nextInt();  
					for(int i=1; i <= 10; i++)  
					{  
					//prints table of the entered number      
					System.out.println(num+" * "+i+" = "+num*i);
					}
					
					
				
			
		}
	} 
		
		

		
		
		
	


