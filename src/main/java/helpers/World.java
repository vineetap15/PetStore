package helpers;
import io.restassured.response.Response;

public class World{
    private Response res =null;

public void setResponse(Response response) {
    this.res = response;
}
public String getResponseBody(){
    return res.getBody().asString();
}

public int getResponseStatusCode(){
    return res.getStatusCode();
}

public Response getResponse(){
    return res;
}

}