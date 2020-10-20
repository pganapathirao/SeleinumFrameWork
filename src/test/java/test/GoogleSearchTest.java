package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.GoogleSearchPage;

public class GoogleSearchTest {

	private static WebDriver driver=null;
	public static void main(String[] args) {
		googleSearch();
	}
	
	public static void googleSearch() {
		
		String projectPath=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/chromedriver/chromedriver.exe");
		 driver=new ChromeDriver();
		
		//goto google.com
		driver.get("https://google.com");
		
		//enter text in search box
		//driver.findElement(By.name("q")).sendKeys("automation step by step");
		GoogleSearchPage.textbox_search(driver).sendKeys("Automation step by step");
		
		//click on search button
		//driver.findElement(By.name("btnK")).click();
		//driver.findElement(By.tagName("input")).sendKeys(Keys.RETURN);
		//driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		
		GoogleSearchPage.button_search(driver).click();
		
		//close the driver
		driver.close();
		
		System.out.println("Test completed sucessfully");
		
		
		
	}
	
	
}
