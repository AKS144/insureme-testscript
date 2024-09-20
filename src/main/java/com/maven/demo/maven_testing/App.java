package com.maven.demo.maven_testing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException
    {
    	
        System.out.println("Script Started");	
	    //initializing the web driver
	  
        System.setProperty("webdriver.chrome.driver", "C:/Users/lenovo/eclipse-workspace/chromedriver/chromedriver.exe");
        WebDriverManager.chromedriver().setup();
	    //setting properties
	    ChromeOptions chromeOptions = new ChromeOptions();
//	    chromeOptions.addArguments("--headless");
	    // open url
	    System.out.println("Driver opening up the url in browser");	
	    WebDriver driver = new ChromeDriver(chromeOptions);
	    driver.get("http://3.110.154.100:8081/contact.html");	
	    
	    //invole implicit waits to load the page
	    driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	    
	    System.out.println("Enter details in the form");
	    //enter details
//	    driver.findElement(By.className("v-button")).click();	
//	    Thread.sleep(2000);
	    //firstname gwt-uid-5
	    driver.findElement(By.id("inputName")).sendKeys("Abhishek");
	    Thread.sleep(2000);
	    //lastname gwt-uid-7
	    driver.findElement(By.id("inputNumber")).sendKeys("9958580999");
	    Thread.sleep(2000);
	    //contactno id="gwt-uid-9"
//	    driver.findElement(By.id("gwt-uid-9")).sendKeys("9999999999");
	    //email gwt-uid-11
	    driver.findElement(By.id("inputMail")).sendKeys("abhishek@email.com");
	    //date of birth gwt-uid-13
	    driver.findElement(By.id("inputMessage")).sendKeys("Hello from Abhishek to StarAgile");
	    Thread.sleep(2000);
	    //click on save -by class = v-button-primary
	    driver.findElement(By.id("my-button")).click();
	    System.out.println("Saving details");
	    Thread.sleep(2000);
	    
	    System.out.println("Test Case execution completed");
	    Thread.sleep(2000);
	    driver.quit();
 
 

        
    }
}
