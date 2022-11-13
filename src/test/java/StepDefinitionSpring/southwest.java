package StepDefinitionSpring;

import org.apache.logging.log4j.*;

import com.spring.action.southwestAction;
import com.spring.utility.base_class_spring;
import com.spring.utility.screenshotSpring;

import cucumber.api.java.en.Then;



public class southwest extends base_class_spring {
	southwestAction SouthwestAction = new southwestAction();
	private static Logger demologger= LogManager.getLogger(southwestAction.class.getName());
	

	
	@Then("^Select departure date$")
	public void select_departure_date() throws Throwable {
		SouthwestAction.Selectdeparturedate();
		screenshotSpring.takescreenshot(driver, "Southwest Calender");
		demologger.info("SouthWest Successful");
		
	}

//	@Then("^Select return date$")
//	public void select_return_date() throws Throwable {
//		SouthwestAction.Selectreturndate();
//	}


}
