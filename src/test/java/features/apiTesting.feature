Feature: API Testing for dummy io

  @API
  Scenario: Verify to GET user by newly created ID
    Given Prepare url for "POST_NEW_USER"
    And Hit the POST API
    Then Validate status code is 200
    And Validate response body POST user data
    And Validate response JSON with JSONSchema "post_new_user_normal.json"
    And Prepare url for "GET_USER_BY_ID"
    And Hit the GET User By ID API
    And Validate status code is 200
    And Validate response body GET user data
    And Validate response JSON with JSONSchema "get_user_normal.json"

  @API
  Scenario: Verify to GET user by existing ID
    Given Prepare url for "GET_USER_BY_ID"
    And Valid User ID is "659bba5128dc34892ccdfe9e"
    And Hit the GET User By Existing ID API
    Then Validate status code is 200
    And Validate response body GET user data
    And Validate response JSON with JSONSchema "get_user_normal.json"

  @API
  Scenario: Verify to GET user by inexistent ID
    Given Prepare url for "INVALID_GET_USER_BY_ID"
    And Invalid User ID is "2329879asskdhkjq0"
    And Hit the GET User By Nonexistent ID API
    Then Validate status code is 404

  @API
  Scenario: Verify unable to get GET response from invalid GET endpoint
    Given Prepare url for "INVALID_GET_URL"
    And User ID is "659bba5128dc34892ccdfe9e"
    And Hit the GET User By Existing ID API
    Then Validate status code is 404



  @API
  Scenario: Verify to GET List of Tags
    Given Prepare url for "GET_List_Of_Tags"
    And Hit the GET List Of Tags API
    Then Validate status code is 200
    And Validate response body GET-Tag user data
    And Validate response JSON with JSONSchema "get_list_of_tags.json"

  @API
  Scenario: Verify unable to get GET response from invalid GET Tag List endpoint
    Given Prepare url for "INVALID_GET_TagList_URL"
    And Hit the GET List Of Tags API
    Then Validate status code is 404




  @API
  Scenario: Verify to POST new user
    Given Prepare url for "POST_NEW_USER"
    And Hit the POST API
    Then Validate status code is 200
    And Validate response body POST user data
    And Validate response JSON with JSONSchema "post_new_user_normal.json"

  @API
  Scenario: Verify to POST new user with blank body
    Given Prepare url for "POST_NEW_USER"
    And Hit the POST new user API with blank body
    Then Validate status code is 400
    And Validate response body POST new user data with blank body

  @API
  Scenario: Verify to POST new user with blank firstName
    Given Prepare url for "POST_NEW_USER"
    And Hit the POST new user API with blank firstName
    Then Validate status code is 400
    And Validate response body POST new user data with blank firstName

  @API
  Scenario: Verify to POST new user with blank lastName
    Given Prepare url for "POST_NEW_USER"
    And Hit the POST new user API with blank lastName
    Then Validate status code is 400
    And Validate response body POST new user data with blank lastName


  @API
  Scenario: Verify to POST new user with blank email
    Given Prepare url for "POST_NEW_USER"
    And Hit the POST new user API with blank email
    Then Validate status code is 400
    And Validate response body POST new user data with blank email

  @API
  Scenario: Verify to POST an existing user
    Given Prepare url for "POST_NEW_USER"
    And Hit the POST API with existing user details
    Then Validate status code is 400
    And Validate response body POST new user data with existing user details

  @API
  Scenario: Verify to POST an existing user firstName
    Given Prepare url for "POST_NEW_USER"
    And Hit the POST API with existing user firstName only
    Then Validate status code is 200
    And Validate response body POST user data
    And Validate response JSON with JSONSchema "post_new_user_normal.json"

  @API
  Scenario: Verify to POST an existing user lastName
    Given Prepare url for "POST_NEW_USER"
    And Hit the POST API with existing user lastName only
    Then Validate status code is 200
    And Validate response body POST user data
    And Validate response JSON with JSONSchema "post_new_user_normal.json"

  @API
  Scenario: Verify to POST an existing user email
    Given Prepare url for "POST_NEW_USER"
    And Hit the POST API with existing user email only
    Then Validate status code is 400
    And Validate response body POST new user data with existing user email

  @API
  Scenario: Verify unable to POST new user from invalid endpoint
    Given Prepare url for "INVALID_POST_NEW_USER_URL"
    And Hit the POST API
    Then Validate status code is 404

  @API
  Scenario: Verify to POST new user with invalid email format
    Given Prepare url for "POST_NEW_USER"
    And Hit the POST new user API with invalid email format
    Then Validate status code is 400
    And Validate response body POST new user data with invalid email format








  @API
  Scenario: Verify to PUT new user data
    Given Prepare url for "POST_NEW_USER"
    And Hit the POST API
    And Validate status code is 200
    And Validate response body POST user data
    And Validate response JSON with JSONSchema "post_new_user_normal.json"
    And Prepare url for "PUT_USER_BY_ID"
    And Hit the PUT user data all
    Then Validate status code is 200

  @API
  Scenario: Verify unable to PUT new user from invalid endpoint
    Given Prepare url for "POST_NEW_USER"
    And Hit the POST API
    And Validate status code is 200
    And Validate response body POST user data
    And Validate response JSON with JSONSchema "post_new_user_normal.json"
    And Prepare url for "INVALID_PUT_User_URL"
    And Hit the PUT user data all
    Then Validate status code is 404






  @API
  Scenario: Verify to DELETE new user data
    Given Prepare url for "POST_NEW_USER"
    And Hit the POST API
    And Validate status code is 200
    And Validate response body POST user data
    And Validate response JSON with JSONSchema "post_new_user_normal.json"
    And Prepare url for "DELETE_User"
    And Hit the DELETE user API
    Then Validate status code is 200
    And Validate the response body DELETE user

  @API
  Scenario: Verify to DELETE inexistent user
    Given Prepare url for "DELETE_User"
    And Invalid User ID is "12345hyujd12398oeldjk1234"
    And Hit the DELETE user by inexistent ID API
    Then Validate status code is 400
    And Validate response body DELETE inexistent user

  @API
  Scenario: Verify unable to DELETE new user from invalid endpoint
    Given Prepare url for "POST_NEW_USER"
    And Hit the POST API
    And Validate status code is 200
    And Validate response body POST user data
    And Validate response JSON with JSONSchema "post_new_user_normal.json"
    And Prepare url for "INVALID_DELETE_User_URL"
    And Hit the DELETE user API
    Then Validate status code is 404


