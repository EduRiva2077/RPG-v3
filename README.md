# TEBM V3 — The Elden BloodMoon

> Tabuleiro tático digital para D&D. Limpo, rápido, focado em combate presencial.

## Stack

| Camada     | Tecnologia                      |
|------------|---------------------------------|
| Frontend   | Angular 22 (SPA, SCSS)          |
| Backend    | Spring Boot 4.x / Java 21       |
| Banco      | PostgreSQL 17                   |
| Migrations | Flyway                          |
| Infra      | Docker Compose                  |

## Subir tudo

```bash
cp .env.example .env   # apenas na primeira vez
docker compose up --build
```

- Frontend: http://localhost:4200  
- Backend:  http://localhost:8080  
- Health:   http://localhost:8080/api/health  

## Parar

```bash
docker compose down
```

## Apagar banco local

```bash
docker compose down -v
```

## Desenvolvimento local (sem Docker)

### Backend

```bash
cd backend
./mvnw spring-boot:run
```

> Requer PostgreSQL local ou `docker compose up database`.

### Frontend

```bash
cd frontend
npm install
npm run dev
```

## Documentação

- [`docs/TEBM_V3_BOOTSTRAP.md`](docs/TEBM_V3_BOOTSTRAP.md) — Visão de produto e arquitetura
- [`docs/rules/README.md`](docs/rules/README.md) — Pacote de regras
- [`docs/rules/INTEGRATION.md`](docs/rules/INTEGRATION.md) — Integração do motor de regras
