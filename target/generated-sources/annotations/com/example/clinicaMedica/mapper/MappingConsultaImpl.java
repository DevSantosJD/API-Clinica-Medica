package com.example.clinicaMedica.mapper;

import com.example.clinicaMedica.dto.consulta.ConsultaRequest;
import com.example.clinicaMedica.dto.consulta.ConsultaResponse;
import com.example.clinicaMedica.model.Enum.StatusConsulta;
import com.example.clinicaMedica.model.entity.Clinica;
import com.example.clinicaMedica.model.entity.Consulta;
import com.example.clinicaMedica.model.entity.Medico;
import com.example.clinicaMedica.model.entity.Paciente;
import java.time.LocalDate;
import java.util.UUID;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-02-04T14:29:25-0300",
    comments = "version: 1.6.3, compiler: javac, environment: Java 21.0.6 (Oracle Corporation)"
)
@Component
public class MappingConsultaImpl implements MappingConsulta {

    @Override
    public Consulta toConsultaEntity(ConsultaRequest consulta) {
        if ( consulta == null ) {
            return null;
        }

        Consulta consulta1 = new Consulta();

        consulta1.setClinica( consulta.clinica() );
        consulta1.setMedico( consulta.medico() );
        consulta1.setPaciente( consulta.paciente() );
        consulta1.setStatus( consulta.status() );

        return consulta1;
    }

    @Override
    public ConsultaResponse toConsultaDTO(Consulta consulta) {
        if ( consulta == null ) {
            return null;
        }

        UUID id = null;
        Clinica clinica = null;
        Medico medico = null;
        Paciente paciente = null;
        StatusConsulta status = null;
        LocalDate dataAgendamento = null;

        id = consulta.getId();
        clinica = consulta.getClinica();
        medico = consulta.getMedico();
        paciente = consulta.getPaciente();
        status = consulta.getStatus();
        dataAgendamento = consulta.getDataAgendamento();

        ConsultaResponse consultaResponse = new ConsultaResponse( id, clinica, medico, paciente, status, dataAgendamento );

        return consultaResponse;
    }
}
