package com.example.clinicaMedica.mapper;

import com.example.clinicaMedica.dto.medico.MedicoRequest;
import com.example.clinicaMedica.dto.medico.MedicoResponse;
import com.example.clinicaMedica.model.entity.Medico;
import org.mapstruct.Mapper;

@Mapper(
        componentModel = "spring"
)
public interface MappingMedico {

    Medico toMedicoEntity (MedicoRequest medico);

    MedicoResponse toMedicoResponse (Medico medico);
}
