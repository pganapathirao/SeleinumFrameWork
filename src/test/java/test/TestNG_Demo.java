package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import config.PropertiesFile;
import pages.GoogleSearchPageObjects;

public class TestNG_Demo {
	
	private static WebDriver driver=null;
	public static String browserName=null;

	

	@BeforeTest
	public void setUpTest() {
		String projectPath=System.getProperty("user.dir");
		PropertiesFile.getProperties();
		if(browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/chromedriver/chromedriver.exe");
			driver=new ChromeDriver();

		}
		
		else if(browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", projectPath+"/drivers/geckodriver/geckodriver.exe");
			driver=new FirefoxDriver();

		}



	}

	@Test
	public static void googleSearchTest() {
		String projectPath=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/chromedriver/chromedriver.exe");
		driver=new ChromeDriver();

		GoogleSearchPageObjects searchPageObj=new GoogleSearchPageObjects(driver);
		driver.get("https://google.com");
		searchPageObj.setTextInSearchBox("ABCD");
		searchPageObj.clickSearchButton();


	}

	@AfterTest
	public void tearDownTest() {
		driver.close();
		System.out.println("Test completed");
		PropertiesFile.setProperties();
	}
}
