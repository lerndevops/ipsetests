package com.ipsetests;

import org.testng.annotations.Test;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class gmail {
  @Test
  public void login() {
	  
	    System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.manage().window().maximize();
	    driver.get("https://gmail.com");
	    //System.out.println("Test Successful.");
	    driver.findElement(By.id("identifierId")).sendKeys("nareshtest");
	    //driver.close();
  }
}
