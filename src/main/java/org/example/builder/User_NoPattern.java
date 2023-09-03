package org.example.builder;

public class User_NoPattern {

    private final String userId;
    private final String token;
    private final String role;
    private String name;

    public User_NoPattern(String token, String userId, String role) {
        this.token = token;
        this.userId = userId;
        this.role = role;
    }

    public String getUserId() {
        return userId;
    }

    public String getToken() {
        return token;
    }

    public String getRole() {
        return role;
    }

    public String getName() {
        return name;
    }

    public User_NoPattern setName(String name) {
        this.name = name;
        return this;
    }

}
