package com.spring.locator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.spring.utility.base_class_spring;

public class southwestLocator extends base_class_spring {

	public southwestLocator() {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(how=How.ID, using="LandingAirBookingSearchForm_departureDate")
	public WebElement DepartDate;
	
	@FindBy(how=How.ID, using="LandingAirBookingSearchForm_returnDate")
	public WebElement ReturnDate;
}
