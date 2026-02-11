package com.example.clinicaMedica.dto.medico;

import com.example.clinicaMedica.dto.especialista.EspecialidadeResponse;
import com.example.clinicaMedica.model.entity.Especialidade;

import java.util.UUID;

public record MedicoResponse(

        UUID id,
        String nome,
        String crm,
        EspecialidadeResponse especialidade
) {}
