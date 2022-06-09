package com.adin.restfulwebservice;

public class Greeting {

    private final long id;
    private final String username;
    public Greeting(long id, String username){
        this.id = id;
        this.username = username;
    }

    public long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

}
