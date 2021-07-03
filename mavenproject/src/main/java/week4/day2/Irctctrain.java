package week4.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Irctctrain {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();   
		ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.irctc.co.in/nget/train-search");
        driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElementByXPath("(//button[@type=\"submit\"])[1]").click();
     driver.findElementByLinkText(" FLIGHTS ").click();
      
		
		// TODO Auto-generated method stub

	}

}
