package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProSpecificMethods;
import base.ProjectSpecificMethods;
import pages.LoginPage;

public class Createlead extends ProSpecificMethods{
	
	@BeforeTest
	public void setFileName() {
		excelFileName = "CreateLead";

	}
		
	@Test(dataProvider = "sendData")
	public void runCreateLead(String username, String password, String company, String firstName, String lastName) throws InterruptedException {
	
		new LoginPage(driver)
		.enterUsername(username)
		.enterPassword(password)
		.clickLoginButton()
		.clickCrmsfa()
		.clickLeadsLink()
		.clickCreateLeadLink()
		.enterCompanyName(company)
		.enterFirstName(firstName)
		.enterLastName(lastName)
		.clickCreateLeadButton()
		.verifyFirstName();
	}
	
	
	

}

