package com.akhil.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverTesting {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver A1=new ChromeDriver();
		A1.manage().window().maximize();
		A1.get("https://www.facebook.com");
		Thread.sleep(1000);
		A1.findElement(By.id("email")).sendKeys("akhilciramdasu@gmail.com");
		A1.close();
		
		
	}

}
