package whil.e;

public class Print8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int no=1;
		
		while(no<=10)
		{
			int i=2;
			int j=1;
			
			while(i>=1) 
			{
				j=j*no;
				i=i-1;
			}
			no=no+1;
			System.out.print(j+" ");
	}

	}
}
           //  1 4 9 16 25 36 49 64 81 100