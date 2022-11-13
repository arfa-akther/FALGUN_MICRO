/*Arfa Akther*/
package com.spring.TestRunner;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.spring.utility.base_class_spring;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = {"src/test/resourcesS/FeaturesSpring"} , //NEVER PUT SPACE AFTER 
plugin = {"json:target/cucumber.json"},
glue = "StepDefinitionSpring",tags= {"@southeast"})
//glue = "StepDefinitionSpring")

public class TestRunnerSpringClass extends AbstractTestNGCucumberTests {
	
	@BeforeTest
	public void startURLspr () {
		base_class_spring springObj = new base_class_spring();
		springObj.initBrowserSpring();
		
		
	}
	
	
	@AfterTest
	public void closeURLspr(){
		base_class_spring springObj = new base_class_spring();
		springObj.driver.quit();	
	}
	
	
	

}