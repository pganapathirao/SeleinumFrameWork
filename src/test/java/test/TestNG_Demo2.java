package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.GoogleSearchPageObjects;

public class TestNG_Demo2 {
	
	private static WebDriver driver=null;
	
	@BeforeTest
	public void setUpTest() {

		String projectPath=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/chromedriver/chromedriver.exe");
		driver=new ChromeDriver();

	}

	@Test
	public static void googleSearchTest2() {
		String projectPath=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/chromedriver/chromedriver.exe");
		driver=new ChromeDriver();

		GoogleSearchPageObjects searchPageObj=new GoogleSearchPageObjects(driver);
		driver.get("https://google.com");
		searchPageObj.setTextInSearchBox("ABCD");
		searchPageObj.clickSearchButton();


	}
	@Test
	public static void googleSearchTest3() {
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
	}
}
