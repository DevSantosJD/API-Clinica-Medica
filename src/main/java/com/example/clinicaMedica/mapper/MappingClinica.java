package com.example.clinicaMedica.mapper;

import com.example.clinicaMedica.dto.clinica.ClinicaRequest;
import com.example.clinicaMedica.dto.clinica.ClinicaResponse;
import com.example.clinicaMedica.model.entity.Clinica;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface MappingClinica {

    Clinica toConsultaEntity (ClinicaRequest consulta);

    ClinicaResponse toDTOConsulta (Clinica consulta);
}
