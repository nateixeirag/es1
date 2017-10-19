/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unioeste.geral.medico.exception;

/**
 *
 * @author cristopher
 */
public class MedicoException extends Exception {

    public MedicoException() {
    }

    public MedicoException(String message) {
        super(message);
    }

    public MedicoException(String message, Throwable cause) {
        super(message, cause);
    }

    public MedicoException(Throwable cause) {
        super(cause);
    }

    public MedicoException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
}
