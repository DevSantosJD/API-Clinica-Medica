package com.example.clinicaMedica.mapper;

import com.example.clinicaMedica.dto.consulta.ConsultaRequest;
import com.example.clinicaMedica.dto.consulta.ConsultaResponse;
import com.example.clinicaMedica.dto.especialista.EspecialidadeResponse;
import com.example.clinicaMedica.dto.medico.MedicoResponse;
import com.example.clinicaMedica.dto.paciente.PacienteResponse;
import com.example.clinicaMedica.model.Enum.StatusConsulta;
import com.example.clinicaMedica.model.entity.Consulta;
import com.example.clinicaMedica.model.entity.Especialidade;
import com.example.clinicaMedica.model.entity.Medico;
import com.example.clinicaMedica.model.entity.Paciente;
import java.time.LocalDate;
import java.util.UUID;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-02-16T13:58:52-0300",
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
        MedicoResponse medico = null;
        PacienteResponse paciente = null;
        StatusConsulta status = null;
        LocalDate dataAgendamento = null;

        id = consulta.getId();
        medico = medicoToMedicoResponse( consulta.getMedico() );
        paciente = pacienteToPacienteResponse( consulta.getPaciente() );
        status = consulta.getStatus();
        dataAgendamento = consulta.getDataAgendamento();

        ConsultaResponse consultaResponse = new ConsultaResponse( id, medico, paciente, status, dataAgendamento );

        return consultaResponse;
    }

    protected EspecialidadeResponse especialidadeToEspecialidadeResponse(Especialidade especialidade) {
        if ( especialidade == null ) {
            return null;
        }

        Long id = null;
        String nome = null;

        id = especialidade.getId();
        nome = especialidade.getNome();

        EspecialidadeResponse especialidadeResponse = new EspecialidadeResponse( id, nome );

        return especialidadeResponse;
    }

    protected MedicoResponse medicoToMedicoResponse(Medico medico) {
        if ( medico == null ) {
            return null;
        }

        UUID id = null;
        String nome = null;
        String crm = null;
        EspecialidadeResponse especialidade = null;

        id = medico.getId();
        nome = medico.getNome();
        crm = medico.getCrm();
        especialidade = especialidadeToEspecialidadeResponse( medico.getEspecialidade() );

        MedicoResponse medicoResponse = new MedicoResponse( id, nome, crm, especialidade );

        return medicoResponse;
    }

    protected PacienteResponse pacienteToPacienteResponse(Paciente paciente) {
        if ( paciente == null ) {
            return null;
        }

        UUID id = null;
        String nome = null;
        int idade = 0;
        String cpf = null;

        id = paciente.getId();
        nome = paciente.getNome();
        idade = paciente.getIdade();
        cpf = paciente.getCpf();

        PacienteResponse pacienteResponse = new PacienteResponse( id, nome, idade, cpf );

        return pacienteResponse;
    }
}
