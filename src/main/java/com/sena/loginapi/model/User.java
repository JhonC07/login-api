package com.sena.loginapi.model;

/**
 * Modelo simple que representa la informacion enviada
 * por el cliente para registrarse o iniciar sesion.
 */
public class User {

    /**
     * Nombre de usuario utilizado como identificador.
     */
    private String username;

    /**
     * Contrasena asociada al usuario.
     */
    private String password;

    /**
     * Constructor vacio requerido para la deserializacion JSON.
     */
    public User() {
    }

    /**
     * Constructor con argumentos para facilitar la creacion del objeto.
     *
     * @param username nombre de usuario
     * @param password contrasena del usuario
     */
    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    /**
     * Obtiene el nombre de usuario enviado en la peticion.
     *
     * @return username del usuario
     */
    public String getUsername() {
        return username;
    }

    /**
     * Asigna el nombre de usuario recibido.
     *
     * @param username nombre de usuario a guardar
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Obtiene la contrasena enviada por el cliente.
     *
     * @return password del usuario
     */
    public String getPassword() {
        return password;
    }

    /**
     * Asigna la contrasena recibida.
     *
     * @param password contrasena a guardar
     */
    public void setPassword(String password) {
        this.password = password;
    }
}
