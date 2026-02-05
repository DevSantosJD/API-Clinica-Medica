package com.example.clinicaMedica.mapper;

import com.example.clinicaMedica.dto.paciente.PacienteRequest;
import com.example.clinicaMedica.dto.paciente.PacienteResponse;
import com.example.clinicaMedica.model.entity.Paciente;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-02-04T14:29:25-0300",
    comments = "version: 1.6.3, compiler: javac, environment: Java 21.0.6 (Oracle Corporation)"
)
@Component
public class MappingPacienteImpl implements MappingPaciente {

    @Override
    public Paciente toPacienteEntity(PacienteRequest paciente) {
        if ( paciente == null ) {
            return null;
        }

        Paciente paciente1 = new Paciente();

        return paciente1;
    }

    @Override
    public PacienteResponse toPAcienteResponse(Paciente paciente) {
        if ( paciente == null ) {
            return null;
        }

        PacienteResponse pacienteResponse = new PacienteResponse();

        return pacienteResponse;
    }
}
