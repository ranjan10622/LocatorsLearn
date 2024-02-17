package com.selenium.locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class Locators2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();
	    driver.manage().window().maximize();
	   driver.get("https://rahulshettyacademy.com/locatorspractice/");
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
	   
	   
	   
	   
	   driver.findElement(By.cssSelector("input#inputUsername")).sendKeys("contact");
       
       driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");

       driver.findElement(By.cssSelector("#chkboxOne")).click();
       
       driver.findElement(By.cssSelector("#chkboxTwo")).click();
       
   
     
         driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
          Thread.sleep(2000);
         
         String str=driver.findElement(By.tagName("p")).getText();
           System.out.println(str);
         
          Assert.assertEquals(str, "You are successfully logged in.");
          
          String str1 = driver.findElement(By.cssSelector("h2")).getText();
          
           Assert.assertEquals(str1, "Hello contact,");
           
           driver.findElement(By.xpath("//button[text()='Log Out']")).click();
           
           driver.close();
          


	}

}
