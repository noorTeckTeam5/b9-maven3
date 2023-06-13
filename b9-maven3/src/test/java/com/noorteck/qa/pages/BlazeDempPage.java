package com.noorteck.qa.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.noorteck.qa.util.Constants;

public class BlazeDempPage {
	@FindBy(id = "inputName")
	WebElement nameField;

	@FindBy(id = "address")
	WebElement addressField;

	@FindBy(id = "city")
	WebElement cityField;

	@FindBy(id = "state")
	WebElement stateField;

	@FindBy(id = "zipCode")
	WebElement zipcodeField;

	@FindBy(id = "cardType")
	WebElement SelectCardType;

	@FindBy(id = "creditCardNumber")
	WebElement creditCardNumberField;

	@FindBy(id = "creditCardMonth")
	WebElement monthField;

	@FindBy(id = "creditCardYear")
	WebElement yearField;

	@FindBy(id = "nameOnCard")
	WebElement nameOnCardField;

	@FindBy(id = "rememberMe")
	WebElement remeberCheckBox;

	@FindBy(xpath = "//input[@class='btn btn-primary']")
	WebElement purchaseFlightButton;
	
	@FindBy(xpath = "//h1[text() = 'Thank you for your purchase today!']")
	WebElement text;

	public BlazeDempPage() {
		PageFactory.initElements(Constants.driver, this);
	}

	public void enterName(String name) {
		nameField.sendKeys(name);
	}

	public void enterAddress(String Address) {
		addressField.sendKeys(Address);
	}

	public void enterCity(String city) {
		cityField.sendKeys(city);

	}

	public void enterState(String state) {
		stateField.sendKeys(state);
	}

	public void enterZipCode(String zipCode) {
		zipcodeField.sendKeys(zipCode);
	}

	public void selectCardType(String cardType) {
		Select select = new Select(SelectCardType);
		List<WebElement> options = select.getOptions();

		for (WebElement card : options) {
			String cardText = card.getText();
			if (cardText.equals(cardType)) {
				card.click();
				break;
			}
		}
	}

	public void enterCardNumber(String cardNumber) {
		creditCardNumberField.sendKeys(cardNumber);
	}

	public void enterMonth(String month) {
		monthField.sendKeys(month);
	}

	public void enterYear(String year) {
		yearField.sendKeys(year);
	}

	public void enterNameOnTheCard(String nameOnCard) {
		nameOnCardField.sendKeys(nameOnCard);
	}

	public void clickRemeberMe() {
		remeberCheckBox.click();
	}

	public void clickFlightPurchase() {
		purchaseFlightButton.click();
	}
	public String getText() {
		return text.getText();
	}
	
}
