package com.Yorha.WeatherAPI.WeatherModel;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class weatherResponse {
    private String city;
    private Double temp;
    private String description;
    private String units;
}
