package pagepkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class fbcreatepage {
	WebDriver driver;
	    
	By createpage=By.xpath("//*[@id=\"reg_pages_msg\"]/a");
	By getstartpage=By.xpath("//*[@id=\"content\"]/div/div[2]/div/div[2]/table/tbody/tr/td[1]/div/div[1]/div[2]/button/div/div");
    public 	fbcreatepage(WebDriver driver) {
    	this.driver=driver;
    }
    public void pagrclick() {
    	driver.findElement(createpage).click();}
    public void getstartclick() {
    	driver.findElement(getstartpage).click();
    	
    }

}
