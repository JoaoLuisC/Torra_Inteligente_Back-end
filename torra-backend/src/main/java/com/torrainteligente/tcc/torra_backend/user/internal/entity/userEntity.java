package com.torrainteligente.tcc.torra_backend.user.internal.entity;

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
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "users")
public class UserEntity implements UUIDTorraEntity {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @NotBlank(message = "O primeiro nome deve ser preenchido.")
    @Size(max = 100, message = "O primeiro nome deve ter no máximo 100 caracteres.")
    @Column(name = "first_name")
    private String firstName;

    @NotBlank(message = "O sobrenome deve ser preenchido.")
    @Size(max = 100, message = "O sobrenome deve ter no máximo 100 caracteres.")
    @Column(name = "last_name")
    private String lastName;

    @NotNull(message = "O tipo de usuário deve ser informado.")
    @Enumerated(EnumType.STRING)
    @Column(name = "user_type")
    private UserType userType;

    @NotBlank(message = "O email deve ser preenchido.")
    @Email(message = "O email deve ter um formato válido.")
    @Size(max = 150, message = "O email deve ter no máximo 150 caracteres.")
    @Column(name = "email", unique = true)
    private String email;

    @NotBlank(message = "A senha deve ser preenchida.")
    @Size(max = 255, message = "A senha deve ter no máximo 255 caracteres.")
    @Column(name = "password")
    private String password;

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

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public UserType getUserType() {
        return userType;
    }

    public void setUserType(UserType userType) {
        this.userType = userType;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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
