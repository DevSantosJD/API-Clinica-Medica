package com.example.clinicaMedica.service;

import com.example.clinicaMedica.dto.consulta.ConsultaRequest;
import com.example.clinicaMedica.mapper.MappingConsulta;
import com.example.clinicaMedica.model.entity.Consulta;
import com.example.clinicaMedica.repository.ConsultaRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
public class ConsultaService {

    private final ConsultaRepository consultaRepository;
    private final MappingConsulta mappingConsulta;


    public ConsultaService(ConsultaRepository consultaRepository, MappingConsulta mappingConsulta){
        this.consultaRepository = consultaRepository;
        this.mappingConsulta= mappingConsulta;
    }

    public void agendar(ConsultaRequest consulta){
        Consulta consultaEntity = mappingConsulta.toConsultaEntity(consulta);
        consultaRepository.save(consultaEntity);
    }

    public Optional<Consulta> retornarConsulta(UUID consulta_id){

        return consultaRepository.findById(consulta_id);
    }

}
