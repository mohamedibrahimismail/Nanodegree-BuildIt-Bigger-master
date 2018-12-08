package com.udacity.gradle.builditbigger.backend;

/** The object model for the data we are sending through endpoints */
import com.e.k.m.a.jokejava.MyClass;

public class MyBean {

    private String myData;

    public String getData() {
        myData = new MyClass().getJoke();
        return myData;
    }

    public void setData(String data) {
        myData = data;
    }
}