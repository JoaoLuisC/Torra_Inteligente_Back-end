package com.torrainteligente.tcc.torra_backend.roasts.internal.enums;

public enum FermentationType {
    
    NATURAL("Natural", "Café seco com a cereja intacta, resultando em sabores frutados"),
    FERMENTADO("Fermentado", "Processo de fermentação controlada que desenvolve sabores únicos"),
    CD("Cereja Descascada", "Café com cereja descascada, fermentação sem mucilagem");
    
    private final String displayName;
    private final String description;
    
    FermentationType(String displayName, String description) {
        this.displayName = displayName;
        this.description = description;
    }
    
    public String getDisplayName() {
        return displayName;
    }
    
    public String getDescription() {
        return description;
    }
    
    public static FermentationType fromDisplayName(String displayName) {
        for (FermentationType type : values()) {
            if (type.displayName.equals(displayName)) {
                return type;
            }
        }
        return null;
    }
}