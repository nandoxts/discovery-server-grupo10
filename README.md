# discovery-server-grupo10

> **EduSmart Campus – Microservicios con Spring Cloud** · Laboratorio T2 (Fila B) · Grupo 10
> Java 25 · Spring Boot 4.1.1 · Spring Cloud 2025.1.3 · Maven

Servidor de descubrimiento **Netflix Eureka** (Pregunta 1). Registra a `curso-service-grupo10`, `matricula-service-grupo10` y `api-gateway-grupo10`.

| Dato | Valor |
|---|---|
| Puerto | `8761` |
| Anotación | `@EnableEurekaServer` |
| Dependencias | Eureka Server |
| Dashboard | http://localhost:8761 |

```properties
spring.application.name=discovery-server-grupo10
server.port=8761
eureka.client.register-with-eureka=false
eureka.client.fetch-registry=false
```

El servidor no se registra a sí mismo ni descarga el registro.

## Ejecutar

```bash
./mvnw spring-boot:run      # Windows: mvnw.cmd spring-boot:run
```

Orden de arranque: config-server → **discovery-server** → curso-service → matricula-service → api-gateway.
