package fo.r;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
                 String word="MoM";
                 String word2="";
                 for(int i=word.length()-1;i>=0;i--) 
                 {
                	 word2=word2+word.charAt(i);
             //   	 word.charAt(i);
                 }
                System.out.println(word2);	
                 if(word.equals(word2))
                 {
                	System.out.println("palindrome"); 
                 }
                 else
                 {
                	 System.out.println("not palindrome");
                 }
	}

}
