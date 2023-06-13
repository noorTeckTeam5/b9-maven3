package com.noorteck.qa.steps;

import org.openqa.selenium.chrome.ChromeDriver;

import com.noorteck.qa.pages.BlazeDempPage;
import com.noorteck.qa.util.Constants;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BlazeDemoSteps {
	BlazeDempPage obj;

	@Given("user navigates to Blaze Demo Purchase {string}")
	public void user_navigates_to_blaze_demo_purchase(String url) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		Constants.driver = new ChromeDriver();
		Thread.sleep(2000);
		Constants.driver.manage().window().maximize();
		Constants.driver.get(url);
		obj = new BlazeDempPage();
		Thread.sleep(2000);
	}

	@When("user enters first and last name {string}")
	public void user_enters_first_and_last_name(String name) {

		obj.enterName(name);

	}
	@When("User enters address {string}")
	public void user_enters_address(String address) {
	 obj.enterAddress(address);
	}
	@When("User enters city {string}")
	public void user_enters_city(String city) {
	   obj.enterCity(city);
	}

	@When("user enters state {string}")
	public void user_enters_state(String state) {
	    obj.enterState(state);
	}

	@When("User enters zipCode {string}")
	public void user_enters_zip_code(String zipcode) {
	    obj.enterZipCode(zipcode);
	}

	@When("User selects card type {string}")
	public void user_selects_card_type(String cardType) {
	  obj.selectCardType(cardType);
	}

	@When("User eneters card number {string}")
	public void user_eneters_card_number(String cardNumber) {
	   obj.enterCardNumber(cardNumber);
	}

	@When("User enters month {string}")
	public void user_enters_month(String month) {
	    obj.enterMonth(month);
	}

	@When("User enters year {string}")
	public void user_enters_year(String year) {
	   obj.enterYear(year);
	}

	@When("User enters name on the card {string}")
	public void user_enters_name_on_the_card(String nameOnCard) {
	   obj.enterNameOnTheCard(nameOnCard);
	}

	@When("User clicks on the Remeber me check box")
	public void user_clicks_on_the_remeber_me_check_box() {
	   obj.clickRemeberMe();
	}

	@When("User clicks on the purchase flight button")
	public void user_clicks_on_the_purchase_flight_button() {
	  obj.clickFlightPurchase();
	}
	@Then("User validate meesage {string}")
	public void user_validate_meesage(String message) {
	   String actualMessage = obj.getText();
	   
	   if(actualMessage.equals(message)) {
		   System.out.println("Testcase passed");
	   }else {
		   System.out.println("Testcase failed");
	   }
	}

}
