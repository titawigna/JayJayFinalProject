package stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.ApiPage;
import pages.HomePagePage;

public class HomePageStepDef {

    HomePagePage homePagePage;

    public HomePageStepDef(){
        this.homePagePage = new HomePagePage();

    }

    @Given("User is on the Home Page")
    public void userIsOnTheHomePage() {
        homePagePage.userIsOnTheHomePage();
    }

    @Then("Verify the URL is {string}")
    public void verifyTheURLIs(String webUrl) {
        homePagePage.verifyTheURLIs(webUrl);
    }

    @And("User sees Categories box menu")
    public void userSeesCategoriesBoxMenu() {
        homePagePage.userSeesCategoriesBoxMenu();
    }

    @And("User clicks one of the category {string}")
    public void userClicksOneOfTheCategory(String nameOfCategory) throws InterruptedException {
        Thread.sleep(1000);
        homePagePage.userClicksOneOfTheCategory(nameOfCategory);
    }

    @Then("Verify user sees {string}")
    public void verifyUserSees(String itemName) throws InterruptedException {
        Thread.sleep(1000);
        homePagePage.verifyUserSees(itemName);
    }


    @And("User clicks the Next button")
    public void userClicksTheNextButton() throws InterruptedException {
        Thread.sleep(5000);
        homePagePage.userClicksTheNextButton();
    }

    @And("User clicks the Previous button")
    public void userClicksThePreviousButton() throws InterruptedException {
        Thread.sleep(5000);
        homePagePage.userClicksThePreviousButton();
    }

    @And("User sees the carousel")
    public void userSeesTheCarousel() throws InterruptedException {
        Thread.sleep(5000);
        homePagePage.userSeesTheCarousel();
    }

    @And("User clicks on the slide right carousel")
    public void userClicksOnTheSlideRightCarousel() throws InterruptedException {
        Thread.sleep(5000);
        homePagePage.userClicksOnTheSlideRightCarousel();
    }

    @Then("Verify user sees the picture is changing")
    public void verifyUserSeesThePictureIsChanging() throws InterruptedException {
        Thread.sleep(5000);
        homePagePage.verifyUserSeesThePictureIsChanging();
    }

    @And("User clicks on the slide left carousel")
    public void userClicksOnTheSlideLeftCarousel() throws InterruptedException {
        Thread.sleep(5000);
        homePagePage.userClicksOnTheSlideLeftCarousel();
    }

    @And("User clicks on the first bar of carousel picture")
    public void userClicksOnTheFirstBarOfCarouselPicture() throws InterruptedException {
        Thread.sleep(5000);
        homePagePage.userClicksOnTheFirstBarOfCarouselPicture();

    }

    @Then("Verify user sees the first picture")
    public void verifyUserSeesTheFirstPicture() throws InterruptedException {
        Thread.sleep(5000);
        homePagePage.verifyUserSeesTheFirstPicture();
    }

    @And("User clicks on the second bar of carousel picture")
    public void userClicksOnTheSecondBarOfCarouselPicture() throws InterruptedException {
        Thread.sleep(5000);
        homePagePage.userClicksOnTheSecondBarOfCarouselPicture();
    }

    @Then("Verify user sees the second picture")
    public void verifyUserSeesTheSecondPicture() throws InterruptedException {
        Thread.sleep(5000);
        homePagePage.verifyUserSeesTheSecondPicture();
    }

    @And("User clicks on the third bar of carousel picture")
    public void userClicksOnTheThirdBarOfCarouselPicture() throws InterruptedException {
        Thread.sleep(5000);
        homePagePage.userClicksOnTheThirdBarOfCarouselPicture();
    }

    @Then("Verify user sees the third picture")
    public void verifyUserSeesTheThirdPicture() throws InterruptedException {
        Thread.sleep(5000);
        homePagePage.verifyUserSeesTheThirdPicture();
    }

    @And("User clicks on the item title name {string}")
    public void userClicksOnTheItemTitleName(String clickItemTitleName) throws InterruptedException {
        Thread.sleep(1000);
        homePagePage.userClicksOnTheItemTitleName(clickItemTitleName);
    }

    @Then("Verify user is on the detail page of {string}")
    public void verifyUserIsOnTheDetailPageOf(String detailPageItemTitleName) throws InterruptedException {
        Thread.sleep(1000);
        homePagePage.verifyUserIsOnTheDetailPageOf(detailPageItemTitleName);
    }

    @And("User sees the Global Navigation Menu")
    public void userSeesTheGlobalNavigationMenu() {
        homePagePage.userSeesTheGlobalNavigationMenu();
    }

    @Then("Verify the menus of Global Navigation Menu")
    public void verifyTheMenusOfGlobalNavigationMenu() {
        homePagePage.verifyTheMenusOfGlobalNavigationMenu();
    }

    @And("User clicks on the Global Navigation Menu {string}")
    public void userClicksOnTheGlobalNavigationMenu(String nameOfGlobalNavMenu) throws InterruptedException {
        Thread.sleep(1000);
        homePagePage.userClicksOnTheGlobalNavigationMenu(nameOfGlobalNavMenu);
    }

    @Then("Verify user is on the Home Page")
    public void verifyUserIsOnTheHomePage() {
        homePagePage.verifyUserIsOnTheHomePage();
    }

    @And("User clicks the logo icon")
    public void userClicksTheLogoIcon() {
        homePagePage.userClicksTheLogoIcon();
    }
}
