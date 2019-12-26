package com.hillel.lecture_14;

import org.apache.commons.lang.math.NumberUtils;

import java.util.*;

/**
 * Create json converter. User object should be present in key-value pair, all field should be like Map;
 * F.E:
 * public class User {
 *
 *     private String name;
 *
 * }
 *
 * Should be present as json {"name": "bob"}
 * @see <a href="https://www.w3schools.com/whatis/whatis_json.asp">JSON</a>
 */
public class JsonConverter {


    public String convertToJsonString(List<User> users) {

        String result = "";
        String jsonStart = "\"[";
        String jsonEnd = "]\"";

        for (int i = 0; i <users.size(); i++){
            if (i != 0){
                result += ",";
            }
            result += convertUserToJson(users.get(i));
        }
        return jsonStart + result + jsonEnd;
    }

    public String convertUserToJson(User users) {
        String result = "";
        String jsonOpen = "{";
        String jsonClose = "}";

        Map<String, String> userInfo = new LinkedHashMap<>();
        userInfo.put("id", String.valueOf(users.getId()));
        userInfo.put("firstName", "\"" + users.getFirstName() + "\"");
        userInfo.put("lastName", "\"" + users.getLastName() + "\"");
        userInfo.put("age", String.valueOf(users.getAge()));
        userInfo.put("gender", "\"" + users.getGender() + "\"");
        userInfo.put("company", "\"" + users.getCompany() + "\"");
        userInfo.put("email", "\"" + users.getEmail() + "\"");


        String userPhone = "";
        for (int i = 0; i <  users.getPhone().size(); i++) {
            if (i != 0){
                userPhone += ",";
            }
            userPhone += "\"" + users.getPhone().get(i) + "\"";
        }
        userInfo.put("phone", "[" + userPhone + "]");

        String userAddress;
        userAddress = "{" + "\"city\":" + "\"" + users.getAddress().getCity() + "\"," + "\"street\":" + "\"" + users.getAddress().getStreet() + "\"" + "}";
        userInfo.put("address", userAddress);

        String userFriends = "";
        for (int i = 0; i < users.getFriends().size(); i++) {
            if (i != 0) {
                userFriends += ",";
            }
            Friend friend = users.getFriends().get(i);
            userFriends += "{\"id\":" + friend.getId() + ",\"firstName\":\"" + friend.getFirstName() + "\"" + ",\"lastName\":\"" + friend.getLastName() + "\"}";
        }
        userInfo.put("friends", "[" + userFriends + "]");


        Set<Map.Entry<String, String>> entries = userInfo.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            String row;
                if (entry.getKey() == "friends") {
                     row = entry.getKey() + "\"" + ":" + entry.getValue();
                } else {
                    row = entry.getKey() + "\"" + ":" + entry.getValue() + ",";
                }

            result += "\"" + row;
        }

        return jsonOpen + result + jsonClose;

    }

    public String convertToJsonString(User users) {
        String result = "\"";
        result += convertUserToJson(users);
        result += "\"";
        return result;
    }
}
