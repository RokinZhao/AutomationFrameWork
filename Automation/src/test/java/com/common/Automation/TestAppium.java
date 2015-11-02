package com.common.Automation;

import io.appium.java_client.android.AndroidDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class TestAppium {
	
	
 public static void main(String[] args) {
	 TestAppium.testApp();
}	
	public static void testApp(){
		try {
			URL url = new URL("http://127.0.0.1:4723/wd/hub");
			DesiredCapabilities cap = new DesiredCapabilities();
			cap.setCapability("device", "android");
			cap.setCapability("deviceName", "192.168.56.101:5555");
			cap.setCapability("platformName", "android");
			cap.setCapability("platformVersion", "4.4.4");
			cap.setCapability("androidPackage", "com.android.calculator2");
			cap.setCapability("appActivity", "Calculator");
			AndroidDriver<WebElement> driver = new AndroidDriver<WebElement>(url, cap);
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.findElement(By.name("9")).click();
			driver.findElement(By.name("÷")).click();
			driver.findElement(By.name("2")).click();
			driver.findElement(By.name("=")).click();
			//driver.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}finally{
			
		}
	}
	
  @Test
  public void f() {
	  TestAppium.testApp();
	  
  }
}
