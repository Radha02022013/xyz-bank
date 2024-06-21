package com.bank.pages;

import com.aventstack.extentreports.Status;
import com.bank.customlisteners.CustomListeners;
import com.bank.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class AccountPage extends Utility {


    @CacheLookup
    @FindBy(xpath = "//div[@ng-hide='noAccount']//button[2]")
    WebElement clickOnDepositeTopTab;

    @CacheLookup
    @FindBy(xpath = "//body/div[1]/div[1]/div[2]/div[1]/div[4]/div[1]/form[1]/div[1]/input[1]")
    WebElement enterAmountField;

    @CacheLookup
    @FindBy(xpath = "//button[@type='submit']")
    WebElement clickOnDepositeAfterAmountField;

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Deposit Successful')]")
    WebElement verifyMessage;

    @CacheLookup
    @FindBy(xpath = "//body/div[1]/div[1]/div[2]/div[1]/div[3]/button[3]")
    WebElement clickOnWithdrawTopTab;


    public void clickOnDepositeTab() {
        clickOnElement(clickOnDepositeTopTab);
        Reporter.log("click on deoposit" + clickOnDepositeTopTab);
        CustomListeners.test.log(Status.PASS, "click on deposit " + clickOnDepositeTopTab);
    }

    public void enter100InAmountField() {
        sendTextToElement(enterAmountField, "100");
        Reporter.log("click on deoposit" + clickOnDepositeTopTab);
        CustomListeners.test.log(Status.PASS, "click on deposit " + clickOnDepositeTopTab);
    }

    public void clickOnDepositeButton() {
        clickOnElement(clickOnDepositeAfterAmountField);
        Reporter.log("click on deoposit" + clickOnDepositeTopTab);
        CustomListeners.test.log(Status.PASS, "click on deposit " + clickOnDepositeTopTab);
    }

    public void ClickOnWithdrawTab() {
        clickOnElement(clickOnWithdrawTopTab);
        Reporter.log("click on deoposit" + clickOnDepositeTopTab);
        CustomListeners.test.log(Status.PASS, "click on deposit " + clickOnDepositeTopTab);
    }

    @CacheLookup
    @FindBy(tagName = "input")
    WebElement amountWithdraw;

    public void enterAmountInWithdrawField() {
        sendTextToElement(amountWithdraw, "50");
        Reporter.log("withdraw amount " + amountWithdraw.toString());
        CustomListeners.test.log(Status.PASS, "withdraw amount  " + amountWithdraw);
    }


    @CacheLookup
    @FindBy(xpath = "//body/div[1]/div[1]/div[2]/div[1]/div[4]/div[1]/form[1]/button[1]")
    WebElement clickOnWithdrawBtn;


    public void clickOnWithdrawButton() {
        clickOnElement(clickOnWithdrawBtn);
        Reporter.log("click on withdraw" + clickOnWithdrawBtn.toString());
        CustomListeners.test.log(Status.PASS, "click on withdraw " + clickOnWithdrawBtn);
    }


    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Deposit Successful')]")
    WebElement verifydepositTransactionSuccessful;

    public String verifyDepositTransactionSuccessful() {
        Reporter.log("verify transaction " + verifydepositTransactionSuccessful.toString());
        CustomListeners.test.log(Status.PASS, "verify transaction  " + verifydepositTransactionSuccessful);
        return getTextFromElement(verifydepositTransactionSuccessful);

    }

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Transaction successful')]")
    WebElement verifywithdrawTransactionSuccessful;

    public String verifywithdrawlTransactionSuccessful() {
        Reporter.log("verify transaction " + verifywithdrawTransactionSuccessful.toString());
        CustomListeners.test.log(Status.PASS, "verify transaction  " + verifywithdrawTransactionSuccessful);
        return getTextFromElement(verifywithdrawTransactionSuccessful);

    }

}
