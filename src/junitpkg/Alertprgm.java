package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertprgm {
	ChromeDriver driver;
	@Before
	public void google() {
		driver=new ChromeDriver();
		driver.get("file:///C:/Users/TECH%20ZONE%20ITS/Desktop/luminarjava/alert.html");
	}
	@Test
	public void test1() {
		driver.findElement(By.xpath("/html/body/input[1]")).click();
		Alert a=driver.switchTo().alert();
		String alerttext=a.getText();
		System.out.println(alerttext);
		a.accept();
		//a.dismiss();//cancel
		driver.findElement(By.xpath("/html/body/input[2]")).sendKeys("Rinsha k");
		driver.findElement(By.xpath("/html/body/input[3]")).sendKeys("mubashir");
		driver.findElement(By.xpath("/html/body/input[4]")).click();
	}
}