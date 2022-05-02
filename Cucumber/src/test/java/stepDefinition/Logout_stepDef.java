package stepDefinition;

import java.util.concurrent.TimeUnit;



import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Logout_stepDef {
	
	@Given("^User is on Home Page$")
	public void User_is_on_Home_Page() throws Throwable {
		System.out.println("Launch the browser");
		System.out.println("User is on Home Page");
	    
	}

	@When("^User Navigate to LogIn Page$")
	public void User_Navigate_to_LogIn_Page() throws Throwable {
		System.out.println("User Navigate to LogIn Page");
	   
	}

	@When("^User enters UserName and Password$")
	public void User_enters_UserName_and_Password() throws Throwable {
		System.out.println("User enters UserName and Password");
	    
	}

	@Then("^Message displayed Login Successfully$")
	public void Message_displayed_Login_Successfully() throws Throwable {
		System.out.println("Message displayed Login Successfully");
	   
	}

	@When("^User LogOut from the Application$")
	public void User_LogOut_from_the_Application() throws Throwable {
		System.out.println("User LogOut from the Application");
	    
	}

	@Then("^Message displayed LogOut Successfully$")
	public void Message_displayed_LogOut_Successfully() throws Throwable {
		System.out.println("Message displayed LogOut Successfully");
		System.out.println("Close the browser");
	   
	}



}
