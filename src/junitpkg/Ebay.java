package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ebay {
	ChromeDriver driver;
	@Before
	public void setup() {
		driver=new ChromeDriver();
		driver.get("https://www.ebay.com");
	}
	@Test
	public void test1() {
		driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys("mobile",Keys.ENTER);
        driver.findElement(By.xpath("//*[@id=\"s0-53-17-6-3-4[0]-3-2-1-list\"]/li[3]/div/a/div")).click();
        driver.findElement(By.xpath("//*[@id=\"x-refine__group__0\"]/ul/li/ul/li[1]/a")).click();
	  
		   String actualtitle=driver.getTitle();
			System.out.println(actualtitle);
	   
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
	}

}
