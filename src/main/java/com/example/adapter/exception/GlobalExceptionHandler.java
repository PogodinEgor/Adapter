package com.example.adapter.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
/**
 * Класс GlobalExceptionHandler предоставляет глобальную обработку исключений для приложения.
 * Он определяет обработчики для специфических исключений, возникающих во время выполнения приложения,
 * и формирует соответствующие ответы HTTP для клиента.
 */
@ControllerAdvice
public class GlobalExceptionHandler {

    /**
     * Обрабатывает исключения, связанные с недоступностью внешнего сервиса погоды.
     * @param ex Экземпляр исключения NotConnectionWeatherApiException, содержащий информацию об ошибке.
     * @return ResponseEntity с объектом NotConnectionWeatherResponse, который содержит сообщение об ошибке и временную метку.
     * Возвращает HTTP статус 404 Not Found, указывая на то, что запрашиваемый ресурс (внешний сервис погоды) не был найден или недоступен.
     */
    @ExceptionHandler
    public ResponseEntity<NotConnectionWeatherResponse> handleException(NotConnectionWeatherApiException ex) {
        NotConnectionWeatherResponse response = new NotConnectionWeatherResponse(ex.getMessage(), System.currentTimeMillis());
        return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
    }

    /**
     * Обрабатывает исключения, связанные с отсутствием ожидаемого сообщения от сервиса.
     * @param ex Экземпляр исключения NotFoundMessageServicesException, содержащий информацию об ошибке.
     * @return ResponseEntity с объектом NotFoundMessageServicesResponse, который содержит сообщение об ошибке и временную метку.
     * Возвращает HTTP статус 404 Not Found, указывая на то, что ожидаемое сообщение отсутствует или не было предоставлено корректно.
     */
    @ExceptionHandler
    public ResponseEntity<NotFoundMessageServicesResponse> handleException(NotFoundMessageServicesException ex) {
        NotFoundMessageServicesResponse response = new NotFoundMessageServicesResponse(ex.getMessage(), System.currentTimeMillis());
        return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
    }
}
