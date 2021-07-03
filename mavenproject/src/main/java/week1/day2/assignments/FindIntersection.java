package week1.day2.assignments;

import java.util.Arrays;

public class FindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr1= {3,2,11,4,6,7,2};
		Arrays.sort(arr1);
		int[] arr2= {1,3,4,8,2,7};
		Arrays.sort(arr2);
    for (int i=0; i<arr1.length;i++ ) {
    	
    	for(int j=0;j<arr2.length;j++) {
    		
    		if(arr1[i]==arr2[j]) {
    			System.out.println(arr2[j]);
    		}
	}
	}
}
}
