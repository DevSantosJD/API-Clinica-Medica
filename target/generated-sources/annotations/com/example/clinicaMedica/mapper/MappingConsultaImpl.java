package com.example.clinicaMedica.mapper;

import com.example.clinicaMedica.dto.clinica.ClinicaResponse;
import com.example.clinicaMedica.dto.consulta.ConsultaRequest;
import com.example.clinicaMedica.dto.consulta.ConsultaResponse;
import com.example.clinicaMedica.dto.especialista.EspecialidadeResponse;
import com.example.clinicaMedica.dto.medico.MedicoResponse;
import com.example.clinicaMedica.dto.paciente.PacienteResponse;
import com.example.clinicaMedica.model.Enum.StatusConsulta;
import com.example.clinicaMedica.model.entity.Clinica;
import com.example.clinicaMedica.model.entity.Consulta;
import com.example.clinicaMedica.model.entity.Medico;
import com.example.clinicaMedica.model.entity.Paciente;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-02-09T15:12:40-0300",
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

        return consulta1;
    }

    @Override
    public ConsultaResponse toConsultaDTO(Consulta consulta) {
        if ( consulta == null ) {
            return null;
        }

        UUID id = null;
        ClinicaResponse clinica = null;
        MedicoResponse medico = null;
        PacienteResponse paciente = null;
        StatusConsulta status = null;
        LocalDate dataAgendamento = null;

        id = consulta.getId();
        clinica = clinicaToClinicaResponse( consulta.getClinica() );
        medico = medicoToMedicoResponse( consulta.getMedico() );
        paciente = pacienteToPacienteResponse( consulta.getPaciente() );
        status = consulta.getStatus();
        dataAgendamento = consulta.getDataAgendamento();

        ConsultaResponse consultaResponse = new ConsultaResponse( id, clinica, medico, paciente, status, dataAgendamento );

        return consultaResponse;
    }

    protected ClinicaResponse clinicaToClinicaResponse(Clinica clinica) {
        if ( clinica == null ) {
            return null;
        }

        String nome = null;
        List<Consulta> consultas = null;

        nome = clinica.getNome();
        List<Consulta> list = clinica.getConsultas();
        if ( list != null ) {
            consultas = new ArrayList<Consulta>( list );
        }

        String crm = null;

        ClinicaResponse clinicaResponse = new ClinicaResponse( nome, crm, consultas );

        return clinicaResponse;
    }

    protected MedicoResponse medicoToMedicoResponse(Medico medico) {
        if ( medico == null ) {
            return null;
        }

        UUID id = null;
        String nome = null;
        String crm = null;

        id = medico.getId();
        nome = medico.getNome();
        crm = medico.getCrm();

        EspecialidadeResponse nomeEspecialidade = null;

        MedicoResponse medicoResponse = new MedicoResponse( id, nome, crm, nomeEspecialidade );

        return medicoResponse;
    }

    protected List<ConsultaResponse> consultaListToConsultaResponseList(List<Consulta> list) {
        if ( list == null ) {
            return null;
        }

        List<ConsultaResponse> list1 = new ArrayList<ConsultaResponse>( list.size() );
        for ( Consulta consulta : list ) {
            list1.add( toConsultaDTO( consulta ) );
        }

        return list1;
    }

    protected PacienteResponse pacienteToPacienteResponse(Paciente paciente) {
        if ( paciente == null ) {
            return null;
        }

        UUID id = null;
        String nome = null;
        int idade = 0;
        String cpf = null;
        List<ConsultaResponse> consultas = null;

        id = paciente.getId();
        nome = paciente.getNome();
        idade = paciente.getIdade();
        cpf = paciente.getCpf();
        consultas = consultaListToConsultaResponseList( paciente.getConsultas() );

        PacienteResponse pacienteResponse = new PacienteResponse( id, nome, idade, cpf, consultas );

        return pacienteResponse;
    }
}
