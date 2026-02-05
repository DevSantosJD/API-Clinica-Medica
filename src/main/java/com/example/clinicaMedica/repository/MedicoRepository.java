package com.example.clinicaMedica.repository;

import com.example.clinicaMedica.model.entity.Medico;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface MedicoRepository extends JpaRepository<Medico, UUID> {

    Boolean existsByCrm(String crm);
}
