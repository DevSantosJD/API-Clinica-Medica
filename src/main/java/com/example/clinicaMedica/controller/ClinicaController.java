package com.example.clinicaMedica.controller;

import com.example.clinicaMedica.dto.clinica.ClinicaRequest;
import com.example.clinicaMedica.dto.consulta.ConsultaRequest;
import com.example.clinicaMedica.dto.especialista.EspecialidadeRequest;
import com.example.clinicaMedica.dto.medico.MedicoRequest;
import com.example.clinicaMedica.dto.medico.MedicoResponse;
import com.example.clinicaMedica.model.entity.Consulta;
import com.example.clinicaMedica.service.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/consultorio")
public class ClinicaController {

    private final ClicinaService clicinaService;
    private final ConsultaService consultaService;
    private final EspecialidadeService especialidadeService;
    private final MedicoService medicoService;
    private final PacienteService pacienteService;

    public ClinicaController(ClicinaService clicinaService,
                             ConsultaService consultaService,
                             EspecialidadeService especialidadeService,
                             MedicoService medicoService,
                             PacienteService pacienteService){

        this.clicinaService = clicinaService;
        this.consultaService = consultaService;
        this.especialidadeService = especialidadeService;
        this.medicoService = medicoService;
        this.pacienteService = pacienteService;
    }

    @PostMapping("/cadastrar")
    public ResponseEntity<ClinicaRequest> cadastrarClinica(@RequestBody ClinicaRequest clinica){
        clicinaService.cadastrarClinica(clinica);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/medicoCadastro")
    public ResponseEntity<MedicoRequest> cadastrarMedico(@RequestBody MedicoRequest medico){
        medicoService.medicoCadastro(medico);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/cadastroEspecialidade")
    public ResponseEntity<EspecialidadeRequest> cadastroEspecialidade(@RequestBody EspecialidadeRequest especialidade){
        especialidadeService.especialidadeCadastro(especialidade);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/agendarConsulta")
    public ResponseEntity<ConsultaRequest> agendarConsulta(ConsultaRequest consulta){
        consultaService.agendar(consulta);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/exibirMedicos/{id_medico}")
    public ResponseEntity<MedicoResponse> exibirConsulta(@PathVariable UUID id_medico){
        MedicoResponse medicos = medicoService.getMedicos(id_medico);
        return ResponseEntity.ok().body(medicos);
    }

}
