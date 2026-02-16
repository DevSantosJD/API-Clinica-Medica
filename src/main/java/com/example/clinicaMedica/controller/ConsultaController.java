package com.example.clinicaMedica.controller;

import com.example.clinicaMedica.dto.consulta.ConsultaRequest;
import com.example.clinicaMedica.dto.consulta.ConsultaResponse;
import com.example.clinicaMedica.model.entity.Consulta;
import com.example.clinicaMedica.service.ConsultaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/consulta")
public class ConsultaController {

    public final ConsultaService consultaService;

    public ConsultaController(ConsultaService consultaService){
        this.consultaService = consultaService;
    }

    //Agendamento de consulta
    @PostMapping("/agendarConsulta")
    public ResponseEntity<ConsultaRequest> agendarConsulta(@RequestBody ConsultaRequest consulta){
        consultaService.agendar(consulta);
        return ResponseEntity.ok().build();
    }

    //Buscar consulta por id
    @GetMapping("/consultasAgendadas/{idConsult}")
    public ResponseEntity<ConsultaResponse> consultaAgendada(@PathVariable UUID idConsult ){
        ConsultaResponse consulta = consultaService.verificarConsulta(idConsult);
        return ResponseEntity.ok().body(consulta);
    }
}
