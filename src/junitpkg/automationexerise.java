package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class automationexerise {
	ChromeDriver driver;
	@Before
	public void setup(){
		driver =new ChromeDriver();
		driver.get("https://automationexercise.com/");
		
	}
	@Test
	public void test1() {
		driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[2]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"accordian\"]/div[1]/div[1]/h4/a")).click();
	    driver.findElement(By.xpath("//*[@id=\"Women\"]/div/ul/li/a")).click();
	    driver.findElement(By.xpath("/html/body/section/div/div[2]/div[2]/div/div[2]/div/div[2]/ul/li/a")).click();	
	    driver.findElement(By.xpath("//*[@id='name']")).sendKeys("rinsha.k");
	    driver.findElement(By.xpath("//*[@id='email']")).sendKeys("mubashir.com");
	    driver.findElement(By.xpath("//*[@name='review']")).sendKeys("good");
	
	}

}
