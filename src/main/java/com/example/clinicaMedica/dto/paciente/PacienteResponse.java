package com.example.clinicaMedica.dto.paciente;

import com.example.clinicaMedica.dto.consulta.ConsultaResponse;

import java.util.List;
import java.util.UUID;

public record PacienteResponse(

        UUID id,
        String nome,
        int idade,
        String cpf
       // List<ConsultaResponse> consultas
) {
}
