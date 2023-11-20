package Testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Facebook {
	 ChromeDriver driver;
	@BeforeTest
	public void setup() {
		
		 driver=new ChromeDriver();
	}
	@BeforeMethod
	public void setUp()
	{
		driver.get("https://www.facebook.com");

	}
	@Parameters({"email","pswrd"})
	@Test
	public void fblogin(String email,String pswrd) {
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(email);
   	driver.findElement(By.xpath("//input[@name='pass']")).sendKeys(pswrd);
 driver.findElement(By.xpath("//*[@id=\"u_0_5_MX\"]")).click();
    }
}
