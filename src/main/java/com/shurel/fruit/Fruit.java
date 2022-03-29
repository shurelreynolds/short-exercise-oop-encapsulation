package com.shurel.fruit;

public class Fruit{
    protected String name;

    public Fruit(String name, String color, String countryOfOrigin) {
        this.name = name;
        this.color = color;
        this.countryOfOrigin = countryOfOrigin;
    }

    protected String color;
    protected String countryOfOrigin;

    public String getDetails(){
        return name+" "+color+" "+countryOfOrigin;
    }
}

