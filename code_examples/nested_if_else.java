public class EvenOdd {
	public static void main(String[] args) {

		int num = 8;

		if (num < 10) {
			if (num%2==0) {
				System.out.println(num + " is even number less than 10");
			} else {
				System.out.println(num + " is odd number less than 10");
			}
			
		}
		else{
		    System.out.println(num + " is greater than 10");
		}
		

	}
}
