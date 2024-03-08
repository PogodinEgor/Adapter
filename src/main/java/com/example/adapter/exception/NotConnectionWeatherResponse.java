package com.example.adapter.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * Ответ, представляющий ошибку связи с внешним сервисом погоды.
 * Содержит сообщение об ошибке и временную метку.
 */
@AllArgsConstructor
@Getter
@Setter
public class NotConnectionWeatherResponse {
    private String message;
    private Long timestamp;
}
