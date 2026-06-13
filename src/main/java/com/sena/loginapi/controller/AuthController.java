package com.sena.loginapi.controller;

import com.sena.loginapi.model.User;
import com.sena.loginapi.service.AuthService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/* Controlador REST que expone los endpoints de registro 
e inicio de sesion solicitados para la evidencia.
 */
@RestController
@RequestMapping("/api/auth")
public class AuthController {

    /**
     * Servicio que contiene la logica de autenticacion.
     */
    private final AuthService authService;

    /**
     * Constructor con inyeccion de dependencias.
     *
     * @param authService servicio de autenticacion
     */
    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    /**
     * Endpoint para registrar usuarios en memoria.
     *
     * @param user datos recibidos en formato JSON
     * @return mensaje con el resultado del registro
     */
    @PostMapping("/register")
    public ResponseEntity<String> register(@RequestBody User user) {
        return ResponseEntity.ok(authService.register(user));
    }

    /**
     * Endpoint para autenticar usuarios registrados.
     *
     * @param user datos recibidos en formato JSON
     * @return mensaje con el resultado del login
     */
    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody User user) {
        return ResponseEntity.ok(authService.login(user));
    }
}
