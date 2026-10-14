# Prioridade de regras

## Camadas

1. **Regra da campanha registrada pelo Mestre** - override local e explícito.
2. **Livro do Jogador 5e/2014** - mecânica-base de personagens e ações.
3. **Guia do Mestre 5e/2014** - adjudicação, regras do Mestre e opções.
4. **Manual dos Monstros 5e/2014** - estatística específica de criatura.
5. **Lista de Magias v1.4** - suplemento de consulta.
6. **Deuses e Divindades 2.1** - homebrew, somente quando habilitado.

A ficha 2024 não participa da prioridade mecânica enquanto o ruleset ativo for `DND5E_2014`.

## Variantes

Qualquer regra identificada como *variação*, *opcional* ou opção do Guia do Mestre deve ter uma flag de campanha. Exemplo conceitual:

```yaml
rule_id: movement.diagonal_variant
source: dmg
enabled_by_default: false
```

## Conflitos

Se a TEBM não puder determinar a prioridade com segurança, não escolher silenciosamente. O Oráculo deve mostrar as fontes conflitantes e marcar `INTERPRETAÇÃO` ou pedir decisão do Mestre.
