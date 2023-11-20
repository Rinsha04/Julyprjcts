package Testngpkg;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testingdemo {
     @BeforeTest
     public void setup() {
    	 System.out.println("browser open");
     }
     @BeforeMethod
     public void urlloding() {
    	 System.out.println("url details");
     }
     @Test(priority=2 )//,enabled=false)
     
     public void test1() {
    	 System.out.println("test1");
     }
     @Test(priority=1,invocationCount=3,dependsOnMethods= {"test1"})
     public void test2() {
    	 System.out.println("test2");
     }
     @AfterMethod
     public void aftrmethod(){
    	 System.out.println("after method");
     }
     @AfterTest
     public void aftrtest() {
    	 System.out.println("aftertest");
     }
    	 
}
