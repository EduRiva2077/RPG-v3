# Integração com a TEBM V3

## Backend

O Java/Spring Boot é a autoridade mecânica. Módulos sugeridos:

```text
rules-core
character-rules
movement-rules
combat-rules
spell-rules
condition-rules
monster-rules
item-rules
oracle-rules
```

## Frontend

Angular recebe resultados e desenha:

- alcance;
- movimento restante;
- área de magia;
- estados/condições;
- fórmulas que o jogador precisa preencher com os resultados dos dados físicos.

O frontend não replica as regras.

## Oráculo

O Oráculo deve indexar primeiro `engine/` e `content/`, mantendo `source/` como prova/auditoria e fallback de consulta por página.

## Próximo passo técnico

Antes de implementar combate em Java, transformar cada regra de `engine/` em casos de teste. Ex.: vantagem/desvantagem, distância, alcance, ataque, crítico, concentração e condições.
