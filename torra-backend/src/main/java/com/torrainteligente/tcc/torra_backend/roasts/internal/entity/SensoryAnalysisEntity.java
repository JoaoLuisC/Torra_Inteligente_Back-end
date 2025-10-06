package com.torrainteligente.tcc.torra_backend.roasts.internal.entity;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;

import com.torrainteligente.tcc.torra_backend.shared.helpers.EqualsByUUID;
import com.torrainteligente.tcc.torra_backend.shared.helpers.HashCodeByUUID;
import com.torrainteligente.tcc.torra_backend.shared.interfaces.UUIDTorraEntity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.DecimalMax;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "sensory_analyses")
public class SensoryAnalysisEntity implements UUIDTorraEntity {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @NotNull(message = "A torra analisada deve ser informada.")
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "roast_id", nullable = false, unique = true)
    private RoastsEntity roast;

    @DecimalMin(value = "0.0", message = "A nota deve ser maior ou igual a 0.")
    @DecimalMax(value = "10.0", message = "A nota deve ser menor ou igual a 10.")
    @Column(name = "powder_aroma", precision = 3, scale = 1)
    private BigDecimal powderAroma;

    @DecimalMin(value = "0.0", message = "A nota deve ser maior ou igual a 0.")
    @DecimalMax(value = "10.0", message = "A nota deve ser menor ou igual a 10.")
    @Column(name = "fragrance", precision = 3, scale = 1)
    private BigDecimal fragrance;

    @DecimalMin(value = "0.0", message = "A nota deve ser maior ou igual a 0.")
    @DecimalMax(value = "10.0", message = "A nota deve ser menor ou igual a 10.")
    @Column(name = "flavor", precision = 3, scale = 1)
    private BigDecimal flavor;

    @DecimalMin(value = "0.0", message = "A nota deve ser maior ou igual a 0.")
    @DecimalMax(value = "10.0", message = "A nota deve ser menor ou igual a 10.")
    @Column(name = "acidity", precision = 3, scale = 1)
    private BigDecimal acidity;

    @DecimalMin(value = "0.0", message = "A nota deve ser maior ou igual a 0.")
    @DecimalMax(value = "10.0", message = "A nota deve ser menor ou igual a 10.")
    @Column(name = "body", precision = 3, scale = 1)
    private BigDecimal body;

    @DecimalMin(value = "0.0", message = "A nota deve ser maior ou igual a 0.")
    @DecimalMax(value = "10.0", message = "A nota deve ser menor ou igual a 10.")
    @Column(name = "aftertaste", precision = 3, scale = 1)
    private BigDecimal aftertaste;

    @DecimalMin(value = "0.0", message = "A nota deve ser maior ou igual a 0.")
    @DecimalMax(value = "10.0", message = "A nota deve ser menor ou igual a 10.")
    @Column(name = "balance", precision = 3, scale = 1)
    private BigDecimal balance;

    @DecimalMin(value = "0.0", message = "A nota deve ser maior ou igual a 0.")
    @DecimalMax(value = "10.0", message = "A nota deve ser menor ou igual a 10.")
    @Column(name = "sweetness", precision = 3, scale = 1)
    private BigDecimal sweetness;

    @DecimalMin(value = "0.0", message = "A nota deve ser maior ou igual a 0.")
    @DecimalMax(value = "10.0", message = "A nota deve ser menor ou igual a 10.")
    @Column(name = "uniformity", precision = 3, scale = 1)
    private BigDecimal uniformity;

    @DecimalMin(value = "0.0", message = "A nota deve ser maior ou igual a 0.")
    @DecimalMax(value = "10.0", message = "A nota deve ser menor ou igual a 10.")
    @Column(name = "defects", precision = 3, scale = 1)
    private BigDecimal defects;

    @DecimalMin(value = "0.0", message = "A nota deve ser maior ou igual a 0.")
    @DecimalMax(value = "10.0", message = "A nota deve ser menor ou igual a 10.")
    @Column(name = "final_aroma", precision = 3, scale = 1)
    private BigDecimal finalAroma;

    @DecimalMin(value = "0.0", message = "A nota deve ser maior ou igual a 0.")
    @DecimalMax(value = "10.0", message = "A nota deve ser menor ou igual a 10.")
    @Column(name = "overall_assessment", precision = 3, scale = 1)
    private BigDecimal overallAssessment;

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

    public RoastsEntity getRoast() {
        return roast;
    }

    public void setRoast(RoastsEntity roast) {
        this.roast = roast;
    }

    public BigDecimal getPowderAroma() {
        return powderAroma;
    }

    public void setPowderAroma(BigDecimal powderAroma) {
        this.powderAroma = powderAroma;
    }

    public BigDecimal getFragrance() {
        return fragrance;
    }

    public void setFragrance(BigDecimal fragrance) {
        this.fragrance = fragrance;
    }

    public BigDecimal getFlavor() {
        return flavor;
    }

    public void setFlavor(BigDecimal flavor) {
        this.flavor = flavor;
    }

    public BigDecimal getAcidity() {
        return acidity;
    }

    public void setAcidity(BigDecimal acidity) {
        this.acidity = acidity;
    }

    public BigDecimal getBody() {
        return body;
    }

    public void setBody(BigDecimal body) {
        this.body = body;
    }

    public BigDecimal getAftertaste() {
        return aftertaste;
    }

    public void setAftertaste(BigDecimal aftertaste) {
        this.aftertaste = aftertaste;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public BigDecimal getSweetness() {
        return sweetness;
    }

    public void setSweetness(BigDecimal sweetness) {
        this.sweetness = sweetness;
    }

    public BigDecimal getUniformity() {
        return uniformity;
    }

    public void setUniformity(BigDecimal uniformity) {
        this.uniformity = uniformity;
    }

    public BigDecimal getDefects() {
        return defects;
    }

    public void setDefects(BigDecimal defects) {
        this.defects = defects;
    }

    public BigDecimal getFinalAroma() {
        return finalAroma;
    }

    public void setFinalAroma(BigDecimal finalAroma) {
        this.finalAroma = finalAroma;
    }

    public BigDecimal getOverallAssessment() {
        return overallAssessment;
    }

    public void setOverallAssessment(BigDecimal overallAssessment) {
        this.overallAssessment = overallAssessment;
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
