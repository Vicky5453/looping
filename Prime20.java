package fo.r;

public class Prime20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no=70;
		int count;
		
		for(int i=1;i<=no;i++)
		{
			count=0;
			for(int j=2;j<=i/2;j++)
			{
				if(i%j==0)
				{
					count++;
					break;
				}
			}
			if(count==0)
			{
				System.out.println(i);
			}
		}
				
			
		
	}

}
