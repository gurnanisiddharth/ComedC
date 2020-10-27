package com.example.comedc;

public class feedbackDB {
    String feedback;
    String name;

    feedbackDB() {

    }

    public feedbackDB(final String name, final String feedback) {
        this.name = name;
        this.feedback = feedback;
    }

    public String getName() { return this.name;}

    public void setName(final String name) { this.name = name;}

    public String getFeedback() {
        return this.feedback;
    }

    public void setFeedback(final String feedback) {
        this.feedback = feedback;
    }

}