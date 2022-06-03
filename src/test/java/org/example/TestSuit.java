package org.example;

import org.testng.annotations.Test;

public class TestSuit  extends BaseTest{

    HomePage homePage = new HomePage();
    LogInPage logInPage = new LogInPage();
    ComputersPage computersPage = new ComputersPage();
    NotebooksPage notebooksPage = new NotebooksPage();
    AppleMacBookPro appleMacBookPro = new AppleMacBookPro();
    CartPage cartPage = new CartPage();
    CheckOutAsGuest checkOutAsGuest = new CheckOutAsGuest();
    ShippingDetails shippingDetails = new ShippingDetails();
    ProcessedSuccessfully processedSuccessfully = new ProcessedSuccessfully();

    @Test
    public void userShouldBeAbleToLoginSuccessfully()
    {
        // click on login button
        homePage.clickOnLogIn();

        //enter email address
        logInPage.enterEmailAddress();

        //enter password
        logInPage.enterPassword();

        //click on login button
        logInPage.clickOnLoginButton();
    }

    @Test
    public void userShouldBeAbleToAddProductSuccessfullyInShoppingCard() {

        //click on Computers
        homePage.clickOnComputers();

        // new class - click on Notebooks
        computersPage.clickOnNoteBooks();

        // new class- click on Apple MacBook Pro 13-inch
        notebooksPage.clickOnAppleMacBookPro();

        //new class - click on add to cart
        appleMacBookPro.clickOnAddToCartButton();

        //new class - click on shopping cart
        appleMacBookPro.clickOnShoppingCart();

        // click on T C button
        cartPage.radioButtonTC();

        // new class - click on checkout button
        cartPage.clickOnCheckOutButton();

        //click on checkout guest button
        checkOutAsGuest.clickOnCheckOutAsGuestButton();

        //new class- enter first name
        shippingDetails.enterFirstName();

        //enter last name
        shippingDetails.enterLastName();

        //enter email address
        shippingDetails.emailAddress();

        // select country
        shippingDetails.selectCountry();

        //enter city
        shippingDetails.enterCity();

        //enter address1
        shippingDetails.enterAddress1();

        //enter postal code
        shippingDetails.enterPostalCode();

        //enter phone number
        shippingDetails.enterPhoneNumber();

        // click on continue button
        shippingDetails.clickOnContinueButton();

        //click on continue button
        shippingDetails.clickOnCheckOutContinue();

        shippingDetails.clickOnCheckOutContinue1();

        shippingDetails.clickOnCheckOutContinue2();

        // click on confirm button
        shippingDetails.clickOnConfirmButton();

        //Assert
        processedSuccessfully.userVerifyOrderHasBeenSuccessfullyProcessed();

    }

}
