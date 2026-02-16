package com.example.clinicaMedica.exception;

import com.example.clinicaMedica.dto.medico.MedicoRequest;

public class MedicoNaoEncontradoException extends BuisnessException {

    public MedicoNaoEncontradoException(String msg){
        super(msg);
    }
}
