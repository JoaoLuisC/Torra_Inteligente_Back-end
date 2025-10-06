package com.torrainteligente.tcc.torra_backend.roasts.internal.enums;

public enum CoffeeVariety {
    
    ARABICO("Arábica", "Variedade premium com sabores complexos e menor teor de cafeína"),
    BOURBON("Bourbon", "Variedade de alta qualidade com características equilibradas");
    
    private final String displayName;
    private final String description;
    
    CoffeeVariety(String displayName, String description) {
        this.displayName = displayName;
        this.description = description;
    }
    
    public String getDisplayName() {
        return displayName;
    }
    
    public String getDescription() {
        return description;
    }
    
    public static CoffeeVariety fromDisplayName(String displayName) {
        for (CoffeeVariety variety : values()) {
            if (variety.displayName.equals(displayName)) {
                return variety;
            }
        }
        return null;
    }
}