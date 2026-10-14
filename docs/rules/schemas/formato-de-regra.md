# Formato de regra normalizada

A implementação futura pode converter cada regra para registros com metadados explícitos.

```yaml
rule_id: combat.attack_roll
title: Jogada de ataque
ruleset: DND5E_2014
status: active
source:
  book: PHB
  pdf_page: 194
type: formula
inputs:
  - d20
  - ability_modifier
  - proficiency_bonus
  - modifiers
output: attack_total
notes: []
```

## Requisitos

Toda regra executável deve ter:

- `rule_id` estável;
- ruleset;
- fonte e página;
- status (`active`, `optional`, `homebrew`, `disabled`);
- entradas/saídas quando houver cálculo;
- exceções semânticas;
- testes automatizados correspondentes quando virar código.
