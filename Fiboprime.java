package fo.r;

public class Fiboprime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
                int no=10;
                int f=0;
                int s=1;
                int t=0;
                
                while (t<=no)
                {
                	t=f+s;
                	f=s;
                	s=t;
                	
                	int div=2;
                	int count=0;
                	
                	while (div<=t/2)
                	{
                		if (t%div==0)
                		{
                			count++;
                		}
                		div++;
                	}
                	if(count==0)
                	{
                		System.out.println("fiboprime:"+t);
                	}
                }
	}

}
