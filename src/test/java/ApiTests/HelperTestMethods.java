package ApiTests;

import com.jayway.restassured.response.Response;

import org.testng.Assert;


public class HelperTestMethods {
    //Verify the http response status returned. Check Status Code is 200?
    public void checkStatusIs200 (Response res) {
        Assert.assertEquals(res.getStatusCode(),200,"Status Check Failed!");
    }

    public void checkStatusIs202 (Response res) {
        Assert.assertEquals(res.getStatusCode(),202,"Status Check Failed!");
    }

    public void checkStatusIs400 (Response res) {
        Assert.assertEquals(400, res.getStatusCode(),"Status Check Failed!");
    }

    public void checkStatusIs404 (Response res) {
        Assert.assertEquals(404, res.getStatusCode(),"Status Check Failed!");
    }

}
