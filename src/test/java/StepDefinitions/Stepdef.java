package StepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Outerutils.Commoneg;
import Outerutils.Prop;
import cucumber.api.java.Before;

public class Stepdef {

	public static WebDriver driver;
	
	@Before
	public void beforescenario() {
		
		try {
//			Prop.loading();
			
			if(driver==null) {
			launchBrowser();
			}
		}
		
		catch(Exception e) {
			
			e.printStackTrace();
		}
		
	}


	private void launchBrowser() {
		
		try {
			
			
			switch("chrome") {
			case "chrome":
				System.setProperty("webdriver.chrome.driver",
						"C:\\Users\\ramya\\eclipse-workspace\\Selenium_Testing\\Drivers\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				
				
//				driver.get(Commoneg.URL);
				
				driver.get("https://www.google.com/");
				
				
				break;
				
				
			case "firefox":	
				
//				System.setProperty("webdriver.chrome.driver",
//						"C:\\Users\\ramya\\eclipse-workspace\\Selenium_Testing\\Drivers\\chromedriver.exe");
//				
//				driver = new geckoDriver();
				
				
				break;
				
			case "IE":
//				System.setProperty("webdriver.chrome.driver",
//						"C:\\Users\\ramya\\eclipse-workspace\\Selenium_Testing\\Drivers\\chromedriver.exe");
//				
//				driver = new geckoDriver();
				
				default:
					
					System.setProperty("webdriver.chrome.driver",
							"C:\\Users\\ramya\\eclipse-workspace\\Selenium_Testing\\Drivers\\chromedriver.exe");
					 driver = new ChromeDriver();
					
				break;
			}
			
			
		}

		catch (Exception e) {
			e.printStackTrace();
	}
}
}
