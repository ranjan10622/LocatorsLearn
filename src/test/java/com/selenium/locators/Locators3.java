package com.selenium.locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators3 {

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	   driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
	   
	  String str= driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).getText();
	  
	      System.out.println(str);

	}

}
