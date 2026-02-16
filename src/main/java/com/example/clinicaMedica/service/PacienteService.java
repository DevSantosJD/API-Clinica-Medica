package com.example.clinicaMedica.service;

import com.example.clinicaMedica.dto.paciente.PacienteRequest;
import com.example.clinicaMedica.dto.paciente.PacienteResponse;
import com.example.clinicaMedica.mapper.MappingPaciente;
import com.example.clinicaMedica.model.entity.Paciente;
import com.example.clinicaMedica.repository.PacienteRepository;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class PacienteService {

    private final PacienteRepository pacienteRepository;
    private final MappingPaciente mappingPaciente;

    public PacienteService(PacienteRepository pacienteRepository, MappingPaciente mappingPaciente){
        this.pacienteRepository = pacienteRepository;
        this.mappingPaciente = mappingPaciente;
    }

    public void cadastrar(PacienteRequest paciente){
        if(pacienteRepository.existsByCpf(paciente.cpf())){
            throw new RuntimeException("paciente já cadastrado!");
        }
        pacienteRepository.save(mappingPaciente.toPacienteEntity(paciente));
    }


    public PacienteResponse buscarPaciente(UUID idPaciente){
        Paciente paciente = pacienteRepository.findById(idPaciente)
                .orElseThrow(()-> new RuntimeException("Paciente não localizado"));

        return mappingPaciente.toPacienteResponse(paciente);


    }


}
