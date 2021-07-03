package week2.day1.assignments;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Testleafapp {
public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
//		String page = driver.getTitle();
//		System.out.println(page);
		WebElement username= driver.findElementById("username");
		username.sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys("EY");
		driver.findElementById("createLeadForm_firstName").sendKeys("devi");
		driver.findElementById("createLeadForm_lastName").sendKeys("menon");
		WebElement source = driver.findElementById("createLeadForm_dataSourceId");
		Select dropdown = new Select(source);
		dropdown.selectByValue("LEAD_COLDCALL");
		WebElement market = driver.findElementById("createLeadForm_marketingCampaignId");
		Select marketdrop = new Select(market);
		marketdrop.selectByValue("CATRQ_AUTOMOBILE");
		WebElement industry = driver.findElementById("createLeadForm_industryEnumId");
		Select dropd = new Select(industry);
		dropd.selectByValue("IND_HEALTH_CARE");
		driver.findElementById("createLeadForm_birthDate").sendKeys("05/4/21");
		driver.findElementByClassName("smallSubmit").click();
		driver.findElementByLinkText("Duplicate Lead").click();
		driver.findElementById("createLeadForm_companyName").clear();
		driver.findElementById("createLeadForm_companyName").sendKeys("EY");
		driver.findElementByClassName("smallSubmit").click();
		WebElement company = driver.findElementById("viewLead_companyName_sp");
		String comp = company.getText();
		String input = "ey";
		System.out.println(comp.equalsIgnoreCase(input)); { 
		
			
		driver.close();
		}
		// TODO Auto-generated method stub

	}

}
