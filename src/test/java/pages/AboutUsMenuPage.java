package pages;


import org.openqa.selenium.By;

import static helper.Utility.driver;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class AboutUsMenuPage {

    By aboutUsMenuPopUpWindow = By.xpath("//div[@id='videoModal'] /child::div[@class='modal-dialog'] /child:: div[@class='modal-content']");
    By playButtonVideo = By.xpath("//button[@title='Play Video']");
    //By videoControlBar = By.xpath("//div[@class='vjs-control-bar']");
    By videoPausedIndicator = By.xpath("//button[@class='vjs-play-control vjs-control vjs-button vjs-paused']");
    By videoPlayedIndicator = By.xpath("//button[@class='vjs-play-control vjs-control vjs-button vjs-playing']");
    By soundOnIndicator = By.xpath("//button[@title='Mute']");
    By soundOffIndicator = By.xpath("//button[@title='Unmute']");
    By durationSkipIndicator = By.xpath("//div[@aria-label='Progress Bar' and @aria-valuetext='08:32 of 18:40']");
    By aboutUsXButton = By.xpath("//div[@id='videoModal']//span[@aria-hidden='true'][normalize-space()='×']");
    By aboutUsCloseButton = By.xpath("//div[@id='videoModal']//button[@class='btn btn-secondary'][normalize-space()='Close']");

    public void verifyThatAboutUsPopUpWindowWillBeDisplayed(){
        driver.findElement(aboutUsMenuPopUpWindow).isDisplayed();
    }

    public void userClicksThePlayVideoButton(){
        driver.findElement(playButtonVideo).click();
    }

    public void verifyTheVideoIsPlayed(){
        driver.findElement(videoPlayedIndicator).isDisplayed();
    }

    public void userClicksThePauseVideoButton(){
        driver.findElement(videoPlayedIndicator).click();
    }

    public void verifyTheVideoIsPaused(){
        driver.findElement(videoPausedIndicator).isDisplayed();
    }

    public void userClicksOnTheMuteButton(){
        driver.findElement(soundOnIndicator).click();
    }

    public void verifyTheAudioIsOnMute(){
        driver.findElement(soundOffIndicator).isDisplayed();
    }

    public void userClicksOnTheUnmuteButton(){
        driver.findElement(soundOffIndicator).click();
    }

    public void verifyTheAudioIsOnUnmute(){
        driver.findElement(soundOnIndicator).isDisplayed();
    }

    public void userClicksOnTheVideoTimePoint(){
        driver.findElement(durationSkipIndicator).click();
    }

    public void verifyVideoIsSkipped(){
        driver.findElement(durationSkipIndicator).isDisplayed();
    }

    public void userClicksTheXButtonOnAboutUsPopUpWindow(){
        driver.findElement(aboutUsXButton).click();
    }

    public void verifyThatTheAboutUsPopUpWindowIsNotDisplayed(){
        assertFalse(driver.findElement(aboutUsMenuPopUpWindow).isDisplayed());
    }

    public void userClicksTheCloseButtonOnAboutUsPopUpWindow(){
        driver.findElement(aboutUsCloseButton).click();
    }
}
