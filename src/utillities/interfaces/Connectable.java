/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utillities.interfaces;


import utillities.beans.User;
import utilities.exception.*;


/**
 * This is the interface of both sides, client and server. 
 * @author Adrian
 */
public interface Connectable {
    public User logIn(User user) throws LoginNotFoundException,WrongPasswordException,LogicException;
    public void signUp(User user) throws LoginAlreadyTakenException,LogicException;
    public void logOut(User user) throws LogicException;
    
}
