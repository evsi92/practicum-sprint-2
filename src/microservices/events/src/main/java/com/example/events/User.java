package com.example.events;

import com.fasterxml.jackson.annotation.JsonProperty;

public class User {
    @JsonProperty("timestamp")
    String timestamp;
    @JsonProperty("username")
    String username;
    @JsonProperty("action")
    String action;
    @JsonProperty("user_id")
    Integer userId;

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "User{" +
                "timestamp='" + timestamp + '\'' +
                ", username='" + username + '\'' +
                ", action='" + action + '\'' +
                ", userId=" + userId +
                '}';
    }
}
