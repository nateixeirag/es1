/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unioeste.geral.hospital.exception;

/**
 *
 * @author cristopher
 */
public class HospitalException extends Exception {

    public HospitalException() {
    }

    public HospitalException(String message) {
        super(message);
    }

    public HospitalException(String message, Throwable cause) {
        super(message, cause);
    }

    public HospitalException(Throwable cause) {
        super(cause);
    }

    public HospitalException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
    
}
