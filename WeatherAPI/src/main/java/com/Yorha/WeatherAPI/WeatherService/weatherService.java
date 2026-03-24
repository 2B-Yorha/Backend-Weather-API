package com.Yorha.WeatherAPI.WeatherService;


import com.Yorha.WeatherAPI.WeatherModel.openWeatherResponse;
import com.Yorha.WeatherAPI.WeatherModel.weatherResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class weatherService {
    private final RestTemplate restTemplate = new RestTemplate();

    @Value("${weather.api.key}")
    private String apiKey;

    public weatherResponse getWeather(String city,String units){
        String url = "https://api.openweathermap.org/data/2.5/weather?q="
                + city + "&appid=" + apiKey + "&units=" + units;
        openWeatherResponse response = restTemplate.getForObject(url, openWeatherResponse.class);

        return new weatherResponse(
            response.getName(),
            response.getMain().getTemp(),
            response.getWeather().get(0).getDescription(), units
        );
    }



}
