package Testngpkg;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Fileuploadrobot {
	 ChromeDriver driver;
		@BeforeTest
		public void setup() {
			
			 driver=new ChromeDriver();
		}		 
		@Test
		public void fileuploadpgm() throws Exception{
			driver.get("http://www.ilovepdf.com/word_to_pdf");
			driver.findElement(By.xpath("//*[@id=\"pickfiles\"]")).click();
		
		fileUpload("C:\\Users\\TECH ZONE ITS\\Desktop\\rinsha.k luminar JULY 28.docx")	;
			
		}
		
		public void fileUpload(String p)  throws AWTException{
			StringSelection strSelection=new StringSelection(p);
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(strSelection, null);
			
			
			Robot robt=new Robot();
			
			
			robt.delay(3000);
			robt.keyPress(KeyEvent.VK_CONTROL);
			robt.keyPress(KeyEvent.VK_V);
			robt.keyRelease(KeyEvent.VK_V);
			robt.keyRelease(KeyEvent.VK_CONTROL);

			robt.keyPress(KeyEvent.VK_ENTER);
			robt.keyPress(KeyEvent.VK_ENTER);
            robt.delay(2000);

		}
		
}
