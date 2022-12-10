package whil.e;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
               int no=5;
               int fact=no;
               
               while (no>1)
               {
            	   no=no-1;
            	   fact=fact*no;
               }
               System.out.print(fact+" ");
	}

}
