package stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.AboutUsMenuPage;


public class AboutUsMenuStepDef {

    AboutUsMenuPage aboutUsMenuPage;

    public AboutUsMenuStepDef(){
        this.aboutUsMenuPage = new AboutUsMenuPage();
    }

    @Then("Verify that About Us Pop-up window will be displayed")
    public void verifyThatAboutUsPopUpWindowWillBeDisplayed() throws InterruptedException{
        Thread.sleep(1000);
        aboutUsMenuPage.verifyThatAboutUsPopUpWindowWillBeDisplayed();
    }

    @And("User clicks the play video button")
    public void userClicksThePlayVideoButton() throws InterruptedException{
        Thread.sleep(1000);
        aboutUsMenuPage.userClicksThePlayVideoButton();
    }


    @Then("Verify the video is played")
    public void verifyTheVideoIsPlayed() {
        aboutUsMenuPage.verifyTheVideoIsPlayed();
    }

    @And("User clicks the pause video button")
    public void userClicksThePauseVideoButton() {
        aboutUsMenuPage.userClicksThePauseVideoButton();
    }

    @Then("Verify the video is paused")
    public void verifyTheVideoIsPaused() {
        aboutUsMenuPage.verifyTheVideoIsPaused();
    }

    @And("User clicks on the mute button")
    public void userClicksOnTheMuteButton() {
        aboutUsMenuPage.userClicksOnTheMuteButton();
    }

    @Then("Verify the audio is on mute")
    public void verifyTheAudioIsOnMute() {
        aboutUsMenuPage.verifyTheAudioIsOnMute();
    }

    @And("User clicks on the unmute button")
    public void userClicksOnTheUnmuteButton() {
        aboutUsMenuPage.userClicksOnTheUnmuteButton();
    }

    @Then("Verify the audio is on unmute")
    public void verifyTheAudioIsOnUnmute() {
        aboutUsMenuPage.verifyTheAudioIsOnUnmute();
    }

    @And("User clicks on the video time point")
    public void userClicksOnTheVideoTimePoint() {
        aboutUsMenuPage.userClicksOnTheVideoTimePoint();
    }

    @Then("Verify video is skipped")
    public void verifyVideoIsSkipped() {
        aboutUsMenuPage.verifyVideoIsSkipped();
    }

    @And("User clicks the X button on About Us pop-up window")
    public void userClicksTheXButtonOnAboutUsPopUpWindow() throws InterruptedException{
        Thread.sleep(1000);
        aboutUsMenuPage.userClicksTheXButtonOnAboutUsPopUpWindow();
    }

    @Then("Verify that the About Us Pop-up window is not displayed")
    public void SignUpverifyThatTheAboutUsPopUpWindowIsNotDisplayed() throws InterruptedException{
        Thread.sleep(1000);
        aboutUsMenuPage.verifyThatTheAboutUsPopUpWindowIsNotDisplayed();
    }

    @And("User clicks the Close button on About Us pop-up window")
    public void userClicksTheCloseButtonOnAboutUsPopUpWindow() throws InterruptedException{
        Thread.sleep(1000);
        aboutUsMenuPage.userClicksTheCloseButtonOnAboutUsPopUpWindow();
    }

}
