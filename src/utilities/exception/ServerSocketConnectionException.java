/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilities.exception;

/**
 *
 * @author adria
 */
public class ServerSocketConnectionException extends Exception {

    /**
     * Creates a new instance of <code>ServerException</code> without detail
     * message.
     */
    public ServerSocketConnectionException() {
    }

    /**
     * Constructs an instance of <code>ServerException</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    public ServerSocketConnectionException(String msg) {
        super(msg);
    }
}
