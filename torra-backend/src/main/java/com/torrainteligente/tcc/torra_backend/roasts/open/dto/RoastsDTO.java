package com.torrainteligente.tcc.torra_backend.roasts.open.dto;

import java.time.OffsetDateTime;
import java.util.UUID;

public record RoastsDTO(
        UUID id,
        String name,
        UUID userId,
        CoffeeQualityDTO coffeeQuality,
        OffsetDateTime createdAt,
        OffsetDateTime updatedAt
) {}
