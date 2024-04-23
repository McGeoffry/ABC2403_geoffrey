# La lumière d'un véhicule s'éclaire si une des deux portes avant est ouverte (capteurs pd et pg à coupure de circuit) ou si l'interrupteur du plafonnier est appuyé.

Présentez:

•	Les propositions

•	La table de vérité

•	L'expression booléenne simplifiée

# Ia.Propositions

## Proposition 1

Le véhicule a la porte avant droite ouverte 

Le véhicule a une des porte fermée

Le véhicule a l'interrupteur du plafonnier non appuyé

## Proposition 2

Le véhicule a la porte avant gauche ouverte 

Le véhicule a une des porte fermée

Le véhicule a l'interrupteur du plafonnier non appuyé

## Proposition 3

Le véhicule a une la portes avant droite ouverte

Le véhicule a une des portes fermée

Le véhicule a l'interrupteur du plafonnier appuyé

## Proposition 4

Le véhicule a une la portes avant gauche ouverte

Le véhicule a une des portes fermée

Le véhicule a l'interrupteur du plafonnier appuyé

## Propositions 5

Le véhicule a les 2 portes avant ouvertes

Le véhicule a l'interrupteur du plafonnier non appuyé

## Proposition 6

Le véhicule a les 2 portes avant fermées

Le véhicule a l'interrupteur du plafonnier appuyé

## Proposition 7

Le véhicule a les 2 portes avant ouvertes

Le véhicule a l'interrupteur du plafonnier appuyé

## Ib.Propositions (Correction)

- P1 = La lumière est allumé
- P2 = Porte droite ouverte
- P3 = Porte gauche ouverte
- p4 = Iterrupteur appuyé

# IIa.La table de vérité

| pd | pg | i | L |
| --- | --- | --- | --- |
 0|0 |0|0|
 0|1 |0|1|
 1|0 |0|1|
 0|0 |1|1|
 1|1 |0|1|
 1|1 |1|1|
 0|1 |1|1|
 1|0 |1|1|

 # IIb.La table de vérité (Correction)

| Entrée | Entrée | Entrée |  | Sortie |
| --- | --- | --- | --- |
| P2 | P3 | P4 | = | P1 |
| 1 | 1 | 1 | = | 1 | 
| 0 | 0 | 0 | = | 0 |
| 1 | 0 | 0 | = | 1 |
| 0 | 1 | 0 | = | 1 |
| 0 | 1 | 1 | = | 1 |
| 1 | 1 | 0 | = | 1 |
| 1 | 0 | 1 | = | 1 |

# IIIa.L'expression booléenne simplifiée

L = (pd+pg)+i

# IIIa.L'expression booléenne simplifiée(Correction)

P1 est `VRAI` si P2 est `VRAI` si P3 est `VRAI` et si P4 est `VRAI`

`P1 = P2 + P3 + P4`

