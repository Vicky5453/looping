package whil.e;

public class Multiple3or5 {               // multiple of 3 or 5 in first ten numbers 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
                 int no=1;
                 while(no<=50) 
                 {
                	 if(no%3==0)
                	 {
                		 System.out.println("three divices.....:"+ no);
                	 }
                	 else if(no%5==0)
                	 {
                		 System.out.println("five divices:"+no);
                	 }
                	 no=no+1;
                	
                 }
	}

}
