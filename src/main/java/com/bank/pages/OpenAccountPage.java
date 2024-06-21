package com.bank.pages;

import com.aventstack.extentreports.Status;
import com.bank.customlisteners.CustomListeners;
import com.bank.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;


public class OpenAccountPage extends Utility {


    @CacheLookup
    @FindBy(xpath = "//body/div[1]/div[1]/div[2]/div[1]/div[1]/button[2]")
    WebElement openAccount;

    @CacheLookup
    @FindBy(id = "userSelect")
    WebElement selectCustomerCreated;

    @CacheLookup
    @FindBy(id = "currency")
    WebElement selectCurrency;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Process')]")
    WebElement clickOnProcessBtn;

    public void clickOnOpenAccountTab() {
        clickOnElement(openAccount);
        Reporter.log("click on open account" + openAccount.toString());
        CustomListeners.test.log(Status.PASS, "click on open account " + openAccount);
    }

    public void selectCustomerCreatedFromDropDownList() {
        selectByVisibleTextFromDropDown(selectCustomerCreated, "Hermoine Granger");
        Reporter.log("Select customer" + selectCustomerCreated.toString());
        CustomListeners.test.log(Status.PASS, "select customer" + selectCustomerCreated);
    }

    public void selectCurrencyFromDropDownList() {
        selectByVisibleTextFromDropDown(selectCurrency, "Pound");
        Reporter.log("Select currency" + selectCurrency.toString());
        CustomListeners.test.log(Status.PASS, "select currency" + selectCurrency);
    }

    public void clickOnProcessButton() {
        clickOnElement(clickOnProcessBtn);
        Reporter.log("click on button " + clickOnProcessBtn.toString());
        CustomListeners.test.log(Status.PASS, "click on button " + clickOnProcessBtn);
    }

}

