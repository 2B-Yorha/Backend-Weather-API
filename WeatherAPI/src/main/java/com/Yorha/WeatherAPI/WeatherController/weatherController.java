package com.Yorha.WeatherAPI.WeatherController;


import com.Yorha.WeatherAPI.WeatherModel.weatherResponse;
import com.Yorha.WeatherAPI.WeatherService.weatherService;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/weather")
@CrossOrigin(origins = "*")
public class weatherController {
    private final weatherService weatherService;


    public weatherController(weatherService weatherService) {
        this.weatherService = weatherService;
    }

    @GetMapping
    public weatherResponse getWeather(
            @RequestParam String city,
            @RequestParam(defaultValue = "metric") String units){
        return weatherService.getWeather(city, units);
    }

}
