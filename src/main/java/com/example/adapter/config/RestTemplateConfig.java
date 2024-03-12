package com.example.adapter.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * Конфигурационный класс Spring для создания и настройки {@link RestTemplate}.
 * {@link RestTemplate} предоставляет удобные методы для вызова RESTful сервисов с синхронным поведением.
 * Этот конфигурационный класс определяет бин {@link RestTemplate}, который можно автоматически внедрять в другие компоненты приложения.
 */
@Configuration
public class RestTemplateConfig {

    /**
     * Создаёт бин {@link RestTemplate}.
     * Может быть настроен для использования пользовательскими интерцепторами, обработчиками ошибок и другими характеристиками,
     * специфичными для приложения.
     *
     * @return экземпляр {@link RestTemplate}, готовый к использованию в приложении.
     */
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}