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
2. get your API key from: https://openweathermap.org
3. Add your API key in application.properties
   weather.api.key= _your Api Key Here_
4. Run the applicaiton in Intellij


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



```
WeatherAPI
├─ .idea
│  ├─ compiler.xml
│  ├─ encodings.xml
│  ├─ jarRepositories.xml
│  ├─ misc.xml
│  ├─ modules.xml
│  ├─ vcs.xml
│  ├─ WeatherAPI.iml
│  └─ workspace.xml
├─ README.md
└─ WeatherAPI
   ├─ .mvn
   │  └─ wrapper
   │     └─ maven-wrapper.properties
   ├─ Dockerfile
   ├─ HELP.md
   ├─ mvnw
   ├─ mvnw.cmd
   ├─ pom.xml
   ├─ src
   │  ├─ main
   │  │  ├─ java
   │  │  │  └─ com
   │  │  │     └─ Yorha
   │  │  │        └─ WeatherAPI
   │  │  │           ├─ WeatherApiApplication.java
   │  │  │           ├─ WeatherController
   │  │  │           │  └─ weatherController.java
   │  │  │           ├─ WeatherModel
   │  │  │           │  ├─ openWeatherResponse.java
   │  │  │           │  └─ weatherResponse.java
   │  │  │           └─ WeatherService
   │  │  │              └─ weatherService.java
   │  │  └─ resources
   │  │     ├─ application.properties
   │  │     ├─ static
   │  │     └─ templates
   │  └─ test
   │     └─ java
   │        └─ com
   │           └─ Yorha
   │              └─ WeatherAPI
   │                 └─ WeatherApiApplicationTests.java
   └─ target
      ├─ classes
      │  ├─ application.properties
      │  └─ com
      │     └─ Yorha
      │        └─ WeatherAPI
      │           ├─ WeatherApiApplication.class
      │           ├─ WeatherController
      │           │  └─ weatherController.class
      │           ├─ WeatherModel
      │           │  ├─ openWeatherResponse$Main.class
      │           │  ├─ openWeatherResponse$Weather.class
      │           │  ├─ openWeatherResponse.class
      │           │  └─ weatherResponse.class
      │           └─ WeatherService
      │              └─ weatherService.class
      ├─ generated-sources
      │  └─ annotations
      ├─ generated-test-sources
      │  └─ test-annotations
      ├─ maven-archiver
      │  └─ pom.properties
      ├─ maven-status
      │  └─ maven-compiler-plugin
      │     ├─ compile
      │     │  └─ default-compile
      │     │     ├─ createdFiles.lst
      │     │     └─ inputFiles.lst
      │     └─ testCompile
      │        └─ default-testCompile
      │           ├─ createdFiles.lst
      │           └─ inputFiles.lst
      ├─ test-classes
      │  └─ com
      │     └─ Yorha
      │        └─ WeatherAPI
      │           └─ WeatherApiApplicationTests.class
      ├─ WeatherAPI-0.0.1-SNAPSHOT.jar
      └─ WeatherAPI-0.0.1-SNAPSHOT.jar.original

```