/*
 * @author Shurel Reynolds
 * */

package com.techreturners.encapsulation.weather.model;

import java.text.MessageFormat;


public class Weather {
    private final String location;
    private double temperature;
    private Atmosphere atmosphere = Atmosphere.SUNNY;


    public Weather(final String location, double temperature, Atmosphere atmosphere) {
        this(location, temperature);
        this.atmosphere = atmosphere;
    }

    public Weather(final String location, double temperature) {
        if(location==null)
            throw new NullPointerException("Location not set.");
        this.location = location;
        this.temperature = temperature;
    }
    /**
     * Returns the Fahrenheit for the Weather object's temperature.
     * @return      degrees Fahrenheit
     */
    public double toFahrenheit() {
        return (9.0 / 5.0) * temperature + 32;
    }

    /**
     * Returns the Fahrenheit for the Weather object's temperature.
     * @return      degrees Fahrenheit
     */
    public String getSentiment() {
        if (temperature > 30) {

            return "It's too hot 🥵!";

        } else if (temperature < 10) {

            return "It's too cold 🥶!";

        }
        return "Ahhh...it's just right 😊!";
    }

    public String getSymbol() {
        return this.atmosphere.getSymbol();
    }

    public String getLocation() {
        return this.location;
    }

    public String getReport() {
        return MessageFormat.format("I am in {0} and it is {1}. {2}. The temperature in Fahrenheit is {3}.", getLocation(), getSymbol(), getSentiment(), toFahrenheit());

    }
    public void update(double temperature, Atmosphere atmosphere){
        this.temperature = temperature;
        this.atmosphere = atmosphere;
    }

    public double getTemperature() {
        return temperature;
    }

    /**
     * Declares the temperature to location of the Weather object.
     *
     * @param temperature the text of the tool tip
     */
    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public Atmosphere getAtmosphere() {
        return atmosphere;
    }

    public void setAtmosphere(Atmosphere atmosphere) {
        this.atmosphere = atmosphere;
    }

    @Override
    public String toString(){
        return getReport();
    }
}