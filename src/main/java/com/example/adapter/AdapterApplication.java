package com.example.adapter;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@OpenAPIDefinition(
        info = @Info(
                title = "AdapterService",
                description = "Микросервис 'AdapterService' предназначен для обработки данных между сервисом А и сервисом B,\n" +
                        " обогащая их информацией о погоде от внешнего API. \n" +
                        "Сервис принимает данные от сервиса А, \n" +
                        "фильтрует их по определенным критериям (например, по полю 'lng'), \n" +
                        "затем запрашивает информацию о погоде исходя из координат, \n" +
                        "полученными данными формирует и обогащает новый объект для передачи в сервис B, \n" +
                        "включая в него данные о текущей погоде. \n" +
                        "Это позволяет сервису B получать расширенную информацию, необходимую для выполнения своих функций.",
                version = "0.0.1",
                contact = @Contact(
                        name = "Pogodin Egor",
                        email = "666deadkain999@gmail.com",
                        url = "https://github.com/PogodinEgor"
                )
        )
)
public class AdapterApplication {
    public static void main(String[] args) {
        SpringApplication.run(AdapterApplication.class, args);
    }

}
