package org.launchcode.spaday.models;

import javax.validation.constraints.*;

public class User {

    @NotEmpty(message = "please enter a username")
    @NotBlank(message = "Name is required")
    @Size(min = 5, max = 15, message = "Username must be between 5 and 15 characters")
    private String username;

    @Email(message = "please enter a valid email address")
    private String email;

    @NotEmpty(message="please enter a password")
    @NotBlank(message = "password is required")
    @Min(6)
    private String password;

    private String verifyPassword;

    public User() {

    }

    public User(String username, String email, String password) {
        this();
        this.username = username;
        this.email = email;
        this.password = password;
    }

//    private void checkPassword(String password, String verifyPassword){
//        if (password != null && verifyPassword != null){
//            if(password != verifyPassword){
//                verifyPassword = null;
//            }
//        }
//    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
//        checkPassword(password, verifyPassword);
    }

    public String getVerifyPassword() {
        return verifyPassword;
    }

    public void setVerifyPassword(String verifyPassword) {
        this.verifyPassword = verifyPassword;
//        checkPassword(password, verifyPassword);
    }

}
