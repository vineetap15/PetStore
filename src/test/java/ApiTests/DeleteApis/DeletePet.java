package ApiTests.DeleteApis;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.path.json.JsonPath;
import com.jayway.restassured.response.Response;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import ApiTests.HelperTestMethods;
import utils.Utils;

public class DeletePet {

    private static Response res = null; // Response
    // Instantiate a Helper Test Methods (htm) Object
    HelperTestMethods htm = new HelperTestMethods();

    // createPetinput ip = new createPetinput();

    @BeforeSuite
    public void setup() {

        Response res = null; //Response

        Utils.setBaseURI();
        Utils.setBasePath("/10");
        Utils.getPetDeleteResponse(ContentType.JSON);

    }

    @Test
    public void T01_StatusCodeTest() {
        // Verify the http response status returned. Check Status Code is 200?
        htm.checkStatusIs200(res);
    }

}