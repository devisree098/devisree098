package week1.day2;

public class SumofDigits {

	public static void main(String[] args) {
		
		int input =123,rem,sum = 0;
	
		
		while(input>0) {
			rem = input %10;
			sum = sum +rem;
			input = input /10;
		}
		System.out.println(sum);           
		
		// TODO Auto-generated method stub

	}

}
