package com.julie.eunju.project.controller;

import java.util.*;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/* Constructed a controller that contains functional routes of application from the localhost.  
 * Each function in the controller returns one of the following values: string, integer, list, or JSON object.
 * Used RequesMapping annotation to map web requests onto specific handler class and methods.
 * Specific values returned by the functions are commented below.
*/
@RestController
public class APIProjectController {

    // returns a string value containing a greeting message to be 
    // displayed on a path called "greeting"
    @RequestMapping("/greeting")
    public String getGreeting(){
        return "Java Spring Framework Test --- Hello There!";
    }

    // returns a single string value "success" to be displayed on a path called "string"
    @RequestMapping("/string")
    public String getString(){
        return "Success";
    }

    // returns an integer value to be displayed on a path called "number"
    @RequestMapping("/number")
    public int getInt(){
        return 2;
    }

    // returns a list of integers to be displayed on a path called "list"
    @RequestMapping("/list")
    public List<String> getList(){
        List<String> numbers =new ArrayList<String>();
        numbers.add("1");
        numbers.add("2");
        numbers.add("3");
        numbers.add("4");
        return numbers;
    }

    // returns a JSON object that contains a key and value pair to be displayed on a path called "js"
    @RequestMapping("/js")
    public Map<String, String> getJSonObject(){
        Map<String, String> map = new HashMap<>();
        map.put("key", "value");
        return map;
    }

    // returns a JSON object that contains a key and JSON object as a value pair to be displayed on a path called "js2"
    @RequestMapping("/js2")
    public Map<String, Object> getJSObject2(){
        Map<String, String> innerMap = new HashMap<>();
        innerMap.put("key", "value");

        Map<String, Object> map = new HashMap<>();
        map.put("key", innerMap);
        
        return map;
    }
}
