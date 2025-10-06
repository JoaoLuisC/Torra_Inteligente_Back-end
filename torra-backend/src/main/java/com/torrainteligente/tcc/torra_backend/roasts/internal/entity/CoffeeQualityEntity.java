package com.torrainteligente.tcc.torra_backend.roasts.internal.entity;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;

import com.torrainteligente.tcc.torra_backend.shared.helpers.EqualsByUUID;
import com.torrainteligente.tcc.torra_backend.shared.helpers.HashCodeByUUID;
import com.torrainteligente.tcc.torra_backend.shared.interfaces.UUIDTorraEntity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.DecimalMax;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "coffee_qualities")
public class CoffeeQualityEntity implements UUIDTorraEntity {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @NotNull(message = "A variedade do café deve ser informada.")
    @Enumerated(EnumType.STRING)
    @Column(name = "variety")
    private CoffeeVariety variety;

    @DecimalMin(value = "0.0", message = "A densidade deve ser maior ou igual a 0.")
    @DecimalMax(value = "999999.99", message = "A densidade deve ser menor que 1.000.000.")
    @Column(name = "density", precision = 10, scale = 2)
    private BigDecimal density;

    @NotNull(message = "O tipo de fermentação deve ser informado.")
    @Enumerated(EnumType.STRING)
    @Column(name = "fermentation")
    private FermentationType fermentation;

    @NotNull(message = "A finalidade do café deve ser informada.")
    @Enumerated(EnumType.STRING)
    @Column(name = "purpose")
    private CoffeePurpose purpose;

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

    public CoffeeVariety getVariety() {
        return variety;
    }

    public void setVariety(CoffeeVariety variety) {
        this.variety = variety;
    }

    public BigDecimal getDensity() {
        return density;
    }

    public void setDensity(BigDecimal density) {
        this.density = density;
    }

    public FermentationType getFermentation() {
        return fermentation;
    }

    public void setFermentation(FermentationType fermentation) {
        this.fermentation = fermentation;
    }

    public CoffeePurpose getPurpose() {
        return purpose;
    }

    public void setPurpose(CoffeePurpose purpose) {
        this.purpose = purpose;
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