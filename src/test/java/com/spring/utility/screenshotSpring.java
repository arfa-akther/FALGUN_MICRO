package com.spring.utility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class screenshotSpring {

	public static void takescreenshot(WebDriver driver, String screenshot) {//1st import webdriver,here driver & screenshot are object of parameter that we passiing
		// selenium can take SS in only png formate
		// File class is given by apache poi,that is holding the following line & and its obj name is srcfile
			File srcfile= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); 
				//import TakesScreenshot interface from selenium
                // that interface Capture the screenshot and store it in the specified location.
                //Obtain the screenshot into a temporary file that will be deleted once the JVM exits.				
                //It is up to users to make a copy of this file.				
				
				String correntdir = System.getProperty("user.dir");//user.dir= my system
		
				try {
					FileUtils.copyFile(srcfile, new File(correntdir+"/ScreenshotSpring/"+screenshot+".png"));
					// selenium can take SS in only png formate
					//copyFile method given by FileUtils class,this is for copy that screanshot 
					// "/ScreenShots/" this the showing the new creating folder for SS copy	
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}

		
	}

