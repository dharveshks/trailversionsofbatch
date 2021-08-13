package StepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Project_demo {

	WebDriver driver ;
	
	
	@Before
	private void Set_up() {
		
		try {
			if(driver==null) {
			
				
				
			launchbrowser();
			
			}
		} catch (Exception e) {
		
			e.printStackTrace();
		}
		
	}
	
	
	
	
	
	private void launchbrowser() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ramya\\eclipse-workspace\\Selenium_Testing\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
//		driver.get(Commoneg.URL);
		
		driver.get("https://www.google.com/");
		
//		driver.get(QUICKLAUNCH);
		
	}












	@After
	private void tear_down() {
		// TODO Auto-generated method stub

	}
	
	
}
