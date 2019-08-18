package utils.models.pet;


import java.util.HashMap;

public class PetData{

public static HashMap<String,String> categoryData(){

    HashMap<String,String> hm = new HashMap<String,String>();
    hm.put("id", "101");
    hm.put("name", "browny");

    return hm;
}

public static HashMap<String,String> tagData(){

    HashMap<String,String> hm = new HashMap<String,String>();
    hm.put("id", "101");
    hm.put("name", "tagbrowny");

    return hm;
}

}