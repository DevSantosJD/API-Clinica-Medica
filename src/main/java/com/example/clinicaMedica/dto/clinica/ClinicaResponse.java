package com.example.clinicaMedica.dto.clinica;

import com.example.clinicaMedica.model.entity.Consulta;

import java.util.List;

public record ClinicaResponse(

        String nome,
        String crm,
        List<Consulta> consultas
) {}
