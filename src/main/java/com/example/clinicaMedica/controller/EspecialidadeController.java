package com.example.clinicaMedica.controller;

import com.example.clinicaMedica.dto.especialista.EspecialidadeRequest;
import com.example.clinicaMedica.service.EspecialidadeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/especialidade")
public class EspecialidadeController {

    public final EspecialidadeService especialidadeService;

    public EspecialidadeController(EspecialidadeService especialidadeService) {
        this.especialidadeService = especialidadeService;
    }

    //Cadastro de especialidade
    @PostMapping("/cadastroEspecialidade")
    public ResponseEntity<EspecialidadeRequest> cadastroEspecialidade(@RequestBody EspecialidadeRequest especialidade){
        especialidadeService.especialidadeCadastro(especialidade);
        return ResponseEntity.ok().build();
    }
}
