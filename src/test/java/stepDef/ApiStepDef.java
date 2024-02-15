package stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.ApiPage;

public class ApiStepDef {

    ApiPage apiPage;

    public ApiStepDef(){
        this.apiPage = new ApiPage();

    }

    @Given("Prepare url for {string}")
    public void prepareUrlFor(String url) {
        apiPage.prepareURL(url);

    }


    @And("Hit the POST API")
    public void hitThePOSTAPI() {
        apiPage.hitPOSTAPI();
    }

    @Then("Validate status code is {int}")
    public void validateStatusCodeIs(int statusCode) {
        apiPage.validateStatusCode(statusCode);

    }

    @And("Validate response body POST user data")
    public void validateResponseBodyPOSTUserData() {
        apiPage.validateResponseBodyPOSTUserData();
    }

    @And("Validate response JSON with JSONSchema {string}")
    public void validateResponseJSONWithJSONSchema(String jsonFileName) {
        apiPage.validateResponseJSONWithJSONSchema(jsonFileName);
    }

    @And("Hit the GET User By ID API")
    public void hitTheGETUserByIDAPI() {
        apiPage.hitTheGETUserByIDAPI();
    }

    @And("Validate response body GET user data")
    public void validateResponseBodyGETUserData() {
        apiPage.validateResponseBodyGETUserData();
    }

    @And("User ID is {string}")
    public void userIDIs(String userIDCheck) {
        //apiPage.userIDIs(userIDCheck);
    }

    @And("Valid User ID is {string}")
    public void validUserIDIs(String userIDCheckValid) {
        apiPage.validUserIDIs(userIDCheckValid);
    }

    @And("Invalid User ID is {string}")
    public void invalidUserIDIs(String userIDCheckInvalid) {
        apiPage.invalidUserIDIs(userIDCheckInvalid);
    }

    @And("Hit the GET User By Existing ID API")
    public void hitTheGETUserByExistingIDAPI() {
        apiPage.hitTheGETUserByExistingIDAPI();
    }


    @And("Hit the GET User By Nonexistent ID API")
    public void hitTheGETUserByNonexistentIDAPI() {
        apiPage.hitTheGETUserByNonexistentIDAPI();
    }

    @And("Hit the GET List Of Tags API")
    public void hitTheGETListOfTagsAPI() {
        apiPage.hitTheGETListOfTagsAPI();
    }

    @And("Validate response body GET-Tag user data")
    public void validateResponseBodyGETTagUserData() {
        apiPage.validateResponseBodyGETTagUserData();
    }

    @And("Hit the POST new user API with blank body")
    public void hitThePOSTNewUserAPIWithBlankBody() {
        apiPage.hitThePOSTNewUserAPIWithBlankBody();
    }


    @And("Validate response body POST new user data with blank body")
    public void validateResponseBodyPOSTNewUserDataWithBlankBody() {
        apiPage.validateResponseBodyPOSTNewUserDataWithBlankBody();
    }


    @And("Hit the POST new user API with blank firstName")
    public void hitThePOSTNewUserAPIWithBlankFirstName() {
        apiPage.hitThePOSTNewUserAPIWithBlankFirstName();
    }

    @And("Validate response body POST new user data with blank firstName")
    public void validateResponseBodyPOSTNewUserDataWithBlankFirstName() {
        apiPage.validateResponseBodyPOSTNewUserDataWithBlankFirstName();
    }

    @And("Hit the POST new user API with blank lastName")
    public void hitThePOSTNewUserAPIWithBlankLastName() {
        apiPage.hitThePOSTNewUserAPIWithBlankLastName();
    }

    @And("Validate response body POST new user data with blank lastName")
    public void validateResponseBodyPOSTNewUserDataWithBlankLastName() {
        apiPage.validateResponseBodyPOSTNewUserDataWithBlankLastName();
    }

    @And("Hit the POST new user API with blank email")
    public void hitThePOSTNewUserAPIWithBlankEmail() {
        apiPage.hitThePOSTNewUserAPIWithBlankEmail();
    }

    @And("Validate response body POST new user data with blank email")
    public void validateResponseBodyPOSTNewUserDataWithBlankEmail() {
        apiPage.validateResponseBodyPOSTNewUserDataWithBlankEmail();
    }


    @And("Hit the POST API with existing user details")
    public void hitThePOSTAPIWithExistingUserDetails() {
        apiPage.hitThePOSTAPIWithExistingUserDetails();

    }

    @And("Validate response body POST new user data with existing user details")
    public void validateResponseBodyPOSTNewUserDataWithExistingUserDetails() {
        apiPage.validateResponseBodyPOSTNewUserDataWithExistingUserDetails();
    }

    @And("Hit the POST API with existing user firstName only")
    public void hitThePOSTAPIWithExistingUserFirstNameOnly() {
        apiPage.hitThePOSTAPIWithExistingUserFirstNameOnly();
    }

    @And("Hit the POST API with existing user lastName only")
    public void hitThePOSTAPIWithExistingUserLastNameOnly() {
        apiPage.hitThePOSTAPIWithExistingUserLastNameOnly();
    }

    @And("Hit the POST API with existing user email only")
    public void hitThePOSTAPIWithExistingUserEmailOnly() {
        apiPage.hitThePOSTAPIWithExistingUserEmailOnly();
    }

    @And("Validate response body POST new user data with existing user email")
    public void validateResponseBodyPOSTNewUserDataWithExistingUserEmail() {
        apiPage.validateResponseBodyPOSTNewUserDataWithExistingUserEmail();
    }

    @And("Hit the POST new user API with invalid email format")
    public void hitThePOSTNewUserAPIWithInvalidEmailFormat() {
        apiPage.hitThePOSTNewUserAPIWithInvalidEmailFormat();
    }

    @And("Validate response body POST new user data with invalid email format")
    public void validateResponseBodyPOSTNewUserDataWithInvalidEmailFormat() {
        apiPage.validateResponseBodyPOSTNewUserDataWithInvalidEmailFormat();
    }

    @And("Hit the PUT user data all")
    public void hitThePUTUserDataAll() {
        apiPage.hitThePUTUserDataAll();
    }

    @And("Hit the DELETE user API")
    public void hitTheDELETEUserAPI() {
        apiPage.hitTheDELETEUserAPI();
    }

    @And("Validate the response body DELETE user")
    public void validateTheResponseBodyDELETEUser() {
        apiPage.validateTheResponseBodyDELETEUser();
    }

    @And("Hit the DELETE user by inexistent ID API")
    public void hitTheDELETEUserByInexistentIDAPI() {
        apiPage.hitTheDELETEUserByInexistentIDAPI();
    }

    @And("Validate response body DELETE inexistent user")
    public void validateResponseBodyDELETEInexistentUser() {
        apiPage.validateResponseBodyDELETEInexistentUser();
    }
}
