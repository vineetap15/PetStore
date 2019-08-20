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

public class UpdatePet {

    /**
     *
     */
    
    private static Response res = null; // Response
    // Instantiate a Helper Test Methods (htm) Object
    HelperTestMethods htm = new HelperTestMethods();
    CreatePet createPet = new CreatePet();


    @Given("^the user has PUT api of pet$")
public void the_user_has_PUT_api_of_pet() throws Throwable {
    Utils.setBaseURI(); // Setup Base URI
}

@When("^the user enters the new pet details$")
public void the_user_enters_the_new_pet_details() throws Throwable {
    createPet.setId(101);

        ObjectMapper mp = new ObjectMapper();
        Category ct = mp.convertValue(PetData.categoryData(), Category.class);
        Tag tag = mp.convertValue(PetData.tagData(), Tag.class);

        createPet.setCategory(ct);
        createPet.setName("browny");
        ArrayList<String> photoUrls = new ArrayList<String>();
        photoUrls.add("photo1_updated");
        photoUrls.add("photo2_upatd");
        createPet.setPhotoUrls(photoUrls);

        ArrayList<Tag> tags = new ArrayList<Tag>();
        tags.add(tag);
        createPet.setTags(tags);
        createPet.setStatus("sold");
   
}

@When("^the user hits the api$")
public void the_user_hits_the_api() throws Throwable {
    res = Utils.getPetPutResponse(ContentType.JSON, createPet); // get put reponse
    Utils.getJsonPath(res); 
}

@Then("^THE_PET_SHOULD_BE_UPDATED$")
public void the_pet_should_be_updated() throws Throwable {
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



