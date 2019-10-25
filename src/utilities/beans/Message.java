/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilities.beans;


/**
 * The class will make the structure that will be sent via socket to comunicate client and server.
 * @author aimar
 */
public class Message {
    
    private User user;
    private String type;
    
    public static final String LOGIN_MESSAGE = "Login";
    public static final String SIGNUP_MESSAGE = "SignUp";
    public static final String LOGOUT_MESSAGE = "LogOut";

    /**
     * @return the user
     */
    public User getUser() {
        return user;
    }

    /**
     * @param user the user to set
     */
    public void setUser(User user) {
        this.user = user;
    }

    /** 
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }
}
