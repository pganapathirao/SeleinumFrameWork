package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportsBasicDemo {

	static WebDriver driver=null;
	public static void main(String[] args) {
		
		//starts Reports
		ExtentHtmlReporter htmlReporter =new ExtentHtmlReporter("extent.html");
		
		//create ExtentReports and attach reporter
		
		ExtentReports extent=new ExtentReports();
		extent.attachReporter(htmlReporter);
		
		   // creates a toggle for the given test, adds all log events under it  
		
		ExtentTest test1=extent.createTest("Google Search test one","This is a test search functionality validation");
		
		String projectPath=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/chromedriver/chromedriver.exe");
		driver=new ChromeDriver();
		
		test1.log(Status.INFO, "starting test case");
		driver.get("https://google.com");
		test1.pass("Navigate to google.com");
		driver.findElement(By.name("q")).sendKeys("Automation");
		test1.pass("Enter the text in search box");
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		test1.pass("Press the keyboard enter key");
		driver.close();
		driver.quit();
		test1.pass("Close the browser");
		test1.info("Test completed");
		
		 // calling flush writes everything to the log file
        extent.flush();
		
		
		
	}
}
