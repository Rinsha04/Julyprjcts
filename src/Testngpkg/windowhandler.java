package Testngpkg;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class windowhandler {
	ChromeDriver driver;
	@BeforeTest
	public void setup() {
		driver=new ChromeDriver();
	}
   @Test
   public void test() {
	   driver.get("https://demo.guru99.com/popup.php");
 String parentWindow=driver.getWindowHandle();
 System.out.println("parent window title"+driver.getTitle());
 driver.findElement(By.xpath("/html/body/p/a")).click();
 
  
 Set<String> allwindowhandles=driver.getWindowHandles();
 for(String handle:allwindowhandles) {
	 if(!handle.equalsIgnoreCase(parentWindow)) {
		 driver.switchTo().window(handle);
		// driver.findElement(By.xpath("/html/body/form/table/tbody/tr[5]/td[2]/input")).se;
		 
		 driver.close();
	 }
	 driver.switchTo().window(parentWindow);
 }
   

   }
	
}
