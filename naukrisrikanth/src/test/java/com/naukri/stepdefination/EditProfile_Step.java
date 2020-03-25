package com.naukri.stepdefination;

import com.naukri.pages.EditProfile_main;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class EditProfile_Step extends EditProfile_main {

	@Given("^usera launched the chrome browser$")
	public void usera_launched_the_chrome_browser() throws Throwable {
		setup();
	}

	@Given("^usera opens naukri homepage$")
	public void usera_opens_naukri_homepage() throws Throwable {
		urla();
	}

	@Given("^usera clicks login$")
	public void usera_clicks_login() throws Throwable {
		logina();
	}


	@Then("^Hovers on MyNaukri and clicks EditProfile$")
	public void hovers_on_MyNaukri_and_clicks_EditProfile() throws Throwable {

		movetoMyNaukri();

	}


}
