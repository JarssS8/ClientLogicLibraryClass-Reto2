/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilities.exception;

/**
 *
 * @author Gaizka Andres
 */
public class UserPasswordNotFoundException extends Exception {

    /**
     * Creates a new instance of <code>WrongPasswordException</code> without
     * detail message.
     */
    public UserPasswordNotFoundException() {
    }

    /**
     * Constructs an instance of <code>WrongPasswordException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public UserPasswordNotFoundException(String msg) {
        super(msg);
    }
}
