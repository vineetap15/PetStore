package ApiTests.Steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import java.util.ArrayList;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

import org.testng.Assert;

import ApiTests.HelperTestMethods;
import utils.Utils;
import utils.models.pet.Category;
import utils.models.pet.CreatePet;
import utils.models.pet.PetData;
import utils.models.pet.Tag;

public class DeletePet {

    /**
     *
     */
    
    private static Response res = null; // Response
    // Instantiate a Helper Test Methods (htm) Object
    HelperTestMethods htm = new HelperTestMethods();
    CreatePet createPet = new CreatePet();


    @Given("^the user has DELETE api of pet$")
public void the_user_has_DELETE_api_of_pet() throws Throwable {
    Utils.setBaseURI(); // Setup Base 
    Utils.setBasePath("1101");

}

@When("^the user hits the delete api$")
public void the_user_hits_the_delete_api() throws Throwable {
    res = Utils.getPetDeleteResponse(ContentType.JSON); // get put reponse
    Utils.getJsonPath(res); 
}

@Then("^the pet should be deleted$")
public void the_pet_should_be_deleted() throws Throwable {
    htm.checkStatusIs200(res);
    
  
}


}



