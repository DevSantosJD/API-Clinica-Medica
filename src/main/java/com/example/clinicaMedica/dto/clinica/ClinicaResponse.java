package com.example.clinicaMedica.dto.clinica;

import com.example.clinicaMedica.model.entity.Consulta;

import java.util.List;
import java.util.UUID;

public record ClinicaResponse(
        UUID id,
        String nome,
        String crm,
        List<Consulta> consultas
) {}
