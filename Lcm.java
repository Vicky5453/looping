package fo.r;

public class Lcm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
                int no1=3;
                int no2=5;
                int max=no1>no2?no1:no2;
                int lcm;
                
                while(true)
                {
                	if((max%no1==0) && (max%no2==0))
                	{
                		lcm=max;
                		break;
                	}
                	max++;
                }
                System.out.println(lcm);
	}

}
