package week4.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Snapdeal {

	public static void main(String[] args) {
		

		WebDriverManager.chromedriver().setup();   
		ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.snapdeal.com/");
        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        WebElement men = driver.findElementByLinkText("Men's Fashion");
        Actions builder = new Actions(driver);
        builder.moveToElement(men).perform();
		men.click();
		
		
		driver.close();
		
		
		
		// TODO Auto-generated method stub

	}

}
