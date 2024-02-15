package pages;


import groovyjarjarpicocli.CommandLine;
import helper.EndPoint;
import helper.Models;
import helper.Utility;
import io.restassured.module.jsv.JsonSchemaValidator;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.hamcrest.Matchers;

import java.io.File;
import java.lang.reflect.Array;
import java.util.List;

import static helper.Models.*;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import static helper.Utility.generateRandomEmail;

public class ApiPage {

    String setURL, global_id, global_id_to_check_valid, global_id_to_check_invalid, firstNames, lastNames, randomEmails;
    Response res;

    Models models;
    public ApiPage(){
        this.models = new Models();
    }

    public void prepareURL(String url){

        switch (url){
            case "POST_NEW_USER":
                setURL = EndPoint.POST_NEW_USER;
                break;
            case "GET_USER_BY_ID":
                setURL = EndPoint.GET_USER_BY_ID;
                break;
            case "GET_List_Of_Tags":
                setURL = EndPoint.GET_List_Of_Tags;
                break;
            case "DELETE_User":
                setURL = EndPoint.DELETE_User;
                break;
            case "PUT_USER_BY_ID":
                setURL = EndPoint.PUT_USER_BY_ID;
                break;

            case "INVALID_POST_NEW_USER_URL":
                setURL = EndPoint.INVALID_POST_NEW_USER_URL;
                break;
            case "INVALID_GET_USER_BY_ID":
                setURL = EndPoint.INVALID_GET_USER_BY_ID;
                break;
            case "INVALID_GET_URL":
                setURL = EndPoint.INVALID_GET_URL;
                break;
            case "INVALID_GET_TagList_URL":
                setURL = EndPoint.INVALID_GET_TagList_URL;
                break;
            case "INVALID_PUT_User_URL":
                setURL = EndPoint.INVALID_PUT_User_URL;
                break;
            case "INVALID_DELETE_User_URL":
                setURL = EndPoint.INVALID_DELETE_User_URL;
                break;


            default:
                System.out.println("Input a valid URL");
        }

    }

    public void hitPOSTAPI(){
        firstNames = "Amanda";
        lastNames = "Wibawa";
        randomEmails = generateRandomEmail();

        res = postNewUser(setURL, firstNames, lastNames, randomEmails);
        //System.out.println("Data new user adalah: "+ res.getBody().asString());
    }

    public void validateStatusCode(int statusCode){
        assertThat(res.statusCode()).isEqualTo(statusCode);
    }

    public void validateResponseBodyPOSTUserData(){
        JsonPath jsonPathEvaluator = res.jsonPath();
        String id = jsonPathEvaluator.get("id");
        String firstName = jsonPathEvaluator.get("firstName");
        String lastName = jsonPathEvaluator.get("lastName");
        String email = jsonPathEvaluator.get("email");
        String registerDate = jsonPathEvaluator.get("registerDate");
        String updatedDate = jsonPathEvaluator.get("updatedDate");

        assertThat(id).isNotNull();

        assertThat(firstName).isNotNull();
        assertThat(firstName).isEqualTo(firstNames);

        assertThat(lastName).isNotNull();
        assertThat(lastName).isEqualTo(lastNames);

        assertThat(email).isNotNull();
        assertThat(email).isEqualTo(randomEmails);

        assertThat(registerDate).isNotNull();

        assertThat(updatedDate).isNotNull();

        global_id = id;
    }

    public void validateResponseJSONWithJSONSchema(String jsonFileName){
        File JSONFile = Utility.getJSONSchemaFile(jsonFileName);
        res.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(JSONFile));
    }

    public void hitTheGETUserByIDAPI(){
        res = getUserByID(setURL, global_id);

    }

    public void validUserIDIs(String userIDCheckValid){
        global_id_to_check_valid = userIDCheckValid;

    }

    public void invalidUserIDIs(String userIDCheckInvalid){
        global_id_to_check_invalid = userIDCheckInvalid;
    }

    public void hitTheGETUserByExistingIDAPI(){
        res = getUserByID(setURL, global_id_to_check_valid);
        //System.out.println("nomor id adalah: " + global_id_to_check_valid);
    }

    public void validateResponseBodyGETUserData(){
        JsonPath jsonPathEvaluator = res.jsonPath();
        String id = jsonPathEvaluator.get("id");
        String firstName = jsonPathEvaluator.get("firstName");
        String lastName = jsonPathEvaluator.get("lastName");
        String email = jsonPathEvaluator.get("email");
        String registerDate = jsonPathEvaluator.get("registerDate");
        String updatedDate = jsonPathEvaluator.get("updatedDate");

        assertThat(id).isNotNull();
        assertThat(firstName).isNotNull();
        assertThat(lastName).isNotNull();
        assertThat(email).isNotNull();
        assertThat(registerDate).isNotNull();
        assertThat(updatedDate).isNotNull();
    }

    public void hitTheGETUserByNonexistentIDAPI(){
        res = getUserByID(setURL, global_id_to_check_invalid);
        //System.out.println("nomor id adalah: " + global_id_to_check_invalid);
    }

    public void hitTheGETListOfTagsAPI(){
        res = getListOfTags(setURL);
    }

    public void validateResponseBodyGETTagUserData(){

        List<Object> data = res.jsonPath().getList("data");

        assertThat(data.get(0)).isNull();
        assertThat(data.get(1)).isNotNull();
    }

    public void hitThePOSTNewUserAPIWithBlankBody(){
        firstNames = "";
        lastNames = "";
        randomEmails = "";

        res = postNewUser(setURL, firstNames, lastNames, randomEmails);
    }

    public void validateResponseBodyPOSTNewUserDataWithBlankBody(){

        System.out.println("Error message of blank body: " + res.getBody().asString());
        assertThat(res.getBody().asString()).isEqualTo("{\"error\":\"BODY_NOT_VALID\",\"data\":{\"email\":\"Path `email` is required.\",\"firstName\":\"Path `firstName` is required.\",\"lastName\":\"Path `lastName` is required.\"}}");
    }

    public void hitThePOSTNewUserAPIWithBlankFirstName(){
        firstNames = "";
        lastNames = "Berlian";
        randomEmails = "yberlian@gmail.com";

        res = postNewUser(setURL, firstNames, lastNames, randomEmails);
    }

    public void validateResponseBodyPOSTNewUserDataWithBlankFirstName(){
        System.out.println("Error message of blank firstName: " + res.getBody().asString());
        assertThat(res.getBody().asString()).isEqualTo("{\"error\":\"BODY_NOT_VALID\",\"data\":{\"firstName\":\"Path `firstName` is required.\"}}");
    }

    public void hitThePOSTNewUserAPIWithBlankLastName(){
        firstNames = "Yuni";
        lastNames = "";
        randomEmails = "yberlian@gmail.com";

        res = postNewUser(setURL, firstNames, lastNames, randomEmails);
    }

    public void validateResponseBodyPOSTNewUserDataWithBlankLastName(){
        System.out.println("Error message of blank lastName: " + res.getBody().asString());
        assertThat(res.getBody().asString()).isEqualTo("{\"error\":\"BODY_NOT_VALID\",\"data\":{\"lastName\":\"Path `lastName` is required.\"}}");
    }

    public void hitThePOSTNewUserAPIWithBlankEmail(){
        firstNames = "Yuni";
        lastNames = "Berlian";
        randomEmails = "";

        res = postNewUser(setURL, firstNames, lastNames, randomEmails);
    }

    public void validateResponseBodyPOSTNewUserDataWithBlankEmail(){
        System.out.println("Error message of blank email: " + res.getBody().asString());
        assertThat(res.getBody().asString()).isEqualTo("{\"error\":\"BODY_NOT_VALID\",\"data\":{\"email\":\"Path `email` is required.\"}}");
    }

    public void hitThePOSTAPIWithExistingUserDetails(){
        firstNames = "Muhammad Baru";
        lastNames = "Hab";
        randomEmails = "MB@gmail.com";

        res = postNewUser(setURL, firstNames, lastNames, randomEmails);
    }

    public void validateResponseBodyPOSTNewUserDataWithExistingUserDetails(){
        System.out.println("Error message of blank email: " + res.getBody().asString());
        assertThat(res.getBody().asString()).isEqualTo("{\"error\":\"BODY_NOT_VALID\",\"data\":{\"email\":\"Email already used\"}}");
    }

    public void hitThePOSTAPIWithExistingUserFirstNameOnly(){
        firstNames = "Muhammad Baru"; //this is existing firstName
        lastNames = "Dermawan";
        randomEmails = "dermawanbaru@gmail.com";

        res = postNewUser(setURL, firstNames, lastNames, randomEmails);
    }

    public void hitThePOSTAPIWithExistingUserLastNameOnly(){
        firstNames = "Ibnu";
        lastNames = "Hab"; //this is existing lastName
        randomEmails = "ibnuhab@gmail.com";

        res = postNewUser(setURL, firstNames, lastNames,randomEmails);
    }

    public void hitThePOSTAPIWithExistingUserEmailOnly(){
        firstNames = "Nisa";
        lastNames = "Maulida";
        randomEmails = "MB@gmail.com"; //this is existing email

        res = postNewUser(setURL, firstNames, lastNames,randomEmails);
    }

    public void validateResponseBodyPOSTNewUserDataWithExistingUserEmail(){
        System.out.println("Error message of existing email: " + res.getBody().asString());
        assertThat(res.getBody().asString()).isEqualTo("{\"error\":\"BODY_NOT_VALID\",\"data\":{\"email\":\"Email already used\"}}");
    }

    public void hitThePOSTNewUserAPIWithInvalidEmailFormat(){
        firstNames = "Firda";
        lastNames = "Aulia";
        randomEmails = "firdaaulia@.com";

        res = postNewUser(setURL, firstNames, lastNames,randomEmails);
    }

    public void validateResponseBodyPOSTNewUserDataWithInvalidEmailFormat(){
        System.out.println("Error message of invalid email format: " + res.getBody().asString());
        assertThat(res.getBody().asString()).isEqualTo("{\"error\":\"BODY_NOT_VALID\",\"data\":{\"email\":\"Path `email` is invalid (firdaaulia@.com).\"}}");
    }

    public void hitThePUTUserDataAll(){
        firstNames = "DataBaru firstName";
        lastNames = "DataBaru lastName";
        randomEmails = generateRandomEmail();

        res = putDataAll(setURL, global_id, firstNames, lastNames, randomEmails);
    }

    public void hitTheDELETEUserAPI(){
        res = deleteUser(setURL, global_id);
    }

    public void validateTheResponseBodyDELETEUser(){
        System.out.println("Error message of deleted user: " + res.getBody().asString());
        assertThat(res.getBody().asString()).isEqualTo( "{" + "\"id\":" + "\"" + global_id + "\"" + "}");
    }

    public void hitTheDELETEUserByInexistentIDAPI(){
        res = deleteUser(setURL, global_id_to_check_invalid);
    }

    public void validateResponseBodyDELETEInexistentUser(){
        System.out.println("Error message of deleted inexistent user: " + res.getBody().asString());
        assertThat(res.getBody().asString()).isEqualTo("{\"error\":\"PARAMS_NOT_VALID\"}");
    }










}
