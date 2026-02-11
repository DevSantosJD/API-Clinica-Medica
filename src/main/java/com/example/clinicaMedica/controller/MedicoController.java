package com.example.clinicaMedica.controller;

import com.example.clinicaMedica.dto.medico.MedicoRequest;
import com.example.clinicaMedica.dto.medico.MedicoResponse;
import com.example.clinicaMedica.service.MedicoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/medico")
public class MedicoController {

    private final MedicoService medicoService;

    public MedicoController(MedicoService medicoService){
        this.medicoService = medicoService;
    }

    //Cadastro de médico
    @PostMapping("/medicoCadastro")
    public ResponseEntity<MedicoRequest> cadastrarMedico(@RequestBody MedicoRequest medico){
        medicoService.medicoCadastro(medico);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/exibirMedicos/{idMedico}")
    public ResponseEntity<MedicoResponse> exibirConsulta(@PathVariable UUID idMedico){
        MedicoResponse medicos = medicoService.getMedicos(idMedico);
        return ResponseEntity.ok().body(medicos);
    }
}
