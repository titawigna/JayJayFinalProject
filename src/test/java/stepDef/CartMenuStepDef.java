package stepDef;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.CartMenuPage;

public class CartMenuStepDef {

    CartMenuPage cartMenuPage;

    public CartMenuStepDef(){
        this.cartMenuPage = new CartMenuPage();
    }

    @And("User clicks Add To Cart button")
    public void userClicksAddToCartButton() throws InterruptedException{
        Thread.sleep(1000);
        cartMenuPage.userClicksAddToCartButton();
    }


    @Then("Verify the list of item on Cart Menu {string}")
    public void verifyTheListOfItemOnCartMenu(String expectedItemName) throws InterruptedException{
        Thread.sleep(2000);
        cartMenuPage.verifyTheListOfItemOnCartMenu(expectedItemName);
    }

    @And("User clicks the Delete button for {string}")
    public void userClicksTheDeleteButtonFor(String itemToBeDeleted) throws InterruptedException{
        Thread.sleep(2000);
        cartMenuPage.userClicksTheDeleteButtonFor(itemToBeDeleted);
    }

    @Then("Verify the list of item on Cart Menu is empty")
    public void verifyTheListOfItemOnCartMenuIsEmpty() throws InterruptedException{
        Thread.sleep(2000);
        cartMenuPage.verifyTheListOfItemOnCartMenuIsEmpty();
    }


    @And("Verify the total price of the items")
    public void verifyTheTotalPriceOfTheItems() {
        cartMenuPage.verifyTheTotalPriceOfTheItems();
    }

    @And("User clicks Place Order button")
    public void userClicksPlaceOrderButton() {
        cartMenuPage.userClicksPlaceOrderButton();
    }

    @And("Verify that Order Form Pop-up window will be displayed")
    public void verifyThatOrderFormPopUpWindowWillBeDisplayed() throws InterruptedException{
        Thread.sleep(10000);
        cartMenuPage.verifyThatOrderFormPopUpWindowWillBeDisplayed();
    }

    @And("User fills in the Name for Order Form {string}")
    public void userFillsInTheNameForOrderForm(String nameOrderForm) {
        cartMenuPage.userFillsInTheNameForOrderForm(nameOrderForm);
    }

    @And("User fills in the Country for Order Form {string}")
    public void userFillsInTheCountryForOrderForm(String countryOrderForm) {
        cartMenuPage.userFillsInTheCountryForOrderForm(countryOrderForm);
    }

    @And("User fills in the City for Order Form {string}")
    public void userFillsInTheCityForOrderForm(String cityOrderForm) {
        cartMenuPage.userFillsInTheCityForOrderForm(cityOrderForm);
    }

    @And("User fills in the Credit Card for Order Form {string}")
    public void userFillsInTheCreditCardForOrderForm(String creditCardOrderForm) {
        cartMenuPage.userFillsInTheCreditCardForOrderForm(creditCardOrderForm);
    }

    @And("User fills in the Month for Order Form {string}")
    public void userFillsInTheMonthForOrderForm(String monthOrderForm) {
        cartMenuPage.userFillsInTheMonthForOrderForm(monthOrderForm);
    }

    @And("User fills in the Year for Order Form {string}")
    public void userFillsInTheYearForOrderForm(String yearOrderForm) {
        cartMenuPage.userFillsInTheYearForOrderForm(yearOrderForm);
    }

    @And("User clicks Purchase button")
    public void userClicksPurchaseButton() {
        cartMenuPage.userClicksPurchaseButton();
    }

    @Then("User sees the pop-up confirmation of order")
    public void userSeesThePopUpConfirmationOfOrder() {
        cartMenuPage.userSeesThePopUpConfirmationOfOrder();
    }

    @And("User clicks OK button on the pop-up confirmation")
    public void userClicksOKButtonOnThePopUpConfirmation() {
        cartMenuPage.userClicksOKButtonOnThePopUpConfirmation();
    }

    @And("Verify the total Price on the Order Form")
    public void verifyTheTotalPriceOnTheOrderForm() {
        cartMenuPage.verifyTheTotalPriceOnTheOrderForm();
    }

    @And("User clicks the X button on Order Form pop-up window")
    public void userClicksTheXButtonOnOrderFormPopUpWindow() throws InterruptedException{
        Thread.sleep(2000);
        cartMenuPage.userClicksTheXButtonOnOrderFormPopUpWindow();
    }

    @Then("Verify that the Order Form Pop-up window is not displayed")
    public void verifyThatTheOrderFormPopUpWindowIsNotDisplayed() throws InterruptedException{
        Thread.sleep(10000);
        cartMenuPage.verifyThatTheOrderFormPopUpWindowIsNotDisplayed();
    }

    @And("User clicks the Close button on Order Form pop-up window")
    public void userClicksTheCloseButtonOnOrderFormPopUpWindow() throws InterruptedException{
        Thread.sleep(2000);
        cartMenuPage.userClicksTheCloseButtonOnOrderFormPopUpWindow();
    }
}
