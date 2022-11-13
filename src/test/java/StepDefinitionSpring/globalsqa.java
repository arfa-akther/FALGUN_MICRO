package StepDefinitionSpring;

import com.spring.action.globalsqaAction;
import com.spring.utility.base_class_spring;

import cucumber.api.java.en.Then;

public class globalsqa extends base_class_spring {
	
	globalsqaAction GlobalsqaAction = new globalsqaAction();
	
	@Then("^click on Tabs button$")
	public void click_on_Tabs_button() throws Throwable {
		GlobalsqaAction.clickonTabsbutton(); 
	}
	
	@Then("^switch to iframe and click on section(\\d+)$")
	public void switch_to_iframe_and_click_on_section(int arg1) throws Throwable {
		GlobalsqaAction.switchtoiframeandclickonsection();
	}
	@Then("^Click on Re-Size Accordion$")
	public void click_on_Re_Size_Accordion() throws Throwable {
		GlobalsqaAction.clickonReSizeAccordion();
	}
	
//drag drop	
	@Then("^Click on draganddrop$")
	public void click_on_draganddrop() throws Throwable {
		GlobalsqaAction.Clickondraganddrop();
	}

	@Then("^perform drag drop$")
	public void perform_drag_drop() throws Throwable {
		GlobalsqaAction.performdragdrop();
	}
	
	@Then("^click trash$")
	public void click_trash() throws Throwable {
		GlobalsqaAction.clicktrash();
	}
	
	@Then("^find all broken links$")
	public void find_all_broken_links() throws Throwable {
		GlobalsqaAction.findallbrokenlinks();
	}

//Multiple windows	
	@Then("^click on windows$")
	public void click_on_windows() throws Throwable {
		GlobalsqaAction.clickonwindows();
	}

	@Then("^in openNewTab click on clickHere option$")
	public void in_openNewTab_click_on_clickHere_option() throws Throwable {
		GlobalsqaAction.inopenNewTabclickonclickHereoption();
	}

//	@Then("^click openNewWindow click on clickHere option$")
//	public void click_openNewWindow_click_on_clickHere_option() throws Throwable {
//		GlobalsqaAction.clickopenNewWindowclickonclickHereoption();
//	}


}

