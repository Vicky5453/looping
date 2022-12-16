package fo.r;

import java.util.Scanner;

public class Reversenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner sc=new Scanner(System.in);
          System.out.println("enter the number");
          int a =sc.nextInt();
         do { 
          int b = a%10;
          System.out.println(b);
          a=a/10;
	}while (a>0);
	}

}
