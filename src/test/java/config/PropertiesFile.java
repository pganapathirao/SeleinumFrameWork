package config;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

import test.TestNG_Demo;

public class PropertiesFile {

	static Properties prop=new Properties();
	static String projectPath=System.getProperty("user.dir");

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getProperties();
		setProperties();
		getProperties();
	}

	public static void getProperties() {
		try {


			InputStream input=new FileInputStream(projectPath+"/src/test/java/config/config.properties");
			prop.load(input);
			String browser=prop.getProperty("browser");
			System.out.println(browser);
			TestNG_Demo.browserName=browser;
		}catch(Exception exp) {
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			System.out.println(exp.getStackTrace());

		}
	}
	public static void setProperties() {

		try {
			OutputStream output=new FileOutputStream(projectPath+"/src/test/java/config/config.properties");
			prop.setProperty("result", "pass");
			prop.store(output, null);

		}catch(Exception exp) {
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			System.out.println(exp.getStackTrace());

		}
	}
}
