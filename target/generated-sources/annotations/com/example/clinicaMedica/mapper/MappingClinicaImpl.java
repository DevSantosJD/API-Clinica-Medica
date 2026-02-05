package com.example.clinicaMedica.mapper;

import com.example.clinicaMedica.dto.clinica.ClinicaRequest;
import com.example.clinicaMedica.dto.clinica.ClinicaResponse;
import com.example.clinicaMedica.model.entity.Clinica;
import com.example.clinicaMedica.model.entity.Consulta;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-02-04T14:29:25-0300",
    comments = "version: 1.6.3, compiler: javac, environment: Java 21.0.6 (Oracle Corporation)"
)
@Component
public class MappingClinicaImpl implements MappingClinica {

    @Override
    public Clinica toConsultaEntity(ClinicaRequest consulta) {
        if ( consulta == null ) {
            return null;
        }

        Clinica clinica = new Clinica();

        clinica.setNome( consulta.nome() );
        clinica.setCnpj( consulta.cnpj() );

        return clinica;
    }

    @Override
    public ClinicaResponse toDTOConsulta(Clinica consulta) {
        if ( consulta == null ) {
            return null;
        }

        String nome = null;
        List<Consulta> consultas = null;

        nome = consulta.getNome();
        List<Consulta> list = consulta.getConsultas();
        if ( list != null ) {
            consultas = new ArrayList<Consulta>( list );
        }

        String crm = null;

        ClinicaResponse clinicaResponse = new ClinicaResponse( nome, crm, consultas );

        return clinicaResponse;
    }
}
