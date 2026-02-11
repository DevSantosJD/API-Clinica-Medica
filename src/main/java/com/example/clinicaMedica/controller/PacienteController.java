package com.example.clinicaMedica.controller;

import com.example.clinicaMedica.dto.paciente.PacienteRequest;
import com.example.clinicaMedica.service.PacienteService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/paciente")
public class PacienteController {

    public final PacienteService pacienteService;

    public PacienteController(PacienteService pacienteService){
        this.pacienteService = pacienteService;
    }

    //cadastro de pacientes
    @PostMapping("/cadastroPaciente")
    public ResponseEntity<PacienteRequest> cadastroPaciente(@RequestBody PacienteRequest paciente){
        pacienteService.cadastrar(paciente);
        return ResponseEntity.ok().build();
    }
}
