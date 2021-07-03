package week1.day2.assignments;

import java.util.Arrays;

public class Missingelem {

	public static void main(String[] args) {
		
		int[] arr= {1,3,2,4,7,8};	
		
		Arrays.sort(arr);
		for(int i=1; i<arr.length; i++) {
			if(i!=arr[i-1]) {
				System.out.println("not matching value " +i);
			}
			
			else {
				System.out.println("matching");
			}
		}
		// TODO Auto-generated method stub

	}

}
