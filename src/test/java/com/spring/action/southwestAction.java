package com.spring.action;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.spring.locator.southwestLocator;
import com.spring.utility.base_class_spring;

public class southwestAction extends base_class_spring {

	southwestLocator SouthwestLocator = new southwestLocator();

	public void Selectdeparturedate() throws Exception {

		((JavascriptExecutor) driver).executeScript("scroll(0,400)");
		JavascriptExecutor date = (JavascriptExecutor) driver;

		Thread.sleep(3000);
		date.executeScript("document.getElementById('LandingAirBookingSearchForm_departureDate').value='11/21/2022'");
		// date.executeScript("document.SouthwestLocator.DepartDate.value='11/21/2022'");
		Thread.sleep(3000);
		// date.executeScript("document.getElementById('LandingAirBookingSearchForm_returnDate').value='12/01/2022'");

		// or if we want to pass with locator
		WebElement element = SouthwestLocator.ReturnDate;
		// WebElement element1 = SouthwestLocator.DepartDate;
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].value='12/01/2022';", element);
		// jse.executeScript("arguments.value='12/01/2022','12/03/2022';",
		// element,element1);
		Thread.sleep(3000);
		
	}

//public void Selectreturndate() throws Exception {
//	Thread.sleep(3000);
//	((JavascriptExecutor) driver).executeScript("scroll(0,400)");
//	JavascriptExecutor date = (JavascriptExecutor) driver; 
//	date.executeScript("document.SouthwestLocator.ReturnDate.value='12/01/2022'");
//	Thread.sleep(3000);
//	}
}
