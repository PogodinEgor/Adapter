package com.example.adapter.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Класс - DTO, для хранения сообщений, отправляемых сервисом A
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class MsgA {
    /**
     * Текст сообщения
     */
    private String msg;
    /**
     * Язык
     */
    private Language lng;
    /**
     * Координаты
     */
    private  Coordinates coordinates;

}
