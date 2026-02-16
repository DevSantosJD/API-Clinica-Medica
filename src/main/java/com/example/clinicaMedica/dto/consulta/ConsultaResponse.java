package com.example.clinicaMedica.dto.consulta;

import com.example.clinicaMedica.dto.medico.MedicoResponse;
import com.example.clinicaMedica.dto.paciente.PacienteResponse;
import com.example.clinicaMedica.model.Enum.StatusConsulta;
import com.example.clinicaMedica.model.entity.Paciente;


import java.time.LocalDate;
import java.util.UUID;

public record ConsultaResponse(

        UUID id,
        MedicoResponse medico,
        PacienteResponse paciente,
        StatusConsulta status,
        LocalDate dataAgendamento

) {}
