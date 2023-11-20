package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Buttonenable {
	ChromeDriver driver;

	@Before
	public void logo() {
		driver = new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}

	@Test
	public void test1() {
		boolean buttonenable=driver.findElement(By.xpath("	//*[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input[2]\r\n")).isEnabled();
		if (buttonenable) {
			System.out.println("enable");
		} else {
			System.out.println("not enable");
		}	
	}
	//*[@id="tblcrtac"]/tbody/tr[7]/td[3]/input[2]
}
