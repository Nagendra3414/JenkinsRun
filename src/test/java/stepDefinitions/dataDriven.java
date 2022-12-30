package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class dataDriven {



	@Then("Enter the username {string}")
	public void enter_the_username(String username) {
	 
	
		
		// Write code here that turns the phrase above into concrete actions
	   System.out.println(username);
	}
	@Then("Add the password {string}")
	public void add_the_password(String password) {
	    // Write code here that turns the phrase above into concrete actions
		 System.out.println(password);
	}

  
}
