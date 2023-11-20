package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rediflogo {
	ChromeDriver driver;

	@Before
	public void logo() {
		driver = new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}

	@Test
	public void test1() {
		boolean logopresent = driver.findElement(By.xpath("//*[@align='center']/tbody/tr/td[1]/img")).isDisplayed();
		if (logopresent) {
			System.out.println("present");
		} else {
			System.out.println("not present");
		}
	}

}
