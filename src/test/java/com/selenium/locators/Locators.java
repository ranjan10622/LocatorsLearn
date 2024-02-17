package com.selenium.locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		    driver.manage().window().maximize();
		   driver.get("https://rahulshettyacademy.com/locatorspractice/");
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		    
		   //locators By ID
		   
		   driver.findElement(By.id("inputUsername")).sendKeys("contact");
		   
		   //locators By NAME
		    driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacadem");
		    
		    //locators By CLASS
		    
		    driver.findElement(By.className("signInBtn")).click();
		    
		    //locators By CSS
		      
		     String str= driver.findElement(By.cssSelector("p.error")).getText();
		       System.out.println(str); 
		       
		       //locators By LinkText
		       
		       driver.findElement(By.linkText("Forgot your password?")).click();
		       
		       Thread.sleep(1000);
		       
		       //Locators By XPath
		       
		       driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("abcd");
		       
		       //Locators By CSS
		       
		       driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("abc@gmail.com");
		       
		       
		       //Locators By XPath (index value)
		       driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
		       
		       //Locators By CSS
		    //   driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("john@gmail.com");
		       
		       //Locators By CSS (index value)
		       
		       driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("baba@gmail.com");
		       
		       //Locators By XPath(parent to child)
		       
		       driver.findElement(By.xpath(" //form/input[3]")).sendKeys("9234767781");
		       
		       //Locators By CLASSNAME
		       
		       driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		       
		       //LOCATORS By CSS SELECTOR (Parent to child)
		       
		       String abr = driver.findElement(By.cssSelector("form p")).getText();
		         System.out.println(abr);
		       
		         
		         //Login In Application
		         
		         driver.findElement(By.cssSelector(".go-to-login-btn")).click();
		         
		          Thread.sleep(2000);
		         
		         driver.findElement(By.cssSelector("input#inputUsername")).sendKeys("contact");
		         
		         driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
	
		         driver.findElement(By.cssSelector("#chkboxOne")).click();
		         
		         driver.findElement(By.cssSelector("#chkboxTwo")).click();
		         
		       //  driver.findElement(By.cssSelector("button.submit")).click();
		       
		           driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();


	}

}
