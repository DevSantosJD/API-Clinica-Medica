package com.example.clinicaMedica.dto.paciente;

public record PacienteRequest(

        String nome,
        int idade,
        String cpf
) {
}
