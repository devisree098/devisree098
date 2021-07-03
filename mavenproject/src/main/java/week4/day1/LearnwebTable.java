package week4.day1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnwebTable {

	public static void main(String[] args) throws InterruptedException {
		

		WebDriverManager.chromedriver().setup();   
		ChromeDriver driver = new ChromeDriver();
        driver.get("https://erail.in/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement fromstation= driver.findElementById("txtStationFrom");
		fromstation.clear();
		fromstation.sendKeys("ms");
		fromstation.sendKeys(Keys.TAB);
		WebElement dest= driver.findElementById("txtStationTo");
		dest.clear();
		dest.sendKeys("mdu");
		driver.findElementById("chkSelectDateOnly").clear();
		Thread.sleep(10000);
		List<WebElement> rows = driver.findElementsByXPath("//table[@class='DataTable TrainList TrainListHeader']");
		
		driver.close();
		
		
		
		// TODO Auto-generated method stub

	}

}
