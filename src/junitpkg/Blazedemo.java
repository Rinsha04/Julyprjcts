package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Blazedemo {
ChromeDriver driver;
@Before
public void setUp() {
	driver=new ChromeDriver();
	driver.get("https://blazedemo.com/register");
}
@Test
public void test1() {
	driver.findElement(By.xpath("//input[@name='name']")).sendKeys("rinsha");
	driver.findElement(By.xpath("//input[@name='company']")).sendKeys("abc");
	driver.findElement(By.xpath("//input[@name='email']")).sendKeys("mubashirk2340@gmail.com");
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123dfg");
	driver.findElement(By.xpath("//input[@name='password_confirmation']")).sendKeys("123dfg");
	driver.findElement(By.xpath("//button[@type='submit']"));
}
}
