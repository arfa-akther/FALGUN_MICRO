package com.spring.locator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.spring.utility.base_class_spring;

public class categorypageSpringLocators extends base_class_spring{

	public categorypageSpringLocators() {
		PageFactory.initElements(driver, this);
	}
	
	//sort by dropDown
	@FindBy(how=How.ID, using="selectProductSort")
	public WebElement sortDropDown;
	
	//mouseover on quickview box
	@FindBy(how=How.XPATH, using="//div[@class=\"product-container\"]")
	public WebElement QuickViewBox;
	
	//click on quick box
	@FindBy(how= How.XPATH, using ="//span [text() = 'Quick view']" )
	public WebElement ClickQuickview;
	
}
