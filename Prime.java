package whil.e;

public class Prime {                 //prime number 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
                int no=17;
                int div=1;
                int count=0;
                while(no>=div)
                {
                	if(no%div==0)
                	{
                		count=count+1;
                	}
                	div=div+1;
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

}
