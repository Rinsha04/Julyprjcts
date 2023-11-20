package Testngpkg;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Amazonecart {
	ChromeDriver driver;
	@BeforeTest
	public void setup() {
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
	}
	@Test
	public void test1() {
		driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("mobilephones");
		driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)","");	
		String perantwindows=driver.getWindowHandle();
		driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[4]/div/div/div/div/span/div/div/div/div[1]/div/div[2]/div/span/a")).click();
		  
		 
         
			 Set<String> allwindow=driver.getWindowHandles();
			 for(String handle:allwindow) {
				 if (!handle.equalsIgnoreCase(perantwindows)){
					 driver.switchTo().window(handle);

						//js.executeScript("window.scrollBy(0,500)","");	
						driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();
						driver.findElement(By.xpath("//*[@id=\"attach-sidesheet-view-cart-button\"]")).click();
						 driver.close();
					
				 }
				 driver.switchTo().window(perantwindows);
			 }
			 
      }		
}
