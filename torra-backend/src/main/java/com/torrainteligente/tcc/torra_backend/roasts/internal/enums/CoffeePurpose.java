package com.torrainteligente.tcc.torra_backend.roasts.internal.enums;

public enum CoffeePurpose {
    
    ESPRESSO("Espresso", "Café destinado à preparação em máquinas de espresso"),
    FILTRO("Filtro", "Café destinado à preparação por métodos de filtragem"),
    AMOSTRA("Amostra", "Café destinado à análise sensorial e cupping");
    
    private final String displayName;
    private final String description;
    
    CoffeePurpose(String displayName, String description) {
        this.displayName = displayName;
        this.description = description;
    }
    
    public String getDisplayName() {
        return displayName;
    }
    
    public String getDescription() {
        return description;
    }
    
    public static CoffeePurpose fromDisplayName(String displayName) {
        for (CoffeePurpose purpose : values()) {
            if (purpose.displayName.equals(displayName)) {
                return purpose;
            }
        }
        return null;
    }
}