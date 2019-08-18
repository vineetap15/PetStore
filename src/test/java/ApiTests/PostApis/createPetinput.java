package ApiTests.PostApis;

public class createPetinput{

    public  String payload;

    public String getpayload (){

        payload = "{\n" +
    	        "  \"id\": \"1\",\n" +
    	        "  \"name\": \"vin\",\n" +
    	        "  \"category\":{\n" +
    	        "       \"id\":\"1\",\n" +
    	        "        \"name\":\"vinee\"\n" +
    	            "},\n"+
    	        "   \"photoUrls\": [ \n" +
    	            "\"strings\"\n" +
    	            "],\n " +
    	        "\"tags\": [\n   " +
    	        "{\n" +
    	        "       \"id\":\"1\",\n" +
    	        "        \"name\":\"alk\"\n" +
    	                "}\n " +
    	        "],\n" +
    	        "  \"status\": \"available\"\n" +
    	        "}";

        return payload;
    }
}