package com.example.adapter.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Класс - DTO, получаемый из сервиса api-ninjas.com/api/weather
 */
@AllArgsConstructor
@Getter
@Setter
@ToString
public class WeatherNinjaResponse {

    /**
     * Класс - DTO, для сообщения, получаемого из погодного сервиса
     */
    @JsonProperty("cloud_pct")
    private Integer cloudPercentage;
    /**
     * Текущая температура
     */
    @JsonProperty("temp")
    private Integer temperature;

    @JsonProperty("feels_like")
    private Double feelsLike;

    @JsonProperty("humidity")
    private Integer humidity;

    @JsonProperty("min_temp")
    private Double minTemperature;

    @JsonProperty("max_temp")
    private Double maxTemperature;

    @JsonProperty("wind_speed")
    private Double windSpeed;

    @JsonProperty("wind_degrees")
    private Integer windDegrees;

    @JsonProperty("sunrise")
    private Long sunrise;

    @JsonProperty("sunset")
    private Long sunset;


}
