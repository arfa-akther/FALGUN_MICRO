package com.spring.action;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.spring.locator.globalsqaLocator;
import com.spring.utility.base_class_spring;

public class globalsqaAction extends base_class_spring{

	globalsqaLocator GlobalsqaLocator = new globalsqaLocator();
	
	public void clickonTabsbutton() throws Exception {
		Thread.sleep(3000);
		((JavascriptExecutor)driver).executeScript("scroll(0,500)");
		GlobalsqaLocator.Tab.click();
		Thread.sleep(3000);
		
	}
	
	public void switchtoiframeandclickonsection() throws Exception {
		driver.switchTo().frame(GlobalsqaLocator.iFrame);
		Thread.sleep(3000);
		GlobalsqaLocator.section1.click();
		Thread.sleep(3000);
		
	}
	
	
	public void clickonReSizeAccordion() throws Exception{
		driver.switchTo().defaultContent(); // switching to default means next tab 
		Thread.sleep(3000); 
		GlobalsqaLocator.resize.click();
		Thread.sleep(3000);
		GlobalsqaLocator.simpleAccordion.click(); // going back to  simple Accordion
		Thread.sleep(3000);
		driver.switchTo().frame(GlobalsqaLocator.iFrame); // switching back to frame 
		GlobalsqaLocator.section2.click();
		Thread.sleep(3000);
		
		
		
		
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		GlobalsqaLocator.ToggleIcons.click();
		Thread.sleep(3000);
		//driver.switchTo().frame(GlobalsqaLocator.iFrame);
		Thread.sleep(3000);
		GlobalsqaLocator.togglesection2.click();
		Thread.sleep(3000);
		
		
		
	}
	
	public void Clickondraganddrop() {
		((JavascriptExecutor)driver).executeScript("scroll(0,500)");
		GlobalsqaLocator.dragdropclick.click();
		
		
	}
	
	public void performdragdrop() throws Exception {
		Actions acttn = new Actions(driver);
		driver.switchTo().frame(GlobalsqaLocator.iFrame);
		
		WebElement from0 = GlobalsqaLocator.img1;
		WebElement from1 = GlobalsqaLocator.img2;
		WebElement from2 = GlobalsqaLocator.img3;
	
		
		WebElement to = GlobalsqaLocator.trash;
		acttn.dragAndDrop(from0, to).perform();
		acttn.dragAndDrop(from1, to).perform();
		acttn.dragAndDrop(from2, to).perform();
		Thread.sleep(3000);

	}
	
	public void clicktrash() throws Exception {
		GlobalsqaLocator.clickdelete.click();
		 Thread.sleep(3000);
	}
	
	public void findallbrokenlinks() throws IOException {
		String url = driver.getCurrentUrl();
		System.out.println(url);

		
		List<WebElement> alllinks = driver.findElements(By.tagName("a"));
		System.out.println("Number of link:" + alllinks.size());
		 // 22. Print all links name
		for (int i = 0; i < alllinks.size(); i++) {
			System.out.println(alllinks.get(i).getAttribute("href"));
		
			
			WebElement elements = alllinks.get(i);
			String urll = elements.getAttribute("href");
			URL link = new URL(urll);
			// create a connection using url object 'link'
			HttpURLConnection httpConn = (HttpURLConnection) link.openConnection();
			// establish connection
			httpConn.connect();
			int rescode = httpConn.getResponseCode(); // return response if res code is above 400 :broken
			if (rescode >= 400) {
				System.out.println(url + " - " + "is broken link");
			} else {
				System.out.println(url + " -  " + "is valid link");
			}
			
		} 
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		
		
	}
	
	public void clickonwindows() {
		((JavascriptExecutor)driver).executeScript("scroll(0,500)");
		
		
		 WebDriverWait wait = new WebDriverWait(driver,10);
		 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(GlobalsqaLocator.Windows));
		
		 //GlobalsqaLocator.Windows.click();
		 //or click using javascript executor
		 JavascriptExecutor ex = (JavascriptExecutor)driver;
		 ex.executeScript("arguments[0].click()",GlobalsqaLocator.Windows);
			System.out.println("explicite wait");
		
	}
	
   public void inopenNewTabclickonclickHereoption() throws Exception {
	   
	   GlobalsqaLocator.clickHereTab.click();
	   GlobalsqaLocator.WindowTab.click();
	   GlobalsqaLocator.clickHereWindow.click();
	   
	  
	   Set<String> window =driver.getWindowHandles();
	   Iterator <String> ite = window.iterator();
	        String mainwindow = ite.next();
	        String secondwindow = ite.next();
	     // String thirdwindow = ite.next();
	       // String child2 = ite.next();
	        driver.switchTo().window(secondwindow);
	        System.out.println("second  window");
	        Thread.sleep(3000);
	        driver.switchTo().window(mainwindow);
	        System.out.println("main window");
	        Thread.sleep(3000);
	        driver.switchTo().window(secondwindow);
	        System.out.println("second window");
	        Thread.sleep(3000);
	   
	   
   }
   
//   public void clickopenNewWindowclickonclickHereoption() throws Exception {
//	   
//	   GlobalsqaLocator.clickHereTab.click();
//	   String parentwindow = driver.getWindowHandle();
//	   GlobalsqaLocator.WindowTab.click();
//	   
//	   GlobalsqaLocator.clickHereWindow.click();
//	   Set<String> allwindow = driver.getWindowHandles();	
//	   driver.switchTo().window(parentwindow);
//	   Thread.sleep(3000);
//   }
	
	}
	


