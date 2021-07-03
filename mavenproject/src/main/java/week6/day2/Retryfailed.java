package week6.day2;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retryfailed implements IRetryAnalyzer{

	int maxRetry =3;
	int retrycount = 0;
	
	

	public boolean retry(ITestResult result) {
		
		if(!result.isSuccess() && retrycount < maxRetry ) {
			retrycount++;
			return true;
		}
		// TODO Auto-generated method stub
		return false;
	}

}
