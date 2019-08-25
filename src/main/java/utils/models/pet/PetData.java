package utils.models.pet;


import java.util.HashMap;

public class PetData{

public static HashMap<String,String> categoryData(){

    HashMap<String,String> hm = new HashMap<String,String>();
    hm.put("id", "1031");
    hm.put("name", "bdrowny");

    return hm;
}

public static HashMap<String,String> tagData(){

    HashMap<String,String> hm = new HashMap<String,String>();
    hm.put("id", "1001");
    hm.put("name", "tagbrowny");

    return hm;
}

}