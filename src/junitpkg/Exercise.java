package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Exercise {
	ChromeDriver driver;
	@Before
	public void setup() {
		driver=new ChromeDriver();
		driver.get("https://automationexercise.com/login");
	}
	@Test
	public void test1() {
		driver.findElement(By.name("name")).sendKeys("Rinsha");
		driver.findElement(By.xpath("//*[@id='form']/div/div/div[3]/div/form/input[3]")).sendKeys("mubashirk2340@gmail.com");
		driver.findElement(By.xpath("//*[@id='form']/div/div/div[3]/div/form/button")).click();
		driver.findElement(By.xpath("//input[@id='id_gender2']")).click();
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("mubu123");
	WebElement day=	driver.findElement(By.xpath("//select[@id='days']"));
		Select daydetails=new Select(day);
		daydetails.selectByValue("1");
		
		WebElement month=driver.findElement(By.xpath("//*[@id=\"months\"]"));
		Select monthdetails=new Select(month);
		monthdetails.selectByValue("1");
		
		
		WebElement year=	driver.findElement(By.xpath("//*[@id=\"years\"]"));
		Select yeardetails=new Select(year);
		yeardetails.selectByValue("2001");
		
		driver.findElement(By.xpath("//input[@id='newsletter']")).click();
		driver.findElement(By.xpath("//input[@id='first_name']")).sendKeys("rinsha");
		driver.findElement(By.xpath("//input[@id='last_name']")).sendKeys("mubashir");

		driver.findElement(By.xpath("//input[@id='company']")).sendKeys("luminar");
		driver.findElement(By.xpath("//input[@id='address1']")).sendKeys("37");
		driver.findElement(By.xpath("//input[@id='address2']")).sendKeys("kolamban");
		WebElement country= driver.findElement(By.xpath("//select[@id='country']"));
		Select countrydetails=new Select(country);
		countrydetails.selectByValue("India");
		
		
		driver.findElement(By.xpath("//*[@id='state']")).sendKeys("kerala");
		driver.findElement(By.xpath("//*[@id='city']")).sendKeys("mannarkkad");
		driver.findElement(By.xpath("//*[@id='zipcode']")).sendKeys("678582");
		driver.findElement(By.xpath("//*[@id='mobile_number']")).sendKeys("9747174861");
		driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/div[1]/form/button")).click();
		
	}
}
