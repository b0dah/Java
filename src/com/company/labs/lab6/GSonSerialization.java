package com.company.labs.lab6;

import com.google.gson.Gson;

public class GSonSerialization {

    public static void serializeInstance(UserModel user){
        Gson gson = new Gson();
        String userJson = gson.toJson(user);
        System.out.println(userJson);
    }

    public static UserModel deserializeInstance( String json ){
        Gson gson = new Gson();
        UserModel user = gson.fromJson(json, UserModel.class);

        return user;
    }

    public static void main(String[] args) {
        UserModel user = new UserModel("Dave", "@mail");
        serializeInstance(user);

        String userJson = "{'name':'Dave','email':'@mail'}";
        System.out.println(deserializeInstance(userJson).name);
    }

}
