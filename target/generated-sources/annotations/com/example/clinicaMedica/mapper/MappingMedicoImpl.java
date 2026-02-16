package com.example.clinicaMedica.mapper;

import com.example.clinicaMedica.dto.especialista.EspecialidadeResponse;
import com.example.clinicaMedica.dto.medico.MedicoRequest;
import com.example.clinicaMedica.dto.medico.MedicoResponse;
import com.example.clinicaMedica.model.entity.Especialidade;
import com.example.clinicaMedica.model.entity.Medico;
import java.util.UUID;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-02-16T13:58:52-0300",
    comments = "version: 1.6.3, compiler: javac, environment: Java 21.0.6 (Oracle Corporation)"
)
@Component
public class MappingMedicoImpl implements MappingMedico {

    @Override
    public Medico toMedicoEntity(MedicoRequest medico) {
        if ( medico == null ) {
            return null;
        }

        Medico medico1 = new Medico();

        medico1.setNome( medico.nome() );
        medico1.setCrm( medico.crm() );

        return medico1;
    }

    @Override
    public MedicoResponse toMedicoResponse(Medico medico) {
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
}
