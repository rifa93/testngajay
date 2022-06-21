package org.tng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrowser {

	public static WebDriver driver;
	
	@Parameters({"browser"})
	@Test
	public void browserTest(String bro) {
		
		if(bro.contains("chrome")) {
			WebDriverManager.chromedriver().setup();
			 driver = new ChromeDriver(); 
		}
		else if (bro.contains("edge")) {
			WebDriverManager.edgedriver().setup();
			 driver = new EdgeDriver();
		}
		else if (bro.contains("ie")) {
			WebDriverManager.iedriver().setup();
			 driver = new InternetExplorerDriver();
		}
		else {
			WebDriverManager.operadriver().setup();
			 driver = new OperaDriver();
		}
		
		
	}
}
