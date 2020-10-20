package SeleinumJavaFramework.SeleinumJavaFramework;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserTest {

	public static void main(String[] args) {
		
		String projectPath=System.getProperty("user.dir");
		//System.out.println("projectpath");
		//System.setProperty("webdriver.gecko.driver", projectPath+"/drivers/geckodriver/geckodriver.exe");
		//WebDriver driver=new FirefoxDriver();
		
		System.setProperty("webdriver.chrome.driver", projectPath+ "/drivers/chromedriver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//ystem.setProperty("webdriver.ie.driver", projectPath+ "/drivers/iedriver/IEDriverServer.exe");
		//WebDriver driver= new InternetExplorerDriver();
		driver.get("https://google.com");
		
		//driver.findElement(By.id("realbox")).sendKeys("ABCD");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("abcd");
		List<WebElement> elements = driver.findElements(By.xpath("//input"));
		int count=elements.size();
		System.out.println("Size of the count ="+count);
			
		//WebElement textbox=driver.findElement(By.xpath("//input[@name='q']"));
		//textbox.sendKeys("Automation step by step");
	
		driver.close();
		//driver.quit();
	}
}
