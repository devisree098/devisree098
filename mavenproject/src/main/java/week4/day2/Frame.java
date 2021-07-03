package week4.day2;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frame {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();   
		ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
        driver.switchTo().frame("iframeResult");
        driver.findElementByXPath("//button[text()='Try it']").click();
        driver.switchTo().alert().sendKeys("Devi");
        driver.switchTo().alert().accept();
        String name = driver.findElementByXPath("//p[@id=\"demo\"]").getText();
        
        if (name.contains("Devi")) {
        	
        	System.out.println("Name is displayed");
        }
        else
        	System.out.println("Name is not displayed");
	}

}
