package com.ipsetests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class intellipaat {
 
    WebDriver driver;
	
	@BeforeMethod
	public void launch() {
		
	    System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    driver.get("https://intellipaat.com");
	    //driver.manage().window().maximize();
		//System.out.println("Executed Before the Test");
	}

	@Test
	public void SearchDevOps() {
		
	    driver.findElement(By.className("main-search-input")).sendKeys("DevOps");
	    driver.findElement(By.id("home-search-btn")).click();
	    //String abc = driver.findElement(By.xpath("//img[contains(@src,'/2020/03/DevOps_small.png')]")).getText();
	    //driver.findElement((By.cssSelector("div.course-image-wrapper>a[href='https://intellipaat.com/devops-certification-training/']"))).click();
	    //driver.findElement((By.cssSelector("div.course-image-wrapper>a[href='https://intellipaat.com/devops-certification-training/']>img[src='https://intellipaat.com/course-image/2020/03/DevOps_small.png']"))).click();
	    //driver.findElement((By.cssSelector("a[href='https://intellipaat.com/course-image/2020/03/DevOps_small.png']"))).click();
	    //System.out.println(abc);
	    //String CheckData = "AWS DevOps Training and Certification";
		    		
	    //if(firstData.equals(CheckData)) {
	    //	driver.findElement(By.className("block_media")).click();
	    //	driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
	    //}
	    //else {
	    //	System.out.println("Course not found");
	    //}
	    //String actualData = driver.findElement(By.className("title")).getText();
	    //String expectedData = "AWS DevOps Training and Certification";
		    		
	    //if(actualData.equals(expectedData)) {
	    //	System.out.println("Found String!");			
	    //	String dateView = driver.findElement(By.className("batchDate")).getText();
	    //	String timeView = driver.findElement(By.className("batchWeek")).getText();
	    //	System.out.println("Next Batch is on: \n"+ dateView + "\n"+ timeView);
	    //	System.out.println("Test Successful");
		    	
	    //}
	    //else {
	    //	System.out.println("Oops!! String Not Found.");
	    //}
	}

    @AfterMethod
	public void close() {
	    driver.close();	
	    //System.out.println("Executed After the Test");
	}

}
