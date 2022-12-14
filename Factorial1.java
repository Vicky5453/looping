package whil.e;

public class Factorial1 {        // 5! 4! 3! 2! 1! 
	static void factorial(int no) {
		int fact=1;
		while(no>=1) {
			fact=fact*no;
			no=no-1;
		}
		System.out.println(fact);
	}

	public static void main(String[] args) {
		int no=5;
		while(no>=1) {
			factorial(no);
			no=no-1;
		}
		
	}
}
		     // 120  24  6  2  1 