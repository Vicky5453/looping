package whil.e;

public class Count {                  //count of divices 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
             int no=20;
             int div=1;
             int count=0;
             while(no>=div)
             {
            	 if(no%div==0)
            	 {
            		//System.out.println(div);
            		 count=count+1;
            	 }
            	 div=div+1;
             }
             System.out.println(count);       
	}

}
