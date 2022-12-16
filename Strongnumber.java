package fo.r;
import java.util.Scanner;

public class Strongnumber {
	
	static int factorial(int no)
	{
		int fact=1;
		while (no>0)
		{
			fact=fact*no;
			no--;
		}
		return fact;
	}

	public static void main(String[] args) {
		
		     Scanner vk = new Scanner(System.in);
		     int no =vk. nextInt();
		 //    System.out.println("enter the number");
		     
		     int result=0;
		     int no1=no;
		     
		     while (no>0)
		     {
		    	 result=result+factorial(no%10);
		    	 no=no/10;
		     }
		    		
             if (no1==result)
             {
            	 System.out.println("strong");
             }
             else
             {
            	 System.out.println("not strong ");
             }
             
            	 
             
           
            
            
	}

}
