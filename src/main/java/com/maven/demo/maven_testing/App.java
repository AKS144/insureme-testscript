package com.maven.demo.maven_testing;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class App {
    public static void main(String[] args) {
        System.out.println("Script Started");

        WebDriverManager.chromedriver().setup();
        
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--headless=new");  
        chromeOptions.addArguments("--no-sandbox");   
        chromeOptions.addArguments("--disable-dev-shm-usage"); 

        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));

        System.out.println("Opening URL");
        driver.get("http://13.201.58.61:8081/contact.html");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        System.out.println("Filling form...");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("inputName"))).sendKeys("Abhishek");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("inputNumber"))).sendKeys("9958580999");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("inputMail"))).sendKeys("abhishek@email.com");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("inputMessage"))).sendKeys("Hello from Abhishek to StarAgile");

        wait.until(ExpectedConditions.elementToBeClickable(By.id("my-button"))).click();
        
        System.out.println("Saving details");
        System.out.println("Test Case execution completed");

        driver.quit();
    }
}
