# ── Stage 1: build ────────────────────────────────────────────────────────────
FROM maven:3.9-eclipse-temurin-21-alpine AS build
WORKDIR /app

# Cache de dependências: copia pom primeiro, baixa deps offline
COPY pom.xml .
RUN mvn -q -DskipTests dependency:go-offline

# Copia fontes e compila (skipTests: banco não está disponível no build)
COPY src ./src
RUN mvn -q -DskipTests package

# ── Stage 2: runtime ──────────────────────────────────────────────────────────
FROM eclipse-temurin:21-jre-alpine
WORKDIR /app

COPY --from=build /app/target/*.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "/app/app.jar"]
