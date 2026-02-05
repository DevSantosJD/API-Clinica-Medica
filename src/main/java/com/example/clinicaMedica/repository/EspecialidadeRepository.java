package com.example.clinicaMedica.repository;

import com.example.clinicaMedica.model.entity.Especialidade;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EspecialidadeRepository extends JpaRepository<Especialidade, Long> {

    Boolean existsByNome(String nome);
    Optional<Especialidade> findByNome(String nome);
}