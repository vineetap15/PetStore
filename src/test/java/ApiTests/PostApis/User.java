package ApiTests.postApis;

import static utils.Utils.getUserPostResponse;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import ApiTests.HelperTestMethods;
import utils.Utils;
import utils.models.user.CreateUser;
import utils.models.user.UserData;

public class User {
    private static Response res =null;
    HelperTestMethods htm = new HelperTestMethods();

    @BeforeSuite
    public void setup(){
        CreateUser user =new CreateUser();


        ObjectMapper mp = new ObjectMapper();
        mp.convertValue(UserData.userData("101","user1","vinee","pandee","be@test.com","123","1234","0"), CreateUser.class);
        mp.convertValue(UserData.userData("102","user2","frygt","prte","tye@test.com","323","124534","1"), CreateUser.class);

        Utils.setBaseURI();
        res = getUserPostResponse(ContentType.JSON, user); // get post reponse
        Utils.getJsonPath(res);
    }

    @Test
    public void T01_StatusCodeTest() {
        // Verify the http response status returned. Check Status Code is 200?
        htm.checkStatusIs200(res);
    }

    @Test
    public void T02_JsonTest() {
        // Verify the http response json
        String bodyStringValue = res.asString();
        Assert.assertTrue(bodyStringValue.contains("id"));
        Assert.assertTrue(bodyStringValue.contains("category"));
        Assert.assertTrue(bodyStringValue.contains("name"));
        Assert.assertTrue(bodyStringValue.contains("photoUrls"));
        Assert.assertTrue(bodyStringValue.contains("tags"));
        Assert.assertTrue(bodyStringValue.contains("status"));
    }

}
