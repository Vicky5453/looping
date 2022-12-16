package fo.r;

public class Primestaticmethod {

	static void prime(int no)
	{
		int i=1;
		int count=0;
		while (no>=i)
		{
			if(no%i==0)
			{
				count++;
			}
			
			
			i++;
		}
		if(count==2)
		{
			System.out.println("prime");
		}
		else
		{
			System.out.println("not prime");
		}
	}
	        
	public static void main(String [] args)
	{
		int no=17;
		while (no>1)
		{
			prime(no);
			break;
		//	no=no-1;
			
		}
	}
	}


