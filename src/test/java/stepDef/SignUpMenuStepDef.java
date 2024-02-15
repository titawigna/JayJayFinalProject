package stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.SignUpPage;

public class SignUpMenuStepDef {

    SignUpPage signUpPage;

    public SignUpMenuStepDef(){
        this.signUpPage = new SignUpPage();
    }

    @Then("Verify that Sign Up Menu Pop-up window will be displayed")
    public void verifyThatSignUpMenuPopUpWindowWillBeDisplayed() throws InterruptedException {
        Thread.sleep(1000);
        signUpPage.verifyThatSignUpMenuPopUpWindowWillBeDisplayed();
    }

    @And("User clicks the X button on Sign Up pop-up window")
    public void userClicksTheXButtonOnSignUpPopUpWindow() {
        signUpPage.userClicksTheXButtonOnSignUpPopUpWindow();
    }


    @Then("Verify that the Sign Up Pop-up window is not displayed")
    public void verifyThatTheSignUpPopUpWindowIsNotDisplayed() throws InterruptedException {
        Thread.sleep(1000);
        signUpPage.verifyThatTheSignUpPopUpWindowIsNotDisplayed();
    }

    @And("User clicks the Close button on Sign Up pop-up window")
    public void userClicksTheCloseButtonOnSignUpPopUpWindow() throws InterruptedException {
        Thread.sleep(1000);
        signUpPage.userClicksTheCloseButtonOnSignUpPopUpWindow();
    }

    @And("User fills in the new Sign Up username")
    public void userFillsInTheNewSignUpUsername() {
        signUpPage.userFillsInTheNewSignUpUsername();
    }

    @And("User fills in the Sign Up password {string}")
    public void userFillsInTheSignUpPassword(String signUpPassword) {
        signUpPage.userFillsInTheSignUpPassword(signUpPassword);
    }

    @And("User clicks the Sign Up button")
    public void userClicksTheSignUpButton() {
        signUpPage.userClicksTheSignUpButton();
    }

    @And("User fills in the Sign Up username {string}")
    public void userFillsInTheSignUpUsername(String signUpUsername) {
        signUpPage.userFillsInTheSignUpUsername(signUpUsername);
    }


    @And("User fills in the Sign Up username with more than 99 characters")
    public void userFillsInTheSignUpUsernameWithMoreThanCharacters() {
        signUpPage.userFillsInTheSignUpUsernameWithMoreThanCharacters();
    }
}
