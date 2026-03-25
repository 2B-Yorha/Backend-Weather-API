# Weather API

A RESTful Weather API built with java and Spring Boot that returns live weather data
for any city in the world.

## Technologies Used:
- Java 17
- Spring Boot
- RestTemplate
- OpenWeatherMap API



## Features
- Get current Weather by city Name
- Support for Metric and imperial system
- Returns temperature, weather description and the units in which its measured


## Getting Started

### Prerequisites
- Java 17+
- Maven
- OpenWeatherMap API key (free available at weathermap.org)

### Installation
1. Clone the repo:
   git clone https://github.com/2B-Yorha/Backend-Weather-API.git
2. Add your API key in application.properties
   weather.api.key= _your Api Key Here_
3. Run the applicaiton in Intellij


### Endpoints for PostMan
* GET | /api/weather?city=Cape town&units=metric | get weather in Celsius
* GET | /api/weather?city=Cape town&units=imperial | get weather in Fahrenheit

### Example Response
 - {
      "city": "Cape Town",
      "temp": 20.35,
      "description": "broken clouds",
      "units": "metric"
   }



- {
      "city": "Cape Town",
      "temp": 68.63,
      "description": "broken clouds",
      "units": "imperial"
  }


