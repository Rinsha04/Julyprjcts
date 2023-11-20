package pagepkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class fbloginpage {
     WebDriver driver;
     
     By fbemail=By.id("email");
     By fbpswd=By.id("pass");
     By fblogin=By.name("login");
     public fbloginpage(WebDriver driver){
    	 this.driver=driver;
     }
     
     public void setvalue(String email,String paswd) {
    	 driver.findElement(fbemail).sendKeys(email);
    	 driver.findElement(fbpswd).sendKeys(paswd);
     }
     public void login() {
    	 driver.findElement(fblogin).click();
     }
}
