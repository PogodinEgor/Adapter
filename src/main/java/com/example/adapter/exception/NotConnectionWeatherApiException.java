package com.example.adapter.exception;

/**
 * Исключение для ситуаций, когда не удается установить соединение с внешним API погоды.
 * Это может происходить из-за различных причин, включая проблемы с сетью или неправильный URL сервиса.
 */
public class NotConnectionWeatherApiException extends RuntimeException {
    public NotConnectionWeatherApiException(String message) {
        super(message);
    }
}
