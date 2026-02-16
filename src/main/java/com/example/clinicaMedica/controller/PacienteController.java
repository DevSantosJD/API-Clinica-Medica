package com.example.clinicaMedica.controller;

import com.example.clinicaMedica.dto.paciente.PacienteRequest;
import com.example.clinicaMedica.dto.paciente.PacienteResponse;
import com.example.clinicaMedica.model.entity.Paciente;
import com.example.clinicaMedica.service.PacienteService;
import org.springframework.aop.target.LazyInitTargetSource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

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

    @GetMapping("/buscarPaciente/{idPaciente}")
    public ResponseEntity<PacienteResponse> buscar(@PathVariable UUID idPaciente){
        PacienteResponse paciente = pacienteService.buscarPaciente(idPaciente);
        return ResponseEntity.ok().body(paciente);
    }

}
