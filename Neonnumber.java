package fo.r;

public class Neonnumber {

	public static void main(String[] args) {
		
                 int no=9;
                 int result=0;
                 int sqr=no*no;
                 
                 while (sqr>0)
                 {
                	 int digit=sqr%10;
                	 result=result+digit;
                	 sqr=sqr/10;
                 }
                 
                 if (result==no)
                 {
                	 System.out.println("neon number");
                 }
                 else
                 {
                	 System.out.println("not neon number");
                 }
	}

}
