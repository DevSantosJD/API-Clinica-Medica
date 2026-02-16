package com.example.clinicaMedica.mapper;

import com.example.clinicaMedica.dto.especialista.EspecialidadeRequest;
import com.example.clinicaMedica.dto.especialista.EspecialidadeResponse;
import com.example.clinicaMedica.model.entity.Especialidade;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-02-16T13:58:52-0300",
    comments = "version: 1.6.3, compiler: javac, environment: Java 21.0.6 (Oracle Corporation)"
)
@Component
public class MappingEspecialidadeImpl implements MappingEspecialidade {

    @Override
    public Especialidade toEspecialidadeEntity(EspecialidadeRequest especialidade) {
        if ( especialidade == null ) {
            return null;
        }

        Especialidade especialidade1 = new Especialidade();

        especialidade1.setNome( especialidade.nome() );

        return especialidade1;
    }

    @Override
    public EspecialidadeResponse toEspecialidadeResponse(Especialidade especialidade) {
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
