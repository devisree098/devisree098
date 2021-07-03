package pages;



import org.openqa.selenium.By;

import base.ProSpecificMethods;

public class Loginpage extends ProSpecificMethods {

		
		public Loginpage enterusername() {
			driver.findElementById("username").sendKeys("demosalesmanager");
			return this;
		}
		
		public Loginpage enterpassword() {
			driver.findElementById("password").sendKeys("crmsfa");
	return this;
		}
		
	public Homepage clickloginButton() {
		driver.findElement(By.className("decorativeSubmit")).click();
		return new Homepage();
	}
}