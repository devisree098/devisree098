package testcase;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
public class CreateLead extends Baseclass{
	
@Test(dataProvider = "fetchdata")
	public  void runCreateLead(String company, String firstname, String secname, String phno) {
	
	    driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Hari");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("R");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("99");
		driver.findElement(By.name("submitButton")).click();

		@DataProvider(name = "fetchdata")
}

}








