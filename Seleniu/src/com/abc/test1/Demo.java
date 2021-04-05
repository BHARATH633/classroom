package com.abc.test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		ChromeDriver cd=new ChromeDriver();
		cd.manage().window().maximize();
		cd.get("https://www.facebook.com");
		WebElement em=cd.findElement(By.name("email"));
		em.sendKeys("bharathciramdasu@gmail.com");
	

	}

}
