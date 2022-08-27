package com.spring.locator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.spring.utility.base_class_spring;

public class signinpageSpringLocators extends base_class_spring{

	public signinpageSpringLocators() {
		PageFactory.initElements(driver, this);
	}
	
	//email address 
	@FindBy(how=How.XPATH, using="//span[text()='aqsa mahboob']")
	public WebElement accountuser;
}
