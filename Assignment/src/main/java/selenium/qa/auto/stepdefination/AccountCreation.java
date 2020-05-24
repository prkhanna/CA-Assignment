package selenium.qa.auto.stepdefination;

import static selenium.qa.auto.modules.Hooks.misc;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import selenium.qa.auto.pages.AuthenticationPage;
import selenium.qa.auto.pages.HomePage;
import selenium.qa.auto.pages.PersonalInfoPage;

public class AccountCreation {
	
	private static String createdEmail;

	@Then("^Enter the email$")
	public void enter_the_email() throws Throwable {
		String emailID = generatedEmail();
		createdEmail =  emailID;
		misc.elementSendKeys(AuthenticationPage.newEmail, emailID);
	}

	@Then("^Click on createAccount$")
	public void click_on_createAccount() throws Throwable {
		misc.elementClick(AuthenticationPage.creatAccountBtn);
	}


	@Given("^click on sigin$")
	public void click_on_sigin() throws Throwable {
		misc.elementClick(HomePage.signIn);
	}

	@Then("^user enters username and password$")
	public void user_enters_username_and_password() throws Throwable {
		misc.elementSendKeys(AuthenticationPage.existingEmail, createdEmail);
		misc.elementSendKeys(AuthenticationPage.password, "test123");
	}

	

	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button() throws Throwable {
		misc.elementClick(AuthenticationPage.signInButton);
	}

	@Then("^Click on title$")
	public void click_on_title() throws Throwable {
		misc.elementClick(PersonalInfoPage.titleRadio);
	}

	@Then("^Enter the first name$")
	public void enter_the_first_name() throws Throwable {
		misc.elementSendKeys(PersonalInfoPage.firstName, "Cross");
	}

	@Then("^Enter the last name$")
	public void enter_the_last_name() throws Throwable {
		misc.elementSendKeys(PersonalInfoPage.lastName, "Assyst");	}

	@Then("^Enter the password$")
	public void enter_the_password() throws Throwable {
		misc.elementSendKeys(PersonalInfoPage.password, "test123");
	}

	@Then("^Enter the address$")
	public void enter_the_address() throws Throwable {
		misc.elementSendKeys(PersonalInfoPage.address, "Beverly Park");
	}

	@Then("^Enter the city$")
	public void enter_the_city() throws Throwable {
		misc.elementSendKeys(PersonalInfoPage.city, "Mumbai");
	}

	@Then("^Enter the state$")
	public void enter_the_state() throws Throwable {
		misc.selectByText(PersonalInfoPage.state, "Alabama");
	}

	@Then("^Enter the zipcode$")
	public void enter_the_zipcode() throws Throwable {
		misc.elementSendKeys(PersonalInfoPage.zipcode, "40110");
	}

	@Then("^Enter the country$")
	public void enter_the_country() throws Throwable {
		misc.selectByText(PersonalInfoPage.country, "United States");
	}

	@Then("^Enter the mobileno$")
	public void enter_the_mobileno() throws Throwable {
		misc.elementSendKeys(PersonalInfoPage.phoneMobile, "123456789");
	}

	@Then("^click on register$")
	public void click_on_register() throws Throwable {
		misc.elementClick(PersonalInfoPage.registerButton);
	}

	@Then("^click on signout$")
	public void click_on_signout() throws Throwable {
		misc.elementClick(HomePage.signOut);
	}
	
	private String generatedEmail() {
		String userName = ""+(int)(Math.random()*Integer.MAX_VALUE);
		 String emailID = "User"+userName+"@expl.com";
		return emailID;
	}

}
