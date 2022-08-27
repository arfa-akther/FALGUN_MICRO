package com.spring.locator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.spring.utility.base_class_spring;

public class productpageSpringLocators extends base_class_spring{

	public productpageSpringLocators() {
		PageFactory.initElements(driver, this);
	}
	
	//click blue tshirt
	@FindBy(how=How.ID, using="thumb_4")
	public WebElement BlueTshirt;
}
