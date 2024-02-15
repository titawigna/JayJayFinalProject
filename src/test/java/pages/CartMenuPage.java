package pages;

import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;

import static helper.Utility.driver;
import static org.junit.jupiter.api.Assertions.*;
import static pages.HomePagePage.*;

public class CartMenuPage {
    String itemPrices, totalPriceRight, globalNameOrderForm, globalCreditCardOrderForm;

    By addToCartButton = By.xpath("//a[@class='btn btn-success btn-lg' and text()='Add to cart']");
    By totalPrice = By.id("totalp");
    By countNumberOfItem = By.xpath("//tr [@class = 'success']");
    By placeOrderButton = By.xpath("//button [@data-target='#orderModal']");
    By orderFormPopUpWindow = By.xpath("//div[@id='orderModal' and @style='display: block;'] /child::div[@class='modal-dialog'] /child:: div[@class='modal-content']");
    By nameFieldOrderForm = By.id("name");
    By countryFieldOrderForm = By.id("country");
    By cityFieldOrderForm = By.id("city");
    By creditCardFieldOrderForm = By.id("card");
    By monthFieldOrderForm = By.id("month");
    By yearFieldOrderForm = By.id("year");
    By purchaseButton = By.xpath("//button [@onclick = 'purchaseOrder()' and text()='Purchase']");
    By closeButton = By.xpath("//div[@id='orderModal']//button[@type='button'][normalize-space()='Close']");
    By xButton = By.xpath("//div[@id='orderModal']//button[@type='button'][normalize-space()='×']");
    By orderPopUpConfirmation = By.xpath("//div[contains(@class,'showSweetAlert visible')]");
    By totalPriceOnOrderForm = By.id("totalm");
    By okButtonPopUpConfirmation = By.xpath("//button[normalize-space()='OK']");


    By priceOfItems (int index){
        return By.xpath("(//tr[@class='success']//child::*[3])["+index+"]");}

    By deleteSpecificItemCartButton(String toDeleteItem){
        return By.xpath("//tr[@class='success'] //td[normalize-space()='"+toDeleteItem+"'] //following-sibling:: td //a[contains (@onclick, 'deleteItem') and normalize-space()='Delete']");
    }

    By cartItemName(String itemCartName){
        return By.xpath("//tr[@class='success'] //child:: td[normalize-space()='"+itemCartName+"']");
    }


    public void userClicksAddToCartButton(){
        driver.findElement(addToCartButton).click();
    }

    public void verifyTheListOfItemOnCartMenu(String expectedItemName){
        String[] expectedItemsArray = expectedItemName.split(", ");

        for (String item : expectedItemsArray) {
            WebElement cartItem = driver.findElement(cartItemName(item));
            assertTrue(cartItem.isDisplayed());
        }

    }

    public void userClicksTheDeleteButtonFor(String itemToBeDeleted){
        driver.findElement(deleteSpecificItemCartButton(itemToBeDeleted)).click();
    }

    public void verifyTheListOfItemOnCartMenuIsEmpty(){
        assertFalse(driver.findElement(totalPrice).isDisplayed());
    }

    public void verifyTheTotalPriceOfTheItems(){

        int parsingStoI;
        int totalPriceTable = 0;

        List<WebElement> elementsItem = driver.findElements(countNumberOfItem);
        int elementsCount = elementsItem.size();

        int[] tablePriceArray = new int[elementsCount];

        //System.out.println("Length of table price array is: "+elementsCount);


        for(int intIndex = 0; intIndex < tablePriceArray.length ; intIndex++){

            if(driver.findElement(priceOfItems(intIndex+1)).isDisplayed()){
                itemPrices = driver.findElement(priceOfItems(intIndex+1)).getText();
                //System.out.println("Here are the: "+itemPrices);

                parsingStoI = Integer.parseInt(itemPrices);

                tablePriceArray[intIndex]= parsingStoI;

                totalPriceTable += parsingStoI;
            }else{
                break;
            }

        }

        //System.out.println("Here's the total price obtained: " + totalPriceTable);

        String totalPriceTableString = Integer.toString(totalPriceTable);;
        totalPriceRight = driver.findElement(totalPrice).getText();
        assertEquals(totalPriceTableString, totalPriceRight);
    }

    public void userClicksPlaceOrderButton(){
        driver.findElement(placeOrderButton).click();
    }

    public void verifyThatOrderFormPopUpWindowWillBeDisplayed(){
        driver.findElement(orderFormPopUpWindow).isDisplayed();
    }

    public void verifyTheTotalPriceOnTheOrderForm(){
        String substringTotalPrice = driver.findElement(totalPriceOnOrderForm).getText().substring(7);
        assertEquals(substringTotalPrice, totalPriceRight);
    }

    public void userFillsInTheNameForOrderForm(String nameOrderForm){
        driver.findElement(nameFieldOrderForm).sendKeys(nameOrderForm);
        globalNameOrderForm = nameOrderForm;
    }

    public void userFillsInTheCountryForOrderForm(String countryOrderForm){
        driver.findElement(countryFieldOrderForm).sendKeys(countryOrderForm);
    }

    public void userFillsInTheCityForOrderForm(String cityOrderForm){
        driver.findElement(cityFieldOrderForm).sendKeys(cityOrderForm);
    }

    public void userFillsInTheCreditCardForOrderForm(String creditCardOrderForm){
        driver.findElement(creditCardFieldOrderForm).sendKeys(creditCardOrderForm);
        globalCreditCardOrderForm = creditCardOrderForm;
    }

    public void userFillsInTheMonthForOrderForm(String monthOrderForm){
        driver.findElement(monthFieldOrderForm).sendKeys(monthOrderForm);
    }

    public void userFillsInTheYearForOrderForm(String yearOrderForm){
        driver.findElement(yearFieldOrderForm).sendKeys(yearOrderForm);
    }

    public void userClicksPurchaseButton(){
        driver.findElement(purchaseButton).click();
    }

    public void userSeesThePopUpConfirmationOfOrder(){
        driver.findElement(orderPopUpConfirmation).isDisplayed();
        //System.out.println("ini adalah isi textnya: " + driver.findElement(orderPopUpConfirmation).getText());

        assertTrue( driver.findElement(orderPopUpConfirmation).getText().contains("Thank you for your purchase!") );
        assertTrue( driver.findElement(orderPopUpConfirmation).getText().contains("Id: ") );

        if(driver.findElement(orderPopUpConfirmation).getText().contains("Amount: 0 USD")){
            assertTrue( driver.findElement(orderPopUpConfirmation).getText().contains("Amount: 0 USD") );
        }else{
            assertTrue( driver.findElement(orderPopUpConfirmation).getText().contains(totalPriceRight) );
        }

        assertTrue( driver.findElement(orderPopUpConfirmation).getText().contains(globalNameOrderForm) );
        assertTrue( driver.findElement(orderPopUpConfirmation).getText().contains(globalCreditCardOrderForm) );
    }

    public void userClicksOKButtonOnThePopUpConfirmation(){
        driver.findElement(okButtonPopUpConfirmation).click();
    }

    public void userClicksTheXButtonOnOrderFormPopUpWindow(){
        driver.findElement(xButton).click();
    }

    public void verifyThatTheOrderFormPopUpWindowIsNotDisplayed(){

        boolean modal;
        try {
            driver.findElement(orderFormPopUpWindow).isDisplayed();
            // kalau modal ketemu, variable modal = true
            modal = true;
        } catch (Exception e) {
            // kalau modal GAK/TIDAK ketemu, variable modal = false
            modal = false;
        }
        assertFalse(modal);
    }




    public void userClicksTheCloseButtonOnOrderFormPopUpWindow(){
        driver.findElement(closeButton).click();
    }








}
