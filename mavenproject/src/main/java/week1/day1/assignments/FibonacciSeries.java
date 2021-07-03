package week1.day1.assignments;

public class FibonacciSeries {
	int range = 8; 
	static int firstNum = 0;
	static int secNum = 1;
	

	public static void main(String[] args) {
		
		System.out.println(firstNum);
		System.out.println(secNum);
			for(int i = 2; i<8; ++i) {
			int sum = firstNum + secNum;
			System.out.println(sum);
			firstNum = secNum;
			secNum = sum;
			}
		
		// TODO Auto-generated method stub

	}

}
