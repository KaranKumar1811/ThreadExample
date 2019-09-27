package com.lambton;

import org.json.JSONObject;

public class JSONHandiling {
    public static void main(String[] args) {
        JSONObject obj=new JSONObject();

        obj.put("sid",1);
        obj.put("snm","Karan Kumar");
        obj.put("marks",100.34);

      //  System.out.println(obj);

        String jsonString=JSONObject.valueToString(obj);

        JSONObject jsonObject=new JSONObject(jsonString);


        System.out.println("Student ID : "+jsonObject.getInt("sid"));
        System.out.println("Name : "+jsonObject.getString("snm"));
        System.out.println("Marks : "+jsonObject.getFloat("marks"));




        
    }
}
