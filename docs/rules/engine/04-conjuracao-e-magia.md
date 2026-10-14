# Conjuração e magia

Fonte principal: Livro do Jogador, capítulo 10, PDF p. 201-206; descrições no capítulo 11.

## Autoridade

- regras gerais de conjuração: capítulo 10;
- descrição específica de cada magia: capítulo 11;
- a descrição específica da magia prevalece sobre comportamento genérico quando ela explicitamente criar uma exceção.

## Dados que uma magia precisa expor ao motor

```yaml
name:
level:
school:
casting_time:
range:
components:
duration:
concentration:
ritual:
targeting:
area_shape:
save_ability:
attack_type:
damage_formula:
damage_type:
scaling:
source_pdf_page:
```

## Componentes

A TEBM deve representar componentes verbal, somático e material conforme o capítulo 10. Não assumir que uma magia pode ser conjurada quando a fonte indicar que o personagem não consegue cumprir componentes exigidos.

## Concentração

Concentração é um estado mecânico que deve ser rastreado separadamente. O motor deve impedir que o personagem mantenha simultaneamente efeitos incompatíveis com a regra de concentração e deve aplicar os testes/causas de perda de concentração descritos no capítulo 10.

## Ataque mágico

```text
bônus_de_ataque_mágico = modificador_do_atributo_de_conjuração + bônus_de_proficiência
```

## CD de magia

A fórmula deve ser obtida da característica de conjuração da classe/fonte ativa e armazenada no personagem. Não duplicar cálculo no frontend.

## Áreas e alcance

Ao escolher magia, o frontend deve ler do backend: alcance, forma de área, dimensões e requisitos de alvo. O mapa apenas desenha o preview; o backend valida a aplicação.

## Efeitos mágicos iguais

Efeitos de magias diferentes podem coexistir conforme suas durações; efeitos da mesma magia lançada múltiplas vezes não se acumulam da forma indicada no capítulo 10, aplicando-se o efeito relevante mais potente enquanto houver sobreposição.
