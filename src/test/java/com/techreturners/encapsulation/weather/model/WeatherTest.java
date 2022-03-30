/*
 * @author Shurel Reynolds
 */
package com.techreturners.encapsulation.weather.model;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WeatherTest {
    Weather weather;


    @Before
    public void setup() {

        weather = new Weather("London", 13, Atmosphere.BRIGHT);
    }

    @Test
    public void testLocation() {
        String expected = "London";
        assertEquals(expected, weather.getLocation());

    }

    @Test
    public void testWeatherConversion() {

        weather.setTemperature(0);
        String expected="32.0";
        Assert.assertEquals(expected, weather.toFahrenheit()+"");
    }

    @Test
    public void testWeatherUpdate() {

        Atmosphere expected=Atmosphere.BRIGHT;
        Assert.assertEquals(expected, weather.getAtmosphere());
        weather.update(15,Atmosphere.RAINING);
        expected=Atmosphere.RAINING;
        Assert.assertEquals(expected, weather.getAtmosphere());
    }


}
