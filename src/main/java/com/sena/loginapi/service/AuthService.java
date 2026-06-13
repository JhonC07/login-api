package com.sena.loginapi.service;

import com.sena.loginapi.model.User;
import org.springframework.stereotype.Service;

import java.util.HashMap;

/**
 * Servicio encargado de gestionar la logica de negocio
 * del registro y autenticacion de usuarios.
 */
@Service
public class AuthService {

    /**
     * Almacen en memoria para fines academicos.
     * La llave corresponde al username y el valor a la password.
     */
    private final HashMap<String, String> users = new HashMap<>();

    /**
     * Registra un nuevo usuario despues de validar sus datos.
     *
     * @param user informacion enviada por el cliente
     * @return mensaje con el resultado del registro
     */
    public String register(User user) {
        if (user == null || isBlank(user.getUsername()) || isBlank(user.getPassword())) {
            return "Username y password son obligatorios";
        }

        if (users.containsKey(user.getUsername())) {
            return "El usuario ya existe";
        }

        users.put(user.getUsername(), user.getPassword());
        return "Usuario registrado correctamente";
    }

    /**
     * Verifica si el usuario existe y si la contrasena coincide.
     *
     * @param user informacion enviada por el cliente
     * @return mensaje con el resultado de la autenticacion
     */
    public String login(User user) {
        if (user == null || !users.containsKey(user.getUsername())) {
            return "Error en la autenticacion";
        }

        String storedPassword = users.get(user.getUsername());
        if (storedPassword != null && storedPassword.equals(user.getPassword())) {
            return "Autenticacion satisfactoria";
        }

        return "Error en la autenticacion";
    }

    /**
     * Evalua si una cadena es nula, vacia o contiene solo espacios.
     *
     * @param value valor a validar
     * @return true cuando el valor no es valido
     */
    private boolean isBlank(String value) {
        return value == null || value.isBlank();
    }
}
