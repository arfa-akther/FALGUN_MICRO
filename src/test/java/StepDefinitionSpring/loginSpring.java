package StepDefinitionSpring;

import com.spring.action.homepageSpringActions;
import com.spring.action.myaccountpageSpringActions;
import com.spring.action.signinpageSpringActions;
import com.spring.utility.base_class_spring;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class loginSpring extends base_class_spring{

	homepageSpringActions HomepageSpringActions = new homepageSpringActions();
	myaccountpageSpringActions MyaccountpageSpringActions = new myaccountpageSpringActions();
	signinpageSpringActions SigninpageSpringActions = new signinpageSpringActions();
	
	@Given("^Launch spring \"([^\"]*)\" application$")
	public void launch_spring_application(String URL) throws Throwable {
	 getURLSPR (URL); 
	}

	@Then("^Click spring signin button$")
	public void click_spring_signin_button() throws Throwable {
		Thread.sleep(3000);
		HomepageSpringActions.Clickspringsigninbutton();
		
	}

	@Then("^Enter spring email address and password and click signin button$")
	public void enter_spring_email_address_and_password_and_click_signin_button() throws Throwable {
		MyaccountpageSpringActions.Enterspringemailaddressandpasswordandclicksigninbutton(propspring.getProperty("EMAILSPRING"),propspring.getProperty("PASSWORDSPRING"));
	}

	@Then("^Verify spring user signin has been successful$")
	public void verify_spring_user_signin_has_been_successful() throws Throwable {
		SigninpageSpringActions.Verifyspringusersigninhasbeensuccessful();
	}
	
	
	
}