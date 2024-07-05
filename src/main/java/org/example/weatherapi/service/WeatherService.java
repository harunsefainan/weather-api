package org.example.weatherapi.service;

import lombok.RequiredArgsConstructor;
import org.example.weatherapi.model.WeatherResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@RequiredArgsConstructor
public class WeatherService {

    @Value("${weather.api.key}")
    private String apiKey;

    private final RestTemplate restTemplate;

    public WeatherResponse getDailyWeather(String city) {
        String url = String.format("https://api.openweathermap.org/data/3.0/weather?q=%s&appid=%s", city, apiKey);
        return restTemplate.getForObject(url, WeatherResponse.class);
    }

    public WeatherResponse getWeeklyWeather(String city) {
        String url = String.format("https://api.openweathermap.org/data/3.0/forecast?q=%s&appid=%s", city, apiKey);
        return restTemplate.getForObject(url, WeatherResponse.class);
    }

    public WeatherResponse getMonthlyWeather(String city) {
        String url = String.format("https://api.openweathermap.org/data/3.0/weather?q=%s&appid=%s", city, apiKey);
        return restTemplate.getForObject(url, WeatherResponse.class);
    }
}
