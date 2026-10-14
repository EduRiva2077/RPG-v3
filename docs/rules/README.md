# TEBM V3 - Rules Pack v0.1

Este pacote é o **coração de regras** inicial da TEBM V3. Ele foi construído apenas a partir dos PDFs fornecidos pelo Mestre nesta conversa.

## Ruleset ativo

`DND5E_2014`

Os três livros-base são:

1. **Livro do Jogador** - regras do personagem, testes, aventura, combate e magia.
2. **Guia do Mestre** - adjudicação, variantes, encontros, tesouros e ferramentas do Mestre.
3. **Manual dos Monstros** - criaturas e blocos de estatísticas.

## Regra de autoridade

Quando duas fontes parecerem divergir, a TEBM não deve inventar uma conciliação. Use a seguinte política:

- regra específica do Livro do Jogador para personagens > regra geral;
- Guia do Mestre complementa e fornece variantes/opções, mas variantes ficam **desativadas** até o Mestre ativá-las;
- Manual dos Monstros é autoridade para o bloco de uma criatura;
- `Lista de Magias D&D 5 v1.4` é uma fonte suplementar de consulta; se conflitar com a descrição da magia no Livro do Jogador, a descrição do Livro do Jogador prevalece;
- `Deuses e Divindades 2.1` é **homebrew opt-in**, desativado por padrão;
- a ficha 2024 é **referência visual somente** e não altera o ruleset 2014;
- a ficha clássica 5e é a referência inicial do schema de personagem.

## Estrutura

- `engine/`: regras normalizadas que poderão virar código Java.
- `content/`: conteúdo de jogo que será pesquisado pelo Oráculo e consumido pelo sistema.
- `source/`: conversão página a página dos PDFs, preservada para auditoria.
- `schemas/`: modelos de dados propostos a partir das fichas e livros.
- `reports/`: relatório de extração e pendências.

## Princípio do Oráculo

O Oráculo deve sempre distinguir:

- **REGRA ENCONTRADA**: resposta explicitamente sustentada pelas fontes ativas.
- **INTERPRETAÇÃO**: a fonte dá peças suficientes, mas a situação não está fechada pela regra.
- **REGRA DA CAMPANHA**: decisão registrada pelo Mestre.
- **NÃO ENCONTRADO**: a fonte ativa não sustenta uma resposta.

Ele nunca deve completar uma regra com memória geral de D&D ou com conteúdo externo sem autorização.
