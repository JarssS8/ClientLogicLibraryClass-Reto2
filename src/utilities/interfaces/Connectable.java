/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilities.interfaces;


import utilities.exception.WrongPasswordException;
import utilities.exception.LoginNotFoundException;
import utilities.exception.LoginAlreadyTakenException;
import utilities.beans.User;
import utilities.exception.ServerConnectionErrorException;


/**
 * This is the interface of both sides, client and server. 
 * @author Adrian
 */
public interface Connectable {
    public User logIn(User user) throws LoginNotFoundException,WrongPasswordException,ServerConnectionErrorException;
    public User signUp(User user) throws LoginAlreadyTakenException,ServerConnectionErrorException;
    public void logOut(User user) throws ServerConnectionErrorException;
}
