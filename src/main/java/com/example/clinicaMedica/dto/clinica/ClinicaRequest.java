package com.example.clinicaMedica.dto.clinica;

import com.example.clinicaMedica.model.entity.Consulta;
import jakarta.persistence.Column;
import jakarta.validation.constraints.NotBlank;
import lombok.Builder;

import java.util.List;

@Builder
public record ClinicaRequest(

        @NotBlank(message = "Nome da clinica é obrigatório!")
        String nome,

        @NotBlank(message = "CNPJ é obrigatório")
        @Column(unique = true)
        String cnpj

) {}
