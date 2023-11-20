package testpkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pagepkg.Pagefactory;

public class pagefactorytest {
	WebDriver driver;
	@BeforeTest
	public void setup() {
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}
	@Test
	public void test1() {
		 Pagefactory ob=new  Pagefactory(driver) ;
			 ob.setvalue("TYFTD@gamail", "safs");
		   ob.login();
	}
}
