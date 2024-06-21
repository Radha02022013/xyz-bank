package com.bank.pages;

import com.aventstack.extentreports.Status;
import com.bank.customlisteners.CustomListeners;
import com.bank.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class BankManagerLoginPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Bank Manager Login')]")
    WebElement managerLogin;

    public void clickManagerLogin() {
        clickOnElement(managerLogin);
        Reporter.log("click on login " + managerLogin.toString());
        CustomListeners.test.log(Status.PASS, "click on login " + managerLogin);

    }
}
