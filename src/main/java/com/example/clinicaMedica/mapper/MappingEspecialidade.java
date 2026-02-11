package com.example.clinicaMedica.mapper;

import com.example.clinicaMedica.dto.especialista.EspecialidadeRequest;
import com.example.clinicaMedica.dto.especialista.EspecialidadeResponse;
import com.example.clinicaMedica.model.entity.Especialidade;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface MappingEspecialidade {

    Especialidade toEspecialidadeEntity(EspecialidadeRequest especialidade);

    EspecialidadeResponse toEspecialidadeResponse(Especialidade especialidade);
}

