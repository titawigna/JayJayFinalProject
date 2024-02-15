package pages;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;

import static helper.Utility.driver;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class ContactMenuPage {

    By contactMenuPopUpWindow = By.xpath("//div[@id='exampleModal'] /child::div[@class='modal-dialog'] /child:: div[@class='modal-content']");
    By contactEmailTextBox = By.id("recipient-email");
    By contactNameTextBox = By.id("recipient-name");
    By contactMessageTextBox = By.id("message-text");
    By sendMessageButton = By.xpath("//button[@onclick='send()' and text()='Send message']");
    By contactXButton = By.xpath("//div[@id='exampleModal']//span[@aria-hidden='true'][normalize-space()='×']");
    By contactCloseButton = By.xpath("//div[@id='exampleModal']//button[@class='btn btn-secondary'][normalize-space()='Close']");


    public void verifyThatContactMenuPopUpWindowWillBeDisplayed(){
        driver.findElement(contactMenuPopUpWindow).isDisplayed();
    }

    public void userFillsTheContactEmail(String contactEmail){
        driver.findElement(contactEmailTextBox).sendKeys(contactEmail);
    }

    public void userFillsTheContactName(String contactName){
        driver.findElement(contactNameTextBox).sendKeys(contactName);
    }

    public void userFillsTheMessage(String contactMessage){
        driver.findElement(contactMessageTextBox).sendKeys(contactMessage);
    }

    public void userClicksTheSendMessageButton(){
        driver.findElement(sendMessageButton).click();
    }

    public void verifyTheAlertMessage(String alertMessage){
        String expectedAlertMessage = alertMessage;
        String actualAlertMessage = driver.switchTo().alert().getText();
        //System.out.println(actualAlertMessage);

        driver.switchTo().alert().accept();
        assertEquals(expectedAlertMessage, actualAlertMessage);
    }

    public void verifyThatTheContactMenuPopUpWindowIsNotDisplayed(){
        assertFalse(driver.findElement(contactMenuPopUpWindow).isDisplayed());
    }

    public void userClicksTheXButton(){
        driver.findElement(contactXButton).click();
    }

    public void userClicksTheCloseButton(){
        driver.findElement(contactCloseButton).click();
    }


}
