package com.example.clinicaMedica.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "clinica_tb")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Clinica {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false, length = 14, unique = true)
    private String cnpj;

    @OneToMany(mappedBy = "clinica")
    private List<Consulta> consultas;

}
