package com.my;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Fact {
    String id;
    String text;
    String type;
    String user;
    int upvotes;

    public Fact(
            @JsonProperty("id") String id,
            @JsonProperty("text") String text,
            @JsonProperty("type") String type,
            @JsonProperty("user") String user,
            @JsonProperty("upvotes") int upvotes
    ) {

        this.id = id;
        this.text = text;
        this.type = type;
        this.user = user;
        this.upvotes = upvotes;
    }

    public String getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public String getType() {
        return type;
    }

    public String getUser() {
        return user;
    }

    public int getUpvotes() {
        return upvotes;
    }

    public String toString() {
        return "id: " + id + "\ntext: " + text + "\ntype: " + type + "\nuser: " + user + "\nupvotes: " + upvotes + "\n";
    }
}
