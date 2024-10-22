# TRACCAR CON DOCKER

Este documento describe cómo configurar y ejecutar Traccar usando Docker, aprovechando la capacidad de contenedores para administrar tanto el backend como el frontend de la aplicación.

## Requisitos

- Tener instalado Docker y Docker Compose en tu sistema.

## Instrucciones de uso

### 1. Realizar un Fork del Repositorio

Para comenzar, haz un fork del repositorio de Traccar que contiene la configuración de Docker y los archivos necesarios. Esto te permitirá tener tu propia copia del proyecto para hacer modificaciones y actualizaciones según tus necesidades.

### 2. Crear las Redes para los Contenedores

Traccar se divide en dos partes principales: el backend y el frontend. Para separar estas dos partes y mejorar la organización y seguridad, se crearán dos redes Docker específicas:

1. **Red para Backend**
   - Ejecuta el siguiente comando para crear la red del backend:
     ```bash
     docker network create --driver bridge --subnet=172.18.0.0/24 backend_network
     ```

2. **Red para Frontend**
   - Ejecuta el siguiente comando para crear la red del frontend:
     ```bash
     docker network create --driver bridge --subnet=172.19.0.0/24 frontend_network
     ```

### 3. Crear los Contenedores con Docker Compose

Para levantar los contenedores de la base de datos, servidor y la interfaz web de Traccar, se utilizará Docker Compose. Cada componente tiene su propio archivo `docker-compose.yaml` que define su configuración.

1. Ejecuta el siguiente comando:
   ```bash
   docker-compose -f <nombre de carpeta de contenedor>/docker-compose.yaml up
   ```
Esperar que se termine de construir y pasar al siguiente:
Construir en el siguiente orden db --> server --> web