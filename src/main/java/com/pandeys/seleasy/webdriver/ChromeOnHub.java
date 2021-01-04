package com.pandeys.seleasy.webdriver;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

/**
 * Hello world!
 *
 */
public class ChromeOnHub 
{
    public static void main( String[] args ) throws MalformedURLException
    {
        System.out.println( "Hello World!" );
        System.setProperty("webdriver.chrome.driver", "C:\\Projects\\Selenium\\chromedriver.exe");
        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
       RemoteWebDriver driver = new RemoteWebDriver(new URL("http://172.18.105.49:4444/wd/hub"), capabilities);
       driver.get("https://www.google.com/");
    }
}
