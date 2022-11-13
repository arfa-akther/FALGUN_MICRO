package com.spring.locator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.spring.utility.base_class_spring;

public class herokuappLocator extends base_class_spring {

	public herokuappLocator() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.LINK_TEXT, using = "Context Menu")
	public WebElement contextMenu;
	
	@FindBy(how=How.XPATH , using = "//div[@oncontextmenu=\"displayMessage()\"]")
	public WebElement rightClickBox;
	
	//digest authentication or basic authentication
	 @FindBy(how=How.LINK_TEXT, using = "Digest Authentication")
	 public WebElement digestClick;
	 
	 @FindBy(how=How.LINK_TEXT, using = "Basic Auth")
	 public WebElement basicClick;
	 
	// file or image upload
	 
	 @FindBy(how=How.LINK_TEXT, using = "File Upload")
	 public WebElement fileUploadClick;
	 
	 @FindBy (how=How.XPATH, using = "//input[@id=\"file-upload\"]")
	 public WebElement chooseFile;
	 
	 @FindBy (how=How.ID, using = "file-submit")
	 public WebElement ClickUpload;
	 
	 //dropdown
	 
	 @FindBy(how=How.XPATH, using = "//a[text()='Dropdown']")
	   public WebElement dropdown;
	 
	 @FindBy(how=How.XPATH, using = "//select[@id=\"dropdown\"]")
	 public WebElement selectdropdown;
	 
	 //Frames
	 @FindBy (how=How.XPATH, using =  "//a[text()='Frames']")
	 public WebElement clickFrames;
	 
	 @FindBy (how=How.XPATH , using = "//a[text()='Nested Frames']")
	 public WebElement nestedFrames;
	 
	 @FindBy (how=How.XPATH, using = "//frame[@name=\"frame-bottom\"]")
	 public WebElement bottomFrame;
	 
	 @FindBy (how=How.XPATH, using = " //body[contains(text(),'BOTTOM')]")
	 public WebElement Bottomtext;
	 
	 @FindBy (how=How.XPATH, using = "//body[contains(text(),'LEFT')]")
	 public WebElement lefttext;
	 
	 @FindBy (how=How.XPATH, using = "//div[@id=\"content\"]")
	 public WebElement middlettext;
	 
	 @FindBy (how=How.XPATH, using = "//a[text()='Checkboxes']")
	 public WebElement checkboxes;
	 
	 @FindBy (how=How.XPATH, using = "/html/body/div[2]/div/div/form/input[1]")
	 public WebElement checkbox1;
	 
	 @FindBy (how=How.XPATH, using = "/html/body/div[2]/div/div/form/input[2]")
	 public WebElement checkbox2;
	 
	 @FindBy (how=How.XPATH, using = "//a[text()='Form Authentication']")
	 public WebElement FormAuthentication;
	 
	 @FindBy (how=How.XPATH, using = "//input[@id=\"username\"]")
	 public WebElement username;
	 
	 @FindBy (how=How.XPATH, using = "//input[@id=\"password\"]")
	 public WebElement password;
	 
	 @FindBy (how=How.XPATH, using = "//button[@type=\"submit\"]")
	 public WebElement login;
	
	 //mouse over
	 @FindBy (how=How.XPATH, using = "//a[text()='Hovers']")
	   public WebElement Clickhover;
	 
	 @FindBy (how=How.XPATH, using = "/html/body/div[2]/div/div/div[1]/img")
	   public WebElement img1;
	 
	 @FindBy (how=How.XPATH, using = "/html/body/div[2]/div/div/div[2]/img")
	   public WebElement img2;
	 
	 //drag drop
	 @FindBy(how= How.LINK_TEXT, using = "Drag and Drop")
	 public WebElement dragDrop;
	 
	 @FindBy(how= How.XPATH, using = "//div[@id=\"column-a\"]")
	 public WebElement optionA;
	 
	 @FindBy (how=How.XPATH, using = "//div[@id=\"column-b\"]")
	 public WebElement optionB;
}







   
