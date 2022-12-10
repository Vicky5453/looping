package whil.e;

public class Multipleof3and5 {          // multiple of 3 and 5 in first ten number 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            int no=1;
            while(no<=50)
            {
            	if(no%3==0)
            	{
            		System.out.println("three divices:"+no);
            	}
            	if(no%5==0)
            	{
            		System.out.println("five divices........:"+no);
            	}
            	no=no+1;
            }
	}
}
