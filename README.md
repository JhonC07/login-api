# login-api

Proyecto academico desarrollado con Spring Boot 3 y Java 17 para la evidencia `GA7-220501096-AA5-EV01` del SENA. La aplicacion expone una API REST sencilla para registrar usuarios e iniciar sesion, almacenando la informacion en memoria mediante un `HashMap<String, String>`.

## Descripcion del proyecto

La API implementa dos servicios web:

- `POST /api/auth/register`
- `POST /api/auth/login`

El objetivo es demostrar el uso de una arquitectura por capas sencilla:

- `controller`: expone los endpoints REST.
- `service`: contiene la logica de negocio.
- `model`: representa los datos enviados por el cliente.

## Requisitos

- Java 17
- Maven 3.9 o superior

## Como ejecutar

1. Abrir una terminal en la carpeta del proyecto.
2. Ejecutar el siguiente comando:

```bash
mvn spring-boot:run
```

3. La aplicacion quedara disponible en:

```text
http://localhost:8080
```

## Endpoints

### 1. Registro de usuario

- Metodo: `POST`
- URL: `http://localhost:8080/api/auth/register`

#### Request

```json
{
  "username": "juan",
  "password": "12345"
}
```

#### Response exitosa

```text
Usuario registrado correctamente
```

#### Response usuario duplicado

```text
El usuario ya existe
```

#### Response validacion

```text
Username y password son obligatorios
```

### 2. Inicio de sesion

- Metodo: `POST`
- URL: `http://localhost:8080/api/auth/login`

#### Request

```json
{
  "username": "juan",
  "password": "12345"
}
```

#### Response exitosa

```text
Autenticacion satisfactoria
```

#### Response error

```text
Error en la autenticacion
```

## Ejemplos para Postman

### Registro exitoso

- Metodo: `POST`
- URL: `http://localhost:8080/api/auth/register`
- Body:

```json
{
  "username": "maria",
  "password": "clave123"
}
```

- Respuesta esperada:

```text
Usuario registrado correctamente
```

### Usuario duplicado

- Metodo: `POST`
- URL: `http://localhost:8080/api/auth/register`
- Body:

```json
{
  "username": "maria",
  "password": "clave123"
}
```

- Respuesta esperada:

```text
El usuario ya existe
```

### Login exitoso

- Metodo: `POST`
- URL: `http://localhost:8080/api/auth/login`
- Body:

```json
{
  "username": "maria",
  "password": "clave123"
}
```

- Respuesta esperada:

```text
Autenticacion satisfactoria
```

### Login incorrecto

- Metodo: `POST`
- URL: `http://localhost:8080/api/auth/login`
- Body:

```json
{
  "username": "maria",
  "password": "incorrecta"
}
```

- Respuesta esperada:

```text
Error en la autenticacion
```

## Estructura del proyecto

```text
src/main/java/com/sena/loginapi
|-- controller
|   `-- AuthController.java
|-- service
|   `-- AuthService.java
|-- model
|   `-- User.java
`-- LoginApiApplication.java
```
