package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import static helper.Utility.driver;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.*;

public class HomePagePage {

    By categoriesBox = By.id("cat");
    By homePageNextButton = By.id("next2");
    By homePagePreviousButton = By.id("prev2");
    By carouselItem = By.xpath("//div[@class=\"carousel-inner\"]");
    By carouselNextButton = By.xpath("//span[@class=\"carousel-control-next-icon\"]");
    By carouselPreviousButton = By.xpath("//span[@class=\"carousel-control-prev-icon\"]");
    By imageDisplayedInCarousel = By.xpath("//div[@class=\"carousel-item active\"]/child::img[@alt=\"First slide\" or \"Second slide\" or \"Third slide\"]");
    By firstCarouselButton = By.xpath("//li[@data-slide-to='0']");
    By firstCarouselButtonClicked = By.xpath("//li[@data-slide-to='0' and @class = 'active']");
    By secondCarouselButton = By.xpath("//li[@data-slide-to='1']");
    By secondCarouselButtonClicked = By.xpath("//li[@data-slide-to='1' and @class = 'active']");
    By thirdCarouselButton = By.xpath("//li[@data-slide-to='2']");
    By thirdCarouselButtonClicked = By.xpath("//li[@data-slide-to='2' and @class = 'active']");
    By globalNavigationMenu = By.xpath("//ul[@class='navbar-nav ml-auto']");
    By logoIcon = By.id("nava");



    By categoriesListFix(String name){
        return By.xpath("//*[@id='itemc' and text () = '"+name+"']");
    }
    By clickedItemTitleName(String clickedItem){
        return By.xpath("//h4[@class='card-title'] /child :: a[normalize-space()='" +clickedItem+ "']" );
    }
    By titleOfItemDetailPage(String detailPageItemTitle){
        return By.xpath("//div[@id = 'tbodyid'] /child:: h2[normalize-space()='" + detailPageItemTitle + "']");
    }
    By titlesOfGlobalNavigationMenu(String titlesOfGlobalNavMenu) {
        return By.xpath("//*[@class = 'nav-link' and text() = '" + titlesOfGlobalNavMenu + "']");
    }






    public void userIsOnTheHomePage(){
        driver.get("https://www.demoblaze.com/");
    }

    public void verifyTheURLIs(String webUrl){
        String expectedUrl = driver.getCurrentUrl();
        assertThat(expectedUrl).isEqualTo(webUrl);

    }

    public void userSeesCategoriesBoxMenu(){
        driver.findElement(categoriesBox).isDisplayed();
    }

    public void userClicksOneOfTheCategory(String nameOfCategory){
        driver.findElement(categoriesListFix(nameOfCategory)).click();
    }

    public void verifyUserSees(String itemName){
        WebElement ItemListedElement;
        ItemListedElement = driver.findElement(clickedItemTitleName(itemName));
        assertEquals(itemName, ItemListedElement.getText());
    }

    public void userClicksTheNextButton(){
        driver.findElement(homePageNextButton).click();
    }

    public void userClicksThePreviousButton(){
        driver.findElement(homePagePreviousButton).click();
    }

    public void userSeesTheCarousel(){
        driver.findElement(carouselItem).isDisplayed();
    }

    public void userClicksOnTheSlideRightCarousel(){
        driver.findElement(carouselNextButton).click();
    }

    public void verifyUserSeesThePictureIsChanging(){
        driver.findElement(imageDisplayedInCarousel).isDisplayed();
    }

    public void userClicksOnTheSlideLeftCarousel(){
        driver.findElement(carouselPreviousButton).click();
    }

    public void userClicksOnTheFirstBarOfCarouselPicture(){
        driver.findElement(firstCarouselButton).click();
    }

    public void verifyUserSeesTheFirstPicture(){
        driver.findElement(firstCarouselButtonClicked).isDisplayed();

        WebElement pictureDisplayedElement = driver.findElement(imageDisplayedInCarousel);
        assertEquals(pictureDisplayedElement.getAttribute("src"), "https://www.demoblaze.com/Samsung1.jpg");
    }

    public void userClicksOnTheSecondBarOfCarouselPicture(){
        driver.findElement(secondCarouselButton).click();
    }

    public void verifyUserSeesTheSecondPicture(){
        driver.findElement(secondCarouselButtonClicked).isDisplayed();

        WebElement pictureDisplayedElement = driver.findElement(imageDisplayedInCarousel);
        assertEquals(pictureDisplayedElement.getAttribute("src"), "https://www.demoblaze.com/nexus1.jpg");
    }

    public void userClicksOnTheThirdBarOfCarouselPicture(){
        driver.findElement(thirdCarouselButton).click();
    }

    public void verifyUserSeesTheThirdPicture(){
        driver.findElement(thirdCarouselButtonClicked).isDisplayed();

        WebElement pictureDisplayedElement = driver.findElement(imageDisplayedInCarousel);
        assertEquals(pictureDisplayedElement.getAttribute("src"), "https://www.demoblaze.com/iphone1.jpg");
    }





    public void userClicksOnTheItemTitleName(String clickItemTitleName){
        driver.findElement(clickedItemTitleName(clickItemTitleName)).click();
    }






    public void verifyUserIsOnTheDetailPageOf(String detailPageItemTitleName){
        driver.findElement(titleOfItemDetailPage(detailPageItemTitleName));
    }

    public void userSeesTheGlobalNavigationMenu(){
        driver.findElement(globalNavigationMenu).isDisplayed();
    }

    public void verifyTheMenusOfGlobalNavigationMenu(){
        String listOfMenuGlobalNavExpected = "Home\n" +
                "(current)\n" +
                "Contact\n" +
                "About us\n" +
                "Cart\n" +
                "Log in\n" +
                "Sign up";
        String listOfMenuGlobalNavActual = driver.findElement(globalNavigationMenu).getText();
        assertEquals(listOfMenuGlobalNavExpected, listOfMenuGlobalNavActual);
        //System.out.println(listOfMenuGlobalNavActual);
    }

    public void userClicksOnTheGlobalNavigationMenu(String nameOfGlobalNavMenu){
        driver.findElement(titlesOfGlobalNavigationMenu(nameOfGlobalNavMenu)).click();
    }

    public void verifyUserIsOnTheHomePage(){
        String urlExpected = "https://www.demoblaze.com/index.html";
        String urlActual = driver.getCurrentUrl();

        assertEquals(urlExpected, urlActual);

    }

    public void userClicksTheLogoIcon(){
        driver.findElement(logoIcon).click();
    }






}
