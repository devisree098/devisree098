package week2.day1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Openapp {
public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
//		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32.exe");
//      WebDriver driver = new ChromeDriver();   
		ChromeDriver driver = new ChromeDriver();
        driver.get("http://leaftaps.com/opentaps/control/main");
		WebElement username= driver.findElementById("username");
		username.sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys("abc");
		driver.findElementById("createLeadForm_firstName").sendKeys("devi");
		driver.findElementById("createLeadForm_lastName").sendKeys("menon");
		WebElement ind = driver.findElementById("createLeadForm_industryEnumId");
		Select dropdown = new Select(ind);
		dropdown.selectByValue("IND_HEALTH_CARE");
		
		
	}

}
