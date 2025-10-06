package com.torrainteligente.tcc.torra_backend.user.internal.enums;

public enum UserType {
    
    ANALYST("Analista", "Usuário responsável por análises sensoriais"),
    PRODUCER("Produtor", "Usuário responsável por torradores e torras"),
    ADMIN("Administrador", "Usuário com acesso completo ao sistema");
    
    private final String displayName;
    private final String description;
    
    UserType(String displayName, String description) {
        this.displayName = displayName;
        this.description = description;
    }
    
    public String getDisplayName() {
        return displayName;
    }
    
    public String getDescription() {
        return description;
    }
    
    public static UserType fromDisplayName(String displayName) {
        for (UserType type : values()) {
            if (type.displayName.equals(displayName)) {
                return type;
            }
        }
        return null;
    }
}