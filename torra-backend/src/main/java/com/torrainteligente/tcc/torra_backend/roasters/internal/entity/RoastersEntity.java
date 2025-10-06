package com.torrainteligente.tcc.torra_backend.roasters.internal.entity;

import java.time.OffsetDateTime;
import java.util.UUID;

import com.torrainteligente.tcc.torra_backend.shared.helpers.EqualsByUUID;
import com.torrainteligente.tcc.torra_backend.shared.helpers.HashCodeByUUID;
import com.torrainteligente.tcc.torra_backend.shared.interfaces.UUIDTorraEntity;
import com.torrainteligente.tcc.torra_backend.user.internal.entity.UserEntity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "roasters")
public class RoastersEntity implements UUIDTorraEntity {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @NotBlank(message = "O nome do torrador deve ser preenchido.")
    @Size(max = 100, message = "O nome do torrador deve ter no máximo 100 caracteres.")
    @Column(name = "name")
    private String name;

    @NotNull(message = "O usuário proprietário deve ser informado.")
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private UserEntity user;

    @Column(name = "created_at")
    private OffsetDateTime createdAt;

    @Column(name = "updated_at")
    private OffsetDateTime updatedAt;

    @Override
    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UserEntity getUser() {
        return user;
    }

    public void setUser(UserEntity user) {
        this.user = user;
    }

    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public boolean equals(Object o) {
        return EqualsByUUID.equals(this, o);
    }

    @Override
    public int hashCode() {
        return HashCodeByUUID.hashCode(this);
    }
}
