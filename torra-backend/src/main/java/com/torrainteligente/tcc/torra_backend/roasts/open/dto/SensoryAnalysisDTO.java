package com.torrainteligente.tcc.torra_backend.roasts.open.dto;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;

public record SensoryAnalysisDTO(
        UUID id,
        UUID roastId,
        BigDecimal powderAroma,
        BigDecimal fragrance,
        BigDecimal flavor,
        BigDecimal acidity,
        BigDecimal body,
        BigDecimal aftertaste,
        BigDecimal balance,
        BigDecimal sweetness,
        BigDecimal uniformity,
        BigDecimal defects,
        BigDecimal finalAroma,
        BigDecimal overallAssessment,
        OffsetDateTime createdAt,
        OffsetDateTime updatedAt
) {}
