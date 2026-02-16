package com.example.clinicaMedica.exception;

import java.time.LocalDateTime;
import java.util.List;

public record APIError(
        int stattus,
        ErrorType error,
        String message,
        String path,
        LocalDateTime timestamp,
        List<String> details
) {}
