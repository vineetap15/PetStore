package utils;

import static com.jayway.restassured.RestAssured.get;
import static com.jayway.restassured.RestAssured.given;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.path.json.JsonPath;
import com.jayway.restassured.response.Response;

import utils.models.pet.CreatePet;
import utils.models.user.CreateUser;

public class Utils {
    //Global Setup Variables
    public static String path;
    public static String jsonPathTerm;

    //Sets Base URI
    public static void setBaseURI (){
        //RestAssured.baseURI = "https://petstore.swagger.io/v2/pet";
        //RestAssured.baseURIDelete = "https://petstore.swagger.io/v2/pet";
        RestAssured.baseURI = "https://petstore.swagger.io/v2/user/createWithList";
    }

    //Sets base path
    public static void setBasePath(String basePathTerm){
        RestAssured.basePath = basePathTerm;
    }

    //Reset Base URI (after test)
    public static void resetBaseURI (){
        RestAssured.baseURI = null;
    }

    //Reset base path
    public static void resetBasePath(){
        RestAssured.basePath = null;
    }

    //Sets ContentType
    public static void setContentType(ContentType Type){
        given().contentType(Type);
    }

    //Sets Json path term
    public static void  setJsonPathTerm(String jsonPath){
        jsonPathTerm = jsonPath;
    }

    //Sets the input body request
    public static Response getPostResponse(ContentType Type,String input){
        
        return given().contentType(Type).body(input).post();
    }

    //Sets the input body request
    public static Response getPetPostResponse(ContentType Type,CreatePet input){
        
        return given().contentType(Type).body(input).post();
    }

    public static Response getUserPostResponse(ContentType Type,CreateUser input){
        
        return given().contentType(Type).body(input).post();
    }

    public static Response getPetPutResponse(ContentType Type,CreatePet input){
        
        return given().contentType(Type).body(input).put();
    }

    public static Response getPetDeleteResponse(ContentType Type){
        
        return given().contentType(Type).delete(RestAssured.basePath);
    }

    //Created search query path
    public static void  createSearchQueryPath(String searchTerm, String param, String paramValue) {
        path = jsonPathTerm + "?" + param + "=" + paramValue;
    }

    //Returns response
    public static Response getResponse(String id) {
        //System.out.print("path: " + path +"\n");
        return get(id);
    }

    //Returns response 
    public static Response getResponse() {
        //System.out.print("path: " + path +"\n");
        return get(path);
    }

    

    //Returns JsonPath object
    public static JsonPath getJsonPath (Response res) {
        String json = res.asString();
        //System.out.print("returned json: " + json +"\n");
        return new JsonPath(json);
    }
}
