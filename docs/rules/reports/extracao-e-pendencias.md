# Relatório de extração

A conversão foi feita sem OCR, porque os PDFs principais possuem camada de texto extraível. Páginas com pouco texto são geralmente capas, ilustrações ou páginas predominantemente visuais.

## Livro do Jogador - D&D 5e

- páginas: 314
- páginas com pouco texto extraído: 1, 8, 9, 15, 24, 43, 121, 127, 143, 157, 163, 172, 173, 181, 185, 199, 200, 206, 249, 260, 274, 283, 302, 312, 313, 314

## Guia do Mestre - D&D 5e

- páginas: 326
- páginas com pouco texto extraído: 1, 2, 3, 8, 9, 36, 43, 70, 71, 89, 99, 108, 116, 125, 133, 160, 168, 199, 217, 239, 240, 268, 321, 322, 323, 324, 325

## Manual dos Monstros - D&D 5e

- páginas: 352
- páginas com pouco texto extraído: 1, 2, 3, 228, 288

## Lista de Magias D&D 5 v1.4

- páginas: 79
- páginas com pouco texto extraído: 6

## Deuses e Divindades 2.1

- páginas: 24
- páginas com pouco texto extraído: nenhuma

## Ficha de Personagem 2024 - referência visual

- páginas: 2
- páginas com pouco texto extraído: nenhuma

## Ficha de Personagem D&D 5e - 2014

- páginas: 3
- páginas com pouco texto extraído: nenhuma

## Pendências de normalização

O corpus-fonte está convertido, mas ainda precisam de normalização registro-a-registro para uso totalmente estruturado pelo backend:

- todas as classes/subclasses e progressões;
- cada arma/armadura/equipamento como registro de banco;
- cada magia como objeto estruturado;
- cada item mágico como objeto estruturado;
- cada monstro/stat block como objeto estruturado;
- todas as regras opcionais do capítulo 9 do Guia do Mestre como flags separadas.

Essas pendências não significam ausência de conteúdo: o texto-fonte correspondente já está em `source/` e `content/`. Significam apenas que ainda não foi transformado em dados executáveis individualizados.
