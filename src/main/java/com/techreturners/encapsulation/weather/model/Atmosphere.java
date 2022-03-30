package com.techreturners.encapsulation.weather.model;

public enum Atmosphere {
    RAINING("🌦"),
    BRIGHT("🌅"),
    PARTLY_CLOUDY("🌤"),
    SUNNY("🔆");

    private String symbol;

    private Atmosphere(String symbol) {
        this.symbol = symbol;
    }

    public String getSymbol() {
        return this.symbol;
    }
}
