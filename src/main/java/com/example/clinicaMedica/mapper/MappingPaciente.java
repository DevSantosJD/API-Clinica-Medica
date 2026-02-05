package com.example.clinicaMedica.mapper;

import com.example.clinicaMedica.dto.paciente.PacienteRequest;
import com.example.clinicaMedica.dto.paciente.PacienteResponse;
import com.example.clinicaMedica.model.entity.Paciente;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface MappingPaciente {

    Paciente toPacienteEntity (PacienteRequest paciente);

    PacienteResponse toPAcienteResponse (Paciente paciente);
}
