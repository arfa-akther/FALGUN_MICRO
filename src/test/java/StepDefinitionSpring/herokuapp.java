package StepDefinitionSpring;

import com.spring.action.herokuappAction;
import com.spring.utility.base_class_spring;

import cucumber.api.java.en.Then;

public class herokuapp extends base_class_spring{

	herokuappAction HerokuappAction = new herokuappAction();
	
	@Then("^click on context Menu$")
	public void click_on_context_Menu() throws Throwable {
		HerokuappAction.clickoncontextMenu(); 	
	}	
	
	@Then("^right click on the given box and accept OK popup alert$")
	public void right_click_on_the_given_box_and_accept_OK_popup_alert() throws Throwable {
		HerokuappAction.rightclickonthegivenboxandacceptOKpopupalert(); 
	}
	
//digest authentication , basic is same
	@Then("^click on digest Authentication$")
	public void click_on_digest_Authentication() throws Throwable {
		HerokuappAction.clickondigestAuthentication();
	}

	@Then("^enter username pass to perfrom the action$")
	public void enter_username_pass_to_perfrom_the_action() throws Throwable {
		HerokuappAction.enterusernamepasstoperfromtheaction();
	}
	
// file or image upload
	@Then("^click on file upload$")
	public void click_on_file_upload() throws Throwable {
		HerokuappAction.clickonfileupload();
	}

	@Then("^click on choose file to select file$")
	public void click_on_choose_file_to_select_file() throws Throwable {
		HerokuappAction.clickonchoosefiletoselectfile();
	}

	@Then("^click upload$")
	public void click_upload() throws Throwable {
		HerokuappAction.clickupload();
	}
	
//Dropdown
	@Then("^click on dropdown$")
	public void click_on_dropdown() throws Throwable {
		HerokuappAction.clickondropdown();
	}

	@Then("^Select dropdown$")
	public void select_dropdown() throws Throwable {
		HerokuappAction.Selectdropdown();
	}
	
//Frames
	
	@Then("^click on frames$")
	public void click_on_frames() throws Throwable {
		HerokuappAction.clickonframes();
	}

	@Then("^click on Nested frames$")
	public void click_on_Nested_frames() throws Throwable {
		HerokuappAction.clickonNestedframes(); 
	}

	@Then("^Work on frames$")
	public void work_on_frames() throws Throwable {
		HerokuappAction.Workonframes();
	}
	
//checkboxes	
	
	@Then("^click on checkboxes option$")
	public void click_on_checkboxes_option() throws Throwable {
		HerokuappAction.clickoncheckboxesoption(); 
	}

	@Then("^verify checkbox displayed then select checkbox$")
	public void verify_checkbox_displayed_then_select_checkbox() throws Throwable {
		HerokuappAction.verifycheckboxdisplayedthenselectcheckbox();
	}

	@Then("^verify checkbox is pre selected$")
	public void verify_checkbox_is_pre_selected() throws Throwable {
		HerokuappAction.verifycheckboxispreselected(); 
	}

	@Then("^verify checkbox enabled OR not Pre Selected then select checkbox$")
	public void verify_checkbox_enabled_OR_not_Pre_Selected_then_select_checkbox() throws Throwable {
		HerokuappAction.verifycheckboxenabledORnotPreSelectedthenselectcheckbox();
	}
	
//	current link,all links, page resources & title , print value
	
	@Then("^get current link and all links including the total$")
	public void get_current_link_and_all_links_including_the_total() throws Throwable {
		HerokuappAction.getcurrentlinkandalllinksincludingthetotal();
	}

	@Then("^get page resources and page title$")
	public void get_page_resources_and_page_title() throws Throwable {
		HerokuappAction.getpageresourcesandpagetitle();
	}
	
// Form Authentication
	
	@Then("^click on Form Authentication$")
	public void click_on_Form_Authentication() throws Throwable {
		HerokuappAction.clickonFormAuthentication();
	}

	@Then("^click enter username and passowrd  and click login and print value username$")
	public void click_enter_username_and_passowrd_and_click_login_and_print_value_username() throws Throwable {
		HerokuappAction.clickenterusernameandpassowrdandclickloginandprintvalueusername();

  }
	//mouse over
	
		@Then("^click on hovers$")
		public void click_on_hovers() throws Throwable {
			HerokuappAction.clickonhovers(); 
		}

		@Then("^mouseover on images$")
		public void mouseover_on_images() throws Throwable {
			HerokuappAction.mouseoveronimages();
		}

//drag and drop		
		@Then("^Click on drag and drop$")
		public void click_on_drag_and_drop() throws Throwable {
			HerokuappAction.Clickondraganddrop();
		}

		@Then("^perform drag$")
		public void perform_drag() throws Throwable {
			HerokuappAction.performdrag();
		}
		
}
