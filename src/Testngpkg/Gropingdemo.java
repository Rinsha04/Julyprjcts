package Testngpkg;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Gropingdemo {
	  @BeforeTest
	     public void setup() {
	    	 System.out.println("browser open");
	     }
	     @BeforeMethod
	     public void urlloding() {
	    	 System.out.println("url details");
	     }
	     
	     
	     @Test(groups= {"smoke","sanity"})
	     public void test1() {
	    	 System.out.println("test1");
	     }
	     
	     
	     @Test(groups= {"smoke"})
	     public void test2() {
	    	 System.out.println("test2");
	     }
	     
	     
	     
         @Test(groups= {"smoke","sanity"})
	     public void test3() {
	    	 System.out.println("test3");
	     }
         
         
           @Test(groups= {"sanity"})
          public void test4() {
       	 System.out.println("test4");
           }
           
           
          @Test(groups= {"sanity"})
          public void test5() {
	       System.out.println("test5");
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


