package whil.e;

public class First20primenumber {

	public static void main(String [] args) {
		// TODO Auto-generated method stub
	       
	            int no=37;          // first 20 prime number 
	            int count;
	            int i=1;
	            int j=2;
	            
	            while (i<=no)
	            {
	            	count=0;
	            	while (j<=i/2)
	            	{
	            		if(i%j==0)
	            		{
	            			count++;
	            			break;
	            		}
	            	 	j=j+1;
	            	}
	            	if (count==0)
	            	{
	            		System.out.println(i);
	            	}
	            	i++;
	            }
		}

	}



	


