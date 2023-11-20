package pagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pagefactory {
 WebDriver driver;
     
     @FindBy(id="email")
     WebElement fbemail;
     @FindBy (id="pass")
     WebElement fbpswd;
     @FindBy(name="login")
     WebElement fblogin  ;
     public  Pagefactory(WebDriver driver){
    	 this.driver=driver;
    	 PageFactory.initElements( driver,this);
     }
     
     public void setvalue(String email,String paswd) {
    	 fbemail.sendKeys(email);
    	 fbpswd.sendKeys(paswd);
     }
     public void login() {
    	 fblogin.click();
     }

}
