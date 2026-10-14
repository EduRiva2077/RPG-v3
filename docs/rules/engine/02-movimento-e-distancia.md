# Movimento e distância

Fontes principais: Livro do Jogador, capítulos 8 e 9; especialmente PDF p. 189-193.

## Unidade tática

A variação de matriz do Livro do Jogador usa quadrados de **1,5 m por 1,5 m**.

```text
quadrados_disponiveis = deslocamento_em_metros / 1.5
```

Para a TEBM, o mapa pode permanecer sem grid visual obrigatório, mas o cálculo interno deve respeitar as distâncias em metros definidas pelo ruleset.

## Movimento contextual

A TEBM deve calcular continuamente:

```text
movimento_usado
movimento_restante = deslocamento_atual - movimento_usado
distancia_ate_alvo
```

A interface não precisa de uma ferramenta de régua separada. Distância deve surgir quando movimento, ataque ou magia exigir.

## Regras importantes

- levantar-se da condição caído custa metade do deslocamento;
- rastejar custa movimento adicional;
- terreno difícil exige movimento adicional;
- espaço ocupado por outra criatura conta como terreno difícil;
- não se pode terminar voluntariamente o movimento no espaço de outra criatura;
- atravessar espaço hostil depende da diferença de categorias de tamanho indicada no Livro do Jogador;
- sair do alcance de uma criatura hostil pode provocar ataque de oportunidade;
- teleporte e movimento forçado descritos nas regras não provocam ataque de oportunidade da mesma maneira que movimento voluntário;
- criaturas em espaço apertado sofrem os modificadores descritos na regra de espremer-se.

## Tamanhos e espaço tático

| Tamanho | Espaço |
|---|---|
| Miúdo | 0,75 m x 0,75 m |
| Pequeno | 1,5 m x 1,5 m |
| Médio | 1,5 m x 1,5 m |
| Grande | 3 m x 3 m |
| Enorme | 4,5 m x 4,5 m |
| Imenso | 6 m x 6 m ou maior |

## Nota de implementação

O frontend pode prever a trajetória visualmente, mas o backend deve validar o custo final de movimento quando a ação for confirmada.
