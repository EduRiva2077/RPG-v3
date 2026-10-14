# Resolução básica - D&D 5e/2014

Fontes principais: Livro do Jogador, PDF p. 174-176.

## `core.ability_modifier`

```text
modificador = floor((valor_de_habilidade - 10) / 2)
```

## `core.d20_check`

Estrutura-base das jogadas de d20:

```text
total = d20 + modificador_de_habilidade + bônus/penalidades aplicáveis
```

Testes de habilidade comparam o total a uma **Classe de Dificuldade (CD)**. Igualar ou superar a CD é sucesso.

## `core.typical_dc`

| Dificuldade | CD |
|---|---:|
| Muito fácil | 5 |
| Fácil | 10 |
| Moderada | 15 |
| Difícil | 20 |
| Muito difícil | 25 |
| Quase impossível | 30 |

## `core.advantage_disadvantage`

- vantagem: rolar 2d20 e usar o maior;
- desvantagem: rolar 2d20 e usar o menor;
- múltiplas fontes não adicionam mais dados;
- vantagem + desvantagem se anulam, independentemente da quantidade de fontes;
- quando um efeito permite rerrolar um d20 em uma jogada com vantagem/desvantagem, apenas um dos dados é rerrolado.

## `core.proficiency`

O bônus de proficiência só é adicionado quando a regra aplicável concede proficiência. O mesmo bônus não é somado mais de uma vez à mesma jogada. Multiplicações/divisões explícitas são aplicadas uma única vez.

## `core.passive_check`

```text
passivo = 10 + modificadores_normais
```

- vantagem em teste passivo: `+5`;
- desvantagem em teste passivo: `-5`.

## `core.contest`

Em teste resistido, ambos fazem os testes apropriados e comparam resultados. O maior vence. Em empate, a situação permanece como estava antes do teste.

## `core.group_check`

Todos fazem o teste. Se pelo menos metade obtiver sucesso, o grupo tem sucesso; caso contrário, fracassa.
