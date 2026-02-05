package com.example.clinicaMedica.service;

import com.example.clinicaMedica.dto.especialista.EspecialidadeRequest;
import com.example.clinicaMedica.mapper.MappingEspecialidade;
import com.example.clinicaMedica.model.entity.Especialidade;
import com.example.clinicaMedica.repository.EspecialidadeRepository;
import org.springframework.stereotype.Service;

@Service
public class EspecialidadeService {

    private final EspecialidadeRepository especialidadeRepository;
    private final MappingEspecialidade mappingEspecialidade;

    public EspecialidadeService(EspecialidadeRepository especialidadeRepository, MappingEspecialidade mappingEspecialidade){
        this.especialidadeRepository = especialidadeRepository;
        this.mappingEspecialidade = mappingEspecialidade;
    }

    public void especialidadeCadastro(EspecialidadeRequest especialidade){
        if(especialidadeRepository.existsByNome(especialidade.nome())){
            throw new RuntimeException("Especialidade já cadastrada");
        }

        Especialidade estecialidadeEntity = mappingEspecialidade.toEspecialidadeEntity(especialidade);
        especialidadeRepository.save(estecialidadeEntity);

    }
}
