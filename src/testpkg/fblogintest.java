package testpkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pagepkg.fbcreatepage;
import pagepkg.fbloginpage;

public class fblogintest {
	WebDriver driver;
	@BeforeTest
	public void setup() {
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}
	@Test
	public void test1() {
		fbloginpage ob=new fbloginpage(driver);
		ob.setvalue("desew@gmail.com" , "jhfted");
		ob.login();
		driver.navigate().back();
		fbcreatepage ob1=new fbcreatepage(driver);
		ob1.pagrclick();
		ob1.getstartclick();
	}

}
