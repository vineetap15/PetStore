// package e2e.steps.pets;

// import io.restassured.http.ContentType;
// import io.restassured.response.Response;

// import org.testng.Assert;

// import helpers.HelperTestMethods;
// import helpers.World;
// import cucumber.api.java.en.Given;
// import cucumber.api.java.en.Then;
// import cucumber.api.java.en.When;
// import utils.Utils;
// import utils.models.pet.CreatePet;

// public class GetPet {

//      private static Response res = null; // Response
//     // Instantiate a Helper Test Methods (htm) Object
//     World world;
//     helpers.HelperTestMethods htm = new HelperTestMethods();
//     CreatePet createPet = new CreatePet();


//     @Given("^the user has GET api of pet$")
// public void the_user_has_GET_api_of_pet() throws Throwable {
//     Utils.setBaseURI(); // Setup Base URI
//     Utils.setContentType(ContentType.JSON); 
        
// }

// @When("^the user hits the GET api with id \"([^\"]*)\"$")
// public void the_user_hits_the_GET_api(String id) throws Throwable {

//     System.out.println(world.getResponseBody());
//     res = Utils.getResponse(id);
//     System.out.println( Utils.getJsonPath(res).toString());
// }

// @Then("^the pet should be validated$")
// public void the_pet_should_be_validated() throws Throwable {
//     htm.checkStatusIs404(res);
//        String bodyStringValue = res.asString();
//     Assert.assertTrue(bodyStringValue.contains("message"));
//     //Assert.assertTrue(bodyStringValue.contains("category"));
//     Assert.assertTrue(bodyStringValue.contains("type"));
//     // Assert.assertTrue(bodyStringValue.contains("photoUrls"));
//     // Assert.assertTrue(bodyStringValue.contains("tags"));
//     //Assert.assertTrue(bodyStringValue.contains("status"));
  
// }

// }



