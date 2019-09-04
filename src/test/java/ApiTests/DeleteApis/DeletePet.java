// package ApiTests.deleteApis;

// import io.restassured.http.ContentType;
// import io.restassured.path.json.JsonPath;
// import io.restassured.response.Response;

// import org.testng.annotations.BeforeSuite;
// import org.testng.annotations.Test;

// import helpers.*;
// import utils.Utils;

// public class DeletePet {

//     private static Response res = null; // Response
//     // Instantiate a Helper Test Methods (htm) Object
//     HelperTestMethods htm = new HelperTestMethods();

//     // createPetinput ip = new createPetinput();

//     @BeforeSuite
//     public void setup() {

//         Response res = null; //Response

//         Utils.setBaseURI();
//         //Utils.setBasePath("10");
//         Utils.setJsonPathTerm("/100");
//         Utils.getPetDeleteResponse(ContentType.JSON);

//     }

//     @Test
//     public void T01_StatusCodeTest() {
//         // Verify the http response status returned. Check Status Code is 200?
//         htm.checkStatusIs200(res);
//     }

// }