package stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.LogInPage;

public class LogInMenuStepDef {

    LogInPage logInPage;

    public LogInMenuStepDef(){
        this.logInPage = new LogInPage();
    }

    @Then("Verify that Log In Menu Pop-up window will be displayed")
    public void verifyThatLogInMenuPopUpWindowWillBeDisplayed() throws InterruptedException {
        Thread.sleep(1000);
        logInPage.verifyThatLogInMenuPopUpWindowWillBeDisplayed();
    }

    @And("User clicks the X button on Log In pop-up window")
    public void userClicksTheXButtonOnLogInPopUpWindow() throws InterruptedException {
        Thread.sleep(1000);
        logInPage.userClicksTheXButtonOnLogInPopUpWindow();
    }

    @Then("Verify that the Log In Pop-up window is not displayed")
    public void verifyThatTheLogInPopUpWindowIsNotDisplayed() throws InterruptedException {
        Thread.sleep(1000);
        logInPage.verifyThatTheLogInPopUpWindowIsNotDisplayed();
    }

    @And("User clicks the Close button on Log In pop-up window")
    public void userClicksTheCloseButtonOnLogInPopUpWindow() throws InterruptedException {
        Thread.sleep(1000);
        logInPage.userClicksTheCloseButtonOnLogInPopUpWindow();
    }

    @And("User fills the Log In username {string}")
    public void userFillsTheLogInUsername(String logInUsername) {
        logInPage.userFillsTheLogInUsername(logInUsername);

    }

    @And("User fills the Log In password {string}")
    public void userFillsTheLogInPassword(String logInPassword) {
        logInPage.userFillsTheLogInPassword(logInPassword);
    }

    @And("User clicks on the Log In button")
    public void userClicksOnTheLogInButton() {
        logInPage.userClicksOnTheLogInButton();
    }

    @Then("Verify user has been logged in as {string}")
    public void verifyUserHasBeenLoggedInAs(String nameOfUser) throws InterruptedException {
        Thread.sleep(1000);
        logInPage.verifyUserHasBeenLoggedInAs(nameOfUser);
    }


    @Then("Verify user has been logged out")
    public void verifyUserHasBeenLoggedOut() throws InterruptedException {
        Thread.sleep(1000);
        logInPage.verifyUserHasBeenLoggedOut();
    }

    @And("User fills the Log In username for newly created account")
    public void userFillsTheLogInUsernameForNewlyCreatedAccount() throws InterruptedException {
        Thread.sleep(1000);
        logInPage.userFillsTheLogInUsernameForNewlyCreatedAccount();
    }

    @Then("Verify user has been logged in for newly created account")
    public void verifyUserHasBeenLoggedInForNewlyCreatedAccount() throws InterruptedException {
        Thread.sleep(1000);
        logInPage.verifyUserHasBeenLoggedInForNewlyCreatedAccount();
    }
}
