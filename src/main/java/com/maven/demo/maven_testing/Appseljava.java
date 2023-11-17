//package com.maven.demo.maven_testing;
//
//public class Appseljava {
//
//}



package com.maven.demo.maven_testing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/**
 * Hello world!
 *
 */
public class Appseljava 
{
    public static void main( String[] args )
    {
    	
        System.out.println( "Script Started" );
        
        //initialising the web driver
        System.setProperty("webdriver.chrome.driver", "C:/Users/lenovo/eclipse-workspace/chromedriver/chromedriver.exe");
        
        
        //setting properties
        ChromeOptions chromeOptions = new ChromeOptions();
//        chromeOptions).setBrowserVersion("117");
        
        //open url
        System.out.println("Driver opening up the url in browser");
        
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("http://localhost:8080/addressbook/");
        
        //involve implict waits to load page
        driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
        
        System.out.println("Enter details in the form");
        
        //enter details
        driver.findElement(By.className("v-button")).click();
        
        //firstname gwt-uid-5
        driver.findElement(By.id("gwt-uid-5")).sendKeys("Abhishek");
        //firstname gwt-uid-7
        driver.findElement(By.id("gwt-uid-7")).sendKeys("kumar");
        //firstname gwt-uid-9
        driver.findElement(By.id("gwt-uid-9")).sendKeys("9999999999");
        //firstname gwt-uid-11
        driver.findElement(By.id("gwt-uid-11")).sendKeys("aks144k@gmail.com");
        //firstname gwt-uid-13
        driver.findElement(By.id("gwt-uid-13")).sendKeys("04/09/2023");
        
        //click on save-by class = v-button-primary
        driver.findElement(By.className("v-button-primary")).click();        
        
        System.out.println("Saving details");
        
        System.out.println("Test case execution completed");        
        driver.quit();        
    }
}
