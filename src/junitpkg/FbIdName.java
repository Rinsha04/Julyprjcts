package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FbIdName {

	  ChromeDriver driver;
	  @Before
	  public void setup() {
		  driver=new ChromeDriver();
		  driver.get("https://www.facebook.com");
	  }
	
	@Test
	public void task1() {
		driver.findElement(By.id("email")).sendKeys("mubashir@gamil.com");
		driver.findElement(By.name("pass")).sendKeys("bgdrchv");
		driver.findElement(By.name("login")).click();
	}
	
	
	
	
	
	
	
	
}
