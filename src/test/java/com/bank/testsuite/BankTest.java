package com.bank.testsuite;

import com.bank.customlisteners.CustomListeners;
import com.bank.pages.*;
import com.bank.testbase.BaseTest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListeners.class)
public class BankTest extends BaseTest {

    private static final Logger log = LoggerFactory.getLogger(BankTest.class);
    AccountPage accountPage;
    HomePage homePage;
    BankManagerLoginPage bankManagerLoginPage;
    CustomerLoginPage customerLoginPage;
    CustomersPage customersPage;
    OpenAccountPage openAccountPage;
    AddCustomerPage addCustomerPage;

    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        accountPage = new AccountPage();
        homePage = new HomePage();
        bankManagerLoginPage = new BankManagerLoginPage();
        customerLoginPage = new CustomerLoginPage();
        customersPage = new CustomersPage();
        openAccountPage = new OpenAccountPage();
        addCustomerPage = new AddCustomerPage();
    }

    /*
    1.bankManagerShouldAddCustomerSuccessfully.
    click On "Bank Manager Login" Tab
	click On "Add Customer" Tab
	enter FirstName
	enter LastName
	enter PostCode
	click On "Add Customer" Button
	popup display
	verify message "Customer added successfully"
	click on "ok" button on popup.
     */

    @Test(groups = {"sanity", "regression"})
    public void bankManagerShouldAddCustomerSuccessfully() {
        bankManagerLoginPage.clickManagerLogin();
        addCustomerPage.clickOnAddCustomer();
        addCustomerPage.addFirstName("anjana");
        addCustomerPage.setAddLastName("patel");
        addCustomerPage.enterPostCode("Tw1 3qd");
        addCustomerPage.clickOnAddCustomerButton();
        addCustomerPage.verifyMessageInPopupWindow();
        addCustomerPage.popupDisplay();
        addCustomerPage.clickOnOkButtInPopup();

    }
    /*
2. bankManagerShouldOpenAccountSuccessfully.
	click On "Bank Manager Login" Tab
	click On "Open Account" Tab
	Search customer that created in first test
	Select currency "Pound"
	click on "process" button
	popup displayed
	verify message "Account created successfully"
	click on "ok" button on popup.
	*/

    @Test(groups = {"Smoke", "regression"})
    public void bankManagerShouldOpenAccountSuccessfully() {
        bankManagerLoginPage.clickManagerLogin();
        openAccountPage.clickOnOpenAccountTab();
        openAccountPage.selectCustomerCreatedFromDropDownList();
        openAccountPage.selectCurrencyFromDropDownList();
        openAccountPage.clickOnProcessButton();
        addCustomerPage.popupDisplay();
        addCustomerPage.verifyMessageInPopupWindow();
        addCustomerPage.clickOnOkButtInPopup();
    }

    /*
    3. customerShouldLoginAndLogoutSuceessfully.
	click on "Customer Login" Tab
	search customer that you created.
	click on "Login" Button
	verify "Logout" Tab displayed.
	click on "Logout"
	verify "Your Name" text displayed.
     */


    @Test(groups = {"regression"})
    public void customerShouldLoginAndLogoutSuceessfully() {
        customerLoginPage.clickOnCustomerLogin();
        customerLoginPage.searchCustomerField();
        customerLoginPage.clickOnLoginButton();
        customerLoginPage.verifyLogOut();
        customerLoginPage.clickOnLogOut();
        customerLoginPage.verifyName();
    }

    /*
    4. customerShouldDepositMoneySuccessfully.
	click on "Customer Login" Tab
	search customer that you created.
	click on "Login" Button
	click on "Deposit" Tab
	Enter amount 100
	click on "Deposit" Button
	verify message "Deposit Successful"
     */


    @Test(groups = {"regression"})
    public void customerShouldDepositMoneySuccessfully() {
        customerLoginPage.clickOnCustomerLogin();
        customerLoginPage.searchCustomerField();
        customerLoginPage.clickOnLoginButton();
        accountPage.clickOnDepositeTab();
        accountPage.enter100InAmountField();
        accountPage.clickOnDepositeButton();
        accountPage.verifyDepositTransactionSuccessful();

    }
    /*
    5. customerShouldWithdrawMoneySuccessfully
	click on "Customer Login" Tab
	search customer that you created.
	click on "Login" Button
	click on "Withdrawl" Tab
	Enter amount 50
	click on "Withdraw" Button
	verify message "Transaction Successful"
     */

    @Test(groups = {"regression"})
    public void customerShouldWithdrawMoneySuccessfully() {
        customerLoginPage.clickOnCustomerLogin();
        customerLoginPage.searchCustomerField();
        customerLoginPage.clickOnLoginButton();
        accountPage.ClickOnWithdrawTab();
        accountPage.enterAmountInWithdrawField();
        accountPage.clickOnWithdrawButton();
        accountPage.verifywithdrawlTransactionSuccessful();
    }
}