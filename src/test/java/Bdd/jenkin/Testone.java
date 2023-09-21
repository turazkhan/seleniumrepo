package Bdd.jenkin;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testone {
	WebDriver driver;
	@Test
	public void mone() {
		WebDriverManager.chromedriver().setup();
		 driver =new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("http://omayo.blogspot.com/");
		 String actual = driver.findElement(By.id("pah")).getText();
		 Assert.assertEquals(actual,"PracticeAutomationHere");
			
	}
	@AfterMethod	
	 public void clooser ( ) {
	 driver.quit();
	 }

}
