// package ApiTests.PostApis;


// import utils.Utils;
// import io.restassured.http.ContentType;
// import io.restassured.path.json.JsonPath;
// import io.restassured.response.Response;
// import org.hamcrest.Matchers;
// import static org.hamcrest.MatcherAssert.assertThat;

// import java.util.ArrayList;
// import org.testng.*;
// import org.testng.annotations.BeforeSuite;
// import org.testng.annotations.Test;
// import ApiTests.*;

// public class UseCase7Test {
//     private Response res = null; //Response
//     private JsonPath jp = null; //JsonPath

//     //Instantiate a Helper Test Methods (htm) Object
//     HelperTestMethods htm = new HelperTestMethods();

//     createPetinput ip = new createPetinput();
        

//     @BeforeSuite
//     public void setup (){
//         //Test Setup
//         Utils.setBaseURI(); //Setup Base URI
//         //Utils.setBasePath("video"); //Setup Base Path
//         //Create a path (It can be done via Utils method. I created manually.)
//         //Utils.path = "list/info.json?video_ids=518793166&num_related_return=5";
//         //Utils.setContentType(ContentType.JSON); //Setup Content Type

//         res= Utils.getPostResponse(ContentType.JSON,ip.getpayload()); //get post reponse
//         jp = Utils.getJsonPath(res); //Set JsonPath
//     }

//     @Test
//     public void createPet(){
//         Pet pet = new Pet();
//         pet.id("1")
//             .setCategory("1","abc")
//             .name("vin")
//             .photoUrls["tstrings"]
//             .setTags("1","alk")
//             .status("available");
//     }

//     private String id;
//     private String categoryid;
//     private String categoryname;
//     private String name;
//     private String photoUrls[];
//     private String tags[];
//     private String status;
//     private String tagsid;
//     private String tagsname;

//     @Test
//     public void T01_StatusCodeTest() {
//         //Verify the http response status returned. Check Status Code is 200?
//         htm.checkStatusIs200(res);
//     }

//     @Test
//     public void T02_JsonTest() {
//         //Verify the http response json
//         String bodyStringValue = res.asString();
//         Assert.assertTrue(bodyStringValue.contains("id"));
//         Assert.assertTrue(bodyStringValue.contains("category"));
//         Assert.assertTrue(bodyStringValue.contains("name"));
//         Assert.assertTrue(bodyStringValue.contains("photoUrls"));
//         Assert.assertTrue(bodyStringValue.contains("tags"));
//         Assert.assertTrue(bodyStringValue.contains("status"));
//     }

    

    
// }
