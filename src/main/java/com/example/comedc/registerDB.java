package com.example.comedc;

public class registerDB {
    String phn_no;
    String address;
    String password;

    registerDB() {

    }

    public registerDB(final String phn_no, final String address, final String password) {
        this.phn_no = phn_no;
        this.address = address;
        this.password = password;
    }

    public String getPhn_no() {
        return this.phn_no;
    }

    public void setPhn_no(final String phn_no) {
        this.phn_no = phn_no;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(final String address) {
        this.address = address;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(final String password) {
        this.password = password;
    }

}