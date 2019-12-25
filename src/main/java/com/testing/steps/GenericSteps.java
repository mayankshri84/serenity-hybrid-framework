package com.testing.steps;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Step;

import org.openqa.selenium.WebDriver;

public class GenericSteps {

	WebDriver driver;
	GenericPage page;

	@Step("{0} opens url in browser")
	public void openBrowser(Actor actor) {
		page.openAt("https://www.google.com");
	}
	
	@Step("{0} opens url in browser")
	public void click(Actor actor) {
		BrowseTheWeb.with(driver);
	}
}
