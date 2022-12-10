package whil.e;

public class Print9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
              int no=1;
              while(no<=4)
              {
            	  int j=1;
            	  int k=1;
            	  while(j<=no)
            	  {
            		  k=k*no;        
            		  j=j+1;
            	  }
            	  no=no+1;
            	  System.out.print(k+" ");
              }
	}

}
                //  1 4 27 256