package com.torrainteligente.tcc.torra_backend.user.open.dto;

import com.torrainteligente.tcc.torra_backend.shared.interfaces.DTO;
import com.torrainteligente.tcc.torra_backend.user.internal.enums.UserType;

import java.time.OffsetDateTime;
import java.util.UUID;

public record UserDTO(
        UUID id,
        String firstName,
        String lastName,
        UserType userType,
        String email,
        OffsetDateTime createdAt,
        OffsetDateTime updatedAt
) implements DTO {}
