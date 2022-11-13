package com.spring.locator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.spring.utility.base_class_spring;

public class globalsqaLocator extends base_class_spring{

	public globalsqaLocator() {
		PageFactory.initElements(driver, this);
	}
	
	
   @FindBy(how=How.XPATH, using="//a[text()= 'Tabs']")
   public WebElement Tab;
	
   
   //Iframe 
   
   @FindBy(how=How.XPATH, using = "//iframe[@class=\"demo-frame lazyloaded\"]")
   public WebElement iFrame;
   
   @FindBy(how=How.XPATH, using = "//h3[text()='Section 1']")
   public WebElement section1;
   
   @FindBy(how=How.XPATH, using ="//li[@id=\"Re-Size Accordion\"]")
   public WebElement resize;
   
   @FindBy (how=How.XPATH, using = "//li[contains(text(),'Simple')]")
   public WebElement simpleAccordion; 
   
   @FindBy (how= How.XPATH, using = "//h3[text()='Section 2']")
   public WebElement section2;
   
   @FindBy (how = How.XPATH, using = "//li[contains(text(),'Toggle')]")
   public WebElement ToggleIcons;
   
   @FindBy (how=How.XPATH, using = "/html/body/div[1]/h3[2]")
   public WebElement togglesection2;
  
   //drag and drop in frame
   @FindBy(how=How.XPATH, using = "//a[text()='DragAndDrop']")
   public WebElement dragdropclick;
   
 @FindBy(how=How.XPATH, using = "//img[@alt=\"The peaks of High Tatras\"]")
 public WebElement img1;
 
 @FindBy(how=How.XPATH, using = "//img[@alt=\"The chalet at the Green mountain lake\"]")
 public WebElement img2;
 
 @FindBy(how=How.XPATH, using = "//img[@alt=\"Planning the ascent\"]")
 public WebElement img3;
 
 @FindBy(how=How.XPATH, using = "//div[@id=\"trash\"]")
 public WebElement trash;
 
 @FindBy (how=How.XPATH, using="//div[@ id=\"trash\"]")
	public WebElement clickdelete;
 
 @FindBy (how=How.XPATH, using="//a[text()='Windows']")
	public WebElement Windows;
 
 @FindBy (how=How.XPATH, using="/html/body/div/div[1]/div[2]/div/div/div[2]/div/div/div[1]/a")
	public WebElement clickHereTab;
 
 @FindBy (how=How.XPATH, using="//li[text()='Open New Window']")
	public WebElement WindowTab;
 
 @FindBy (how=How.XPATH, using="//*[@id=\"post-2632\"]/div[2]/div/div/div[2]/a")
	public WebElement clickHereWindow;
 
 
   
  
 
 
}
