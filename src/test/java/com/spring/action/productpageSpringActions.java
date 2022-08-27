package com.spring.action;

import org.openqa.selenium.interactions.Actions;

import com.spring.locator.productpageSpringLocators;
import com.spring.utility.base_class_spring;

public class productpageSpringActions extends base_class_spring{
	productpageSpringLocators ProductpageSpringLocators= new productpageSpringLocators();
	public void ClickblueTshirt() throws Exception {
		driver.switchTo().frame("fancybox-iframe");
		
		Actions mouseover = new Actions(driver);
		mouseover.moveToElement(ProductpageSpringLocators.BlueTshirt).build().perform();
		
		ProductpageSpringLocators.BlueTshirt.click();
		Thread.sleep(10000);
		
	}
}
