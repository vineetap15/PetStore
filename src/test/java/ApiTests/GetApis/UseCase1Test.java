package ApiTests.GetApis;

import utils.Utils;
import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.path.json.JsonPath;
import com.jayway.restassured.response.Response;
import org.testng.*;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import java.util.*;
import ApiTests.*;

import static org.hamcrest.Matchers.containsString;

public class UseCase1Test {

    private Response res = null; //Response
    private JsonPath jp = null; //JsonPath

    //Instantiate a Helper Test Methods (htm) Object
    HelperTestMethods htm = new HelperTestMethods();

    @BeforeSuite
    public void setup (){
        //Test Setup
        Utils.setBaseURI(); //Setup Base URI
        //Utils.setBasePath("search"); //Setup Base Path
        Utils.setContentType(ContentType.JSON); //Setup Content Type
        //Utils.setJsonPathTerm("videos.json"); //Setup Json Path Term
       // Utils.createSearchQueryPath("paris hilton", "num_of_videos", "5"); //Set up search term, param and param value
        res = Utils.getResponse("2"); //Get response
        jp = Utils.getJsonPath(res); //Set JsonPath
    }

    @Test
    public void T01_StatusCodeTest() {
        //Verify the http response status returned. Check Status Code is 200?
        htm.checkStatusIs200(res);
    }

    @Test
    public void T02_SearchTermTest() {
        //Verify the title is correct
        Assert.assertEquals(("Cats"),jp.get("category.name"),"Category Name is wrong!");
    }

    @Test
    public void TO3_VerifyName(){
        Assert.assertEquals(("Cat 2"),jp.get("name"),"Name is wrong!");
    }

    @Test
    public void TO4_VerifyphotoUrls(){
        ArrayList petlist = jp.get("photoUrls");
        System.out.println(petlist);
        for(int i=1;i<=petlist.size();i++){
            Assert.assertEquals(("url"+i),jp.get("photoUrls["+(i-1)+"]"),"photoUrls "+i+ "is wrong!");

        }
    }

    // @Test
    // public void TO4_Verifytags(){
    //     Assert.assertEquals("tags id1 is wrong!",(1),jp.get("tags[0].id"));
    //     Assert.assertEquals("tags name1 is wrong!",("tag2"),jp.get("tags[0].name"));

    //     Assert.assertEquals("tags id2 is wrong!",(2),jp.get("tags[1].id"));
    //     Assert.assertEquals("tags name2 is wrong!",("tag3"),jp.get("tags[1].name"));
    // }

    // @Test
    // public void T03_verifyOnlyFiveVideosReturned() {
    //     //Verify that only 5 video entries were returned
    //     Assert.assertEquals("Video Size is not equal to 5", 5, htm.getVideoIdList(jp).size());
    // }

    // @Test
    // public void T04_duplicateVideoVerification() {
    //     //Verify that there is no duplicate video
    //     assertTrue("Duplicate videos exist!", htm.findDuplicateVideos(htm.getVideoIdList(jp)));
    // }

    // @Test
    // public void T05_printAttributes() {
    //     //Print video title, pubDate & duration
    //     printTitlePubDateDuration(jp);
    // }

    // @After
    // public void afterTest (){
    //     //Reset Values
    //     Utils.resetBaseURI();
    //     Utils.resetBasePath();
    // }

    // //*******************
    // //***Local Methods***
    // //*******************
    // //Prints Attributes
    // private void printTitlePubDateDuration (JsonPath jp) {
    //     for(int i=0; i <htm.getVideoIdList(jp).size(); i++ ) {
    //         System.out.println("Title: " + jp.get("items.title[" + i + "]"));
    //         System.out.println("pubDate: " + jp.get("items.pubDate[" + i + "]"));
    //         System.out.println("duration: " + jp.get("items.duration[" + i + "]"));
    //         System.out.print("\n");
    //     }
    // }
}

