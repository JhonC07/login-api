package com.sena.loginapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Clase principal que inicia la aplicacion Spring Boot.
 * Su responsabilidad es arrancar el contexto de Spring
 * para exponer la API REST de autenticacion.
 */
@SpringBootApplication
public class LoginApiApplication {

    /**
     * Metodo de arranque principal del proyecto.
     *
     * @param args argumentos opcionales enviados por consola
     */
    public static void main(String[] args) {
        SpringApplication.run(LoginApiApplication.class, args);
    }
}
