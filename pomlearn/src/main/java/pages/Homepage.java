package pages;

import org.openqa.selenium.By;

import base.ProSpecificMethods;

public class Homepage extends ProSpecificMethods{
	
	public Myhomepage clickcrm() {
		driver.findElement(By.linkText("CRM/SFA")).click();
		return new Myhomepage();
	}
	
	

}
