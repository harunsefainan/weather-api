package org.example.weatherapi.controller;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.RequiredArgsConstructor;
import org.example.weatherapi.model.WeatherResponse;
import org.example.weatherapi.service.WeatherService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/weather")
public class WeatherController {

    private final WeatherService weatherService;

    @GetMapping("/daily")
    public ResponseEntity<WeatherResponse> getDailyWeather(
            @RequestParam @NotBlank @Size(min = 2) String city) {
        WeatherResponse response = weatherService.getDailyWeather(city);
        System.out.println("/daily");
        return ResponseEntity.ok(response);
    }

    @GetMapping("/weekly")
    public ResponseEntity<WeatherResponse> getWeeklyWeather(
            @RequestParam @NotBlank @Size(min = 2) String city) {
        WeatherResponse response = weatherService.getWeeklyWeather(city);
        return ResponseEntity.ok(response);
    }

    @GetMapping("/monthly")
    public ResponseEntity<WeatherResponse> getMonthlyWeather(
            @RequestParam @NotBlank @Size(min = 2) String city) {
        WeatherResponse response = weatherService.getMonthlyWeather(city);
        return ResponseEntity.ok(response);
    }
}
