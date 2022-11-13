/* Afra */
package com.spring.locator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.spring.utility.base_class_spring;

public class BofaSpringLocator extends base_class_spring {

	public BofaSpringLocator() {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(how=How.XPATH, using="/html/body/div[1]/div/div/section[2]/div/div/div[1]/div[1]/div/nav/ul/li[4]/a/span[3]")
	public WebElement clickHomeLoan;
	
	@FindBy(how=How.LINK_TEXT, using="Find a home")
	public WebElement findahome ;
	
	@FindBy(how=How.XPATH, using="//a[@name=\"home_37\"]")
	public WebElement NewConstructor;
	
	@FindBy(how=How.XPATH, using="/html/body/div[1]/div[2]/div/div/div[2]/div/div[2]/div/div[1]")
	public WebElement monthlyPayment;
}
