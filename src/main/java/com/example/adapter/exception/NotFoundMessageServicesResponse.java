package com.example.adapter.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * Ответ, представляющий ошибку отсутствия ожидаемого сообщения от сервиса.
 * Содержит сообщение об ошибке и временную метку.
 */
@AllArgsConstructor
@Getter
@Setter
public class NotFoundMessageServicesResponse {
    private String message;
    private Long timestamp;
}
