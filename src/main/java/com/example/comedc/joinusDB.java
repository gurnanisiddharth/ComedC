package com.example.comedc;

public class joinusDB {
    String name;
    String address;
    String phn_no;
    String email_id;
    String services;

    joinusDB() {

    }

    public joinusDB(final String name, final String address, final String phn_no, final String email_id, final String services) {
        this.name = name;
        this.address = address;
        this.phn_no = phn_no;
        this.email_id = email_id;
        this.services = services;
    }

    public String getName() { return this.name;}

    public void setName(final String name) { this.name = name;}

    public String getAddress() {
        return this.address;
    }

    public void setAddress(final String address) {
        this.address = address;
    }

    public String getPhn_no() {
        return this.phn_no;
    }

    public void setPhn_no(final String phn_no) {
        this.phn_no = phn_no;
    }

    public String getEmail_id() {
        return this.email_id;
    }

    public void setEmail_id(final String email_id) {
        this.email_id = email_id;
    }

    public String getServices() {
        return this.services;
    }

    public void setServices(final String services) {
        this.services = services;
    }

}