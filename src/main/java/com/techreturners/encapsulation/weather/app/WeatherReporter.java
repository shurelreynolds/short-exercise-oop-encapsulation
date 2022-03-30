package com.techreturners.encapsulation.weather.app;

import com.techreturners.encapsulation.weather.model.Atmosphere;
import com.techreturners.encapsulation.weather.model.Weather;

public class WeatherReporter {

    private Weather weather;

    public WeatherReporter(String location, double temperature, Atmosphere atmosphere) {
        weather = new Weather(location, temperature, atmosphere);

    }


    public Weather getWeather() {
        return weather;
    }

    public void setWeather(Weather weather) {
        this.weather = weather;
    }

    public String getReport() {
        return weather.getReport();
    }

    public static void main(String[] args) {
        Weather londonWeather = new Weather("London", 13, Atmosphere.RAINING);
        Weather californiaWeather = new Weather("California", 30, Atmosphere.BRIGHT);
        Weather capeTownWeather = new Weather("Cape Town", 45, Atmosphere.PARTLY_CLOUDY);
        System.out.println(londonWeather.getReport());
        System.out.println(californiaWeather.getReport());
        System.out.println(capeTownWeather.getReport());
    }
}
