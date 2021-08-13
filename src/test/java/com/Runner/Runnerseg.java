package com.Runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "Featurefiles/login.feature",glue="StepDefinitions",monochrome=true,dryRun=false,strict=true)

public class Runnerseg {
	
	
	
	
	@BeforeClass
	public static void set_up() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ramya\\eclipse-workspace\\Selenium_Testing\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.adactin.com/");
		
		
		System.out.println("launching");
		

	}

	
	//driver.close
	@AfterClass
	public static void tear_down() {
		
		System.out.println("closing");
	}
}
	
	
	

