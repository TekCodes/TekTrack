package com.Tek.Track.Authentication;

public class JwtRequest {
    private String username;
    private String password;

    // Default constructor
    public JwtRequest() {}

    // Parameterized constructor
    public JwtRequest(String username, String password) {
        this.username = username;
        this.password = password;
    }

    // Getter and Setter for username
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    // Getter and Setter for password
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
