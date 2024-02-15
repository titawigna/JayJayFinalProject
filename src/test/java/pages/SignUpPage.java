package pages;

import org.openqa.selenium.By;

import static helper.Utility.*;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class SignUpPage {

    By signUpMenuPopUpWindow = By.xpath("//div[@id='signInModal'] /child::div[@class='modal-dialog'] /child:: div[@class='modal-content']");
    By signUpXButton = By.xpath("//div[@id='signInModal']//span[@aria-hidden='true'][normalize-space()='×']");
    By signUpCloseButton = By.xpath("//div[@id='signInModal']//button[@class='btn btn-secondary'][normalize-space()='Close']");
    By signUpUsernameField = By.id("sign-username");
    By signUpPasswordField = By.id("sign-password");
    By signUpButton = By.xpath("//button[@onclick='register()'][normalize-space()='Sign up']");


    String newlyGeneratedUsername, newlyGeneratedUsername100;


    public void verifyThatSignUpMenuPopUpWindowWillBeDisplayed(){
        driver.findElement(signUpMenuPopUpWindow).isDisplayed();
    }

    public void userClicksTheXButtonOnSignUpPopUpWindow(){
        driver.findElement(signUpXButton).click();
    }

    public void verifyThatTheSignUpPopUpWindowIsNotDisplayed(){
        assertFalse(driver.findElement(signUpMenuPopUpWindow).isDisplayed());
    }

    public void userClicksTheCloseButtonOnSignUpPopUpWindow(){
        driver.findElement(signUpCloseButton).click();
    }

    public void userFillsInTheNewSignUpUsername(){
        newlyGeneratedUsername = generateRandomUsername();
        //System.out.println("Ini adalah username dari SignUpPage: "+newlyGeneratedUsername);
        driver.findElement(signUpUsernameField).sendKeys(newlyGeneratedUsername);

        setterUsername(newlyGeneratedUsername);
    }

    public void userFillsInTheSignUpPassword(String signUpPassword){
        driver.findElement(signUpPasswordField).sendKeys(signUpPassword);
    }

    public void userClicksTheSignUpButton(){
        driver.findElement(signUpButton).click();
    }

    public void userFillsInTheSignUpUsername(String signUpUsername){
        driver.findElement(signUpUsernameField).sendKeys(signUpUsername);
    }

    public void userFillsInTheSignUpUsernameWithMoreThanCharacters(){
        newlyGeneratedUsername100 = generateRandomUsername100();
        driver.findElement(signUpUsernameField).sendKeys(newlyGeneratedUsername100);

        System.out.println(newlyGeneratedUsername100);

        setterUsername100(newlyGeneratedUsername100);
    }

}
