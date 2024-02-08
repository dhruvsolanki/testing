package com.goit.app;

import com.google.gson.Gson;

/**
 * Print name and surname in JSON
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        User user = new User();
        user.setName("Dhruv");
        user.setSurname("Batyashov");
        String json = new Gson().toJson(user);
        System.out.println(json);
    }
}
