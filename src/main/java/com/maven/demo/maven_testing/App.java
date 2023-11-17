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
public class App 
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
//        driver.get("http://localhost:8080/addressbook/");
        driver.get("https://www.facebook.com/");
        
        //involve implict waits to load page
        driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
        
        System.out.println("Enter details in the form");
        
        
        driver.findElement(By.id("email")).sendKeys("abhi144k@gmail.com");
        driver.findElement(By.id("pass")).sendKeys("password");
        
        //click on save-by class = v-button-primary
//        driver.findElement(By.className("v-button-primary")).click(); 
//        Thread.sleep(2000);
        driver.findElement(By.className("_6ltg")).click();  
        
        System.out.println("Saving details");
        
        System.out.println("Test case execution completed");
        
        driver.quit();
        
    }
}
