package com.anfoors.domain;

public enum ResourceType {
    MANA("M", "Mana"),
    BONE("SZK", "Szörnykomponens"),
    BUILDER("É", "Építő"),
    SACRIFICE("Á", "Áldozás"),
    NECRON("N", "Nekron"),
    ZAN("Z", "Zan");

    private final String textSymbol;
    private final String name;

    ResourceType(String textSymbol, String name) {
        this.textSymbol = textSymbol;
        this.name = name;
    }

    public String getTextSymbol() {
        return textSymbol;
    }

    public String getName() {
        return name;
    }
}
