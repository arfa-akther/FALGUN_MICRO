package StepDefinitionSpring;

import com.spring.action.BofaSpringAcrrions;
import com.spring.utility.base_class_spring;

import cucumber.api.java.en.Then;

public class bofaSpring extends base_class_spring{
	BofaSpringAcrrions bofaSpringAcrrions = new BofaSpringAcrrions();	
	
	@Then("^click on home loans$")
	public void click_on_home_loans() throws Throwable {
		bofaSpringAcrrions.clickonhomeloans();
	}

	@Then("^click on find a home$")
	public void click_on_find_a_home() throws Throwable {
		bofaSpringAcrrions.clickonfindahome();
	}

	@Then("^click on New construction$")
	public void click_on_New_construction() throws Throwable {
		bofaSpringAcrrions.clickonNewconstruction();
	}

	@Then("^click monthly payment$")
	public void click_monthly_payment() throws Throwable {
		bofaSpringAcrrions.clickonMonthlypaymentcalculator();
	}
}
