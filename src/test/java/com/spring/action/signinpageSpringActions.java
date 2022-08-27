package com.spring.action;

import com.spring.locator.signinpageSpringLocators;
import com.spring.utility.base_class_spring;

import junit.framework.Assert;

public class signinpageSpringActions extends base_class_spring{

	signinpageSpringLocators SigninpageSpringLocators = new signinpageSpringLocators();
	
	public void Verifyspringusersigninhasbeensuccessful() throws Exception {
		boolean verifyuser = SigninpageSpringLocators.accountuser.isDisplayed();
		Assert.assertTrue(verifyuser);
		Thread.sleep(3000);
	}
}
