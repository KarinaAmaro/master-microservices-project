# [kat] Proyecto Final - Spring Boot [2024]


Este proyecto esta enfocado en implementar un monorepo, utilizando patrones de diseño de microservicios.


## Comenzando 🚀
---

Estas instrucciones te permitirán obtener una copia del proyecto en funcionamiento en tú máquina local para propósitos de desarrollo y pruebas.

1.- Clona el repositorio.

| Comando | Descripción |
| --- | --- |
| HTTP | https://github.com/KarinaAmaro/master-microservices-project.git |
| SSH | git@github.com:KarinaAmaro/master-microservices-project.git |


2.- Importa el proyecto a algún IDE como projecto gradle.

3.- Verifica que todas las dependencias se hayan descargado correctamente, sino ejecutar el siguiente comando para actualizar dependencias.
```shell
$ ./gradlew clean build
```
4.- Verificar que se cumplan los **Pre-requisitos**.

5.- Ejecutar el proyecto con `docker-compose`:
```shell
$ docker-compose up -d
```
6.- Ir a Docker Desktop y visualizar que el contenedor se desplegará correctamente

7.- Contratos de los microservcios
```shell
http://localhost:8090/swagger-ui/index.html

http://localhost:8080/swagger-ui/index.html

http://localhost:8060/swagger-ui/index.html
```

### Pre-requisitos 📋

---
| Nombre | Version |Url |
|   :---:   |   :---:   |   :---:   |
|   Java    |   21.x.x   | https://www.oracle.com/mx/java/technologies/downloads/#graalvmjava21 |
|   Spring Boot   |  3.2.5    |  |
|   Gradle   |  3.2.5    |  |
|   Postman   |  x.x    | https://learning.postman.com/docs/getting-started/installation/installation-and-updates/ |
|   Docker Desktop   |  4.29.0   | https://www.docker.com/products/docker-desktop/ |


### Arquitectura 🔧

---
El proyecto consiste en los siguientes modulos:
- **gateway-service** - módulo de Spring Cloud Netflix Zuul para ejecutar la aplicación Spring Boot que actúa como proxy/gateway en nuestra arquitectura.
- **config-service** - módulo que utiliza Spring Cloud Config Server para ejecutar el servidor de configuración en modo `nativo`. Los archivos de configuración se colocan en el classpath.
- **discovery-service** - módulo utiliza Spring Cloud Netflix Eureka para localizar y registrar serivicios con los que se desea interartuar,además nos ayuda con el balanceo de carga y tolerarncia a fallos.
- **client-service** - módulo que contiene el primero de nuestros microservicios que permite realizar altas y consultas, utilizando como base de dato mongoBD.
- **account-service** - módulo que contiene el segundo de nuestros microservicios que permite el alta y consulta, utilizando como base de datos Mysql .
- **OpenAPI** - librería de java que ayuda a la generación automatica del contrato de la API basandose en las clases y anotaciones que tiene el proyecto.

<img src="/Users/kat/Downloads/microserviceProyecto.png"/>





## Autor✒️

---

* **AMARO TRINIDAD, KARINA** - *Autor*

