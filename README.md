# Proyecto CRUD con Java Spring Boot y MySQL

Este es un proyecto de ejemplo que implementa un CRUD (Crear, Leer, Actualizar, Eliminar) utilizando Java Spring Boot para el backend y MySQL como base de datos. El proyecto incluye una API RESTful para gestionar estudiantes.

## Tecnologías utilizadas

- Java
- Spring Boot
- MySQL
- Maven

## Configuración del proyecto

1. Clona este repositorio en tu máquina local.
2. Configura tu base de datos MySQL y asegúrate de actualizar la configuración de conexión en el archivo `application.properties`.
3. Ejecuta la aplicación Spring Boot utilizando tu IDE favorito o utilizando el comando `mvn spring-boot:run`.
4. Accede a la API RESTful desde tu navegador o herramienta de cliente HTTP.

## Endpoints de la API

- `GET /api/v1/students`: Obtiene todos los estudiantes.
- `GET /api/v1/students/{id}`: Obtiene un estudiante por su ID.
- `POST /api/v1/students`: Crea un nuevo estudiante.
- `PUT /api/v1/students/{id}`: Actualiza un estudiante existente.
- `DELETE /api/v1/students/{id}`: Elimina un estudiante por su ID.

## Contribución

¡Siéntete libre de contribuir a este proyecto enviando solicitudes de extracción! Antes de enviar una solicitud de extracción, asegúrate de discutir los cambios propuestos en un problema.

## Licencia

Este proyecto está licenciado bajo la [Licencia MIT](LICENSE).
