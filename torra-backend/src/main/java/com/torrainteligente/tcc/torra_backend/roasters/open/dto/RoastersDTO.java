package com.torrainteligente.tcc.torra_backend.roasters.open.dto;

import java.time.OffsetDateTime;
import java.util.UUID;

public record RoastersDTO(
        UUID id,
        String name,
        UUID userId,
        OffsetDateTime createdAt,
        OffsetDateTime updatedAt
) {}
