package e2e.steps.pets;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static io.restassured.path.json.JsonPath.from;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import org.testng.Assert;
import helpers.HelperTestMethods;
import helpers.World;
import utils.Utils;
import utils.models.pet.Category;
import utils.models.pet.CreatePet;
import utils.models.pet.Tag;

public class ValidatePet {
    // private static Response res = null; // Response
    // Instantiate a Helper Test Methods (htm) Object

    HelperTestMethods htm = new HelperTestMethods();
    CreatePet createPet = new CreatePet();
    ObjectMapper mp = new ObjectMapper();
    World world = new World();
    Map<String, String> ct1 = new HashMap<String, String>();
    static String id = "";

    @When("^the user enters the category data \"([^\"]*)\" and \"([^\"]*)\"$")
    public void the_user_enters_the_category_data(String id,String name) throws Throwable {
        Category cat = new Category();
        cat.setId(Integer.parseInt(id));
        cat.setName(name);
        Category ct = mp.convertValue(cat, Category.class);
        createPet.setCategory(ct);
    }

    @When("^the user enters the pet name \"([^\"]*)\"$")
    public void the_user_enters_the_pet_name(String petname) throws Throwable {
        createPet.setName(petname);
    }

    @When("^the user enters the photo URLs$")
    public void the_user_enters_the_photo_URLs(List<String> photourl) throws Throwable {
        createPet.setPhotoUrls(photourl);
    }

    @When("^the user enters the tag data$")
    public void the_user_enters_the_tag_data(Map<String, String> tag) throws Throwable {
        Tag t = mp.convertValue(tag, Tag.class);
        ArrayList<Tag> tags = new ArrayList<Tag>();
        tags.add(t);
        createPet.setTags(tags);
    }

    @When("^the user enters the status \"([^\"]*)\"$")
    public void the_user_enters_the_status(String status) throws Throwable {
        createPet.setStatus(status);
    }

    @Given("^the user has POST api of pet$")
public void the_user_has_POST_api_of_pet() throws Throwable {
    Utils.setBaseURI(); // Setup Base URI
}
    @When("^the user hits the api$")
    public void the_user_hits_the_api() throws Throwable {
        Response res = Utils.getPetPostResponse(ContentType.JSON, createPet); // get post reponse
        world.setResponse(res);
        System.out.println("response is ---> " + world.getResponseBody());
        id = from(world.getResponseBody()).getString("id");
        List urls = from(world.getResponseBody()).getList("photoUrls");
        Map category = from(world.getResponseBody()).getMap("category");
        System.out.println("id is  -----> " + id);
        System.out.println("urls are  -----> " + urls.toString());
        System.out.println("urls are  -----> " + category.toString());
        System.out.println(world.getResponseStatusCode());
        Utils.getJsonPath(res);
    }

    @Then("^the pet should be created$")
    public void the_pet_should_be_created() throws Exception {
        try{
            htm.checkStatusIs200(world.getResponse());

        } catch(Exception e){
            System.out.println("The exception is handeled " +e.toString());
        }

        String bodyStringValue = world.getResponseBody();
        Assert.assertTrue(bodyStringValue.contains("id"));
        Assert.assertTrue(bodyStringValue.contains("category"));
        Assert.assertTrue(bodyStringValue.contains("name"));
        Assert.assertTrue(bodyStringValue.contains("photoUrls"));
        Assert.assertTrue(bodyStringValue.contains("tags"));
        Assert.assertTrue(bodyStringValue.contains("status"));

    }

    @Given("^the user has GET api of pet$")
    public void the_user_has_GET_api_of_pet() throws Throwable {
        Utils.setBaseURI(); // Setup Base URI
        Utils.setContentType(ContentType.JSON);
    }

    @When("^the user hits the GET api with id$")
    public void the_user_hits_the_GET_api_with_id() throws Throwable {
        System.out.println("this.id  "  +id );
        Response res1 = Utils.getResponse(id);
        world.setResponse(res1);
        System.out.println(Utils.getJsonPath(res1).toString());
    }

    @Then("^the pet should be validated$")
    public void the_pet_should_be_validated() throws Exception {

        try{
            htm.checkStatusIs200(world.getResponse());

        } catch(Exception e){
            System.out.println("The exception is handeled " +e.toString());
        }

        // if (world.getResponseStatusCode() == 200) {
        //     htm.checkStatusIs200(world.getResponse());
        //     System.out.println("response of GET is ---> " + world.getResponseBody());
        //     String getpetid = from(world.getResponseBody()).getString("id");
        //     Assert.assertEquals(getpetid, this.id);
        // } else if (world.getResponseStatusCode() == 404) {
        //     htm.checkStatusIs404(world.getResponse());
        //     String bodyStringValue = world.getResponseBody();
        //     Assert.assertTrue(bodyStringValue.contains("message"));
        //     // Assert.assertTrue(bodyStringValue.contains("category"));
        //     Assert.assertTrue(bodyStringValue.contains("type"));
        // }

    }
}
