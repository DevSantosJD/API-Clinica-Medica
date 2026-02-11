package com.example.clinicaMedica.service;

import com.example.clinicaMedica.dto.medico.MedicoRequest;
import com.example.clinicaMedica.dto.medico.MedicoResponse;
import com.example.clinicaMedica.mapper.MappingMedico;
import com.example.clinicaMedica.model.entity.Especialidade;
import com.example.clinicaMedica.model.entity.Medico;
import com.example.clinicaMedica.repository.EspecialidadeRepository;
import com.example.clinicaMedica.repository.MedicoRepository;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class MedicoService {

    private final MedicoRepository medicoRepository;
    private final MappingMedico mappingMedico;
    private final EspecialidadeRepository especialidadeRepository;

    public MedicoService(MedicoRepository medicoRepository,
                         MappingMedico mappingMedico,
                         EspecialidadeRepository especialidadeRepository){
        this.medicoRepository = medicoRepository;
        this.mappingMedico = mappingMedico;
        this.especialidadeRepository = especialidadeRepository;
    }

    public void medicoCadastro(MedicoRequest medicoDTO){
        if(medicoRepository.existsByCrm(medicoDTO.crm())){
            throw new RuntimeException("CRM já cadastrado!");
        }
        Especialidade especialidade = especialidadeRepository
                .findByNome(medicoDTO.nomeEspecialidade())
                .orElseThrow(()-> new RuntimeException("Especialidade não encontrada"));

        Medico medicoEntity = mappingMedico.toMedicoEntity(medicoDTO);
        medicoEntity.setEspecialidade(especialidade);

        medicoRepository.save(medicoEntity);

    }

    public MedicoResponse getMedicos(UUID id_medico){
        Medico medico = medicoRepository.findById(id_medico)
                .orElseThrow(()-> new RuntimeException("Medico não localizao"));

        return mappingMedico.toMedicoResponse(medico);

    }
}