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
public class LoginAlreadyTakenException extends Exception {

    /**
     * Creates a new instance of <code>LoginAlreadyTakenException</code> without
     * detail message.
     */
    public LoginAlreadyTakenException() {
    }

    /**
     * Constructs an instance of <code>LoginAlreadyTakenException</code> with
     * the specified detail message.
     *
     * @param msg the detail message.
     */
    public LoginAlreadyTakenException(String msg) {
        super(msg);
    }
}
