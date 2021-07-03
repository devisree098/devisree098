package week1.day1.assignments;

public class PrimeNumber {
	
	public static void main(String[] args) {
		int input = 2, count = 0;
		
		for(int i = 1; i <=input; i ++) {
			if(input % 1 ==0) {
				count = count+1;
			}
		}
		if(count ==2) {
			System.out.println(count + " is prime number");
		}
//		boolean flag = false;
//		for(int i=2; i<= input/2; i++) {
//			
//			if(input % i ==0) {
//				flag= true;
//				break;
//			}
//			
//		}
//		
//		if(flag!= true) {
//			System.out.print(input);
//			System.out.println(" is a primenumber");
//			
//		}
//		else
//			{
//			System.out.print(input);
//				System.out.println(" is not a primenumber");
//			}
			// TODO Auto-generated method stub
	}

}
