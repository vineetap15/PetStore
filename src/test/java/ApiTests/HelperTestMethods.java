package ApiTests;

import com.jayway.restassured.path.json.JsonPath;
import com.jayway.restassured.response.Response;
import org.testng.Assert;
import java.util.*;


public class HelperTestMethods {
    //Verify the http response status returned. Check Status Code is 200?
    public void checkStatusIs200 (Response res) {
        Assert.assertEquals(res.getStatusCode(),200,"Status Check Failed!");
    }

    public void checkStatusIs400 (Response res) {
        Assert.assertEquals(400, res.getStatusCode(),"Status Check Failed!");
    }

    public void checkStatusIs404 (Response res) {
        Assert.assertEquals(404, res.getStatusCode(),"Status Check Failed!");
    }


    //Get Video Ids (For use case-1)
    public ArrayList getPetList (JsonPath jp) {
        ArrayList petIdList = jp.get("id");
        return petIdList;
    }

    //Get Related Video Ids (For use case-2)
    public ArrayList getRelatedVideoIdList (JsonPath jp) {
        ArrayList relatedVideoList = jp.get("items.related.id");
        //In order to split first element of ArrayList and assign it to a new ArrayList, I did below operation.
        ArrayList splittedRelatedVideoList = (ArrayList) relatedVideoList.get(0);
        return splittedRelatedVideoList;
    }

    //Merge videoIdList and relatedVideoIdList as mergedVideoList
    public ArrayList mergeLists (ArrayList videoList, ArrayList relatedVideoList){
        ArrayList mergedVideoList = new ArrayList(videoList);
        mergedVideoList.addAll(relatedVideoList);
        return mergedVideoList;
    }

    //Find Duplicate Videos
    public boolean findDuplicateVideos (List<Integer> videoIdList) {
         for (int i=0; i< videoIdList.size(); i++) {
            if(Collections.frequency(videoIdList, videoIdList.get(i)) > 1){
                System.out.println("This video id is duplicated: " + videoIdList.get(i));
                return false;
            }
        }
        return true;
    }
}
