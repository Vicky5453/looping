package whil.e;

public class Print13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
                int no=0;
                int i=11;
                int count=0;
                while (count<4)
                {
                	if(no<i)
                	{
                		no=no+1;
                    	i=i-1;
                    	
                	}
                	System.out.print(no+"*"+i+" ");	
                	count=count+1;
                }
	}

}
              //   1*10 2*9 3*8 4*7