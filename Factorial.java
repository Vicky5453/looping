package whil.e;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
               int no=5;
               int fact=1;
               
               while (no>0)
               {
            	   
            	   fact=fact*no;
            	   no--;
               }
               System.out.print(fact+" ");
	}

}
