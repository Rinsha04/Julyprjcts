package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rediffmalebutton {
	ChromeDriver driver;

	@Before
	public void logo() {
		driver = new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}

	@Test
	public void test1() {
		boolean buttonselected = driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[24]/td[3]/input[1]")).isSelected();
		if (buttonselected) {
			System.out.println("select");
		}else {
			System.out.println("not selected");
		}
	}
}
