package org.example.weatherapi.model;

import lombok.Data;

import java.util.List;

@Data
public class WeatherResponse {
    private String city;
    private String country;
    private List<WeatherData> weatherDataList;
}
