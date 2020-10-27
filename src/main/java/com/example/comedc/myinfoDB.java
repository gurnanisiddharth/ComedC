package com.example.comedc;

public class myinfoDB {
    String name;
    String blood_group;
    String height;
    String weight;

    myinfoDB() {

    }

    public myinfoDB(final String name, final String blood_group, final String height, final String weight) {
        this.name = name;
        this.blood_group = blood_group;
        this.height = height;
        this.weight = weight;
    }

    public String getName() { return this.name; }

    public void setName(final  String name) { this.name = name; }

    public String getBlood_group() { return this.blood_group;}

    public void setBlood_group(final String blood_group) { this.blood_group = blood_group;}

    public String getHeight() {
        return this.height;
    }

    public void setHeight(final String height) {
        this.height = height;
    }

    public String getWeight() {
        return this.weight;
    }

    public void setWeight(final String weight) {
        this.weight = weight;
    }

}
