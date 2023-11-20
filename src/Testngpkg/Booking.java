package Testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Booking {

	ChromeDriver driver;
@BeforeTest
public void setup() {
	driver=new ChromeDriver();
	 driver.get("https://www.booking.com/");
		driver.manage().window().maximize();
}
@Test
public void booking() {
	driver.findElement(By.xpath("//*[@id=\"indexsearch\"]/div[2]/div/form/div[1]/div[2]/div/div[1]/button[1]")).click();
	datepicker("November 2023","4");
}
public  void datepicker(String expmonth, String expdate) {
	while(true) {
		String month=driver.findElement(By.xpath("//*[@id=\"calendar-searchboxdatepicker\"]/div/div[1]/div/div[1]/h3")).getText();
	     if(month.equals(expmonth)) {
	    	 System.out.println("month="+month);
	    	 break;
	     }
	     else {
	    	 driver.findElement(By.xpath("//*[@id=\"calendar-searchboxdatepicker\"]/div/div[1]/button[2]")).click();
	     }
	
	}
}
}