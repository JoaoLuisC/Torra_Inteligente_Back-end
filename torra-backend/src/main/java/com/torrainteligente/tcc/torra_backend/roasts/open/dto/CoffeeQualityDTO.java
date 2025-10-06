package com.torrainteligente.tcc.torra_backend.roasts.open.dto;

import com.torrainteligente.tcc.torra_backend.roasts.internal.enums.CoffeeVariety;
import com.torrainteligente.tcc.torra_backend.roasts.internal.enums.FermentationType;
import com.torrainteligente.tcc.torra_backend.roasts.internal.enums.CoffeePurpose;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;

public record CoffeeQualityDTO(
        UUID id,
        CoffeeVariety variety,
        BigDecimal density,
        FermentationType fermentation,
        CoffeePurpose purpose,
        OffsetDateTime createdAt,
        OffsetDateTime updatedAt
) {}