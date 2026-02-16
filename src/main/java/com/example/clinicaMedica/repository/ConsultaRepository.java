package com.example.clinicaMedica.repository;

import com.example.clinicaMedica.model.entity.Consulta;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface ConsultaRepository extends JpaRepository<Consulta, UUID> {

    @Override
    Optional<Consulta> findById(UUID uuid);
}
