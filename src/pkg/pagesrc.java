package pkg;

import org.openqa.selenium.chrome.ChromeDriver;

public class pagesrc {

	public static void main(String[] args) {
 ChromeDriver driver=new ChromeDriver();
 driver.get("https://www.google.com");
 String scr=driver.getPageSource();
 if(scr.contains("Gmail")){
	 System.out.println("gmail pressent");
 }
 else {
	 System.out.println("not pressent");
 }
	}

}
