# Schema de personagem - ruleset DND5E_2014

Referência principal: ficha clássica D&D 5e enviada pelo usuário + Livro do Jogador.

## Identidade

```yaml
name:
class_levels: []
background:
player_name:
race:
alignment:
experience_points:
```

## Atributos

```yaml
abilities:
  strength: { score: 10, modifier: 0 }
  dexterity: { score: 10, modifier: 0 }
  constitution: { score: 10, modifier: 0 }
  intelligence: { score: 10, modifier: 0 }
  wisdom: { score: 10, modifier: 0 }
  charisma: { score: 10, modifier: 0 }
```

## Combate

```yaml
proficiency_bonus:
armor_class:
initiative_modifier:
speed_meters:
hp: { max: 0, current: 0, temporary: 0 }
hit_dice: []
death_saves: { successes: 0, failures: 0 }
saving_throw_proficiencies: []
conditions: []
```

## Perícias e passivos

Armazenar proficiência/expertise separadamente do valor calculado. Percepção passiva deve ser derivada pelas regras, não digitada como fonte única da verdade.

## Ataques, equipamento e características

```yaml
attacks: []
equipment: []
coins: {}
proficiencies: {}
features: []
traits: []
```

## Conjuração

```yaml
spellcasting:
  ability:
  save_dc:
  attack_bonus:
  slots: {}
  cantrips: []
  known_or_prepared_spells: []
```

## Narrativa

Aparência, história, personalidade, ideais, vínculos/ligações, defeitos, aliados/organizações e tesouros ficam fora do motor matemático, mas fazem parte da ficha persistida.

## Ficha 2024

Campos exclusivos da ficha 2024 (por exemplo nomenclatura/organização revisada) não entram neste schema mecânico enquanto a campanha usar `DND5E_2014`.
