package fo.r;

public class Decimaltobinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
                int decimal=4;
                String binary="";
                int rem;
                
                while (decimal>0)
                {
                	rem=decimal%2;
                	binary=rem+binary;
                	decimal=decimal/2;
                }
                System.out.println(binary);
	}

}
