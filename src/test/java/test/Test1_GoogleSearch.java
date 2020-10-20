package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1_GoogleSearch {

	public static void main(String[] args) {
		googleSearch();
	}
	
	public static void googleSearch() {
		
		String projectPath=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/chromedriver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//goto google.com
		driver.get("https://google.com");
		
		//enter text in search box
		driver.findElement(By.name("q")).sendKeys("automation step by step");
		
		//click on search button
		//driver.findElement(By.name("btnK")).click();
		//driver.findElement(By.tagName("input")).sendKeys(Keys.RETURN);
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		
		
		//close the driver
		driver.close();
		
		System.out.println("Test completed sucessfully");
		
		
		
	}
	
	
}
