package com.example.clinicaMedica.mapper;

import com.example.clinicaMedica.dto.paciente.PacienteRequest;
import com.example.clinicaMedica.dto.paciente.PacienteResponse;
import com.example.clinicaMedica.model.entity.Paciente;
import java.util.UUID;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-02-16T13:58:51-0300",
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

        paciente1.setNome( paciente.nome() );
        paciente1.setIdade( paciente.idade() );
        paciente1.setCpf( paciente.cpf() );

        return paciente1;
    }

    @Override
    public PacienteResponse toPacienteResponse(Paciente paciente) {
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
