package com.pack;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class OpenChromeAndNavigateToGoogle {
	   public static void main(String[] args) {
	      // Set the path of the ChromeDriver executable file
	      System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe");

	      // Create a new instance of the ChromeDriver
	      WebDriver driver = new ChromeDriver();

	      // Navigate to the Google homepage
	      driver.get("https://www.google.com");

	      // Quit the driver
	      driver.quit();
	   }
	}
