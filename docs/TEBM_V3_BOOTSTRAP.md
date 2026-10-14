# TEBM V3 — Bootstrap

> The Elden BloodMoon V3
>
> Objetivo: um tabuleiro tático digital para D&D, limpo, rápido e focado em combate presencial, com assistência de regras sem substituir o Mestre.


# 0. Visão de produto — o que a TEBM V3 é

A TEBM V3 **não tenta ser outro Roll20**. Ela é um **tabuleiro tático digital para o Mestre usar durante combates**, com o mapa como protagonista e o mínimo possível de interface na tela.

A experiência principal é:

```text
PREPARAR (Modo Mestre)
        ↓
montar cena / mapa / tokens / inimigos / fog
        ↓
JOGAR (Modo Play)
        ↓
mapa limpo + turno + personagem selecionado
        ↓
ações contextuais aparecem somente quando necessárias
```

## 0.1 Modos da interface

### Modo Mestre / Edição

Usado antes ou durante a sessão para preparar o tabuleiro.

Pode acessar:

- cenas;
- mapas;
- tokens;
- inimigos;
- condições;
- fog of war;
- configurações da cena;
- biblioteca de assets;
- decisões/regras da campanha.

As ferramentas aparecem em painéis recolhíveis. Nada precisa permanecer aberto durante a luta.

### Modo Jogar / Play

É o modo padrão do combate.

Exibe principalmente:

- mapa;
- tokens;
- personagem/monstro selecionado;
- PV, CA, movimento e condições essenciais;
- turno/rodada;
- ação contextual atual.

Não exibe ferramentas de edição desnecessárias.

### Modo Exibição (sugestão)

Modo futuro para TV, projetor ou segundo monitor.

Exibe apenas:

- mapa;
- tokens;
- efeitos;
- turno atual;
- informações que o Mestre decidir tornar públicas.

Não exibe controles administrativos. WebSocket pode ser usado futuramente para manter essa tela sincronizada sem transformar a V3 em um sistema multiplayer complexo.

---

## 0.2 Medição contextual — sem ferramenta de régua

Não haverá uma ferramenta principal chamada **Régua**.

A distância aparece porque uma ação precisa dela.

### Movimento

Ao arrastar um token:

```text
Movimento
6 / 9 m usados
3 m restantes
```

A linha e a distância acompanham o token durante o movimento.

### Ataque

Ao selecionar atacante + alvo:

```text
Goblin Arqueiro
Distância: 12 m
Alcance da arma: 24 m
✓ Dentro do alcance
```

### Magia / habilidade em área

Ao escolher uma magia:

```text
Bola de Fogo
Alcance: 45 m
Área: esfera de 6 m
Alvos atingidos: 3
```

Cone, círculo e linha são representações da própria ação, e não ferramentas separadas escondidas em uma barra.

---

## 0.3 Dados físicos, cálculo digital

A TEBM V3 **não precisa rolar dados aleatórios**.

O Mestre/jogador rola o dado físico e informa somente o resultado.

Exemplo:

```text
Ataque com Espada Longa

D20 informado: [17]
+ FOR:           +4
+ Proficiência:  +3
--------------------
Total:           24
```

Para dano:

```text
1d8 + 4
Resultado do d8: [6]
Total: 10 de dano
```

O sistema pode mostrar automaticamente a fórmula correta conforme a ação e o ruleset carregado.

Com vantagem/desvantagem, a interface pede os resultados necessários e informa qual valor deve ser considerado pela regra.

---

## 0.4 Barra contextual — não uma barra cheia de ferramentas

A interface não deve manter vinte botões visíveis.

Nada selecionado:

```text
[ Modo Play ]                             [ Oráculo ]
```

Token selecionado:

```text
Laufey  ♥ 28/31  CA 16  Movimento 9 m
[ Mover ] [ Ação ] [ Condição ] [ PV ]
```

Ação selecionada:

```text
Espada Longa
Alvo: Goblin
Distância: 7,5 m
[ Informar rolagem ] [ Cancelar ]
```

Uma ação importante deve existir em **um único lugar óbvio**.

---

## 0.5 Crônica — histórico, não chat

Não haverá chat tradicional entre jogadores.

A V3 pode manter uma **Crônica** recolhível e automática:

```text
Rodada 3
• Laufey moveu 6 m.
• Goblin sofreu 8 de dano.
• Olive recebeu a condição Abençoado.
• Orc encerrou o turno.
```

A Crônica serve como memória da luta e suporte para desfazer/entender ações, sem ocupar a tela principal.

---

## 0.6 Desfazer e snapshots — sugestão prioritária

Toda ação tática importante deve poder ser desfeita:

- movimento;
- dano;
- cura;
- condição;
- fog;
- criação/exclusão de token.

Atalho planejado:

```text
Ctrl + Z = desfazer última ação
```

Também é recomendado criar snapshots rápidos:

```text
Início da Rodada 4
Antes do Boss
Após descanso
```

Isso é mais valioso em uma mesa real do que dezenas de automações secundárias.

---

## 0.7 Foco de turno — sugestão visual

Durante um combate:

- o token atual recebe destaque discreto;
- alvos válidos podem receber contorno leve;
- elementos não relacionados ficam visualmente mais quietos;
- a interface mostra somente informações úteis à ação atual.

A intenção é reduzir ruído visual sem transformar o mapa em uma árvore de Natal.

---

## 0.8 Atalhos do Mestre — sugestão

Atalhos futuros:

```text
Espaço    alternar Mestre / Play
Esc       cancelar ação atual
Ctrl + Z  desfazer
Delete    remover objeto selecionado no Modo Mestre
F         abrir/fechar ferramentas de fog
O         abrir/fechar Oráculo
```

Atalhos devem complementar a interface, nunca ser obrigatórios.

---

## 0.9 Oráculo — assistente de regras

O chat tradicional é substituído por um painel chamado **Oráculo**.

Ele funciona como um assistente de consulta aos documentos de regras disponíveis para a campanha.

Exemplo:

```text
☾ ORÁCULO

> Se eu arremessar minha espada naquele inimigo,
> isso funciona como um ataque normal?
```

A resposta deve distinguir claramente:

```text
REGRA ENCONTRADA
Existe texto direto nas fontes carregadas.

INTERPRETAÇÃO
Há regras relacionadas, mas a situação não é respondida diretamente.

REGRA DA CAMPANHA
É uma decisão registrada anteriormente pelo Mestre.

NÃO ENCONTRADO
Não há base suficiente nos documentos carregados.
```

O Oráculo **não substitui o Mestre** e não deve inventar regras.

Quando não houver resposta clara:

```text
Não encontrei uma regra direta para esta situação.
Há uma regra relacionada sobre armas improvisadas.
A decisão final depende do Mestre.
```

### Registrar decisão do Mestre

Uma resposta pode oferecer:

```text
[ Registrar decisão da campanha ]
```

Exemplo de regra registrada:

```text
Espada longa arremessada
Alcance: 6 m
Atributo: FOR
Dano: 1d6
Fonte: decisão do Mestre
```

Em consultas futuras, o Oráculo informa que essa é uma **regra da campanha**, e não uma regra oficial.

### Fontes do Oráculo

A arquitetura deve aceitar:

```text
SRD aberto/licenciado
+ documentos fornecidos pelo Mestre
+ regras próprias da campanha
+ decisões anteriores da mesa
```

Toda resposta baseada em documento deve, quando possível, mostrar a fonte e a seção/página correspondente.

---

## 0.10 Biblioteca de assets — sugestão

O Modo Mestre terá uma biblioteca simples de:

- mapas;
- tokens;
- retratos;
- imagens de handout;
- efeitos/ícones reutilizáveis.

Uploads devem sobreviver a reinicializações do Docker por meio de volume persistente.

Não é necessário construir um gerenciador de mídia complexo na primeira versão.

---

## 0.11 Princípio principal de UX

```text
Pouco por padrão.
Mais somente quando solicitado.
```

A tela principal deve ser aproximadamente:

```text
90% tabuleiro
10% controles contextuais
```

A V3 não deve impressionar pela quantidade de menus. Ela deve deixar de chamar atenção quando o combate começa.

---

## 1. Regra arquitetural da V3

- **Frontend (Angular):** interface, interação, mapa, HUD, animações e envio de comandos.
- **Backend (Spring Boot):** regras, validações, campanhas, personagens, combate e persistência.
- **PostgreSQL:** fonte persistente de verdade.
- **WebSocket:** infraestrutura opcional para sincronizar um futuro Modo Exibição/segundo dispositivo; não é requisito para a primeira versão.
- **Docker Compose:** sobe frontend, backend e banco com um único comando.

O frontend **não calcula regra de RPG**. Ele pode calcular apenas comportamento visual, como posição provisória durante um drag.

```text
Browser do Mestre
  |
  | REST: comandos e consultas
  | WebSocket: opcional para tela de exibição futura
  v
Spring Boot
  |
  +-- Rules Engine
  +-- Campaign
  +-- Combat
  +-- Map / Token
  +-- Character
  |
  v
PostgreSQL
```

---

# 2. Estrutura inicial

```text
tebm-v3/
├── compose.yaml
├── .env.example
├── README.md
├── docs/
│   ├── ARCHITECTURE.md
│   └── rules/
│       └── README.md
├── backend/
│   ├── Dockerfile
│   ├── pom.xml
│   └── src/main/
│       ├── java/com/tebm/v3/
│       │   ├── TebmV3Application.java
│       │   ├── config/
│       │   │   └── WebSocketConfig.java
│       │   └── campaign/
│       │       ├── Campaign.java
│       │       ├── CampaignController.java
│       │       ├── CampaignRepository.java
│       │       ├── CampaignService.java
│       │       └── CampaignDtos.java
│       └── resources/
│           ├── application.yml
│           └── db/migration/
│               └── V1__create_campaigns.sql
└── frontend/
    ├── Dockerfile
    ├── nginx.conf
    └── src/app/
        ├── app.ts
        ├── app.config.ts
        ├── app.routes.ts
        ├── core/api/
        │   └── campaign.api.ts
        └── features/lobby/
            ├── lobby.page.ts
            ├── lobby.page.html
            └── lobby.page.scss
```

A organização futura deve ser **por domínio/feature**, não por uma pasta gigante de services.

```text
backend/
├── campaign/
├── character/
├── combat/
├── map/
├── token/
├── rules/
├── realtime/
└── auth/
```

---

# 3. `compose.yaml`

```yaml
services:
  database:
    image: postgres:18-alpine
    container_name: tebm-v3-db
    restart: unless-stopped
    environment:
      POSTGRES_DB: ${POSTGRES_DB:-tebm}
      POSTGRES_USER: ${POSTGRES_USER:-tebm}
      POSTGRES_PASSWORD: ${POSTGRES_PASSWORD:-tebm_dev}
    volumes:
      - tebm_postgres_data:/var/lib/postgresql/data
    ports:
      - "5432:5432"
    healthcheck:
      test: ["CMD-SHELL", "pg_isready -U ${POSTGRES_USER:-tebm} -d ${POSTGRES_DB:-tebm}"]
      interval: 5s
      timeout: 5s
      retries: 10

  backend:
    build:
      context: ./backend
    container_name: tebm-v3-backend
    restart: unless-stopped
    environment:
      DB_URL: jdbc:postgresql://database:5432/${POSTGRES_DB:-tebm}
      DB_USERNAME: ${POSTGRES_USER:-tebm}
      DB_PASSWORD: ${POSTGRES_PASSWORD:-tebm_dev}
    depends_on:
      database:
        condition: service_healthy
    ports:
      - "8080:8080"

  frontend:
    build:
      context: ./frontend
    container_name: tebm-v3-frontend
    restart: unless-stopped
    depends_on:
      - backend
    ports:
      - "4200:80"

volumes:
  tebm_postgres_data:
```

Subir tudo:

```bash
docker compose up --build
```

Parar:

```bash
docker compose down
```

Apagar também o banco local de desenvolvimento:

```bash
docker compose down -v
```

---

# 4. `.env.example`

```dotenv
POSTGRES_DB=tebm
POSTGRES_USER=tebm
POSTGRES_PASSWORD=tebm_dev
```

Crie seu `.env` a partir dele e não versione senhas reais.

---

# 5. `backend/pom.xml`

```xml
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">

    <modelVersion>4.0.0</modelVersion>

    <parent>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-parent</artifactId>
        <version>4.1.1</version>
        <relativePath/>
    </parent>

    <groupId>com.tebm</groupId>
    <artifactId>tebm-v3-backend</artifactId>
    <version>0.0.1-SNAPSHOT</version>
    <name>TEBM V3 Backend</name>

    <properties>
        <java.version>21</java.version>
    </properties>

    <dependencies>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-web</artifactId>
        </dependency>

        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-validation</artifactId>
        </dependency>

        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-data-jpa</artifactId>
        </dependency>

        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-websocket</artifactId>
        </dependency>

        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-actuator</artifactId>
        </dependency>

        <dependency>
            <groupId>org.flywaydb</groupId>
            <artifactId>flyway-core</artifactId>
        </dependency>

        <dependency>
            <groupId>org.flywaydb</groupId>
            <artifactId>flyway-database-postgresql</artifactId>
        </dependency>

        <dependency>
            <groupId>org.postgresql</groupId>
            <artifactId>postgresql</artifactId>
            <scope>runtime</scope>
        </dependency>

        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-test</artifactId>
            <scope>test</scope>
        </dependency>
    </dependencies>

    <build>
        <plugins>
            <plugin>
                <groupId>org.springframework.boot</groupId>
                <artifactId>spring-boot-maven-plugin</artifactId>
            </plugin>
        </plugins>
    </build>

</project>
```

---

# 6. `backend/Dockerfile`

```dockerfile
FROM maven:3.9-eclipse-temurin-21-alpine AS build
WORKDIR /app

COPY pom.xml .
RUN mvn -q -DskipTests dependency:go-offline

COPY src ./src
RUN mvn -q -DskipTests package

FROM eclipse-temurin:21-jre-alpine
WORKDIR /app

COPY --from=build /app/target/*.jar app.jar

EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/app/app.jar"]
```

---

# 7. `backend/src/main/resources/application.yml`

```yaml
spring:
  application:
    name: tebm-v3-backend

  datasource:
    url: ${DB_URL:jdbc:postgresql://localhost:5432/tebm}
    username: ${DB_USERNAME:tebm}
    password: ${DB_PASSWORD:tebm_dev}

  jpa:
    open-in-view: false
    hibernate:
      ddl-auto: validate
    properties:
      hibernate:
        format_sql: true

  flyway:
    enabled: true

server:
  port: 8080

management:
  endpoints:
    web:
      exposure:
        include: health,info
```

---

# 8. `TebmV3Application.java`

Caminho:

```text
backend/src/main/java/com/tebm/v3/TebmV3Application.java
```

```java
package com.tebm.v3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TebmV3Application {

    public static void main(String[] args) {
        SpringApplication.run(TebmV3Application.class, args);
    }
}
```

---

# 9. `WebSocketConfig.java`

```java
package com.tebm.v3.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;

@Configuration
@EnableWebSocketMessageBroker
public class WebSocketConfig implements WebSocketMessageBrokerConfigurer {

    @Override
    public void configureMessageBroker(MessageBrokerRegistry registry) {
        registry.enableSimpleBroker("/topic");
        registry.setApplicationDestinationPrefixes("/app");
    }

    @Override
    public void registerStompEndpoints(StompEndpointRegistry registry) {
        registry.addEndpoint("/ws")
                .setAllowedOriginPatterns("*");
    }
}
```

Uso planejado:

```text
/topic/campaign/{campaignId}
/topic/campaign/{campaignId}/combat
/topic/campaign/{campaignId}/map
```

Não vamos criar um tópico diferente para cada botão. Eventos serão por domínio.

---

# 10. Primeira migration — `V1__create_campaigns.sql`

```sql
CREATE TABLE campaigns (
    id UUID PRIMARY KEY,
    name VARCHAR(120) NOT NULL,
    ruleset VARCHAR(30) NOT NULL DEFAULT 'CUSTOM',
    created_at TIMESTAMPTZ NOT NULL,
    updated_at TIMESTAMPTZ NOT NULL
);

CREATE INDEX idx_campaigns_updated_at
    ON campaigns(updated_at DESC);
```

---

# 11. Primeiro domínio: Campaign

## `Campaign.java`

```java
package com.tebm.v3.campaign;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.Instant;
import java.util.UUID;

@Entity
@Table(name = "campaigns")
public class Campaign {

    @Id
    private UUID id;

    @Column(nullable = false, length = 120)
    private String name;

    @Column(nullable = false, length = 30)
    private String ruleset;

    @Column(name = "created_at", nullable = false)
    private Instant createdAt;

    @Column(name = "updated_at", nullable = false)
    private Instant updatedAt;

    protected Campaign() {
    }

    private Campaign(UUID id, String name, String ruleset, Instant createdAt, Instant updatedAt) {
        this.id = id;
        this.name = name;
        this.ruleset = ruleset;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public static Campaign create(String name, String ruleset) {
        Instant now = Instant.now();

        return new Campaign(
                UUID.randomUUID(),
                name.trim(),
                ruleset,
                now,
                now
        );
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getRuleset() {
        return ruleset;
    }

    public Instant getCreatedAt() {
        return createdAt;
    }

    public Instant getUpdatedAt() {
        return updatedAt;
    }
}
```

## `CampaignRepository.java`

```java
package com.tebm.v3.campaign;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CampaignRepository extends JpaRepository<Campaign, UUID> {
}
```

## `CampaignDtos.java`

```java
package com.tebm.v3.campaign;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.time.Instant;
import java.util.UUID;

public final class CampaignDtos {

    private CampaignDtos() {
    }

    public record CreateCampaignRequest(
            @NotBlank
            @Size(max = 120)
            String name,

            String ruleset
    ) {
    }

    public record CampaignResponse(
            UUID id,
            String name,
            String ruleset,
            Instant createdAt,
            Instant updatedAt
    ) {
        static CampaignResponse from(Campaign campaign) {
            return new CampaignResponse(
                    campaign.getId(),
                    campaign.getName(),
                    campaign.getRuleset(),
                    campaign.getCreatedAt(),
                    campaign.getUpdatedAt()
            );
        }
    }
}
```

## `CampaignService.java`

```java
package com.tebm.v3.campaign;

import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static com.tebm.v3.campaign.CampaignDtos.CampaignResponse;
import static com.tebm.v3.campaign.CampaignDtos.CreateCampaignRequest;

@Service
public class CampaignService {

    private final CampaignRepository repository;

    public CampaignService(CampaignRepository repository) {
        this.repository = repository;
    }

    @Transactional(readOnly = true)
    public List<CampaignResponse> list() {
        return repository
                .findAll(Sort.by(Sort.Direction.DESC, "updatedAt"))
                .stream()
                .map(CampaignResponse::from)
                .toList();
    }

    @Transactional
    public CampaignResponse create(CreateCampaignRequest request) {
        String ruleset = normalizeRuleset(request.ruleset());
        Campaign campaign = Campaign.create(request.name(), ruleset);
        return CampaignResponse.from(repository.save(campaign));
    }

    private String normalizeRuleset(String ruleset) {
        if (ruleset == null || ruleset.isBlank()) {
            return "CUSTOM";
        }

        return switch (ruleset.trim().toUpperCase()) {
            case "SRD_5_1", "SRD_5_2", "CUSTOM" -> ruleset.trim().toUpperCase();
            default -> "CUSTOM";
        };
    }
}
```

## `CampaignController.java`

```java
package com.tebm.v3.campaign;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static com.tebm.v3.campaign.CampaignDtos.CampaignResponse;
import static com.tebm.v3.campaign.CampaignDtos.CreateCampaignRequest;

@RestController
@RequestMapping("/api/v1/campaigns")
public class CampaignController {

    private final CampaignService service;

    public CampaignController(CampaignService service) {
        this.service = service;
    }

    @GetMapping
    public List<CampaignResponse> list() {
        return service.list();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public CampaignResponse create(@Valid @RequestBody CreateCampaignRequest request) {
        return service.create(request);
    }
}
```

Nesse ponto já temos persistência real. Nada de `campaigns.json`.

---

# 12. Criando o Angular 22

Dentro da raiz do projeto:

```bash
npx @angular/cli@22 new frontend \
  --routing \
  --style=scss \
  --standalone \
  --ssr=false \
  --skip-git
```

A V3 é uma SPA. Não precisamos colocar SSR no meio de um VTT.

---

# 13. `frontend/Dockerfile`

```dockerfile
FROM node:24-alpine AS build
WORKDIR /app

COPY package*.json ./
RUN npm ci

COPY . .
RUN npm run build

FROM nginx:alpine

COPY nginx.conf /etc/nginx/conf.d/default.conf
COPY --from=build /app/dist/frontend/browser /usr/share/nginx/html

EXPOSE 80
```

> Se o nome do projeto Angular for alterado, ajuste o caminho em `dist/.../browser`.

---

# 14. `frontend/nginx.conf`

```nginx
server {
    listen 80;
    server_name _;

    root /usr/share/nginx/html;
    index index.html;

    location /api/ {
        proxy_pass http://backend:8080;
        proxy_http_version 1.1;
        proxy_set_header Host $host;
        proxy_set_header X-Real-IP $remote_addr;
    }

    location /ws {
        proxy_pass http://backend:8080;
        proxy_http_version 1.1;
        proxy_set_header Upgrade $http_upgrade;
        proxy_set_header Connection "upgrade";
        proxy_set_header Host $host;
    }

    location / {
        try_files $uri $uri/ /index.html;
    }
}
```

Isso faz frontend, API e WebSocket funcionarem pela mesma origem quando rodados pelo Compose.

---

# 15. `frontend/src/app/app.config.ts`

```ts
import { ApplicationConfig } from '@angular/core';
import { provideHttpClient } from '@angular/common/http';
import { provideRouter } from '@angular/router';
import { routes } from './app.routes';

export const appConfig: ApplicationConfig = {
  providers: [
    provideHttpClient(),
    provideRouter(routes)
  ]
};
```

---

# 16. `frontend/src/app/app.routes.ts`

```ts
import { Routes } from '@angular/router';

export const routes: Routes = [
  {
    path: '',
    loadComponent: () =>
      import('./features/lobby/lobby.page').then(m => m.LobbyPage)
  },
  {
    path: '**',
    redirectTo: ''
  }
];
```

---

# 17. `frontend/src/app/app.ts`

```ts
import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet],
  template: '<router-outlet />'
})
export class App {}
```

---

# 18. API do Lobby — `campaign.api.ts`

```ts
import { inject, Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

export interface Campaign {
  id: string;
  name: string;
  ruleset: 'SRD_5_1' | 'SRD_5_2' | 'CUSTOM';
  createdAt: string;
  updatedAt: string;
}

export interface CreateCampaignRequest {
  name: string;
  ruleset: Campaign['ruleset'];
}

@Injectable({ providedIn: 'root' })
export class CampaignApi {
  private readonly http = inject(HttpClient);
  private readonly baseUrl = '/api/v1/campaigns';

  list(): Observable<Campaign[]> {
    return this.http.get<Campaign[]>(this.baseUrl);
  }

  create(request: CreateCampaignRequest): Observable<Campaign> {
    return this.http.post<Campaign>(this.baseUrl, request);
  }
}
```

Esse service **só conversa com a API**. Ele não controla modal, mapa, combate, XP, horário lunar ou a cozinha do ferreiro.

---

# 19. Lobby inicial — `lobby.page.ts`

```ts
import { Component, inject, signal } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { Campaign, CampaignApi } from '../../core/api/campaign.api';

@Component({
  selector: 'tebm-lobby-page',
  standalone: true,
  imports: [FormsModule],
  templateUrl: './lobby.page.html',
  styleUrl: './lobby.page.scss'
})
export class LobbyPage {
  private readonly campaignApi = inject(CampaignApi);

  readonly campaigns = signal<Campaign[]>([]);
  readonly loading = signal(true);
  readonly creating = signal(false);
  readonly error = signal<string | null>(null);

  campaignName = '';

  constructor() {
    this.loadCampaigns();
  }

  loadCampaigns(): void {
    this.loading.set(true);
    this.error.set(null);

    this.campaignApi.list().subscribe({
      next: campaigns => {
        this.campaigns.set(campaigns);
        this.loading.set(false);
      },
      error: () => {
        this.error.set('Não foi possível carregar as campanhas.');
        this.loading.set(false);
      }
    });
  }

  createCampaign(): void {
    const name = this.campaignName.trim();

    if (!name || this.creating()) {
      return;
    }

    this.creating.set(true);
    this.error.set(null);

    this.campaignApi.create({
      name,
      ruleset: 'CUSTOM'
    }).subscribe({
      next: campaign => {
        this.campaigns.update(current => [campaign, ...current]);
        this.campaignName = '';
        this.creating.set(false);
      },
      error: () => {
        this.error.set('Não foi possível criar a campanha.');
        this.creating.set(false);
      }
    });
  }
}
```

---

# 20. `lobby.page.html`

```html
<main class="lobby-shell">
  <section class="hero">
    <div class="brand-mark">TEBM</div>

    <div>
      <p class="eyebrow">THE ELDEN BLOODMOON</p>
      <h1>TEBM V3</h1>
      <p class="subtitle">Sua mesa. Suas regras. Sem labirinto de botões.</p>
    </div>
  </section>

  <section class="campaign-panel">
    <div class="panel-header">
      <div>
        <span class="section-kicker">Campanhas</span>
        <h2>Escolha onde a lua vai nascer.</h2>
      </div>

      <form class="new-campaign" (submit)="$event.preventDefault(); createCampaign()">
        <input
          type="text"
          name="campaignName"
          maxlength="120"
          autocomplete="off"
          placeholder="Nome da nova campanha"
          [(ngModel)]="campaignName"
        />

        <button type="submit" [disabled]="creating() || !campaignName.trim()">
          {{ creating() ? 'Criando...' : 'Nova campanha' }}
        </button>
      </form>
    </div>

    @if (error()) {
      <p class="error-message">{{ error() }}</p>
    }

    @if (loading()) {
      <div class="empty-state">Carregando campanhas...</div>
    } @else if (campaigns().length === 0) {
      <div class="empty-state">
        Nenhuma campanha ainda. Crie a primeira acima.
      </div>
    } @else {
      <div class="campaign-grid">
        @for (campaign of campaigns(); track campaign.id) {
          <article class="campaign-card">
            <span class="ruleset">{{ campaign.ruleset }}</span>
            <h3>{{ campaign.name }}</h3>
            <p>Atualizada em {{ campaign.updatedAt }}</p>

            <button type="button" class="open-button">
              Entrar
            </button>
          </article>
        }
      </div>
    }
  </section>
</main>
```

Há **um botão para criar** e **um botão para entrar**. Nada de três caminhos diferentes para a mesma ação.

---

# 21. `lobby.page.scss`

```scss
:host {
  display: block;
  min-height: 100dvh;
  color: #f5f1ea;
  background:
    radial-gradient(circle at 15% 0%, rgba(126, 32, 48, 0.22), transparent 32rem),
    linear-gradient(145deg, #0b0c0f 0%, #111319 55%, #090a0d 100%);
}

* {
  box-sizing: border-box;
}

button,
input {
  font: inherit;
}

.lobby-shell {
  width: min(1180px, calc(100% - 40px));
  margin: 0 auto;
  padding: 72px 0;
}

.hero {
  display: flex;
  align-items: center;
  gap: 22px;
  margin-bottom: 52px;
}

.brand-mark {
  display: grid;
  place-items: center;
  width: 76px;
  aspect-ratio: 1;
  border: 1px solid rgba(214, 168, 115, 0.38);
  border-radius: 20px;
  color: #e4b97e;
  background: rgba(255, 255, 255, 0.035);
  letter-spacing: 0.12em;
  font-weight: 800;
}

.eyebrow,
.section-kicker,
.ruleset {
  margin: 0;
  color: #b58a5c;
  font-size: 0.72rem;
  font-weight: 700;
  letter-spacing: 0.16em;
  text-transform: uppercase;
}

h1,
h2,
h3,
p {
  margin-top: 0;
}

h1 {
  margin-bottom: 4px;
  font-size: clamp(2.4rem, 7vw, 5.6rem);
  line-height: 0.95;
  letter-spacing: -0.055em;
}

.subtitle {
  margin: 10px 0 0;
  color: #9b9da7;
}

.campaign-panel {
  padding: 28px;
  border: 1px solid rgba(255, 255, 255, 0.08);
  border-radius: 24px;
  background: rgba(255, 255, 255, 0.025);
  backdrop-filter: blur(18px);
}

.panel-header {
  display: flex;
  justify-content: space-between;
  gap: 28px;
  align-items: end;
  margin-bottom: 28px;
}

.panel-header h2 {
  margin: 7px 0 0;
  font-size: clamp(1.45rem, 3vw, 2.25rem);
}

.new-campaign {
  display: flex;
  gap: 10px;
  width: min(100%, 480px);
}

input {
  flex: 1;
  min-width: 0;
  padding: 13px 14px;
  border: 1px solid rgba(255, 255, 255, 0.1);
  border-radius: 12px;
  outline: none;
  color: inherit;
  background: #111318;
}

input:focus {
  border-color: rgba(228, 185, 126, 0.62);
}

button {
  padding: 12px 16px;
  border: 0;
  border-radius: 12px;
  cursor: pointer;
  color: #160d09;
  background: #e4b97e;
  font-weight: 750;
}

button:hover:not(:disabled) {
  filter: brightness(1.06);
}

button:disabled {
  cursor: not-allowed;
  opacity: 0.45;
}

.campaign-grid {
  display: grid;
  grid-template-columns: repeat(auto-fit, minmax(240px, 1fr));
  gap: 14px;
}

.campaign-card {
  min-height: 190px;
  padding: 20px;
  border: 1px solid rgba(255, 255, 255, 0.075);
  border-radius: 18px;
  background: #101217;
}

.campaign-card h3 {
  margin: 14px 0 8px;
  font-size: 1.2rem;
}

.campaign-card p {
  color: #858893;
  font-size: 0.88rem;
}

.open-button {
  margin-top: 16px;
  color: #ece7df;
  background: rgba(255, 255, 255, 0.08);
}

.empty-state {
  padding: 54px 20px;
  border: 1px dashed rgba(255, 255, 255, 0.1);
  border-radius: 16px;
  text-align: center;
  color: #858893;
}

.error-message {
  color: #ff9a9a;
}

@media (max-width: 760px) {
  .lobby-shell {
    width: min(100% - 24px, 1180px);
    padding: 36px 0;
  }

  .hero,
  .panel-header,
  .new-campaign {
    align-items: stretch;
    flex-direction: column;
  }

  .new-campaign {
    width: 100%;
  }
}
```

---

# 22. Regras que não devemos quebrar

## 1. Uma ação, um dono

```text
Ataque       -> Rules/Combat no backend
Dano         -> Rules/Combat no backend
Cura         -> Rules/Combat no backend
Movimento    -> Map/Token no backend
Visual drag  -> frontend
Modal aberto -> frontend
```

Nunca teremos `DndMathService` no Angular e outro `DndMathService` no Java calculando a mesma coisa.

## 2. Nada de God Service

Proibido renascer algo equivalente ao antigo `CombatService` gigante.

Cada domínio deve ter responsabilidade pequena e identificável.

## 3. Persistência granular

Mover um token não salva a campanha inteira.

Exemplo futuro:

```http
PATCH /api/v1/campaigns/{campaignId}/tokens/{tokenId}/position
```

```json
{
  "x": 1480.25,
  "y": 720.5
}
```

Resposta gera evento WebSocket:

```json
{
  "type": "TOKEN_MOVED",
  "tokenId": "...",
  "x": 1480.25,
  "y": 720.5
}
```

## 4. Coordenadas independentes de grid

Tokens guardam coordenadas livres.

O grid é uma ferramenta visual/mecânica, não a fundação do mapa.

Assim a campanha pode usar:

- grid quadrado;
- grid hexagonal futuramente;
- mapa sem grid;
- medida em metros/pés;
- mapas cinematográficos.

## 5. Sem SSR

TEBM é uma aplicação interativa autenticada, não um site de conteúdo que precisa ser renderizado no servidor para SEO.

## 6. Sem botão duplicado

Uma função importante deve ter uma ação principal clara.

A V3 também evita ferramentas genéricas quando a ação pode ser contextual.

Exemplo:

```text
Token selecionado
[ Mover ] [ Ação ] [ Condição ] [ PV ]
```

Não existe um botão fixo `Medir`: movimento, ataques e magias mostram distância automaticamente quando precisam dela.

Não teremos `Mover Token`, `Ferramenta Movimento`, `Modo Movimento` e outro ícone escondido fazendo a mesma coisa.

---

# 23. Roadmap técnico curto

## Fase 0 — Fundação

- Docker Compose;
- PostgreSQL;
- Spring Boot;
- Angular;
- migrations;
- volume persistente para assets;
- Lobby;
- criar/listar campanha.

Não implementar multiplayer complexo nesta fase.

## Fase 1 — Tabuleiro utilizável

- Scene;
- Map;
- Token;
- upload de mapa/token;
- zoom/pan;
- mover token;
- coordenadas livres;
- medição automática durante movimento;
- autosave granular;
- desfazer movimento.

Esse é o primeiro ponto em que a TEBM V3 deve poder ser usada em uma luta real.

## Fase 2 — Modo Mestre + Modo Play

- alternância Mestre/Play;
- edição de cena somente no Modo Mestre;
- barra contextual;
- esconder/revelar token;
- fog simples;
- iniciativa;
- PV;
- CA;
- condições simples;
- foco de turno;
- Crônica automática;
- Ctrl+Z para ações táticas.

## Fase 3 — Ações e fórmulas

- seleção atacante → alvo;
- distância automática;
- validação de alcance;
- entrada manual do resultado dos dados físicos;
- fórmulas de ataque;
- fórmulas de dano;
- cura;
- saves;
- vantagem/desvantagem;
- círculo/cone/linha como parte das ações relevantes.

A V3 não gera rolagens aleatórias como fluxo principal.

## Fase 4 — Rules Engine

- um único motor no backend;
- regras por ruleset;
- ataque;
- dano;
- cura;
- saves;
- perícias necessárias;
- condições;
- regras específicas dos PDFs/documentos carregados futuramente.

## Fase 5 — Oráculo

- ingestão de documentos autorizados;
- busca por regra;
- resposta com fonte;
- classificação `REGRA / INTERPRETAÇÃO / REGRA DA CAMPANHA / NÃO ENCONTRADO`;
- registrar decisão do Mestre;
- consultar decisões anteriores;
- não inventar regra quando a fonte não sustentar a resposta.

Para simplificar a infraestrutura, considerar PostgreSQL + `pgvector` quando a busca semântica for implementada, evitando um banco vetorial separado no início.

## Fase 6 — Polimento de mesa

- Modo Exibição para TV/segundo monitor;
- sincronização opcional via WebSocket;
- snapshots de cena;
- biblioteca de assets;
- atalhos de teclado;
- animações discretas;
- sons opcionais;
- export/import de campanha.

## Fora do escopo inicial

Não priorizar antes da mesa estar sólida:

- contas individuais para cada jogador;
- chat tradicional;
- marketplace;
- rolagem 3D de dados;
- iluminação dinâmica complexa;
- automação de todas as regras de D&D;
- ficha gigantesca permanentemente aberta;
- dezenas de barras de ferramentas.

---

# 24. Organização das regras

O backend terá uma interface central no futuro:

```java
public interface RuleSet {
    String id();

    AttackResult resolveAttack(AttackCommand command);

    DamageResult resolveDamage(DamageCommand command);

    SavingThrowResult resolveSavingThrow(SavingThrowCommand command);
}
```

Implementações:

```text
rules/
├── RuleSet.java
├── RuleSetRegistry.java
├── srd51/
│   └── Srd51RuleSet.java
├── srd52/
│   └── Srd52RuleSet.java
└── custom/
    └── TebmCustomRuleSet.java
```

Assim suas regras futuras não contaminam campanha, mapa ou frontend.

---

# 25. Arquitetura planejada do Oráculo

O Oráculo deve ser isolado do motor de combate.

```text
frontend/oracle
        ↓
/api/v1/oracle/query
        ↓
OracleService
        ├── RuleDocumentSearch
        ├── CampaignRulingSearch
        └── AnswerComposer
                ↓
          fontes consultadas
```

Persistência sugerida:

```text
rule_documents
rule_chunks
campaign_rulings
oracle_queries   (opcional para auditoria)
```

Uma decisão da campanha deve guardar, no mínimo:

```text
id
campaign_id
title
question
ruling
created_at
source_type = MASTER_RULING
```

O Oráculo nunca deve alterar PV, mover tokens ou executar ações automaticamente. Ele **explica regras**. A execução continua sendo uma decisão explícita do Mestre.

---

# 26. Conteúdo de D&D

Para o projeto, prefira conteúdo aberto/licenciado:

- **SRD 5.1**: base das regras clássicas de quinta edição.
- **SRD 5.2.1**: base das regras revisadas de 2024/5.5e.
- **CUSTOM**: regras próprias da mesa / PDFs fornecidos por você.

O repositório deve ter uma pasta como:

```text
docs/rules/
├── README.md
├── custom/
└── srd/
```

Não embuta livros comerciais completos no repositório. Para SRD, inclua a atribuição exigida pela licença Creative Commons correspondente.

---

# 27. Primeira definição de pronto

Antes de criar ficha, feitiço ou inventário, a versão deve passar neste teste:

1. `docker compose up --build` sobe tudo.
2. `http://localhost:4200` mostra **TEBM V3**.
3. O Mestre cria uma campanha.
4. A campanha aparece no Lobby.
5. Reiniciar os containers não apaga campanha nem assets persistidos.
6. `GET /api/v1/campaigns` retorna a mesma campanha.
7. Nenhuma regra de RPG existe duplicada no frontend.
8. O projeto está preparado para separar claramente **Modo Mestre** e **Modo Play**.

Quando isso estiver estável, o próximo domínio correto é **Scene + Map + Token**, seguido da medição contextual de movimento.

---

# Identidade inicial

Nome completo:

```text
The Elden BloodMoon
```

Marca curta:

```text
TEBM V3
```

Princípio visual:

```text
Dark fantasy limpo.
Poucos controles.
Hierarquia forte.
Mapa é o protagonista.
Informação sob demanda.
Medição contextual.
Dados físicos, cálculo digital.
Ferramentas aparecem apenas quando fazem sentido.
```

A V3 não deve tentar impressionar pela quantidade de botões. Ela deve desaparecer durante a sessão e deixar o RPG aparecer.
