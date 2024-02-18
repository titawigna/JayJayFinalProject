package pages;


import org.openqa.selenium.By;

import static helper.Utility.driver;
import static helper.Utility.getterUsername;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertFalse;


public class LogInPage {

    By logInMenuPopUpWindow = By.xpath("//div[@id='logInModal'] /child::div[@class='modal-dialog'] /child:: div[@class='modal-content']");
    By logInXButton = By.xpath("//div[@id='logInModal']//span[@aria-hidden='true'][normalize-space()='×']");
    By logInCloseButton = By.xpath("//div[@id='logInModal']//button[@class='btn btn-secondary'][normalize-space()='Close']");
    By logInUsernameField = By.id("loginusername");
    By logInPasswordField = By.id("loginpassword");
    By logInButton = By.xpath("//button[@onclick='logIn()' and text()='Log in']");
    By nameOfTheUserz = By.id("nameofuser");

    String newlyCreatedUsername;

    By nameofTheUser(String nameOfUserProfile){
        return By.xpath("//a[@id='nameofuser' and text()='Welcome "+nameOfUserProfile+"']");
    }


    public void verifyThatLogInMenuPopUpWindowWillBeDisplayed(){
        driver.findElement(logInMenuPopUpWindow).isDisplayed();
    }

    public void userClicksTheXButtonOnLogInPopUpWindow(){
        driver.findElement(logInXButton).click();
    }

    public void verifyThatTheLogInPopUpWindowIsNotDisplayed(){
        assertFalse(driver.findElement(logInMenuPopUpWindow).isDisplayed());
    }

    public void userClicksTheCloseButtonOnLogInPopUpWindow(){
        driver.findElement(logInCloseButton).click();
    }

    public void userFillsTheLogInUsername(String logInUsername){
        driver.findElement(logInUsernameField).sendKeys(logInUsername);
    }

    public void userFillsTheLogInPassword(String logInPassword){
        driver.findElement(logInPasswordField).sendKeys(logInPassword);
    }

    public void userClicksOnTheLogInButton(){
        driver.findElement(logInButton).click();
    }

    public void verifyUserHasBeenLoggedInAs(String nameOfUser){
        driver.findElement(nameofTheUser(nameOfUser)).isDisplayed();
    }

    HomePagePage homePagePage;
    SignUpPage signUpPage;
    public LogInPage(){
        this.homePagePage = new HomePagePage();
        this.signUpPage = new SignUpPage();
    }
    public void verifyUserHasBeenLoggedOut(){
        homePagePage.verifyTheMenusOfGlobalNavigationMenu();
    }


    public void userFillsTheLogInUsernameForNewlyCreatedAccount(){
        newlyCreatedUsername = getterUsername();
        //System.out.println("Ini adalah username dari LogInPage: "+newlyCreatedUsername);

        driver.findElement(logInUsernameField).sendKeys(newlyCreatedUsername);
    }

    public void verifyUserHasBeenLoggedInForNewlyCreatedAccount(){
        //driver.findElement(nameofTheUser(newlyCreatedUsername)).isDisplayed();
    }


}
