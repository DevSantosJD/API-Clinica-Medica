package com.example.clinicaMedica.mapper;

import com.example.clinicaMedica.dto.consulta.ConsultaRequest;
import com.example.clinicaMedica.dto.consulta.ConsultaResponse;
import com.example.clinicaMedica.model.entity.Consulta;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface MappingConsulta {

    Consulta toConsultaEntity (ConsultaRequest consulta);

    ConsultaResponse toConsultaDTO (Consulta consulta);
}
