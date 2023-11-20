package Testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Draganddrop {
//https://demo.guru99.com/test/drag_drop.html
	ChromeDriver driver;
	@BeforeTest
	public void setup() {
		driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
	}
	@Test
	public void test1() {
		WebElement amount=driver.findElement(By.xpath("//*[@id='products']/div/ul/li[4]/a"));
		WebElement dest=driver.findElement(By.xpath("//*[@id=\"amt7\"]/li"));
		Actions act=new Actions(driver);
		act.dragAndDrop(amount, dest);
		act.perform();
		
		WebElement amount1=driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
		WebElement dest1=driver.findElement(By.xpath("//*[@id=\"amt8\"]/li"));
		Actions act1=new Actions(driver);
		act1.dragAndDrop(amount1, dest1);
		act1.perform();
		
}
}