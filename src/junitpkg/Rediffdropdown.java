package junitpkg;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Rediffdropdown {
	ChromeDriver driver;

	@Before
	public void logo() {
		driver = new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}

	@Test
	public void test1() {
		WebElement day=driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[22]/td[3]/select[1]"));
		Select daydetails=new Select(day);
		daydetails.selectByValue("26");
	List<WebElement> cl=daydetails.getOptions()	;
		System.out.println("day count="+cl.size());
		
		WebElement month=driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[22]/td[3]/select[2]"));
		Select monthdetails=new Select(month);
		monthdetails.selectByValue("06");
		List<WebElement> cl1=monthdetails.getOptions();
		System.out.println("month count="+cl1.size());
		
		WebElement year=driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[22]/td[3]/select[3]"));
		Select yeardetails=new Select(year);
		yeardetails.selectByValue("2002");
		List<WebElement> cl2=yeardetails.getOptions();
		System.out.println("year count="+cl2.size());
		
		
		driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[24]/td[3]/input[2]")).click();
				
	}
}
