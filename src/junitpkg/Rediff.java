package junitpkg;


import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rediff {
	ChromeDriver driver;
	@Before
	 public void setUp() {
		  driver =new ChromeDriver();
		  driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		  
	  }
	@Test
	public void  test1() {
		driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[3]/td[3]/input")).sendKeys("Rinsha k");
		driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[7]/td[3]/input")).sendKeys("rdasgdf");
		driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[7]/td[3]/input[2]")).click();
	}
	

}
