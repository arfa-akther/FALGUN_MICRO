package com.spring.action;



import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;

import com.spring.locator.herokuappLocator;
import com.spring.utility.base_class_spring;

public class herokuappAction extends base_class_spring {
	herokuappLocator HerokuappLocator = new herokuappLocator();
	
	
	public void clickoncontextMenu() throws Exception {
		HerokuappLocator.contextMenu.click();
		Thread.sleep(3000);
	}
	
	public void rightclickonthegivenboxandacceptOKpopupalert() throws Exception {
		//WebElement admin = driver.findElement(By.id("hot-spot"));
		WebElement admin =HerokuappLocator.rightClickBox ;
        Actions act = new Actions(driver);
        Thread.sleep(3000);
        act.contextClick(admin).build().perform();              //Right Click = Single Click
        Thread.sleep(3000);
        driver.switchTo().alert().accept();

	}
	
	//digest authentication
	public void clickondigestAuthentication() {
		HerokuappLocator.digestClick.click();
	}
	
	
	public void enterusernamepasstoperfromtheaction() throws Exception {
		String t = "admin";
		//this is the format:    https://username:password@URL
		String s = "https://" + t + ":" + t + "@" + "the-internet.herokuapp.com/basic_auth";
		driver.get(s);
		Thread.sleep(4000);
		// identify and get text after authentication of popup
	      String m = driver.findElement(By.cssSelector("p")).getText();
	      System.out.println("Text after pop-up authentication: " + m);
	      Thread.sleep(3000);
	}
	
	// file or image upload
	
	public void clickonfileupload() {
		HerokuappLocator.fileUploadClick.click();
	}
	
	public void clickonchoosefiletoselectfile() throws Exception {
		WebElement browse = HerokuappLocator.chooseFile;
		browse.sendKeys("C:\\Users\\Arfa Akther\\OneDrive\\Desktop\\deleteLater - Copy.jfif"); //Uploading the file using sendKeys
		Thread.sleep(3000);
		System.out.println("File is Uploaded Successfully");
	}
	
	public void clickupload() throws Exception {
		HerokuappLocator.ClickUpload.click();
		Thread.sleep(3000);
	}
	
    //dropdown
	public void clickondropdown() {
		HerokuappLocator.dropdown.click();
	}
	
	public void Selectdropdown () throws Exception {
		WebElement dropdown = HerokuappLocator.selectdropdown;
		Select op1 = new Select(dropdown);
		//op1.selectByVisibleText("Option 1");
		//op1.selectByIndex(1);
		op1.selectByValue("2");
		Thread.sleep(3000);
	}
	
     public void clickonframes() throws Exception {
    	 HerokuappLocator.clickFrames.click();
    	 Thread.sleep(3000);
     }
     
     public void clickonNestedframes() throws Exception {
    	 HerokuappLocator.nestedFrames.click();
    	 Thread.sleep(3000);
     }
     
     
     public void Workonframes() throws Exception {
    	
    	 //To find No. of frames on the page are
    	 JavascriptExecutor exe = (JavascriptExecutor) driver;
    	 Integer noOfFrames = Integer.parseInt(exe.executeScript("return window.length").toString());
    	 System.out.println("No. of iframes on the page are " + noOfFrames);
    	 
    	 
    	 //frame: if a web page is embedded into another web page then frame concept is used and those embedded pages are called iframes
    	 //Frame is a HTML tag that is used for dividing the web page into various frames/windows.
    	 //iframe is used to embed some other document within the current HTML document.
    	 driver.switchTo().frame("frame-top"); // or driver.switchTo().frame(0);
    	 driver.switchTo().frame("frame-left");
    	 String TEXT = HerokuappLocator.lefttext.getText();
    	 System.out.println(TEXT);
    	 driver.switchTo().defaultContent(); //or I can just use this parent syntax here : driver.switchTo().parentFrame();
    	driver.switchTo().frame("frame-top");
    	 driver.switchTo().frame("frame-middle");
    	 String Text = HerokuappLocator.middlettext.getText();
    	System.out.println(Text);
    	driver.switchTo().parentFrame();//ParentFrame is used in nested fames, because under the parent frame we have the list of frames/iframes
    	System.out.println(TEXT);
    	 driver.switchTo().frame("frame-middle");
    	 //driver.switchTo().defaultContent();
    	// driver.switchTo().frame("frame-top");
    	 driver.switchTo().parentFrame();
    	 driver.switchTo().frame("frame-right");
    	 driver.switchTo().parentFrame();
    	 driver.switchTo().frame("frame-left");
    	
    	
    	 driver.switchTo().defaultContent();
    	 driver.switchTo().frame("frame-bottom"); //// or driver.switchTo().frame(1);
    	// driver.switchTo().frame(1);
    	//Thread.sleep(3000);
    	String ext = HerokuappLocator.Bottomtext.getText();
    	//Thread.sleep(3000);
        System.out.println(ext);
        
        
        driver.switchTo().defaultContent(); // default content is the main frame. If we want to switch between multiple frames use default
     	driver.switchTo().frame("frame-top");
    	
    	  	
     }
     
     public void clickoncheckboxesoption() {
    	 HerokuappLocator.checkboxes.click(); 
     }
     
    /* public void clickanycheckbox() throws Exception {
    	 Thread.sleep(5000);
    	 HerokuappLocator.checkbox1.click();
    	 Thread.sleep(5000);
    	 
    	 HerokuappLocator.checkbox2.click();
    	 Thread.sleep(5000);
     } */
     
     public void verifycheckboxdisplayedthenselectcheckbox() throws InterruptedException {
    	//verify if displayed
    	 WebElement checkboxDisplay = HerokuappLocator.checkbox1;
    	 boolean isDisplayed = checkboxDisplay.isDisplayed();
    	 
    	 if(isDisplayed==true) {
    		 Thread.sleep(5000);
    		 checkboxDisplay.click();
    		 Thread.sleep(5000);
    		 	     	     	 
     }
     }
     public void verifycheckboxispreselected() throws Exception {
    	 WebElement checkSelected= HerokuappLocator.checkbox2;
		 boolean isSelected= checkSelected.isSelected();
		
		//verify if selected
		 if(isSelected==false) {
			 checkSelected.click();
		 Thread.sleep(5000);
     }
    }
     
     public void verifycheckboxenabledORnotPreSelectedthenselectcheckbox() throws Exception {
    	 WebElement checkboxEnabled = HerokuappLocator.checkbox1;
    	 boolean isEnabled = checkboxEnabled.isEnabled();
    	 
    	 if(isEnabled==true) {
    		 Thread.sleep(5000); 
    		 checkboxEnabled.click();
    		 Thread.sleep(5000);
		 
    		 System.out.println(driver.getPageSource());
		 
	 } 
   }
     
     public void getcurrentlinkandalllinksincludingthetotal() {
    	 System.out.println(driver.getCurrentUrl()); //current url
    	 
    	 
    	 
    	 List<WebElement> listoflink = driver.findElements(By.tagName("a"));
    	 System.out.println(listoflink.size());
    	 
    	 for (int i=0; i<listoflink.size();i++) {
    			System.out.println(listoflink.get(i).getAttribute("href"));
    	 } 
    	 	 
     }
     
     public void getpageresourcesandpagetitle() {
    	
    	 
    	// System.out.println(driver.getPageSource());
    	 
    	 WebElement internet = HerokuappLocator.contextMenu;
    	 internet.click();
    	 System.out.println(driver.getTitle());     	 
     }
     
     public void clickonFormAuthentication() throws Exception {
    	 HerokuappLocator.FormAuthentication.click();
    	 Thread.sleep(3000);
     }
     
     public void clickenterusernameandpassowrdandclickloginandprintvalueusername() throws Exception {
    	 
    	 HerokuappLocator.username.sendKeys("tomsmith");
    	 
    	 String username =HerokuappLocator.username.getAttribute("value");
    		System.out.println(username);
    		
    	 HerokuappLocator.password.sendKeys("SuperSecretPassword!");
    	 HerokuappLocator.login.click();
    	 Thread.sleep(3000);
    	 	 
     }
     
     //accept popup:  driver.switchTo().alert().accept();
     
    //•	Validation with popup (Contains)//
     /* boolean withinvalidinput =  driver.switchTo().alert().getText().contains("User does not exist");
		Assert.assertTrue(withinvalidinput);
		Thread.sleep(2000);
		driver.switchTo().alert().accept(); 
}*/

   //mouseover
   		public void clickonhovers() throws Exception {
   			HerokuappLocator.Clickhover.click();
   			Thread.sleep(3000);
   		  }	
   		
   		public void mouseoveronimages() throws Exception {
   			
   			Actions Act= new Actions (driver);
   			WebElement image1 = HerokuappLocator.img1;
   			Act.moveToElement(image1).build().perform();
   			Thread.sleep(3000);
   			
   			WebElement image2 = HerokuappLocator.img2;
   			Act.moveToElement(image2).build().perform();
   			Thread.sleep(3000);
   		}
   		
   		//drag and drop
   		
   		public void Clickondraganddrop() {
   			HerokuappLocator.dragDrop.click();
   		}
   		
	public void performdrag() throws Exception {
		
		Actions actn = new Actions(driver);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement From= HerokuappLocator.optionA;
		WebElement To= HerokuappLocator.optionB;
		actn.dragAndDrop(From, To).perform();
	//or//Action dragAndDrop = actn.clickAndHold(From).moveToElement(To).release(To).build();
		//dragAndDrop.perform();
		Thread.sleep(3000);
		
   		}
}


