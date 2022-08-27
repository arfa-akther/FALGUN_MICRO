package com.spring.action;

import com.spring.locator.myaccountpageSpringLocators;
import com.spring.utility.base_class_spring;

public class myaccountpageSpringActions extends base_class_spring{

	myaccountpageSpringLocators MyaccountpageSpringLocators = new myaccountpageSpringLocators();
	
	 public void Enterspringemailaddressandpasswordandclicksigninbutton(String e,String p) throws Exception {
		 MyaccountpageSpringLocators.email.sendKeys(e);
		 MyaccountpageSpringLocators.password.sendKeys(p);
		 MyaccountpageSpringLocators.clicksignin.click();
		 Thread.sleep(3000);
	 }
	
}
