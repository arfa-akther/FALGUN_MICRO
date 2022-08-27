package com.spring.locator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.spring.utility.base_class_spring;

public class myaccountpageSpringLocators extends base_class_spring{

	public myaccountpageSpringLocators() {
		PageFactory.initElements(driver, this);
	}
	
	//email address 
	@FindBy(how=How.ID, using="email")
	public WebElement email;
	
	//password 
	@FindBy(how=How.ID, using="passwd")
	public WebElement password;
	
	//
		@FindBy(how=How.ID, using="SubmitLogin")
		public WebElement clicksignin;
	
	
	
	
	
}

