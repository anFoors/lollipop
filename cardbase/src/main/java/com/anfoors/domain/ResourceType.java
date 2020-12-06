package com.anfoors.domain;

public enum ResourceType {
    MANA("M", "Mana"),
    BONE("SZK", "Szörnykomponens"),
    BUILDER("É", "Építő"),
    SACRIFICE("Á", "Áldozás"),
    NECRON("N", "Nekron"),
    ZAN("Z", "Zan");

    private final String symbol;
    private final String name;

    ResourceType(String symbol, String name) {
        this.symbol = symbol;
        this.name = name;
    }

    public String getSymbol() {
        return symbol;
    }

    public String getName() {
        return name;
    }
}
