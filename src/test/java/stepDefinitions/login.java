package stepDefinitions;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import pages.EmailPage;

public class login {



	@Given("^Launching the browser$")
	public void launching_the_browser() {
		System.out.println("&&&&&&&&&&&&&&&&&&&&&*****************");
	
	
	}

	@Then("^Enter the username$")
	public void enter_the_username() {
		System.out.println();
	}

	@Then("^Enter the Password$")
	public void enter_the_password() {
		System.out.println("Password");
	}

	@Then("^click on login button$")
	public void click_on_login_button() {
		System.out.println("Login button");
	}

	@When("^close the browser$")
	public void close_the_browser() {
		System.out.println("Close");
		

	}

	@Then("Enter the username1")
	public void enter_the_username1() {
		System.out.println("Username1");
	}

	@Then("Enter the Password1")
	public void enter_the_password1() {
		System.out.println("password1");
	}

}
