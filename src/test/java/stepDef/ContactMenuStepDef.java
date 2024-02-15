package stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.ContactMenuPage;
import pages.HomePagePage;


public class ContactMenuStepDef {

    ContactMenuPage contactMenuPage;
    public ContactMenuStepDef(){
        this.contactMenuPage = new ContactMenuPage();

    }

    @Then("Verify that Contact Menu Pop-up window will be displayed")
    public void verifyThatContactMenuPopUpWindowWillBeDisplayed() throws InterruptedException {
        Thread.sleep(1000);
        contactMenuPage.verifyThatContactMenuPopUpWindowWillBeDisplayed();
    }

    @And("User fills the contact email {string}")
    public void userFillsTheContactEmail(String contactEmail) throws InterruptedException {
        Thread.sleep(1000);
        contactMenuPage.userFillsTheContactEmail(contactEmail);
    }

    @And("User fills the contact name {string}")
    public void userFillsTheContactName(String contactName) throws InterruptedException {
        Thread.sleep(1000);
        contactMenuPage.userFillsTheContactName(contactName);
    }

    @And("User fills the message {string}")
    public void userFillsTheMessage(String contactMessage) throws InterruptedException {
        Thread.sleep(1000);
        contactMenuPage.userFillsTheMessage(contactMessage);
    }

    @And("User clicks the Send Message button")
    public void userClicksTheSendMessageButton() throws InterruptedException {
        Thread.sleep(1000);
        contactMenuPage.userClicksTheSendMessageButton();
    }

    @Then("Verify the alert message {string}")
    public void verifyTheAlertMessage(String alertMessage) throws InterruptedException {
        Thread.sleep(1000);
        contactMenuPage.verifyTheAlertMessage(alertMessage);
    }

    @And("Verify that the Contact Menu Pop-up window is not displayed")
    public void verifyThatTheContactMenuPopUpWindowIsNotDisplayed() throws InterruptedException {
        Thread.sleep(1000);
        contactMenuPage.verifyThatTheContactMenuPopUpWindowIsNotDisplayed();

    }

    @And("User clicks the X button")
    public void userClicksTheXButton() throws InterruptedException {
        Thread.sleep(1000);
        contactMenuPage.userClicksTheXButton();
    }

    @And("User clicks the Close button")
    public void userClicksTheCloseButton() throws InterruptedException {
        Thread.sleep(1000);
        contactMenuPage.userClicksTheCloseButton();
    }
}
