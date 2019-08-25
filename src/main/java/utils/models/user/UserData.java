package utils.models.user;

import java.util.HashMap;

public class UserData {


    public static HashMap<String,String> userData(String id,String username,String firstname,String lastname, String email, String password,String phone, String userstatus){

        HashMap<String,String> hm = new HashMap<String,String>();
        hm.put("id",id);
        hm.put("username",username);
        hm.put("firstName", firstname);
        hm.put("lastName", lastname);
        hm.put("email", email);
        hm.put("password", password);
        hm.put("phone", phone);
        hm.put("userStatus", userstatus);

        return hm;
        
    }
}