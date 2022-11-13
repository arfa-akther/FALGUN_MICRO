package com.spring.action;

import java.util.Set;

import com.spring.locator.BofaSpringLocator;
import com.spring.utility.base_class_spring;

public class BofaSpringAcrrions extends base_class_spring{

	BofaSpringLocator bofaSpringLocator = new BofaSpringLocator();
	
	

	public void clickonhomeloans() {
		bofaSpringLocator.clickHomeLoan.click();
	}
	
    public void clickonfindahome() {
    	bofaSpringLocator.findahome.click();
	}

    public void clickonNewconstruction() throws Exception {
    	bofaSpringLocator.NewConstructor.click();
    	
    //	Single window handle
    	String parentwindow = driver.getWindowHandle();
    	Thread.sleep(3000);
    	
    	//  Multiple window handle
 			Set<String> allwindow = driver.getWindowHandles();
   			Thread.sleep(3000);

    			
    	// Switch to window
    			driver.switchTo().window(parentwindow);
    			Thread.sleep(3000);
    			
    	
}

    public void clickonMonthlypaymentcalculator() {
    	bofaSpringLocator.monthlyPayment.click();
}

}
