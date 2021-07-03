package testcases;

import org.testng.annotations.Test;

import base.ProSpecificMethods;
import pages.Loginpage;

public class Verifylogin extends ProSpecificMethods {
	
	@Test
	
	public void runlogin() {
		
		new Loginpage().enterusername().enterpassword().clickloginButton().clickcrm();
	}
	

}
