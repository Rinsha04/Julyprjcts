package pkg;

import org.openqa.selenium.chrome.ChromeDriver;

public class youtube {

	public static void main(String[] args) {
 ChromeDriver driver=new ChromeDriver();
 driver.get("https://www.youtube.com");
		 String actualtitle=driver.getTitle();
		 String exp="YouTube";
		 if(actualtitle.equals(exp)) {
			 System.out.println("pass");
		 }
		 else {
			 System.out.println("fail");
		 }
		 String src=driver.getPageSource();
		 if (src.contains("Trending")) {
			 System.out.println("pressent");
		 }
		 else {
			 System.out.println("not pressent");
		 }
	}

}
