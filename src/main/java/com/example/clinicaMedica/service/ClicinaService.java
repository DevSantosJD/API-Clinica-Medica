package com.example.clinicaMedica.service;

import com.example.clinicaMedica.dto.clinica.ClinicaRequest;
import com.example.clinicaMedica.dto.clinica.ClinicaResponse;
import com.example.clinicaMedica.mapper.MappingClinica;
import com.example.clinicaMedica.model.entity.Clinica;
import com.example.clinicaMedica.repository.*;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class ClicinaService {

    private final ClinicaRepository clinicaRepository;
    private final MappingClinica mappingClinica;

    public ClicinaService(ClinicaRepository clinicaRepository, MappingClinica mappingClinica){
        this.clinicaRepository = clinicaRepository;
        this.mappingClinica = mappingClinica;

    }

    public void cadastrarClinica(ClinicaRequest clinica){
        if(clinicaRepository.existsByCnpj(clinica.cnpj())){
            throw new RuntimeException("CNPJ já cadastrado!");
        }

        Clinica clinicaEntity = mappingClinica.toConsultaEntity(clinica);
        clinicaRepository.save(clinicaEntity);
    }

    public ClinicaResponse exibirClinica(UUID idClinica){
        Clinica clinica = clinicaRepository.findById(idClinica)
                .orElseThrow(()-> new RuntimeException("Clinica não localiada"));

        return mappingClinica.toDTOConsulta(clinica);

    }


}
