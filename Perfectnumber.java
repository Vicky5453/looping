package fo.r;

public class Perfectnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
             int no=28;
             int perfect=0;
             int i=1;
             
             
            while (i<=no/2)
            {
            	if(no%i==0)
            	{
            		perfect=perfect+i;
            		
            	}	            	
            	i++;
            } 
            if (no==perfect)
            {
            	System.out.println("perfect");
            }
            else
            {
            	System.out.println("not perfecct");
            }
	}
	
}
