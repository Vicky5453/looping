package fo.r;

public class Binarytodecimal {
	static int power(int no,int times) {
		int result=1;
		while(times>0) {
			result=result*no;
			times=times-1;
		}
		return result;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
               int binary=1010;
               int decimal=0;
               int i=0;
               int rem;
               
               
               while (binary>0)
               {
            	   rem=binary%10;
            	   decimal=decimal+(rem*power(2,i));
            	   binary=binary/10;
            	   i=i+1;
               }
               System.out.println(decimal);
               
}
}

	

		
		