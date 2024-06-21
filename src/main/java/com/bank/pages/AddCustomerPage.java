package com.bank.pages;

import com.aventstack.extentreports.Status;
import com.bank.customlisteners.CustomListeners;
import com.bank.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class AddCustomerPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//body/div[1]/div[1]/div[2]/div[1]/div[1]/button[1]")
    WebElement addCustomer;

    public void clickOnAddCustomer() {
        clickOnElement(addCustomer);
        Reporter.log("click on add customer" + addCustomer.toString());
        CustomListeners.test.log(Status.PASS, "click on add customer" + addCustomer);
    }

    @CacheLookup
    @FindBy(xpath = "//body/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/input[1]")
    WebElement addName;

    public void addFirstName(String name) {
        sendTextToElement(addName, name);
        Reporter.log("click on add name" + addName.toString());
        CustomListeners.test.log(Status.PASS, "click on add name" + addName);
    }

    @CacheLookup
    @FindBy(xpath = "//body/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/input[1]")
    WebElement addLastName;

    public void setAddLastName(String lastName) {
        sendTextToElement(addLastName, lastName);
        Reporter.log("click on add name" + addLastName.toString());
        CustomListeners.test.log(Status.PASS, "click on add name" + addLastName);
    }

    @CacheLookup
    @FindBy(xpath = "//body/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/div[3]/input[1]")
    WebElement addPost;

    public void enterPostCode(String postCode) {
        sendTextToElement(addPost, postCode);
        Reporter.log("click on add postcode" + addPost.toString());
        CustomListeners.test.log(Status.PASS, "click on add postcode" + addPost);
    }

    @CacheLookup
    @FindBy(xpath = "//body/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/button[1]")
    WebElement addCustomerButton;

    public void clickOnAddCustomerButton() {
        clickOnElement(addCustomerButton);
        Reporter.log("click on add button " + addCustomerButton.toString());
        CustomListeners.test.log(Status.PASS, "click on add button" + addCustomerButton);
    }

    // verify the message in popup Alert
    public String verifyMessageInPopupWindow() {
        return getTextFromAlert();

    }

    //	popup display
    public void popupDisplay() {
        switchToAlert();
    }

    public void clickOnOkButtInPopup() {
        switchToAcceptAlert();
    }

}
