package com.example.clinicaMedica.controller;

import com.example.clinicaMedica.dto.clinica.ClinicaRequest;
import com.example.clinicaMedica.dto.consulta.ConsultaRequest;
import com.example.clinicaMedica.dto.consulta.ConsultaResponse;
import com.example.clinicaMedica.dto.especialista.EspecialidadeRequest;
import com.example.clinicaMedica.dto.medico.MedicoRequest;
import com.example.clinicaMedica.dto.medico.MedicoResponse;
import com.example.clinicaMedica.dto.paciente.PacienteRequest;
import com.example.clinicaMedica.service.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/clinica")
public class ClinicaController {

    private final ClicinaService clicinaService;

    public ClinicaController(ClicinaService clicinaService){
        this.clicinaService = clicinaService;
    }

    //Cadastro de clinica
    @PostMapping("/cadastrar")
    public ResponseEntity<ClinicaRequest> cadastrarClinica(@RequestBody ClinicaRequest clinica){
        clicinaService.cadastrarClinica(clinica);
        return ResponseEntity.ok().build();
    }

}
