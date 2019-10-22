/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utillities.interfaces;

import utillities.beans.User;

/**
 * This is the interface of both sides, client and server. 
 * @author Adrian
 */
public interface Connectable {
    public void logIn(User user);
    public void signUp(User user);
    public void logOut(User user);
    
}
