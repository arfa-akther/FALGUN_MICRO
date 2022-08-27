package com.spring.action;

import org.openqa.selenium.interactions.Actions;

import com.spring.locator.homepageSpringLocators;
import com.spring.utility.base_class_spring;

public class homepageSpringActions extends base_class_spring{
	homepageSpringLocators HomepageSpringLocators = new homepageSpringLocators ();

	public void Clickspringsigninbutton () {
		HomepageSpringLocators.sigininbutton.click();
		
	}
	
	public void MouseHoveronWomencategory  () {
		Actions mouseover = new Actions(driver);
		mouseover.moveToElement(HomepageSpringLocators.WomenCategory).build().perform();
		
		
	}
	
	public void ClickTshirt() {
		HomepageSpringLocators.Tshirts.click();
		
	}
}
