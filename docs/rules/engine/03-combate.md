# Combate

Fonte principal: Livro do Jogador, capítulo 9, PDF p. 189-200.

## Estrutura da ação de ataque

1. escolher um alvo dentro do alcance;
2. determinar modificadores, cobertura, vantagem/desvantagem e outros efeitos;
3. resolver a jogada de ataque e, em caso de acerto, resolver dano/efeitos.

## `combat.attack_roll`

```text
ataque = d20 + modificador_de_habilidade + proficiência_quando_aplicável + modificadores
acerta se ataque >= CA_do_alvo
```

- ataque corpo a corpo com arma normalmente usa Força;
- ataque à distância com arma normalmente usa Destreza;
- propriedades como Acuidade e Arremesso podem alterar a aplicação;
- ataque mágico usa o atributo de conjuração definido pela classe + proficiência.

## 1 natural / 20 natural

- d20 = 20 em jogada de ataque: acerto independentemente dos modificadores/CA e é crítico;
- d20 = 1 em jogada de ataque: erro independentemente dos modificadores/CA.

## Alcance

A TEBM deve conhecer `alcance_normal`, `alcance_longo` e/ou `alcance_corpo_a_corpo`. Ao selecionar um alvo, exibir automaticamente distância e validade do ataque.

## Ações-base do combate

- Ajudar
- Ataque
- Conjurar uma Magia
- Desengajar
- Disparada
- Esconder
- Esquivar
- Preparar
- Procurar
- Usar um Objeto
- ação improvisada adjudicada pelo Mestre

## Ataque de oportunidade

Usa reação quando um inimigo visível deixa o alcance, conforme a regra do capítulo 9. Desengajar evita esse ataque; teleporte e certos movimentos involuntários não o provocam.

## Agarrar

Ataque corpo a corpo especial que substitui um ataque da ação Ataque. A tentativa usa Força (Atletismo) resistida por Força (Atletismo) ou Destreza (Acrobacia) do alvo, respeitando a limitação de tamanho e alcance descrita na fonte.

## Cobertura, dano, cura e 0 PV

Essas regras permanecem vinculadas integralmente às páginas finais do capítulo 9 no arquivo-fonte. A implementação deve transformá-las em serviços separados (`CoverRule`, `DamageRule`, `HealingRule`, `DeathSaveRule`) em vez de uma única classe de combate gigante.

## Entrada manual de dados

A TEBM não precisa sortear dados. O usuário informa o resultado físico e o backend aplica fórmulas/modificadores.
