package com.testing.stepdef;

import net.serenitybdd.screenplay.Actor;
import net.thucydides.core.annotations.Steps;

import com.testing.steps.GenericSteps;

import cucumber.api.java.en.Given;

public class StepDefinitions {

	@Steps
	GenericSteps steps;
	
	Actor actor = Actor.named("Roli");
	
	@Given("^User opens url in browser$")
	public void i_want_to_write_a_step_with_precondition() {
		steps.openBrowser(actor);
	}
	
	@Given("^User type text on field$")
	public void user_type_text_on_field() {
	    
	}
	
	@Given("^User click on field$")
	public void user_click_on_field() {
	    steps.click(actor);
	}


}
