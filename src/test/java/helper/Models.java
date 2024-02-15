package helper;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.JSONObject;

import static helper.Utility.generateRandomEmail;

public class Models {

    private static RequestSpecification request;

    public static void setUpHeaders(){

        request = RestAssured.given()
                .header("Content-Type", "application/json")
                .header("Accept", "application/json")
                .header("app-id", "659529aaa7e69c44b2371d94");
    }

    public static Response getUserByID(String endpoint, String idUserGet) {
        setUpHeaders();
        String finalEndPoint = endpoint + "/" + idUserGet;
        System.out.println("final end point nya adalah: "+finalEndPoint);
        return request.when().get(finalEndPoint);
    }

    public static Response postNewUser(String endpoint, String firstNames, String lastNames, String randomEmails){
        String firstName = firstNames;
        String lastName = lastNames;
        String email = randomEmails;

        JSONObject payload = new JSONObject();
        payload.put("firstName", firstName);
        payload.put("lastName", lastName);
        payload.put("email", email);

        setUpHeaders();
        return request.body(payload.toString()).when().post(endpoint);

    }

    public static Response getListOfTags(String endpoint){
        setUpHeaders();
        return request.when().get(endpoint);
    }

    public static Response putDataAll(String endpoint, String user_id, String firstNameEdit, String lastNamesEdit, String randomEmailsEdit){
        setUpHeaders();

        String firstName = firstNameEdit;
        String lastName = lastNamesEdit;
        String email = randomEmailsEdit;

        JSONObject payload = new JSONObject();
        payload.put("firstName", firstName);
        payload.put("lastName", lastName);
        payload.put("email", email);


        String finalEndPoint = endpoint + "/" + user_id;
        System.out.println("Final endpoint adalah: "+finalEndPoint);
        return request.body(payload.toString()).when().put(finalEndPoint);

    }

    public static Response deleteUser(String endpoint, String user_id){
        setUpHeaders();
        String finalEndpoint = endpoint + "/" + user_id;
        return request.when().delete(finalEndpoint);

    }


}
