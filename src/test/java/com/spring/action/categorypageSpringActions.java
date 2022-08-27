package com.spring.action;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.spring.locator.categorypageSpringLocators;
import com.spring.utility.base_class_spring;

public class categorypageSpringActions extends base_class_spring{

	categorypageSpringLocators CategorypageSpringLocators = new categorypageSpringLocators();
	 
	public void Selecthighestpricefromdropdown() throws Exception {
		//drop down code
		WebElement dropdown = CategorypageSpringLocators.sortDropDown;
		Select sl = new Select(dropdown);
        sl.selectByVisibleText("Price: Highest first");

		Thread.sleep(2500);
	}
	
	public void MousehoverandclickQuickviewtshirt() throws Exception {
		
		Actions mouseover = new Actions(driver);
		mouseover.moveToElement(CategorypageSpringLocators.QuickViewBox).build().perform();
		CategorypageSpringLocators.ClickQuickview.click();
		Thread.sleep(3000);
		
	}

	}
	

