package com.Yorha.WeatherAPI.WeatherModel;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class openWeatherResponse {
    private String name;
    private Main main;
    private List<Weather> weather;


    @Data
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Main{
        private double temp;
    }

    @Data
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Weather{
        private String description;
    }

}
