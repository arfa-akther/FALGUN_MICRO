package com.spring.locator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.spring.utility.base_class_spring;

public class homepageSpringLocators extends base_class_spring {

	public homepageSpringLocators() {
		PageFactory.initElements(driver, this);
	}
	
	//signin button
	@FindBy(how=How.XPATH, using="//a[@class=\"login\"]")
	public WebElement sigininbutton;
	
	
	//Women category
		@FindBy(how=How.XPATH, using="//a[@title=\"Women\"]")
		public WebElement WomenCategory;
	
		//Click Tshirt 
				@FindBy(how=How.XPATH, using="//*[@id=\"block_top_menu\"]/ul/li[1]/ul/li[1]/ul/li[1]/a")
				public WebElement Tshirts;
	
}

