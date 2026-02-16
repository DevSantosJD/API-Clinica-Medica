package com.example.clinicaMedica.exception;

public abstract class BuisnessException extends RuntimeException{

    protected BuisnessException(String msg){
        super(msg);
    }
}
