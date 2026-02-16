package com.example.clinicaMedica.exception;

import com.example.clinicaMedica.model.entity.Especialidade;

public class EspecialidadeNaoEncontrada extends BuisnessException{

    public EspecialidadeNaoEncontrada(String msg){
        super(msg);
    }
}
