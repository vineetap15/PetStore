// package ApiTests.postApis;

// import java.util.ArrayList;

// import com.fasterxml.jackson.databind.ObjectMapper;
// import io.restassured.http.ContentType;
// import io.restassured.response.Response;

// import org.testng.Assert;
// import org.testng.annotations.BeforeSuite;
// import org.testng.annotations.Test;

// import helpers.HelperTestMethods;
// import utils.Utils;
// import utils.models.pet.CreatePet;
// import utils.models.pet.Tag;

// public class Pet {

//     private static Response res = null; // Response
//     // Instantiate a Helper Test Methods (htm) Object
//     HelperTestMethods htm = new HelperTestMethods();

//     // createPetinput ip = new createPetinput();

//     @BeforeSuite
//     public void setup() {

//         CreatePet createPet = new CreatePet();
//         createPet.setId(101);

//         ObjectMapper mp = new ObjectMapper();
//         Category ct = mp.convertValue(PetData.categoryData(), Category.class);
//         Tag tag = mp.convertValue(PetData.tagData(), Tag.class);

//         createPet.setCategory(ct);
//         createPet.setName("jackie");
//         ArrayList<String> photoUrls = new ArrayList<String>();
//         photoUrls.add("photo1");
//         photoUrls.add("photo2");
//         createPet.setPhotoUrls(photoUrls);

//         ArrayList<Tag> tags = new ArrayList<Tag>();
//         tags.add(tag);
//         createPet.setTags(tags);
//         createPet.setStatus("available");

//         // Test Setup
//         Utils.setBaseURI(); // Setup Base URI
//         // Utils.setBasePath("video"); //Setup Base Path
//         // Create a path (It can be done via Utils method. I created manually.)
//         // Utils.path = "list/info.json?video_ids=518793166&num_related_return=5";
//         // Utils.setContentType(ContentType.JSON); //Setup Content Type
//         res = Utils.getPetPostResponse(ContentType.JSON, createPet); // get post reponse
//         Utils.getJsonPath(res);
//     }

//     @Test
//     public void T01_StatusCodeTest() {
//         // Verify the http response status returned. Check Status Code is 200?
//         htm.checkStatusIs200(res);
//     }

//     @Test
//     public void T02_JsonTest() {
//         // Verify the http response json
//         String bodyStringValue = res.asString();
//         Assert.assertTrue(bodyStringValue.contains("id"));
//         Assert.assertTrue(bodyStringValue.contains("category"));
//         Assert.assertTrue(bodyStringValue.contains("name"));
//         Assert.assertTrue(bodyStringValue.contains("photoUrls"));
//         Assert.assertTrue(bodyStringValue.contains("tags"));
//         Assert.assertTrue(bodyStringValue.contains("status"));
//     }

//     @Test
//     public void T03_JsonTest() {
//         // Verify the http response json
//         String bodyStringValue = res.asString();
//         Assert.assertTrue(bodyStringValue.contains("id"));
//         Assert.assertTrue(bodyStringValue.contains("category"));
//         Assert.assertTrue(bodyStringValue.contains("name"));
//         Assert.assertTrue(bodyStringValue.contains("photoUrls"));
//         Assert.assertTrue(bodyStringValue.contains("tags"));
//         Assert.assertTrue(bodyStringValue.contains("status"));
//     }


// }