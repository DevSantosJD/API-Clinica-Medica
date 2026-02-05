package com.example.clinicaMedica.dto.consulta;

import com.example.clinicaMedica.model.Enum.StatusConsulta;
import com.example.clinicaMedica.model.entity.Clinica;
import com.example.clinicaMedica.model.entity.Medico;
import com.example.clinicaMedica.model.entity.Paciente;

import java.time.LocalDate;
import java.util.UUID;

public record ConsultaResponse(
        UUID id,
        Clinica clinica,
        Medico medico,
        Paciente paciente,
        StatusConsulta status,
        LocalDate dataAgendamento
) {
}
