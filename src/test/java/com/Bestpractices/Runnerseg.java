package com.Bestpractices;

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

//	
//	@BeforeClass
//	public static void set_up() {
//		
//		
//		
//		System.out.println("launching");
//		
//
//	}
//
//	
//	//driver.close
//	@AfterClass
//	public static void tear_down() {
//		
//		System.out.println("closing");
//	}
//}
//	
//	
	
}
	

