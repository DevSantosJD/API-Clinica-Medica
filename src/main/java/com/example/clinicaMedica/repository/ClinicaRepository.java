package com.example.clinicaMedica.repository;

import com.example.clinicaMedica.model.entity.Clinica;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ClinicaRepository extends JpaRepository<Clinica, UUID> {

    //Verifica se o cnpj passado já existe no banco de dados
     Boolean existsByCnpj(String cnpj);
}
