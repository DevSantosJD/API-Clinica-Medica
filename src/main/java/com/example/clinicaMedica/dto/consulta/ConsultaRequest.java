package com.example.clinicaMedica.dto.consulta;

import com.example.clinicaMedica.model.Enum.StatusConsulta;
import java.util.UUID;

public record ConsultaRequest(

        UUID clinicaId,
        UUID medicoId,
        UUID pacienteId

) {
}
