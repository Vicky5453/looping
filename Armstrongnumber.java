package fo.r;

public class Armstrongnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            int no=1634;
            int arm=0;
         //   int no2=no;
            
            while (no>0)
            {
             int rem=no%10;
             arm=arm+(rem*rem*rem*rem);
             no=no/10;
            }
            System.out.println(arm);
            
        //    if (no2==arm)
        //    {
        //    	System.out.println("armstrong");
        //    }
	}

}
