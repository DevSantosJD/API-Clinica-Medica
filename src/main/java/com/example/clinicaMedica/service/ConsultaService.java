package com.example.clinicaMedica.service;

import com.example.clinicaMedica.dto.consulta.ConsultaRequest;
import com.example.clinicaMedica.dto.consulta.ConsultaResponse;
import com.example.clinicaMedica.mapper.MappingConsulta;
import com.example.clinicaMedica.model.entity.Clinica;
import com.example.clinicaMedica.model.entity.Consulta;
import com.example.clinicaMedica.model.entity.Medico;
import com.example.clinicaMedica.model.entity.Paciente;
import com.example.clinicaMedica.repository.ClinicaRepository;
import com.example.clinicaMedica.repository.ConsultaRepository;
import com.example.clinicaMedica.repository.MedicoRepository;
import com.example.clinicaMedica.repository.PacienteRepository;
import org.springframework.stereotype.Service;

import java.util.UUID;

import static com.example.clinicaMedica.model.Enum.StatusConsulta.AGENDADO;

@Service
public class ConsultaService {

    private final ConsultaRepository consultaRepository;
    private final ClinicaRepository clinicaRepository;
    private final MedicoRepository medicoRepository;
    private final PacienteRepository pacienteRepository;
    private final MappingConsulta mappingConsulta;



    public ConsultaService(ConsultaRepository consultaRepository,
                           ClinicaRepository clinicaRepository,
                           ClicinaService clicinaService,
                           MedicoRepository medicoRepository,
                           PacienteRepository pacienteRepository,
                           MappingConsulta mappingConsulta){
        this.consultaRepository = consultaRepository;
        this.clinicaRepository = clinicaRepository;
        this.medicoRepository = medicoRepository;
        this.pacienteRepository = pacienteRepository;
        this.mappingConsulta= mappingConsulta;
    }

    public void agendar(ConsultaRequest consulta){


        Clinica clinica = clinicaRepository.findById(consulta.clinicaId())
                .orElseThrow(()->new RuntimeException("Clinica não localizada!"));

        Medico medico = medicoRepository.findById(consulta.medicoId())
                .orElseThrow(()->new RuntimeException("Médico ão localizado!"));

        Paciente paciente = pacienteRepository.findById(consulta.pacienteId())
                .orElseThrow(()->new RuntimeException("Paciente não localizado!"));

        Consulta consultaAgendada = new Consulta();

        consultaAgendada.setClinica(clinica);
        System.out.println(clinica);

        consultaAgendada.setMedico(medico);
        System.out.println(medico);

        consultaAgendada.setPaciente(paciente);
        System.out.println(paciente);

        consultaAgendada.setStatus(AGENDADO);

        consultaRepository.save(consultaAgendada);

    }

    public ConsultaResponse verificarConsulta(UUID idConsulta){
        Consulta consulta = consultaRepository.findById(idConsulta).
                orElseThrow(()-> new RuntimeException("Consulta não registrada"));

        return mappingConsulta.toConsultaDTO(consulta);
    }

}