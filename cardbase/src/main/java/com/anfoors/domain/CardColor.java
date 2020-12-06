package com.anfoors.domain;

public enum CardColor {
    ELENIOS("El", "Elenios"),
    RAIA("Ra", "Raia"),
    SHERAN("Sh", "Sheran"),
    FAIRLIGHT("Fa", "Fairlight"),
    RHATT("Rh", "Rhatt"),
    THARR("Th", "Tharr"),
    CHARADIN("Ch", "Chara-din"),
    DORNODON("Do", "Dornodon"),
    LEAH("Le", "Leah"),
    BUFA("Bu", "Bufa");

    private String textSymbol;
    private String name;

    CardColor(String textSymbol, String name) {
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
