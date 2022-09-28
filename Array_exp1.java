import java.util.Scanner;

public class Array_exp1 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Array_exp1 obj=new Array_exp1();
		
		//obj.accept();
		obj.great_small();
		int[] num=obj.acceptValue();
		obj.ascendingNo(num);
		obj.descendingNo(num);
		
		
		
		
	}
	
	public void great_small()
	{
		Scanner sc=new Scanner(System.in);
		int size,i;
		System.out.println("Enter the size");
		size=sc.nextInt();
		int num[]=new int[size];
		System.out.println("Enter "+size+ " Numbers:");
		for(i=0;i<size;i++)
		{
			num[i]=sc.nextInt();
		}
		
		

		  //assign first element of an array to largest and smallest
		  int smallest = num[0];
		  int largetst = num[0];

		  for (int i1 = 1; i1 < num.length; i1++) {
		   if (num[i1] > largetst)
		    largetst = num[i1];
		   else if (num[i1] < smallest)
		    smallest = num[i1];
		  }

		  System.out.println("Largest Number is : " + largetst);
		  System.out.println("Smallest Number is : " + smallest);
	}
	public int[] acceptValue()
	{
	Scanner sc=new Scanner(System.in);
	int size,i;
	System.out.println("\nEnter the size");
	size=sc.nextInt();
	int num[]=new int[size];
	System.out.println("Enter " +size+ " of Number:");
	for(i=0;i<size;i++)
	{
	num[i]=sc.nextInt();
	}
	return num;

	}

	public void greaterNo(int[] num)
	{
	//int[] num=acceptValue();
	        int biggest = num[0];
	       
	        for(int i=1; i< num.length; i++)
	        {
	                if(num[i] > biggest)
	                        biggest = num[i];
	        }
	       
	        System.out.println("Largest Number is : " + biggest);
	}

	public void smallerNo(int[] num)
	{
	        int smallest = num[0];
	       
	        for(int i=1; i< num.length; i++)
	        {
	                if(num[i] < smallest)
	                        smallest = num[i];
	        }
	       
	        System.out.println("Smallest Number is : " + smallest);
	}
	public void ascendingNo(int[] num)
	{
	int i,temp=0;

	/*System.out.println("\nElements of original array: ");    
	        for(i=0;i<num.length;i++)
	        {    
	            System.out.print(num[i] + "\n ");    
	        }    */
	               
	        for(i=0;i<num.length;i++)
	        {    
	            for(int j=i+1;j<num.length;j++)
	            {    
	               if(num[i] > num[j])
	               {    
	                   temp = num[i];    
	                   num[i] = num[j];    
	                   num[j] = temp;    
	               }    
	            }    
	        }
	        System.out.println("\nElements of array in Ascending order: ");    
	        for (i=0;i<num.length;i++)
	        {    
	            System.out.print(num[i] + "\n ");    
	        }  
	         
	  }


	public void descendingNo(int[] num)
	{
	int i,temp=0;
	        for(i=0;i<num.length;i++)
	        {    
	            for(int j=i+1;j<num.length;j++)
	            {    
	               if(num[i] < num[j])
	               {    
	                   temp = num[i];    
	                   num[i] = num[j];    
	                   num[j] = temp;    
	               }    
	            }    
	        }
	        System.out.println("\nElements of array in Descending order: ");    
	        for (i=0;i<num.length;i++)
	        {    
	            System.out.print(num[i] + "\n ");    
	        }

		}


		}

		
	
	
	

	            
	


	   

