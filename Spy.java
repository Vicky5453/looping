package whil.e;

public class Spy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int no=1124;
        int add=0;
        int mul=1;
        while (no>0)
        {
        	add=add+no%10;
        	mul=mul*no%10;
        	no=no/10;
        	
        }
      if (add==mul)
       {
    	   System.out.println("spy..."+add+"=="+mul);
       }
       else
       {
    	   System.out.println("not spy");
       }
	}
}

	


