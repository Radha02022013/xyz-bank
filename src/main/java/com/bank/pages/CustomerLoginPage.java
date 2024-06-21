package com.bank.pages;

import com.aventstack.extentreports.Status;
import com.bank.customlisteners.CustomListeners;
import com.bank.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class CustomerLoginPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Customer Login')]")
    WebElement customerLogin;

    public void clickOnCustomerLogin() {
        clickOnElement(customerLogin);
        Reporter.log("click on customer" + customerLogin.toString());
        CustomListeners.test.log(Status.PASS, "clcik on customer" + customerLogin);
    }

    @CacheLookup
    @FindBy(xpath = "//select[@id='userSelect']")
    WebElement customerField;

    public void searchCustomerField() {
        selectByVisibleTextFromDropDown(customerField, "Hermoine Granger");
        Reporter.log("search customer" + customerField.toString());
        CustomListeners.test.log(Status.PASS, "search customer" + customerField);
    }

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Login')]")
    WebElement loginButton;

    public void clickOnLoginButton() {
        clickOnElement(loginButton);
        Reporter.log("click on login " + loginButton.toString());
        CustomListeners.test.log(Status.PASS, "click on login" + loginButton);
    }

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Logout')]")
    WebElement vlogout;

    public String verifyLogOut() {
        Reporter.log("verify logout " + vlogout.toString());
        CustomListeners.test.log(Status.PASS, "verify logout" + vlogout);
        return getTextFromElement(vlogout);

    }

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Logout')]")
    WebElement logout;

    public void clickOnLogOut() {
        clickOnElement(vlogout);
        Reporter.log("click on logout " + logout.toString());
        CustomListeners.test.log(Status.PASS, "click on logout" + logout);
    }

    @CacheLookup
    @FindBy(xpath = "//label[contains(text(),'Your Name :')]")
    WebElement name;

    public void verifyName() {
        clickOnElement(name);
        Reporter.log("verify name " + name.toString());
        CustomListeners.test.log(Status.PASS, "verify name " + name);
    }
}