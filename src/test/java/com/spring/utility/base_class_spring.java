package com.spring.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class base_class_spring {

	public static Properties propspring;
	public static WebDriver driver;

	public base_class_spring() {

		propspring = new Properties();

		try {
			FileInputStream flsspring = new FileInputStream(System.getProperty("user.dir")
					+ "\\src\\test\\java\\com\\spring\\configure\\configureSpring.properties");

			propspring.load(flsspring);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void initBrowserSpring() {

		String BrowserSetupSpring = propspring.getProperty("BROWSERS1");

		if (BrowserSetupSpring.equals("CHROME")) {

			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\WebDriverSpring\\chromedriver.exe");
			driver = new ChromeDriver();
   //		driverSpring.manage().deleteAllCookies();
			//driverSpring.get("http://automationpractice.com/index.php");
			driver.manage().timeouts().pageLoadTimeout(testdataSpring.pageloadTimeoutS, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(testdataSpring.implicitlyWaitS, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			System.out.println("Spring Chrome Browser Launch");
		}

		else if (BrowserSetupSpring.equals("FF")) {

		}
	}

		public static void getURLSPR (String URL) {
			
			driver.get(propspring.getProperty("URLSPR4"));
			
		}
		
		

}