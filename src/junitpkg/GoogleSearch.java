package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {
	ChromeDriver driver;
	@Before
	public void google() {
		driver=new ChromeDriver();
		driver.get("https://www.google.com");
	}
	@Test
	public void test1() {
		driver.findElement(By.name("q")).sendKeys("football match",Keys.ENTER);
	}

}
