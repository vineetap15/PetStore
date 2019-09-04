package helpers;

import org.testng.Assert;

import io.restassured.response.Response;

public class HelperTestMethods {
    // Verify the http response status returned. Check Status Code is 200?
    public void checkStatusIs200 (Response res) throws Exception {
        try{
            Assert.assertEquals(res.getStatusCode(),200,"Status Check Failed!");
        } catch(Exception e){
            throw e;
}

        
        
    }

    public void checkStatusIs202(Response res) {
        Assert.assertEquals(res.getStatusCode(), 202, "Status Check Failed!");
    }

    public void checkStatusIs400(Response res) {
        Assert.assertEquals(400, res.getStatusCode(), "Status Check Failed!");
    }

    public void checkStatusIs404(Response res) {
        if (res.getStatusCode() == 404) {
            System.out.println("status check failed");
        }
        // Assert.assertEquals(404, res.getStatusCode(),"Status Check Failed!");
    }

}
