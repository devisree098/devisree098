package week3.day2.assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sortusingcollection {

	public static void main(String[] args) {
		
		String[] input = {"HCL","Wipro","Aspire Systems","CTS"};
		List<String> invalues= new ArrayList<String>();
		for (String val: input) {
			invalues.add(val);		
		}
		
		Collections.sort(invalues);
		System.out.println(invalues);
		// TODO Auto-generaed method stub

	}

}
