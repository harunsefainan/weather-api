package org.example.weatherapi.model;

import lombok.Data;

@Data
public class WeatherData {
    private String date;
    private String condition;
    private double temperature;
}
