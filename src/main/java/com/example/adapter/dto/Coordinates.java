package com.example.adapter.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


/**
 * Класс для хранения координат
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public  class Coordinates{
    /**
     * Координаты широты
     */
    private String latitude;
    /**
     * Координаты долготы
     */
    private String longitude;
}