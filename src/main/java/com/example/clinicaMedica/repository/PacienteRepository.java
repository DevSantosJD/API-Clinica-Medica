package com.example.clinicaMedica.repository;

import com.example.clinicaMedica.model.entity.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PacienteRepository extends JpaRepository<Paciente, UUID> {
}
