package ApiTests.steps.pets;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

import org.testng.Assert;

import ApiTests.HelperTestMethods;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.Utils;
import utils.models.pet.CreatePet;

public class GetPet {

    private static Response res = null; // Response
    // Instantiate a Helper Test Methods (htm) Object
    HelperTestMethods htm = new HelperTestMethods();
    CreatePet createPet = new CreatePet();


    @Given("^the user has GET api of pet$")
public void the_user_has_GET_api_of_pet() throws Throwable {
    Utils.setBaseURI(); // Setup Base URI
    Utils.setContentType(ContentType.JSON); 
        
}

@When("^the user hits the GET api$")
public void the_user_hits_the_GET_api() throws Throwable {
    res = Utils.getResponse("/2");
    Utils.getJsonPath(res);
}

@Then("^the pet details should be fetched$")
public void the_pet_details_should_be_fetched() throws Throwable {
    htm.checkStatusIs200(res);
    String bodyStringValue = res.asString();
    Assert.assertTrue(bodyStringValue.contains("id"));
    Assert.assertTrue(bodyStringValue.contains("category"));
    Assert.assertTrue(bodyStringValue.contains("name"));
    Assert.assertTrue(bodyStringValue.contains("photoUrls"));
    Assert.assertTrue(bodyStringValue.contains("tags"));
    Assert.assertTrue(bodyStringValue.contains("status"));
  
}


}



