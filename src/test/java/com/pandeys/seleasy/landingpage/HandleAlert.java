package com.pandeys.seleasy.landingpage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.pandeys.seleasy.webdriver.ChromeOnLocal;

public class HandleAlert {
  @Test
  public void readAlert() {
	  ChromeOnLocal chromeOnLocal = new ChromeOnLocal();
		WebDriver driver = chromeOnLocal.getChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
//		Alert alert = driver.switchTo().alert();
//		String alertText = alert.getText();
//		System.out.println("Alert text \n " + alertText);
		
		WebElement popUpElement = driver.findElement(By.id("at-cv-lightbox-message"));
		System.out.println(popUpElement);
		String popUpText = popUpElement.getText();
		System.out.println(popUpText);
  }
}
